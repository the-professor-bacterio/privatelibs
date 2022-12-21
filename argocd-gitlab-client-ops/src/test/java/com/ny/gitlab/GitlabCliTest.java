package com.ny.gitlab;

import home.ny.gitlab.Commit;
import home.ny.gitlab.GitlabArgoCdClient;
import home.ny.gitlab.GitlabArgoCdClientConfig;
import org.gitlab4j.api.models.CommitAction;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class GitlabCliTest {
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

    @Test
    @Disabled
    public void addFile() {
        getClient().commitFile(
            Commit.builder()
                .branch("main")
                .action(CommitAction.Action.CREATE)
                .author("zeebe@ny.home")
                .authorName("zeebe")
                .commitMessage("adding new folder and file")
                .projectFile("test-folder/file2.txt")
                .contents("hello world")
                .build()
        );
    }

    @Test
    @Disabled
    public void updateFile() {
        getClient().commitFile(
                Commit.builder()
                        .branch("main")
                        .action(CommitAction.Action.UPDATE)
                        .author("zeebe@ny.home")
                        .authorName("zeebe")
                        .commitMessage("adding new folder and file")
                        .projectFile("test-folder/file2.txt")
                        .contents("hello world updated")
                        .build()
        );
    }

    @Test
    @Disabled
    public void deleteFile() {
        getClient().deleteFile(
                "main",
                "test-folder/file2.txt",
                "zeebe@ny.com",
                "zeebe",
                "delete file"
        );
    }

    public void createBranch() {

    }

    public void deleteBranch() {

    }
}
