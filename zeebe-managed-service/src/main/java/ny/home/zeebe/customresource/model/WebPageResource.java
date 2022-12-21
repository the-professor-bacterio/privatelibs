package ny.home.zeebe.customresource.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
apiVersion: "sample.javaoperatorsdk/v1"
kind: WebPageResource
metadata:
  # Use labels to match the resource with different reconciler implementations:
  # labels:
  #    low-level: "true"
  name: hellows
spec:
  exposed: false
  html: |
    <html>
      <head>
        <title>Hello Operator World</title>
      </head>
      <body>
        Hello World From my operator! Great 2
      </body>
    </html>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebPageResource {
    private String apiVersion;
    private String kind;
    private Metadata metadata;
    private Spec spec;
}
