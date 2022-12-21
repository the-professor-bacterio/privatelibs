package home.ny.gitlab;

import lombok.SneakyThrows;
import org.gitlab4j.api.GitLabApi;
import org.gitlab4j.api.GitLabApiException;
import org.gitlab4j.api.models.CommitAction;
import org.gitlab4j.api.models.Project;
import org.gitlab4j.api.models.RepositoryFile;

public class GitlabArgoCdClient {
    private final GitlabArgoCdClientConfig configuration;
    private final GitLabApi gitLabApi;

    public GitlabArgoCdClient(GitlabArgoCdClientConfig configuration) {
        this.configuration = configuration;
        this.gitLabApi = new GitLabApi(
                configuration.getGitlabUrl(),
                configuration.getGitlabAccessToken()
        );
        this.gitLabApi.setIgnoreCertificateErrors(true);
    }

    @SneakyThrows(GitLabApiException.class)
    public String getProjectFileContents(String namespace, String projectName, String branch, String projectFile) {
        Project project = getProject(namespace, projectName);

        RepositoryFile file = gitLabApi.getRepositoryFileApi().getFile(
                project.getId(), // project id
                projectFile, // full path
                branch, // branch or commit reference
                true // if we want to retrieve the file content
        );

        // Print the content of the file in the Repo
        return file.getDecodedContentAsString();
    }

    public void commitFile(
            String branch,
            String projectFile,
            String contents,
            CommitAction.Action action,
            String author,
            String authorName,
            String commitMessage

    )  {
        commitFile(new Commit(branch, projectFile, contents, action, author, authorName, commitMessage));
    }

    @SneakyThrows(GitLabApiException.class)
    public void commitFile(Commit commit) {
        Project project = getProject(configuration.getGitlabProjectNamespace(), configuration.getGitlabProjectName());
        gitLabApi.getCommitsApi().createCommit(
                project.getId(), //  the project id,
                commit.getBranch(), // branch
                commit.getCommitMessage(), // commitMessage
                commit.getBranch(), // startBranch – the name of the branch to start the new commit
                commit.getAuthor(), // from authorEmail
                commit.getAuthorName(),
                commitAction(commit.getProjectFile(), commit.getContents(), commit.getAction())
        );
    }

    @SneakyThrows(GitLabApiException.class)
    public void deleteFile(
            String branch,
            String projectFile,
            String author,
            String authorName,
            String commitMessage

    )  {
        Project project = getProject(configuration.getGitlabProjectNamespace(), configuration.getGitlabProjectName());

        gitLabApi.getCommitsApi().createCommit(
                project.getId(), //  the project id,
                branch, // branch
                commitMessage, // commitMessage
                branch, // startBranch – the name of the branch to start the new commit
                author, // from authorEmail
                authorName,
                deleteAction(projectFile)
        );
    }

    private Project getProject(String configuration, String configuration1) throws GitLabApiException {
        Project project = gitLabApi.getProjectApi().getProject(
                configuration,
                configuration1
        );
        return project;
    }

    private CommitAction commitAction(String projectFile, String content, CommitAction.Action action) {
        CommitAction ca = new CommitAction();
        ca.setAction(action);
        ca.setFilePath(projectFile);
        ca.setContent(content);

        return ca;
    }

    private CommitAction deleteAction(String projectFile) {
        CommitAction ca = new CommitAction();
        ca.setAction(CommitAction.Action.DELETE);
        ca.setFilePath(projectFile);
        return ca;
    }
}
