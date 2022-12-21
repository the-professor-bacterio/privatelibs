package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1Repository
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1Repository  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("connectionState")
  private V1alpha1ConnectionState connectionState = null;

  @JsonProperty("enableLfs")
  private Boolean enableLfs = null;

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

  @JsonProperty("inheritedCreds")
  private Boolean inheritedCreds = null;

  @JsonProperty("insecure")
  private Boolean insecure = null;

  @JsonProperty("insecureIgnoreHostKey")
  private Boolean insecureIgnoreHostKey = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("project")
  private String project = null;

  @JsonProperty("proxy")
  private String proxy = null;

  @JsonProperty("repo")
  private String repo = null;

  @JsonProperty("sshPrivateKey")
  private String sshPrivateKey = null;

  @JsonProperty("tlsClientCertData")
  private String tlsClientCertData = null;

  @JsonProperty("tlsClientCertKey")
  private String tlsClientCertKey = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("username")
  private String username = null;

  public V1alpha1Repository connectionState(V1alpha1ConnectionState connectionState) {
    this.connectionState = connectionState;
    return this;
  }

  /**
   * Get connectionState
   * @return connectionState
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ConnectionState getConnectionState() {
    return connectionState;
  }

  public void setConnectionState(V1alpha1ConnectionState connectionState) {
    this.connectionState = connectionState;
  }

  public V1alpha1Repository enableLfs(Boolean enableLfs) {
    this.enableLfs = enableLfs;
    return this;
  }

  /**
   * EnableLFS specifies whether git-lfs support should be enabled for this repo. Only valid for Git repositories.
   * @return enableLfs
   **/
  @Schema(description = "EnableLFS specifies whether git-lfs support should be enabled for this repo. Only valid for Git repositories.")
  
    public Boolean isEnableLfs() {
    return enableLfs;
  }

  public void setEnableLfs(Boolean enableLfs) {
    this.enableLfs = enableLfs;
  }

  public V1alpha1Repository enableOCI(Boolean enableOCI) {
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

  public V1alpha1Repository githubAppEnterpriseBaseUrl(String githubAppEnterpriseBaseUrl) {
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

  public V1alpha1Repository githubAppID(String githubAppID) {
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

  public V1alpha1Repository githubAppInstallationID(String githubAppInstallationID) {
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

  public V1alpha1Repository githubAppPrivateKey(String githubAppPrivateKey) {
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

  public V1alpha1Repository inheritedCreds(Boolean inheritedCreds) {
    this.inheritedCreds = inheritedCreds;
    return this;
  }

  /**
   * Get inheritedCreds
   * @return inheritedCreds
   **/
  @Schema(description = "")
  
    public Boolean isInheritedCreds() {
    return inheritedCreds;
  }

  public void setInheritedCreds(Boolean inheritedCreds) {
    this.inheritedCreds = inheritedCreds;
  }

  public V1alpha1Repository insecure(Boolean insecure) {
    this.insecure = insecure;
    return this;
  }

  /**
   * Get insecure
   * @return insecure
   **/
  @Schema(description = "")
  
    public Boolean isInsecure() {
    return insecure;
  }

  public void setInsecure(Boolean insecure) {
    this.insecure = insecure;
  }

  public V1alpha1Repository insecureIgnoreHostKey(Boolean insecureIgnoreHostKey) {
    this.insecureIgnoreHostKey = insecureIgnoreHostKey;
    return this;
  }

  /**
   * Get insecureIgnoreHostKey
   * @return insecureIgnoreHostKey
   **/
  @Schema(description = "")
  
    public Boolean isInsecureIgnoreHostKey() {
    return insecureIgnoreHostKey;
  }

  public void setInsecureIgnoreHostKey(Boolean insecureIgnoreHostKey) {
    this.insecureIgnoreHostKey = insecureIgnoreHostKey;
  }

  public V1alpha1Repository name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1alpha1Repository password(String password) {
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

  public V1alpha1Repository project(String project) {
    this.project = project;
    return this;
  }

  /**
   * Get project
   * @return project
   **/
  @Schema(description = "")
  
    public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public V1alpha1Repository proxy(String proxy) {
    this.proxy = proxy;
    return this;
  }

  /**
   * Get proxy
   * @return proxy
   **/
  @Schema(description = "")
  
    public String getProxy() {
    return proxy;
  }

  public void setProxy(String proxy) {
    this.proxy = proxy;
  }

  public V1alpha1Repository repo(String repo) {
    this.repo = repo;
    return this;
  }

  /**
   * Get repo
   * @return repo
   **/
  @Schema(description = "")
  
    public String getRepo() {
    return repo;
  }

  public void setRepo(String repo) {
    this.repo = repo;
  }

  public V1alpha1Repository sshPrivateKey(String sshPrivateKey) {
    this.sshPrivateKey = sshPrivateKey;
    return this;
  }

  /**
   * SSHPrivateKey contains the PEM data for authenticating at the repo server. Only used with Git repos.
   * @return sshPrivateKey
   **/
  @Schema(description = "SSHPrivateKey contains the PEM data for authenticating at the repo server. Only used with Git repos.")
  
    public String getSshPrivateKey() {
    return sshPrivateKey;
  }

  public void setSshPrivateKey(String sshPrivateKey) {
    this.sshPrivateKey = sshPrivateKey;
  }

  public V1alpha1Repository tlsClientCertData(String tlsClientCertData) {
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

  public V1alpha1Repository tlsClientCertKey(String tlsClientCertKey) {
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

  public V1alpha1Repository type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type specifies the type of the repo. Can be either \"git\" or \"helm. \"git\" is assumed if empty or absent.
   * @return type
   **/
  @Schema(description = "Type specifies the type of the repo. Can be either \"git\" or \"helm. \"git\" is assumed if empty or absent.")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public V1alpha1Repository username(String username) {
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
    V1alpha1Repository v1alpha1Repository = (V1alpha1Repository) o;
    return Objects.equals(this.connectionState, v1alpha1Repository.connectionState) &&
        Objects.equals(this.enableLfs, v1alpha1Repository.enableLfs) &&
        Objects.equals(this.enableOCI, v1alpha1Repository.enableOCI) &&
        Objects.equals(this.githubAppEnterpriseBaseUrl, v1alpha1Repository.githubAppEnterpriseBaseUrl) &&
        Objects.equals(this.githubAppID, v1alpha1Repository.githubAppID) &&
        Objects.equals(this.githubAppInstallationID, v1alpha1Repository.githubAppInstallationID) &&
        Objects.equals(this.githubAppPrivateKey, v1alpha1Repository.githubAppPrivateKey) &&
        Objects.equals(this.inheritedCreds, v1alpha1Repository.inheritedCreds) &&
        Objects.equals(this.insecure, v1alpha1Repository.insecure) &&
        Objects.equals(this.insecureIgnoreHostKey, v1alpha1Repository.insecureIgnoreHostKey) &&
        Objects.equals(this.name, v1alpha1Repository.name) &&
        Objects.equals(this.password, v1alpha1Repository.password) &&
        Objects.equals(this.project, v1alpha1Repository.project) &&
        Objects.equals(this.proxy, v1alpha1Repository.proxy) &&
        Objects.equals(this.repo, v1alpha1Repository.repo) &&
        Objects.equals(this.sshPrivateKey, v1alpha1Repository.sshPrivateKey) &&
        Objects.equals(this.tlsClientCertData, v1alpha1Repository.tlsClientCertData) &&
        Objects.equals(this.tlsClientCertKey, v1alpha1Repository.tlsClientCertKey) &&
        Objects.equals(this.type, v1alpha1Repository.type) &&
        Objects.equals(this.username, v1alpha1Repository.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionState, enableLfs, enableOCI, githubAppEnterpriseBaseUrl, githubAppID, githubAppInstallationID, githubAppPrivateKey, inheritedCreds, insecure, insecureIgnoreHostKey, name, password, project, proxy, repo, sshPrivateKey, tlsClientCertData, tlsClientCertKey, type, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1Repository {\n");
    
    sb.append("    connectionState: ").append(toIndentedString(connectionState)).append("\n");
    sb.append("    enableLfs: ").append(toIndentedString(enableLfs)).append("\n");
    sb.append("    enableOCI: ").append(toIndentedString(enableOCI)).append("\n");
    sb.append("    githubAppEnterpriseBaseUrl: ").append(toIndentedString(githubAppEnterpriseBaseUrl)).append("\n");
    sb.append("    githubAppID: ").append(toIndentedString(githubAppID)).append("\n");
    sb.append("    githubAppInstallationID: ").append(toIndentedString(githubAppInstallationID)).append("\n");
    sb.append("    githubAppPrivateKey: ").append(toIndentedString(githubAppPrivateKey)).append("\n");
    sb.append("    inheritedCreds: ").append(toIndentedString(inheritedCreds)).append("\n");
    sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
    sb.append("    insecureIgnoreHostKey: ").append(toIndentedString(insecureIgnoreHostKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
    sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
    sb.append("    sshPrivateKey: ").append(toIndentedString(sshPrivateKey)).append("\n");
    sb.append("    tlsClientCertData: ").append(toIndentedString(tlsClientCertData)).append("\n");
    sb.append("    tlsClientCertKey: ").append(toIndentedString(tlsClientCertKey)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
