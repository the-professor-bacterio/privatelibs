package ny.home.provisioner.aws.assets.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import ny.home.pilot.asset.Asset;
import ny.home.pilot.asset.AssetConfiguration;
import ny.home.pilot.asset.AssetTypes;
import ny.home.pilot.asset.ProvisionResult;
import ny.home.pilot.asset.configuration.ZeebeConfiguration;
import ny.home.provisioner.aws.lowlevel.s3.BucketCreator;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import software.amazon.awssdk.core.waiters.WaiterResponse;
import software.amazon.awssdk.services.s3.model.HeadBucketResponse;

@Data
@AllArgsConstructor
@Component
@Import(BucketCreator.class)
public class ConfigAsset implements Asset<ZeebeConfiguration> {
    private BucketCreator bucketCreator;

    @Override
    public AssetTypes getType() {
        return AssetTypes.CONFIG;
    }

    @Override
    public ProvisionResult provisionAsset(AssetConfiguration<ZeebeConfiguration> configuration) {
        ZeebeConfiguration zc = configuration.getConfiguration();
        String bucketName = zc.getName();
        WaiterResponse<HeadBucketResponse> response = bucketCreator.createBucket(bucketName);

        var result = response.matched().response();
        if (result.isPresent()) {
            result.get().responseMetadata();
        }

        return new ProvisionResult();

    }
}
