package ny.home.zeebe;

import home.ny.k8s.rmaker.ResourceMaker;
import io.fabric8.kubernetes.api.model.ServiceAccount;
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinition;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.kubernetes.api.model.rbac.ClusterRole;
import io.fabric8.kubernetes.api.model.rbac.ClusterRoleBinding;
import ny.home.zeebe.customresource.model.WebPageResource;

enum KubernetesResources {
    CDR("Crd.yaml", CustomResourceDefinition.class),
    CLUSTER_ROLE("ClusterRole.yaml", ClusterRole.class),
    CLUSTER_ROLE_BINDING("ClusterRoleBinding.yaml", ClusterRoleBinding.class),
    DEPLOYMENT("Deployment.yaml", Deployment.class),
    SERVICE_ACCOUNT("ServiceAccount.yaml", ServiceAccount.class),

    WEBPAGE_CRD("/zeebe-cluster", "zeebe-cluster.yaml", WebPageResource.class);

    private final String fileName;
    private final String folder;
    private Class<?> output;

    KubernetesResources(String fileName, Class<?> output) {
        this(RESOURCE_ROOT, fileName, output);
    }
    KubernetesResources(String folder, String fileName, Class<?> output) {
        this.folder = folder;
        this.fileName = fileName;
        this.output = output;
    }

    public String getFileName() {
        return fileName;
    }

    public Class<?> getOutput() {
        return output;
    }

    public static final String NAMESPACE = "zeebe";
    private static final String RESOURCE_ROOT = "/zeebe-operator";
    private static final String CRD_ROOT = "/zeebe-cluster";

    @SuppressWarnings("unchecked")
    public static <T> T getResource(KubernetesResources resource) {
        return (T) ResourceMaker.loadYamlFromClasspath(resource.getOutput(), resource.folder + "/" + resource.getFileName());
    }
}
