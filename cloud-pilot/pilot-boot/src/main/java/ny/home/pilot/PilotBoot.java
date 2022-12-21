package ny.home.pilot;

import lombok.extern.slf4j.Slf4j;
import ny.home.pilot.provisioner.InfraProvisioner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "ny.home")
@Slf4j
public class PilotBoot {

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> ctx.getBean(InfraProvisioner.class).provision();
    }

    public static void main(String[] args) {
        try (var context = SpringApplication.run(PilotBoot.class, args)) {
            log.info("Application active = " + context.isActive());
            log.info("Creating health end point");

        } catch (Throwable t) {
            log.error("Something went wrong", t);
        }
    }
}
