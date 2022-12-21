package ny.home.pilot.asset;

import ny.home.pilot.asset.configuration.ZeebeConfiguration;

public enum AssetTypes {
    CONFIG(ZeebeConfiguration.class);

    private final Class<?> configType;

    AssetTypes(Class<?> configType) {
        this.configType = configType;
    }

    public Class<?> configType() {
        return this.configType;
    }
}
