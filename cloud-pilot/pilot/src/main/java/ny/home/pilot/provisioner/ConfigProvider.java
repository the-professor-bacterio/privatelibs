package ny.home.pilot.provisioner;

import ny.home.pilot.asset.AssetConfiguration;
import ny.home.pilot.asset.AssetTypes;
import ny.home.pilot.asset.configuration.ZeebeConfiguration;
import org.springframework.stereotype.Component;

@Component
public class ConfigProvider {
    public <T> AssetConfiguration<T> getConfigForAsset(AssetTypes assetType) {
        switch (assetType) {
            case CONFIG: return to(new ZeebeConfiguration("my-bucket"));
        }
        return null;
    }

    @SuppressWarnings("all")
    private <T> AssetConfiguration<T> to(Object any) {
        return (AssetConfiguration<T>) new AssetConfiguration<>(any);
    }
}
