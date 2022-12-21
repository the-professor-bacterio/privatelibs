package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * ClusterConfig is the configuration attributes. This structure is subset of the go-client rest.Config with annotations added for marshalling.
 */
@Schema(description = "ClusterConfig is the configuration attributes. This structure is subset of the go-client rest.Config with annotations added for marshalling.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ClusterConfig  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("awsAuthConfig")
  private V1alpha1AWSAuthConfig awsAuthConfig = null;

  @JsonProperty("bearerToken")
  private String bearerToken = null;

  @JsonProperty("execProviderConfig")
  private V1alpha1ExecProviderConfig execProviderConfig = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("tlsClientConfig")
  private V1alpha1TLSClientConfig tlsClientConfig = null;

  @JsonProperty("username")
  private String username = null;

  public V1alpha1ClusterConfig awsAuthConfig(V1alpha1AWSAuthConfig awsAuthConfig) {
    this.awsAuthConfig = awsAuthConfig;
    return this;
  }

  /**
   * Get awsAuthConfig
   * @return awsAuthConfig
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1AWSAuthConfig getAwsAuthConfig() {
    return awsAuthConfig;
  }

  public void setAwsAuthConfig(V1alpha1AWSAuthConfig awsAuthConfig) {
    this.awsAuthConfig = awsAuthConfig;
  }

  public V1alpha1ClusterConfig bearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
    return this;
  }

  /**
   * Server requires Bearer authentication. This client will not attempt to use refresh tokens for an OAuth2 flow. TODO: demonstrate an OAuth2 compatible client.
   * @return bearerToken
   **/
  @Schema(description = "Server requires Bearer authentication. This client will not attempt to use refresh tokens for an OAuth2 flow. TODO: demonstrate an OAuth2 compatible client.")
  
    public String getBearerToken() {
    return bearerToken;
  }

  public void setBearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
  }

  public V1alpha1ClusterConfig execProviderConfig(V1alpha1ExecProviderConfig execProviderConfig) {
    this.execProviderConfig = execProviderConfig;
    return this;
  }

  /**
   * Get execProviderConfig
   * @return execProviderConfig
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ExecProviderConfig getExecProviderConfig() {
    return execProviderConfig;
  }

  public void setExecProviderConfig(V1alpha1ExecProviderConfig execProviderConfig) {
    this.execProviderConfig = execProviderConfig;
  }

  public V1alpha1ClusterConfig password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   **/
  @Schema(description = "")
  
    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public V1alpha1ClusterConfig tlsClientConfig(V1alpha1TLSClientConfig tlsClientConfig) {
    this.tlsClientConfig = tlsClientConfig;
    return this;
  }

  /**
   * Get tlsClientConfig
   * @return tlsClientConfig
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1TLSClientConfig getTlsClientConfig() {
    return tlsClientConfig;
  }

  public void setTlsClientConfig(V1alpha1TLSClientConfig tlsClientConfig) {
    this.tlsClientConfig = tlsClientConfig;
  }

  public V1alpha1ClusterConfig username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   **/
  @Schema(description = "")
  
    public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterConfig v1alpha1ClusterConfig = (V1alpha1ClusterConfig) o;
    return Objects.equals(this.awsAuthConfig, v1alpha1ClusterConfig.awsAuthConfig) &&
        Objects.equals(this.bearerToken, v1alpha1ClusterConfig.bearerToken) &&
        Objects.equals(this.execProviderConfig, v1alpha1ClusterConfig.execProviderConfig) &&
        Objects.equals(this.password, v1alpha1ClusterConfig.password) &&
        Objects.equals(this.tlsClientConfig, v1alpha1ClusterConfig.tlsClientConfig) &&
        Objects.equals(this.username, v1alpha1ClusterConfig.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsAuthConfig, bearerToken, execProviderConfig, password, tlsClientConfig, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterConfig {\n");
    
    sb.append("    awsAuthConfig: ").append(toIndentedString(awsAuthConfig)).append("\n");
    sb.append("    bearerToken: ").append(toIndentedString(bearerToken)).append("\n");
    sb.append("    execProviderConfig: ").append(toIndentedString(execProviderConfig)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    tlsClientConfig: ").append(toIndentedString(tlsClientConfig)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
