package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1ApplicationSource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ApplicationSource  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("chart")
  private String chart = null;

  @JsonProperty("directory")
  private V1alpha1ApplicationSourceDirectory directory = null;

  @JsonProperty("helm")
  private V1alpha1ApplicationSourceHelm helm = null;

  @JsonProperty("kustomize")
  private V1alpha1ApplicationSourceKustomize kustomize = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("plugin")
  private V1alpha1ApplicationSourcePlugin plugin = null;

  @JsonProperty("repoURL")
  private String repoURL = null;

  @JsonProperty("targetRevision")
  private String targetRevision = null;

  public V1alpha1ApplicationSource chart(String chart) {
    this.chart = chart;
    return this;
  }

  /**
   * Chart is a Helm chart name, and must be specified for applications sourced from a Helm repo.
   * @return chart
   **/
  @Schema(description = "Chart is a Helm chart name, and must be specified for applications sourced from a Helm repo.")
  
    public String getChart() {
    return chart;
  }

  public void setChart(String chart) {
    this.chart = chart;
  }

  public V1alpha1ApplicationSource directory(V1alpha1ApplicationSourceDirectory directory) {
    this.directory = directory;
    return this;
  }

  /**
   * Get directory
   * @return directory
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ApplicationSourceDirectory getDirectory() {
    return directory;
  }

  public void setDirectory(V1alpha1ApplicationSourceDirectory directory) {
    this.directory = directory;
  }

  public V1alpha1ApplicationSource helm(V1alpha1ApplicationSourceHelm helm) {
    this.helm = helm;
    return this;
  }

  /**
   * Get helm
   * @return helm
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ApplicationSourceHelm getHelm() {
    return helm;
  }

  public void setHelm(V1alpha1ApplicationSourceHelm helm) {
    this.helm = helm;
  }

  public V1alpha1ApplicationSource kustomize(V1alpha1ApplicationSourceKustomize kustomize) {
    this.kustomize = kustomize;
    return this;
  }

  /**
   * Get kustomize
   * @return kustomize
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ApplicationSourceKustomize getKustomize() {
    return kustomize;
  }

  public void setKustomize(V1alpha1ApplicationSourceKustomize kustomize) {
    this.kustomize = kustomize;
  }

  public V1alpha1ApplicationSource path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Path is a directory path within the Git repository, and is only valid for applications sourced from Git.
   * @return path
   **/
  @Schema(description = "Path is a directory path within the Git repository, and is only valid for applications sourced from Git.")
  
    public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public V1alpha1ApplicationSource plugin(V1alpha1ApplicationSourcePlugin plugin) {
    this.plugin = plugin;
    return this;
  }

  /**
   * Get plugin
   * @return plugin
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ApplicationSourcePlugin getPlugin() {
    return plugin;
  }

  public void setPlugin(V1alpha1ApplicationSourcePlugin plugin) {
    this.plugin = plugin;
  }

  public V1alpha1ApplicationSource repoURL(String repoURL) {
    this.repoURL = repoURL;
    return this;
  }

  /**
   * Get repoURL
   * @return repoURL
   **/
  @Schema(description = "")
  
    public String getRepoURL() {
    return repoURL;
  }

  public void setRepoURL(String repoURL) {
    this.repoURL = repoURL;
  }

  public V1alpha1ApplicationSource targetRevision(String targetRevision) {
    this.targetRevision = targetRevision;
    return this;
  }

  /**
   * TargetRevision defines the revision of the source to sync the application to. In case of Git, this can be commit, tag, or branch. If omitted, will equal to HEAD. In case of Helm, this is a semver tag for the Chart's version.
   * @return targetRevision
   **/
  @Schema(description = "TargetRevision defines the revision of the source to sync the application to. In case of Git, this can be commit, tag, or branch. If omitted, will equal to HEAD. In case of Helm, this is a semver tag for the Chart's version.")
  
    public String getTargetRevision() {
    return targetRevision;
  }

  public void setTargetRevision(String targetRevision) {
    this.targetRevision = targetRevision;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ApplicationSource v1alpha1ApplicationSource = (V1alpha1ApplicationSource) o;
    return Objects.equals(this.chart, v1alpha1ApplicationSource.chart) &&
        Objects.equals(this.directory, v1alpha1ApplicationSource.directory) &&
        Objects.equals(this.helm, v1alpha1ApplicationSource.helm) &&
        Objects.equals(this.kustomize, v1alpha1ApplicationSource.kustomize) &&
        Objects.equals(this.path, v1alpha1ApplicationSource.path) &&
        Objects.equals(this.plugin, v1alpha1ApplicationSource.plugin) &&
        Objects.equals(this.repoURL, v1alpha1ApplicationSource.repoURL) &&
        Objects.equals(this.targetRevision, v1alpha1ApplicationSource.targetRevision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chart, directory, helm, kustomize, path, plugin, repoURL, targetRevision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ApplicationSource {\n");
    
    sb.append("    chart: ").append(toIndentedString(chart)).append("\n");
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    helm: ").append(toIndentedString(helm)).append("\n");
    sb.append("    kustomize: ").append(toIndentedString(kustomize)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    plugin: ").append(toIndentedString(plugin)).append("\n");
    sb.append("    repoURL: ").append(toIndentedString(repoURL)).append("\n");
    sb.append("    targetRevision: ").append(toIndentedString(targetRevision)).append("\n");
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
