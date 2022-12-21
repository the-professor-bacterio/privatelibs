package ny.home.provisioner.aws.lowlevel.eks;

import lombok.AllArgsConstructor;
import ny.home.provisioner.aws.AWSClientConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import software.amazon.awssdk.core.waiters.WaiterResponse;
import software.amazon.awssdk.services.eks.EksClient;
import software.amazon.awssdk.services.eks.model.CreateClusterRequest;
import software.amazon.awssdk.services.eks.model.CreateClusterResponse;
import software.amazon.awssdk.services.eks.model.DescribeClusterRequest;
import software.amazon.awssdk.services.eks.model.DescribeClusterResponse;
import software.amazon.awssdk.services.eks.waiters.EksWaiter;

//@Component
//@AllArgsConstructor
//@Import(AWSClientConfiguration.class)
public class EKSCreator {
    private EksClient eksClient;

    public WaiterResponse<DescribeClusterResponse> createEKS(String bucketName) {
        EksWaiter s3Waiter = eksClient.waiter();

        CreateClusterRequest createClusterRequest = CreateClusterRequest.builder()
                .name("cluster-name")
                .build();

        CreateClusterResponse createClusterResponse = eksClient.createCluster(createClusterRequest);

        DescribeClusterRequest eksClusterRequest = DescribeClusterRequest.builder()
                .name("cluster-name")
                .build();

        return s3Waiter.waitUntilClusterActive(eksClusterRequest);
    }
}
