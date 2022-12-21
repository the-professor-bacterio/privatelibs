package home.nt.k8s.rmaker;

import home.ny.k8s.rmaker.ResourceMaker;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.kubernetes.client.utils.Serialization;
import org.junit.jupiter.api.Test;

public class ResourceMakerTest {
    @Test
    public void testDeployment() {
        Deployment deployment = ResourceMaker.loadYamlFromClasspath(
                Deployment.class,
                "/templates/nginx-deployment.yaml"
        );

        deployment.setKind("ChangedKind");

        String updatedYaml = Serialization.asYaml(deployment);

        System.out.println(updatedYaml);

    }
}
