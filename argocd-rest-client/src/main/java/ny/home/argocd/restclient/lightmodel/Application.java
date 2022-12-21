package ny.home.argocd.restclient.lightmodel;

import com.argocd.model.*;
import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class Application implements Operation<V1alpha1Application> {
    public static final String ENDPOINT = "/api/v1/applications";
    public static final String CONTRACT_EXAMPLE = """
    {
      "apiVersion": "argoproj.io/v1alpha1",
      "kind": "Application",
      "metadata": {
        "name": "test2"
      },
      "spec": {
        "destination": {
          "name": "",
          "namespace": "",
          "server": "https://kubernetes.default.svc"
        },
        "source": {
          "path": "test2",
          "repoURL": "https://nene:gitlab74!@gitlab.ny.home/nene/argo-applications.git",
          "targetRevision": "HEAD"
        },
        "project": "zeebe",
        "syncPolicy": {
          "automated": {
            "prune": false,
            "selfHeal": false
          }
        }
      }
    }
    """;

    String projectName;
    String applicationName;
    String gitRepoUrl;
    String gitFolder;
    String gitTargetRevision;
    String k8sCluster;
    String k8sNamespace;
    String argoCdNamespace;
    Map<String, String> labels;
    boolean upsert;

    public String endpoint() {
        return Application.ENDPOINT;
    }

    public V1alpha1Application body() {
        // destination
        V1alpha1ApplicationDestination destination = new V1alpha1ApplicationDestination();
        destination.server(this.getK8sCluster());
        destination.namespace(this.getK8sNamespace());
        //destination.name(this.getApplicationName());

        // source
        V1alpha1ApplicationSource source = new V1alpha1ApplicationSource();
        source.repoURL(this.getGitRepoUrl());
        source.path(this.getGitFolder());
        // recursive policy
        source.setDirectory(new V1alpha1ApplicationSourceDirectory());
        source.targetRevision(this.getGitTargetRevision());

        // policy
        V1alpha1SyncPolicy syncPolicy = new V1alpha1SyncPolicy();
        syncPolicy.setAutomated(new V1alpha1SyncPolicyAutomated());

        //spec (project, source, destination, policy)
        V1alpha1ApplicationSpec spec = new V1alpha1ApplicationSpec();
        spec.setProject(this.getProjectName());
        spec.setSource(source);
        spec.setDestination(destination);
        spec.setSyncPolicy(syncPolicy);

        // metadata (app name and labels)
        V1ObjectMeta metadata = new V1ObjectMeta();
        metadata.setLabels(this.getLabels());
        metadata.setName(this.getApplicationName());
        metadata.setClusterName(this.getK8sCluster());
        metadata.setNamespace(this.getArgoCdNamespace());

        //Operation
        V1alpha1OperationInitiator initiator = new V1alpha1OperationInitiator();
        initiator.setUsername("nene");
        initiator.setAutomated(true);

        V1alpha1Operation operation = new V1alpha1Operation();
        operation.setInitiatedBy(initiator);

        V1alpha1Application app = new V1alpha1Application();
        app.setSpec(spec);
        app.setMetadata(metadata);
        //app.setOperation(operation);

        return app;
    }
}
