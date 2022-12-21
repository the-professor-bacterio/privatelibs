#!/bin/bash
export MAVEN_OPTS="-Xmx512m \
 -Dmaven.wagon.http.ssl.insecure=true \
 -Dmaven.wagon.http.ssl.allowall=true \
 -Dmaven.wagon.http.ssl.ignore.validity.dates=true"

 echo "executing maven"

function maven() {
  mvn "$@"
}