package ny.home.provisioner.aws;

import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

@Configuration
public class AWSClientConfiguration {
    @Bean
    public AwsCredentialsProvider credentialsProvider(Connection connection) {
        return () -> new AwsCredentials() {
            @Override
            public String accessKeyId() {
                return connection.getKey();
            }

            @Override
            public String secretAccessKey() {
                return connection.getSecret();
            }
        };
    }

    @SneakyThrows({MalformedURLException.class, URISyntaxException.class})
    @Bean
    public S3Client s3Client(Connection connection, AwsCredentialsProvider credentialsProvider) {
        return S3Client.builder()
                .region(Region.of(connection.getRegion()))
                .credentialsProvider(credentialsProvider)
                .endpointOverride(new URL(connection.getEndpoint()).toURI())
                .build();
    }
}
