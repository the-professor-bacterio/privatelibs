package ny.home.pilot.asset;

public interface Asset<T> {
    public AssetTypes getType();
    public ProvisionResult provisionAsset (AssetConfiguration<T> configuration);
}
