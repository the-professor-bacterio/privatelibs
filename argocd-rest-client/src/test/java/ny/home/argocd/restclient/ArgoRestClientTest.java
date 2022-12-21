package ny.home.argocd.restclient;

import ny.home.argocd.restclient.lightmodel.Application;
import ny.home.argocd.restclient.lightmodel.Project;
import ny.home.argocd.restclient.lightmodel.Repository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ArgoRestClientTest {
    private ArgoRestClient argoRestClient = new ArgoRestClient(
            "https://192.168.1.210:32443",
            "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJhcmdvY2QiLCJzdWIiOiJuZW5lOmFwaUtleSIsIm5iZiI6MTY3MDUwNDI4MiwiaWF0IjoxNjcwNTA0MjgyLCJqdGkiOiI2MDZjYmFhNy0zZmIxLTQ1MjktYmVmZS1iZTU0MzUyM2Y2ZTkifQ.RJLRgJCfQ7gY1cV6AUWUB-ck_Ju17BXuwcsmBVxb0u8"
    );

    @Test
    @Disabled
    public void createProject() {
        var response = argoRestClient.createProject(
                Project.builder()
                        .name("zeebe-test")
                        .description("this is a test")
                        .repoURL("https://nene:gitlab74!@gitlab.ny.home/nene/argo-applications.git")
                        .path("test-application")
                        .targetRevision("HEAD")
                        .k8sDestinationCluster("https://kubernetes.default.svc")
                        .k8sNamespace("*")
                        .argoCdNamespace("argocd")
                        .upsert(true)
                        .build()
        );

        argoRestClient.trace("Response Payload", response);
    }

    @Test
    @Disabled
    public void createRepo() {
        var response = argoRestClient.createRepository(
                Repository.builder()
                        .projectName("zeebe-test")
                        .gitRepoUrl("https://nene:gitlab74!@gitlab.ny.home/nene/argo-applications.git")
                        .type("git")
                        .isRepoInsecure(true)
                        .upsert(true)
                        .build()
        );

        argoRestClient.trace("Response Payload", response);
    }

    @Test
    @Disabled
    public void createApplication() {
        var response = argoRestClient.createApplication(
          Application.builder()
                  .projectName("zeebe-test")
                  .applicationName("new-application")
                  .argoCdNamespace("argocd")
                  .gitRepoUrl("https://nene:gitlab74!@gitlab.ny.home/nene/argo-applications.git")
                  .gitFolder("test-folder")
                  .gitTargetRevision("HEAD")
                  .k8sCluster("https://kubernetes.default.svc")
                  .k8sNamespace("default")
                  .build()
        );

        argoRestClient.trace("Response Payload", response);
    }


}
