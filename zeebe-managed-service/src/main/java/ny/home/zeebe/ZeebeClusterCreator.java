package ny.home.zeebe;

import home.ny.gitlab.Commit;
import home.ny.k8s.rmaker.ResourceMaker;
import ny.home.argocd.restclient.lightmodel.Application;
import ny.home.zeebe.customresource.model.WebPageResource;
import ny.home.zeebe.util.ArgoRestClientFactory;
import ny.home.zeebe.util.GitlabClientFactory;
import org.gitlab4j.api.models.CommitAction;

import static ny.home.zeebe.KubernetesResources.*;

public class ZeebeClusterCreator {

    private void commitResourcesForZeebeCluster() {
        WebPageResource webpage = getResource(WEBPAGE_CRD);
        webpage.getSpec().setHtml(
        """
        <html>
          <head>
            <title>Hello Operator World</title>
          </head>
          <body>
            Hello World From my operator! Great 8
          </body>
        </html>
        """);

        commit(WEBPAGE_CRD, ResourceMaker.asYaml(webpage));
    }

    private void createZeebeArgoApp() {
        ArgoRestClientFactory.client().createApplication(
                Application.builder()
                        .projectName("zeebe-test")
                        .applicationName("zeebe-cluster")
                        .argoCdNamespace("argocd")
                        .gitRepoUrl("https://nene:gitlab74!@gitlab.ny.home/nene/argo-applications.git")
                        .gitFolder("zeebe-cluster")
                        .gitTargetRevision("HEAD")
                        .k8sCluster("https://kubernetes.default.svc")
                        .k8sNamespace(NAMESPACE)
                        .build()
        );
    }

    private void commit(KubernetesResources resource, String content) {
        GitlabClientFactory.client().commitFile(
                Commit.builder()
                        .branch("main")
                        .action(CommitAction.Action.UPDATE)
                        .author("zeebe@ny.home")
                        .authorName("zeebe")
                        .commitMessage("adding new folder and file")
                        .projectFile("zeebe-cluster/" + resource.getFileName())
                        .contents(content)
                        .build()
        );
    }

    static public void main(String ... args) {
        ZeebeClusterCreator zcc = new ZeebeClusterCreator();
        //zcc.createZeebeArgoApp();
        zcc.commitResourcesForZeebeCluster();

    }
}
