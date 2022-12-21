package ny.home.argocd.restclient.lightmodel;

import com.argocd.model.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Project implements Operation<ProjectProjectCreateRequest> {
    public static final String ENDPOINT = "/api/v1/projects";
    public static final String CONTRACT_EXAMPLE = """
        project: my-project
        source:
          repoURL: 'https://nene:gitlab74!@gitlab.ny.home/nene/argo-applications.git'
          path: test-application
          targetRevision: HEAD
        destination:
          server: 'https://kubernetes.default.svc'
          namespace: default
        syncPolicy:
          automated: {}
    """;

    private String name;
    private String description;
    private String repoURL;
    private String path;
    private String targetRevision;
    private String argoCdNamespace;
    private String k8sDestinationCluster;
    private String k8sNamespace;
    private String syncPolicy;
    private boolean upsert;

    @Override
    public String endpoint() {
        return ENDPOINT;
    }

    public ProjectProjectCreateRequest body() {
        V1alpha1ApplicationDestination destination = new V1alpha1ApplicationDestination();
        destination.setName(this.getK8sNamespace());
        destination.setNamespace(this.getK8sNamespace());
        destination.setServer(this.getK8sDestinationCluster());

        V1alpha1AppProjectSpec projectSpec = new V1alpha1AppProjectSpec();
        projectSpec.setDescription(this.getDescription());
        projectSpec.setSourceRepos(List.of(this.getRepoURL()));
        projectSpec.setDestinations(List.of(destination));

        V1ObjectMeta meta = new V1ObjectMeta();
        meta.setName(this.getName());
        meta.setClusterName(this.getK8sDestinationCluster());
        meta.setNamespace(this.getArgoCdNamespace());
        meta.setGenerateName(this.getName());

        V1alpha1AppProjectStatus status = new V1alpha1AppProjectStatus();

        V1alpha1AppProject project = new V1alpha1AppProject();

        project.setStatus(status);
        project.setSpec(projectSpec);
        project.setMetadata(meta);

        ProjectProjectCreateRequest createRequest = new ProjectProjectCreateRequest();
        createRequest.setProject(project);
        createRequest.setUpsert(this.upsert);

        return createRequest;
    }
}
