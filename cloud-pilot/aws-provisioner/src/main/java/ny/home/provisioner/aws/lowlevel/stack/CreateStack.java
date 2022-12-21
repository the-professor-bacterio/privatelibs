package ny.home.provisioner.aws.lowlevel.stack;

import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.core.waiters.WaiterResponse;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.cloudformation.CloudFormationClient;
import software.amazon.awssdk.services.cloudformation.model.Parameter;
import software.amazon.awssdk.services.cloudformation.model.CreateStackRequest;
import software.amazon.awssdk.services.cloudformation.model.OnFailure;
import software.amazon.awssdk.services.cloudformation.model.CloudFormationException;
import software.amazon.awssdk.services.cloudformation.model.DescribeStacksRequest;
import software.amazon.awssdk.services.cloudformation.model.DescribeStacksResponse;
import software.amazon.awssdk.services.cloudformation.waiters.CloudFormationWaiter;

/**
  *  https://aws.amazon.com/cloudformation/aws-cloudformation-templates/
  *  https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/get-started.html
 *   https://aws.amazon.com/cloudformation/community/templates/
 *   https://former2.com
 *   https://github.com/iann0036/former2
  */

public class CreateStack {

    public static void main(String[] args) {

        final String usage = "\n" +
                "Usage:\n" +
                "    <stackName> <roleARN> <location> <key> <value> \n\n" +
                "Where:\n" +
                "    stackName - The name of the AWS CloudFormation stack. \n" +
                "    roleARN - The ARN of the role that has AWS CloudFormation permissions. \n" +
                "    location - The location of file containing the template body. (for example, https://s3.amazonaws.com/<bucketname>/template.yml). \n" +
                "    key - The key associated with the parameter. \n" +
                "    value - The value associated with the parameter. \n";

        if (args.length != 5) {
            System.out.println(usage);
            System.exit(1);
        }

        String stackName = args[0];
        String roleARN = args[1];

        Region region = Region.US_EAST_1;
        CloudFormationClient cfClient = CloudFormationClient.builder()
                .region(region)
                .credentialsProvider(ProfileCredentialsProvider.create())
                .build();

        createCFStack(cfClient, stackName, roleARN);
        cfClient.close();
    }

    public static void createCFStack(
            CloudFormationClient cfClient,
            String stackName,
            String roleARN
    ) {

        try {
            CloudFormationWaiter waiter = cfClient.waiter();
            Parameter myParameter = Parameter.builder()
                    .parameterKey("InstanceType")
                    .parameterValue("t2.small")
                    .build();

            CreateStackRequest stackRequest = CreateStackRequest.builder()
                    .stackName(stackName)
                    .templateBody("load template.yml as string")
                    .roleARN(roleARN)
                    .onFailure(OnFailure.ROLLBACK)
                    .parameters(myParameter)
                    .build();

            cfClient.createStack(stackRequest);
            DescribeStacksRequest stacksRequest = DescribeStacksRequest.builder()
                    .stackName(stackName)
                    .build();

            WaiterResponse<DescribeStacksResponse> waiterResponse = waiter.waitUntilStackCreateComplete(stacksRequest);
            waiterResponse.matched().response().ifPresent(System.out::println);
            System.out.println(stackName + " is ready");

        } catch (CloudFormationException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
}