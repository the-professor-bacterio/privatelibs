package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1RepoCreds
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1RepoCreds  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("enableOCI")
  private Boolean enableOCI = null;

  @JsonProperty("githubAppEnterpriseBaseUrl")
  private String githubAppEnterpriseBaseUrl = null;

  @JsonProperty("githubAppID")
  private String githubAppID = null;

  @JsonProperty("githubAppInstallationID")
  private String githubAppInstallationID = null;

  @JsonProperty("githubAppPrivateKey")
  private String githubAppPrivateKey = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("sshPrivateKey")
  private String sshPrivateKey = null;

  @JsonProperty("tlsClientCertData")
  private String tlsClientCertData = null;

  @JsonProperty("tlsClientCertKey")
  private String tlsClientCertKey = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("username")
  private String username = null;

  public V1alpha1RepoCreds enableOCI(Boolean enableOCI) {
    this.enableOCI = enableOCI;
    return this;
  }

  /**
   * Get enableOCI
   * @return enableOCI
   **/
  @Schema(description = "")
  
    public Boolean isEnableOCI() {
    return enableOCI;
  }

  public void setEnableOCI(Boolean enableOCI) {
    this.enableOCI = enableOCI;
  }

  public V1alpha1RepoCreds githubAppEnterpriseBaseUrl(String githubAppEnterpriseBaseUrl) {
    this.githubAppEnterpriseBaseUrl = githubAppEnterpriseBaseUrl;
    return this;
  }

  /**
   * Get githubAppEnterpriseBaseUrl
   * @return githubAppEnterpriseBaseUrl
   **/
  @Schema(description = "")
  
    public String getGithubAppEnterpriseBaseUrl() {
    return githubAppEnterpriseBaseUrl;
  }

  public void setGithubAppEnterpriseBaseUrl(String githubAppEnterpriseBaseUrl) {
    this.githubAppEnterpriseBaseUrl = githubAppEnterpriseBaseUrl;
  }

  public V1alpha1RepoCreds githubAppID(String githubAppID) {
    this.githubAppID = githubAppID;
    return this;
  }

  /**
   * Get githubAppID
   * @return githubAppID
   **/
  @Schema(description = "")
  
    public String getGithubAppID() {
    return githubAppID;
  }

  public void setGithubAppID(String githubAppID) {
    this.githubAppID = githubAppID;
  }

  public V1alpha1RepoCreds githubAppInstallationID(String githubAppInstallationID) {
    this.githubAppInstallationID = githubAppInstallationID;
    return this;
  }

  /**
   * Get githubAppInstallationID
   * @return githubAppInstallationID
   **/
  @Schema(description = "")
  
    public String getGithubAppInstallationID() {
    return githubAppInstallationID;
  }

  public void setGithubAppInstallationID(String githubAppInstallationID) {
    this.githubAppInstallationID = githubAppInstallationID;
  }

  public V1alpha1RepoCreds githubAppPrivateKey(String githubAppPrivateKey) {
    this.githubAppPrivateKey = githubAppPrivateKey;
    return this;
  }

  /**
   * Get githubAppPrivateKey
   * @return githubAppPrivateKey
   **/
  @Schema(description = "")
  
    public String getGithubAppPrivateKey() {
    return githubAppPrivateKey;
  }

  public void setGithubAppPrivateKey(String githubAppPrivateKey) {
    this.githubAppPrivateKey = githubAppPrivateKey;
  }

  public V1alpha1RepoCreds password(String password) {
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

  public V1alpha1RepoCreds sshPrivateKey(String sshPrivateKey) {
    this.sshPrivateKey = sshPrivateKey;
    return this;
  }

  /**
   * Get sshPrivateKey
   * @return sshPrivateKey
   **/
  @Schema(description = "")
  
    public String getSshPrivateKey() {
    return sshPrivateKey;
  }

  public void setSshPrivateKey(String sshPrivateKey) {
    this.sshPrivateKey = sshPrivateKey;
  }

  public V1alpha1RepoCreds tlsClientCertData(String tlsClientCertData) {
    this.tlsClientCertData = tlsClientCertData;
    return this;
  }

  /**
   * Get tlsClientCertData
   * @return tlsClientCertData
   **/
  @Schema(description = "")
  
    public String getTlsClientCertData() {
    return tlsClientCertData;
  }

  public void setTlsClientCertData(String tlsClientCertData) {
    this.tlsClientCertData = tlsClientCertData;
  }

  public V1alpha1RepoCreds tlsClientCertKey(String tlsClientCertKey) {
    this.tlsClientCertKey = tlsClientCertKey;
    return this;
  }

  /**
   * Get tlsClientCertKey
   * @return tlsClientCertKey
   **/
  @Schema(description = "")
  
    public String getTlsClientCertKey() {
    return tlsClientCertKey;
  }

  public void setTlsClientCertKey(String tlsClientCertKey) {
    this.tlsClientCertKey = tlsClientCertKey;
  }

  public V1alpha1RepoCreds type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type specifies the type of the repoCreds. Can be either \"git\" or \"helm. \"git\" is assumed if empty or absent.
   * @return type
   **/
  @Schema(description = "Type specifies the type of the repoCreds. Can be either \"git\" or \"helm. \"git\" is assumed if empty or absent.")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public V1alpha1RepoCreds url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   **/
  @Schema(description = "")
  
    public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public V1alpha1RepoCreds username(String username) {
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
    V1alpha1RepoCreds v1alpha1RepoCreds = (V1alpha1RepoCreds) o;
    return Objects.equals(this.enableOCI, v1alpha1RepoCreds.enableOCI) &&
        Objects.equals(this.githubAppEnterpriseBaseUrl, v1alpha1RepoCreds.githubAppEnterpriseBaseUrl) &&
        Objects.equals(this.githubAppID, v1alpha1RepoCreds.githubAppID) &&
        Objects.equals(this.githubAppInstallationID, v1alpha1RepoCreds.githubAppInstallationID) &&
        Objects.equals(this.githubAppPrivateKey, v1alpha1RepoCreds.githubAppPrivateKey) &&
        Objects.equals(this.password, v1alpha1RepoCreds.password) &&
        Objects.equals(this.sshPrivateKey, v1alpha1RepoCreds.sshPrivateKey) &&
        Objects.equals(this.tlsClientCertData, v1alpha1RepoCreds.tlsClientCertData) &&
        Objects.equals(this.tlsClientCertKey, v1alpha1RepoCreds.tlsClientCertKey) &&
        Objects.equals(this.type, v1alpha1RepoCreds.type) &&
        Objects.equals(this.url, v1alpha1RepoCreds.url) &&
        Objects.equals(this.username, v1alpha1RepoCreds.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableOCI, githubAppEnterpriseBaseUrl, githubAppID, githubAppInstallationID, githubAppPrivateKey, password, sshPrivateKey, tlsClientCertData, tlsClientCertKey, type, url, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RepoCreds {\n");
    
    sb.append("    enableOCI: ").append(toIndentedString(enableOCI)).append("\n");
    sb.append("    githubAppEnterpriseBaseUrl: ").append(toIndentedString(githubAppEnterpriseBaseUrl)).append("\n");
    sb.append("    githubAppID: ").append(toIndentedString(githubAppID)).append("\n");
    sb.append("    githubAppInstallationID: ").append(toIndentedString(githubAppInstallationID)).append("\n");
    sb.append("    githubAppPrivateKey: ").append(toIndentedString(githubAppPrivateKey)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    sshPrivateKey: ").append(toIndentedString(sshPrivateKey)).append("\n");
    sb.append("    tlsClientCertData: ").append(toIndentedString(tlsClientCertData)).append("\n");
    sb.append("    tlsClientCertKey: ").append(toIndentedString(tlsClientCertKey)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
