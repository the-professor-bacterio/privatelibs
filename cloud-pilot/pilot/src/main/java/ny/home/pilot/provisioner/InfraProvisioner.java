package ny.home.pilot.provisioner;

import lombok.AllArgsConstructor;
import lombok.Data;
import ny.home.pilot.asset.Asset;
import ny.home.pilot.asset.AssetConfiguration;
import ny.home.provisioner.aws.assets.AssetsRoot;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@AllArgsConstructor
@Import(ConfigProvider.class)
@ComponentScan(basePackageClasses = {AssetsRoot.class})
public class InfraProvisioner {
    private List<Asset<?>> assets;
    private ConfigProvider configProvider;

    @SuppressWarnings("all")
    public void provision() {
        assets.forEach(asset -> {
            AssetConfiguration configuration = configProvider.getConfigForAsset(asset.getType());
            asset.provisionAsset(configuration);
        });
    }
}
