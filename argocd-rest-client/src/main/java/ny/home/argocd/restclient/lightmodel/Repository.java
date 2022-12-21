package ny.home.argocd.restclient.lightmodel;

import com.argocd.model.V1alpha1Repository;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Repository implements Operation<V1alpha1Repository> {
    public static final String ENDPOINT = "/api/v1/repositories?upsert={upsert}";
    public static final String CONTRACT_EXAMPLE = """
    {
      "type": "git",
      "repo": "https://nene:gitlab74!@gitlab.ny.home/nene/argo-applications.git",
      "insecure": true,
      "project": "zeebe"
    }
    """;

    private String type = "git";
    private boolean isRepoInsecure = true;
    private String gitRepoUrl;
    private String projectName;
    private boolean upsert;

    @Override
    public String endpoint() {
        return Repository.ENDPOINT.replace("{upsert}", "" + this.upsert);
    }

    public V1alpha1Repository body() {
        V1alpha1Repository repository = new V1alpha1Repository();
        repository.setProject(this.getProjectName());
        repository.setInsecure(this.isRepoInsecure());
        repository.setInsecureIgnoreHostKey(this.isRepoInsecure);
        repository.setType(this.getType());
        repository.setRepo(gitRepoUrl);

        return repository;
    }
}
