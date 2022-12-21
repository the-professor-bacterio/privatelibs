package home.ny.k8s.rmaker;

import io.fabric8.kubernetes.api.builder.Builder;
import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.utils.Serialization;
import io.javaoperatorsdk.operator.BuilderUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ResourceMaker {
    public static <T> T loadYamlFromString(Class<T> clazz, String yaml) {
        try (InputStream is = new ByteArrayInputStream(yaml.getBytes());) {
            if (Builder.class.isAssignableFrom(clazz)) {
                return BuilderUtils.newBuilder(clazz,
                        Serialization.unmarshal(is, BuilderUtils.builderTargetType(clazz)));
            }
            return Serialization.unmarshal(is, clazz);
        } catch (IOException ex) {
            throw new IllegalStateException("Cannot unmarshall string contents: " + yaml);
        }
    }

    public static <T> T loadYamlFromClasspath(Class<T> clazz, String yaml) {
        try (InputStream is = ResourceMaker.class.getResourceAsStream(yaml)) {
            if (Builder.class.isAssignableFrom(clazz)) {
                return BuilderUtils.newBuilder(clazz,
                        Serialization.unmarshal(is, BuilderUtils.builderTargetType(clazz)));
            }
            return Serialization.unmarshal(is, clazz);
        } catch (IOException ex) {
            throw new IllegalStateException("Cannot find yaml on classpath: " + yaml);
        }
    }

    public static <T> String asYaml(T resource) {
        return Serialization.asYaml(resource);
    }

    public static <T extends Namespaced> String asJson(T resource) {
        return Serialization.asJson(resource);
    }
}
