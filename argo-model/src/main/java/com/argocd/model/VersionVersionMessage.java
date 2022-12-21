package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * VersionVersionMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class VersionVersionMessage  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("BuildDate")
  private String buildDate = null;

  @JsonProperty("Compiler")
  private String compiler = null;

  @JsonProperty("GitCommit")
  private String gitCommit = null;

  @JsonProperty("GitTag")
  private String gitTag = null;

  @JsonProperty("GitTreeState")
  private String gitTreeState = null;

  @JsonProperty("GoVersion")
  private String goVersion = null;

  @JsonProperty("HelmVersion")
  private String helmVersion = null;

  @JsonProperty("JsonnetVersion")
  private String jsonnetVersion = null;

  @JsonProperty("KubectlVersion")
  private String kubectlVersion = null;

  @JsonProperty("KustomizeVersion")
  private String kustomizeVersion = null;

  @JsonProperty("Platform")
  private String platform = null;

  @JsonProperty("Version")
  private String version = null;

  public VersionVersionMessage buildDate(String buildDate) {
    this.buildDate = buildDate;
    return this;
  }

  /**
   * Get buildDate
   * @return buildDate
   **/
  @Schema(description = "")
  
    public String getBuildDate() {
    return buildDate;
  }

  public void setBuildDate(String buildDate) {
    this.buildDate = buildDate;
  }

  public VersionVersionMessage compiler(String compiler) {
    this.compiler = compiler;
    return this;
  }

  /**
   * Get compiler
   * @return compiler
   **/
  @Schema(description = "")
  
    public String getCompiler() {
    return compiler;
  }

  public void setCompiler(String compiler) {
    this.compiler = compiler;
  }

  public VersionVersionMessage gitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
    return this;
  }

  /**
   * Get gitCommit
   * @return gitCommit
   **/
  @Schema(description = "")
  
    public String getGitCommit() {
    return gitCommit;
  }

  public void setGitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
  }

  public VersionVersionMessage gitTag(String gitTag) {
    this.gitTag = gitTag;
    return this;
  }

  /**
   * Get gitTag
   * @return gitTag
   **/
  @Schema(description = "")
  
    public String getGitTag() {
    return gitTag;
  }

  public void setGitTag(String gitTag) {
    this.gitTag = gitTag;
  }

  public VersionVersionMessage gitTreeState(String gitTreeState) {
    this.gitTreeState = gitTreeState;
    return this;
  }

  /**
   * Get gitTreeState
   * @return gitTreeState
   **/
  @Schema(description = "")
  
    public String getGitTreeState() {
    return gitTreeState;
  }

  public void setGitTreeState(String gitTreeState) {
    this.gitTreeState = gitTreeState;
  }

  public VersionVersionMessage goVersion(String goVersion) {
    this.goVersion = goVersion;
    return this;
  }

  /**
   * Get goVersion
   * @return goVersion
   **/
  @Schema(description = "")
  
    public String getGoVersion() {
    return goVersion;
  }

  public void setGoVersion(String goVersion) {
    this.goVersion = goVersion;
  }

  public VersionVersionMessage helmVersion(String helmVersion) {
    this.helmVersion = helmVersion;
    return this;
  }

  /**
   * Get helmVersion
   * @return helmVersion
   **/
  @Schema(description = "")
  
    public String getHelmVersion() {
    return helmVersion;
  }

  public void setHelmVersion(String helmVersion) {
    this.helmVersion = helmVersion;
  }

  public VersionVersionMessage jsonnetVersion(String jsonnetVersion) {
    this.jsonnetVersion = jsonnetVersion;
    return this;
  }

  /**
   * Get jsonnetVersion
   * @return jsonnetVersion
   **/
  @Schema(description = "")
  
    public String getJsonnetVersion() {
    return jsonnetVersion;
  }

  public void setJsonnetVersion(String jsonnetVersion) {
    this.jsonnetVersion = jsonnetVersion;
  }

  public VersionVersionMessage kubectlVersion(String kubectlVersion) {
    this.kubectlVersion = kubectlVersion;
    return this;
  }

  /**
   * Get kubectlVersion
   * @return kubectlVersion
   **/
  @Schema(description = "")
  
    public String getKubectlVersion() {
    return kubectlVersion;
  }

  public void setKubectlVersion(String kubectlVersion) {
    this.kubectlVersion = kubectlVersion;
  }

  public VersionVersionMessage kustomizeVersion(String kustomizeVersion) {
    this.kustomizeVersion = kustomizeVersion;
    return this;
  }

  /**
   * Get kustomizeVersion
   * @return kustomizeVersion
   **/
  @Schema(description = "")
  
    public String getKustomizeVersion() {
    return kustomizeVersion;
  }

  public void setKustomizeVersion(String kustomizeVersion) {
    this.kustomizeVersion = kustomizeVersion;
  }

  public VersionVersionMessage platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
   **/
  @Schema(description = "")
  
    public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public VersionVersionMessage version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @Schema(description = "")
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionVersionMessage versionVersionMessage = (VersionVersionMessage) o;
    return Objects.equals(this.buildDate, versionVersionMessage.buildDate) &&
        Objects.equals(this.compiler, versionVersionMessage.compiler) &&
        Objects.equals(this.gitCommit, versionVersionMessage.gitCommit) &&
        Objects.equals(this.gitTag, versionVersionMessage.gitTag) &&
        Objects.equals(this.gitTreeState, versionVersionMessage.gitTreeState) &&
        Objects.equals(this.goVersion, versionVersionMessage.goVersion) &&
        Objects.equals(this.helmVersion, versionVersionMessage.helmVersion) &&
        Objects.equals(this.jsonnetVersion, versionVersionMessage.jsonnetVersion) &&
        Objects.equals(this.kubectlVersion, versionVersionMessage.kubectlVersion) &&
        Objects.equals(this.kustomizeVersion, versionVersionMessage.kustomizeVersion) &&
        Objects.equals(this.platform, versionVersionMessage.platform) &&
        Objects.equals(this.version, versionVersionMessage.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildDate, compiler, gitCommit, gitTag, gitTreeState, goVersion, helmVersion, jsonnetVersion, kubectlVersion, kustomizeVersion, platform, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionVersionMessage {\n");
    
    sb.append("    buildDate: ").append(toIndentedString(buildDate)).append("\n");
    sb.append("    compiler: ").append(toIndentedString(compiler)).append("\n");
    sb.append("    gitCommit: ").append(toIndentedString(gitCommit)).append("\n");
    sb.append("    gitTag: ").append(toIndentedString(gitTag)).append("\n");
    sb.append("    gitTreeState: ").append(toIndentedString(gitTreeState)).append("\n");
    sb.append("    goVersion: ").append(toIndentedString(goVersion)).append("\n");
    sb.append("    helmVersion: ").append(toIndentedString(helmVersion)).append("\n");
    sb.append("    jsonnetVersion: ").append(toIndentedString(jsonnetVersion)).append("\n");
    sb.append("    kubectlVersion: ").append(toIndentedString(kubectlVersion)).append("\n");
    sb.append("    kustomizeVersion: ").append(toIndentedString(kustomizeVersion)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
