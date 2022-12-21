package home.ny.gitlab;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GitlabArgoCdClientConfig {
    private String gitlabAccessToken = "8Cb_QaRBmSzRzC99kfD7";
    private String gitlabUrl = "https://gitlab.ny.home";
    private String gitlabProjectNamespace = "nene";
    private String gitlabProjectName = "argo-applications";
}
