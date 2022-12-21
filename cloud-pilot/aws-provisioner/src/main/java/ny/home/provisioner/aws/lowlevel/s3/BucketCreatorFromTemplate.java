package ny.home.provisioner.aws.lowlevel.s3;

import lombok.AllArgsConstructor;
import ny.home.provisioner.aws.AWSClientConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import software.amazon.awssdk.core.waiters.WaiterResponse;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.CreateBucketRequest;
import software.amazon.awssdk.services.s3.model.HeadBucketRequest;
import software.amazon.awssdk.services.s3.model.HeadBucketResponse;
import software.amazon.awssdk.services.s3.waiters.S3Waiter;

/**
 * Due to the nature of S3 you need to have in your DNS or /etc/hosts an entry to each bucket like this:
 * 192.168.1.159   s3.localhost.localstack.cloud
 * 192.168.1.159   my-bucket.s3.localhost.localstack.cloud
 *
 * This is needed because internally AWS creates DNS entries but localstack backend does not work like it.
 *
 * Remember we use the following config in AWS SDK2 to connect to localstack (http://localstack:4566/health)
 *
 * aws:
 *   connection:
 *     endPoint: "http://s3.localhost.localstack.cloud:4566"
 *     region: "us-east-1"
 *     key: localstack
 *     secret: localstack
 *
 *  We add the entries in the caller machine (cinexin) and in the target machine (localstack)
 *  https://stackoverflow.com/questions/68034637/unknown-host-when-using-localstack-with-spring-cloud-aws-2-3
 *
 */
@Component
@AllArgsConstructor
@Import(AWSClientConfiguration.class)
public class BucketCreatorFromTemplate {
    private final String bucketTemplate = """
    { 
        "Resources": {    
            "MyBucket": {      
                "Type": "AWS::S3::Bucket",      
                "Properties": {        
                    "BucketName": "my-unique-bucket-name"      
                }    
            }  
        }
    }
    """;
    private S3Client s3Client;

    public WaiterResponse<HeadBucketResponse> createBucket(String bucketName) {
        S3Waiter s3Waiter = s3Client.waiter();

        CreateBucketRequest bucketRequest = CreateBucketRequest.builder()
                .bucket("my-unique-bucket-name")
                //.createBucketConfiguration(
                //        b -> b.templateBody(bucketTemplate)
                //)
                .build();

        s3Client.createBucket(bucketRequest);

        HeadBucketRequest bucketRequestWait = HeadBucketRequest.builder()
                .bucket(bucketName)
                .build();

        // Wait until the bucket is created and print out the response.
        return s3Waiter.waitUntilBucketExists(bucketRequestWait);

    }
}