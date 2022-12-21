#!/bin/bash

chmod 755 ${CI_PROJECT_DIR}/scripts/busybox

META=maven-metadata.xml
ASSETS=ASSETS
CONFIG=config/target/config

REGISTRY_URL=harbor2.ny.home
REGISTRY_USER=admin
REGISTRY_PW=registry
PODMAN_FLAGS=--tls-verify=false

function getDep() {
  set -e
  bb=${CI_PROJECT_DIR}/scripts/busybox
  groupId=$1; groupId=${groupId/./\/}
  artifactId=$2
  version=$3

  ROOT_URL=${CI_API_V4_URL}/projects/4/packages/maven/${groupId}/${artifactId}/${version}
  echo ROOT_URL=$ROOT_URL

  METADATA_URL=${ROOT_URL}/${META}
  echo METADATA=$METADATA_URL

  $bb wget --no-check-certificate ${METADATA_URL}

  VER=$(cat ${META} | $bb grep value | $bb sed -e 's/<[^>]*>//g' | $bb head -1 | $bb xargs)

  AID=${artifactId}-${VER}.zip

  ARTIFACT_URL=${ROOT_URL}/${AID}

  echo ARTIFACT_URL=${ARTIFACT_URL}

  mkdir -p $ASSETS

  $bb wget --no-check-certificate ${ARTIFACT_URL}

  unzip ${AID}

  ls -la

}

#https://www.redhat.com/sysadmin/podman-inside-container
#https://docs.gitlab.com/runner/executors/kubernetes.html
#https://pythonspeed.com/articles/gitlab-build-docker-image/
#https://www.cloudsavvyit.com/15115/how-to-build-docker-images-in-a-gitlab-ci-pipeline/
function buildImage() {
  mkdir -p $ASSETS ; pushd $ASSETS || exit

  p="podman"

  groupId=$1
  artifactId=$2
  version=$3
  imageVersion=$4
  tag=$5

  $p --version
  $p login ${PODMAN_FLAGS} -u=${REGISTRY_USER} -p=${REGISTRY_PW} ${REGISTRY_URL}

  getDep $groupId $artifactId $version

  cp app/Dockerfile .

  $p build --rm --tag ${REGISTRY_URL}/library/apps/${artifactId}-${imageVersion}:${tag} -f Dockerfile

  $p push ${PODMAN_FLAGS} ${REGISTRY_URL}/library/apps/${artifactId}-${imageVersion}:${tag}

  #$p rmi $($p images --filter 'dangling=true' -q --no-trunc)
  #$p system prune --all --force
  $p images

  popd || exit
}

function buildConfig() {
  echo "Building configuration and deployment scripts ..."
  mvn --quiet clean install -pl :config -Pgitlab -s ci-settings.xml
  mkdir -p $ASSETS
  cp -r $CONFIG/* $ASSETS
  pushd $ASSETS || exit
  echo "Configuration Built. Generated Files: "
  echo "--------------------------------------"
  find
  popd || exit
}

function deployOnK8s() {
  realm=$1
  echo "Deploying Realm $realm on K8s using Terraform ..."
  cd $ASSETS/realms/${realm} || exit
  find
  terraform init -migrate-state -input=false
  terraform apply -input=false -auto-approve
}

function buildDeployerImage() {
  p="podman --tls-verify=false"

  imageName=$1
  imageVersion=$2
  tag=$3

  $p --version
  $p login ${PODMAN_FLAGS} -u=${REGISTRY_USER} -p=${REGISTRY_PW} ${REGISTRY_URL}

  cp provision/Dockerfile .

  $p build --tag ${REGISTRY_URL}/library/build/${imageName}-${imageVersion}:${tag} -f Dockerfile
  $p images
  $p push ${PODMAN_FLAGS} ${REGISTRY_URL}/library/build/${imageName}-${imageVersion}:${tag}
  #$p system prune --all --force
}
