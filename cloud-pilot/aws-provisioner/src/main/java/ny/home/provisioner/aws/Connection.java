package ny.home.provisioner.aws;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@NoArgsConstructor
@Configuration
@ConfigurationProperties(prefix = "aws.connection")
public class Connection {
    private String endpoint;
    private String region;
    private String key;
    private String secret;

}
