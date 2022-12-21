package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1TLSClientConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1TLSClientConfig  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("caData")
  private byte[] caData = null;

  @JsonProperty("certData")
  private byte[] certData = null;

  @JsonProperty("insecure")
  private Boolean insecure = null;

  @JsonProperty("keyData")
  private byte[] keyData = null;

  @JsonProperty("serverName")
  private String serverName = null;

  public V1alpha1TLSClientConfig caData(byte[] caData) {
    this.caData = caData;
    return this;
  }

  /**
   * Get caData
   * @return caData
   **/
  @Schema(description = "")
  
    public byte[] getCaData() {
    return caData;
  }

  public void setCaData(byte[] caData) {
    this.caData = caData;
  }

  public V1alpha1TLSClientConfig certData(byte[] certData) {
    this.certData = certData;
    return this;
  }

  /**
   * Get certData
   * @return certData
   **/
  @Schema(description = "")
  
    public byte[] getCertData() {
    return certData;
  }

  public void setCertData(byte[] certData) {
    this.certData = certData;
  }

  public V1alpha1TLSClientConfig insecure(Boolean insecure) {
    this.insecure = insecure;
    return this;
  }

  /**
   * Insecure specifies that the server should be accessed without verifying the TLS certificate. For testing only.
   * @return insecure
   **/
  @Schema(description = "Insecure specifies that the server should be accessed without verifying the TLS certificate. For testing only.")
  
    public Boolean isInsecure() {
    return insecure;
  }

  public void setInsecure(Boolean insecure) {
    this.insecure = insecure;
  }

  public V1alpha1TLSClientConfig keyData(byte[] keyData) {
    this.keyData = keyData;
    return this;
  }

  /**
   * Get keyData
   * @return keyData
   **/
  @Schema(description = "")
  
    public byte[] getKeyData() {
    return keyData;
  }

  public void setKeyData(byte[] keyData) {
    this.keyData = keyData;
  }

  public V1alpha1TLSClientConfig serverName(String serverName) {
    this.serverName = serverName;
    return this;
  }

  /**
   * ServerName is passed to the server for SNI and is used in the client to check server certificates against. If ServerName is empty, the hostname used to contact the server is used.
   * @return serverName
   **/
  @Schema(description = "ServerName is passed to the server for SNI and is used in the client to check server certificates against. If ServerName is empty, the hostname used to contact the server is used.")
  
    public String getServerName() {
    return serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1TLSClientConfig v1alpha1TLSClientConfig = (V1alpha1TLSClientConfig) o;
    return Objects.equals(this.caData, v1alpha1TLSClientConfig.caData) &&
        Objects.equals(this.certData, v1alpha1TLSClientConfig.certData) &&
        Objects.equals(this.insecure, v1alpha1TLSClientConfig.insecure) &&
        Objects.equals(this.keyData, v1alpha1TLSClientConfig.keyData) &&
        Objects.equals(this.serverName, v1alpha1TLSClientConfig.serverName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caData, certData, insecure, keyData, serverName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1TLSClientConfig {\n");
    
    sb.append("    caData: ").append(toIndentedString(caData)).append("\n");
    sb.append("    certData: ").append(toIndentedString(certData)).append("\n");
    sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
    sb.append("    keyData: ").append(toIndentedString(keyData)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
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
