package ny.home.zeebe;

import home.ny.gitlab.Commit;
import home.ny.k8s.rmaker.ResourceMaker;
import io.fabric8.kubernetes.api.model.ServiceAccount;
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinition;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.kubernetes.api.model.rbac.ClusterRole;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding;
import ny.home.argocd.restclient.lightmodel.Application;
import ny.home.zeebe.util.ArgoRestClientFactory;
import ny.home.zeebe.util.GitlabClientFactory;
import org.gitlab4j.api.models.CommitAction;
import org.jetbrains.annotations.NotNull;

import static ny.home.zeebe.KubernetesResources.*;

public class ZeebeOperatorDeployer {
    // 1. Commit in gitlab the resources required by the operator
    // 2. Create ArgoCD application
    public void deployOperator() {
        commitResourcesForOperator();
        createOperatorArgoApp();
    }


    private void commitResourcesForOperator() {
        CustomResourceDefinition crd = getCrd();
        ClusterRole clusterRole = getClusterRole();
        ClusterRoleBinding clusterRoleBinding = getClusterRoleBinding();
        Deployment deployment = getDeployment();
        ServiceAccount serviceAccount = getServiceAccount();

        commit(CDR, ResourceMaker.asYaml(crd));
        commit(CLUSTER_ROLE, ResourceMaker.asYaml(clusterRole));
        commit(CLUSTER_ROLE_BINDING, ResourceMaker.asYaml(clusterRoleBinding));
        commit(DEPLOYMENT, ResourceMaker.asYaml(deployment));
        commit(SERVICE_ACCOUNT, ResourceMaker.asYaml(serviceAccount));
    }

    @NotNull
    private ServiceAccount getServiceAccount() {
        ServiceAccount serviceAccount = getResource(SERVICE_ACCOUNT);
        serviceAccount.getMetadata().setNamespace(NAMESPACE);
        return serviceAccount;
    }

    @NotNull
    private Deployment getDeployment() {
        Deployment deployment = getResource(DEPLOYMENT);
        deployment.getMetadata().setNamespace(NAMESPACE);
        deployment.getSpec().getTemplate().getSpec()
                .getContainers().get(0)
                .setImage("harbor2.ny.home/library/apps/spring-boot-operator-v1.0:latest");
        return deployment;
    }

    @NotNull
    private ClusterRoleBinding getClusterRoleBinding() {
        ClusterRoleBinding clusterRoleBinding = getResource(CLUSTER_ROLE_BINDING);
        clusterRoleBinding.getMetadata().setNamespace(NAMESPACE);
        clusterRoleBinding.getSubjects().get(0).setNamespace(NAMESPACE);
        return clusterRoleBinding;
    }

    @NotNull
    private ClusterRole getClusterRole() {
        ClusterRole clusterRole = getResource(CLUSTER_ROLE);
        clusterRole.getMetadata().setNamespace(NAMESPACE);
        return clusterRole;
    }

    private CustomResourceDefinition getCrd() {
        return getResource(CDR);
    }

    private void commit(KubernetesResources resource, String content) {
        GitlabClientFactory.client().commitFile(
                Commit.builder()
                        .branch("main")
                        .action(CommitAction.Action.UPDATE)
                        .author("zeebe@ny.home")
                        .authorName("zeebe")
                        .commitMessage("adding new folder and file")
                        .projectFile("zeebe-operator/" + resource.getFileName())
                        .contents(content)
                        .build()
        );
    }

    private void createOperatorArgoApp() {
        ArgoRestClientFactory.client().createApplication(
                Application.builder()
                        .projectName("zeebe-test")
                        .applicationName("zeebe-operator")
                        .argoCdNamespace("argocd")
                        .gitRepoUrl("https://nene:gitlab74!@gitlab.ny.home/nene/argo-applications.git")
                        .gitFolder("zeebe-operator")
                        .gitTargetRevision("HEAD")
                        .k8sCluster("https://kubernetes.default.svc")
                        .k8sNamespace(NAMESPACE)
                        .build()
        );

    }

    static public void main(String ... args) {
        ZeebeOperatorDeployer zod = new ZeebeOperatorDeployer();
        zod.deployOperator();
    }
}
