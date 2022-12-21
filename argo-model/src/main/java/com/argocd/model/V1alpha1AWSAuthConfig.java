package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1AWSAuthConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1AWSAuthConfig  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("clusterName")
  private String clusterName = null;

  @JsonProperty("roleARN")
  private String roleARN = null;

  public V1alpha1AWSAuthConfig clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * Get clusterName
   * @return clusterName
   **/
  @Schema(description = "")
  
    public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public V1alpha1AWSAuthConfig roleARN(String roleARN) {
    this.roleARN = roleARN;
    return this;
  }

  /**
   * RoleARN contains optional role ARN. If set then AWS IAM Authenticator assume a role to perform cluster operations instead of the default AWS credential provider chain.
   * @return roleARN
   **/
  @Schema(description = "RoleARN contains optional role ARN. If set then AWS IAM Authenticator assume a role to perform cluster operations instead of the default AWS credential provider chain.")
  
    public String getRoleARN() {
    return roleARN;
  }

  public void setRoleARN(String roleARN) {
    this.roleARN = roleARN;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1AWSAuthConfig v1alpha1AWSAuthConfig = (V1alpha1AWSAuthConfig) o;
    return Objects.equals(this.clusterName, v1alpha1AWSAuthConfig.clusterName) &&
        Objects.equals(this.roleARN, v1alpha1AWSAuthConfig.roleARN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterName, roleARN);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1AWSAuthConfig {\n");
    
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    roleARN: ").append(toIndentedString(roleARN)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
