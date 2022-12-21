package ny.home.zeebe.util;

import home.ny.gitlab.GitlabArgoCdClient;
import home.ny.gitlab.GitlabArgoCdClientConfig;

public class GitlabClientFactory {
    private String GITLAB_URL = "https://gitlab.ny.home";
    private String PROJECT_ACCESS_TOKEN = "8Cb_QaRBmSzRzC99kfD7";
    private String NAMESPACE = "nene";
    private String PROJECT_NAME = "argo-applications";

    private GitlabArgoCdClient client;

    private GitlabArgoCdClient getClient() {
        if (client == null) {
            this.client = new GitlabArgoCdClient(
                    GitlabArgoCdClientConfig.builder()
                            .gitlabUrl(GITLAB_URL)
                            .gitlabAccessToken(PROJECT_ACCESS_TOKEN)
                            .gitlabProjectNamespace(NAMESPACE)
                            .gitlabProjectName(PROJECT_NAME)
                            .build()
            );
        }
        return client;
    }

    private static final GitlabClientFactory instance = new GitlabClientFactory();

    private GitlabClientFactory() {
    }

    public static GitlabArgoCdClient client() {
        return instance.getClient();
    }
}
