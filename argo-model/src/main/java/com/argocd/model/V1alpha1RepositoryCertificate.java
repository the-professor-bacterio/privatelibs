package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1RepositoryCertificate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1RepositoryCertificate  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("certData")
  private byte[] certData = null;

  @JsonProperty("certInfo")
  private String certInfo = null;

  @JsonProperty("certSubType")
  private String certSubType = null;

  @JsonProperty("certType")
  private String certType = null;

  @JsonProperty("serverName")
  private String serverName = null;

  public V1alpha1RepositoryCertificate certData(byte[] certData) {
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

  public V1alpha1RepositoryCertificate certInfo(String certInfo) {
    this.certInfo = certInfo;
    return this;
  }

  /**
   * Get certInfo
   * @return certInfo
   **/
  @Schema(description = "")
  
    public String getCertInfo() {
    return certInfo;
  }

  public void setCertInfo(String certInfo) {
    this.certInfo = certInfo;
  }

  public V1alpha1RepositoryCertificate certSubType(String certSubType) {
    this.certSubType = certSubType;
    return this;
  }

  /**
   * Get certSubType
   * @return certSubType
   **/
  @Schema(description = "")
  
    public String getCertSubType() {
    return certSubType;
  }

  public void setCertSubType(String certSubType) {
    this.certSubType = certSubType;
  }

  public V1alpha1RepositoryCertificate certType(String certType) {
    this.certType = certType;
    return this;
  }

  /**
   * Get certType
   * @return certType
   **/
  @Schema(description = "")
  
    public String getCertType() {
    return certType;
  }

  public void setCertType(String certType) {
    this.certType = certType;
  }

  public V1alpha1RepositoryCertificate serverName(String serverName) {
    this.serverName = serverName;
    return this;
  }

  /**
   * Get serverName
   * @return serverName
   **/
  @Schema(description = "")
  
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
    V1alpha1RepositoryCertificate v1alpha1RepositoryCertificate = (V1alpha1RepositoryCertificate) o;
    return Objects.equals(this.certData, v1alpha1RepositoryCertificate.certData) &&
        Objects.equals(this.certInfo, v1alpha1RepositoryCertificate.certInfo) &&
        Objects.equals(this.certSubType, v1alpha1RepositoryCertificate.certSubType) &&
        Objects.equals(this.certType, v1alpha1RepositoryCertificate.certType) &&
        Objects.equals(this.serverName, v1alpha1RepositoryCertificate.serverName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certData, certInfo, certSubType, certType, serverName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RepositoryCertificate {\n");
    
    sb.append("    certData: ").append(toIndentedString(certData)).append("\n");
    sb.append("    certInfo: ").append(toIndentedString(certInfo)).append("\n");
    sb.append("    certSubType: ").append(toIndentedString(certSubType)).append("\n");
    sb.append("    certType: ").append(toIndentedString(certType)).append("\n");
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
