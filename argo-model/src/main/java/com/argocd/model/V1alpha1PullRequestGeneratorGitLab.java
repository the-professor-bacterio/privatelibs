package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PullRequestGeneratorGitLab defines connection info specific to GitLab.
 */
@Schema(description = "PullRequestGeneratorGitLab defines connection info specific to GitLab.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1PullRequestGeneratorGitLab  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("api")
  private String api = null;

  @JsonProperty("labels")
  @Valid
  private List<String> labels = null;

  @JsonProperty("project")
  private String project = null;

  @JsonProperty("pullRequestState")
  private String pullRequestState = null;

  @JsonProperty("tokenRef")
  private V1alpha1SecretRef tokenRef = null;

  public V1alpha1PullRequestGeneratorGitLab api(String api) {
    this.api = api;
    return this;
  }

  /**
   * The GitLab API URL to talk to. If blank, uses https://gitlab.com/.
   * @return api
   **/
  @Schema(description = "The GitLab API URL to talk to. If blank, uses https://gitlab.com/.")
  
    public String getApi() {
    return api;
  }

  public void setApi(String api) {
    this.api = api;
  }

  public V1alpha1PullRequestGeneratorGitLab labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public V1alpha1PullRequestGeneratorGitLab addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
   **/
  @Schema(description = "")
  
    public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public V1alpha1PullRequestGeneratorGitLab project(String project) {
    this.project = project;
    return this;
  }

  /**
   * GitLab project to scan. Required.
   * @return project
   **/
  @Schema(description = "GitLab project to scan. Required.")
  
    public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public V1alpha1PullRequestGeneratorGitLab pullRequestState(String pullRequestState) {
    this.pullRequestState = pullRequestState;
    return this;
  }

  /**
   * Get pullRequestState
   * @return pullRequestState
   **/
  @Schema(description = "")
  
    public String getPullRequestState() {
    return pullRequestState;
  }

  public void setPullRequestState(String pullRequestState) {
    this.pullRequestState = pullRequestState;
  }

  public V1alpha1PullRequestGeneratorGitLab tokenRef(V1alpha1SecretRef tokenRef) {
    this.tokenRef = tokenRef;
    return this;
  }

  /**
   * Get tokenRef
   * @return tokenRef
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1SecretRef getTokenRef() {
    return tokenRef;
  }

  public void setTokenRef(V1alpha1SecretRef tokenRef) {
    this.tokenRef = tokenRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PullRequestGeneratorGitLab v1alpha1PullRequestGeneratorGitLab = (V1alpha1PullRequestGeneratorGitLab) o;
    return Objects.equals(this.api, v1alpha1PullRequestGeneratorGitLab.api) &&
        Objects.equals(this.labels, v1alpha1PullRequestGeneratorGitLab.labels) &&
        Objects.equals(this.project, v1alpha1PullRequestGeneratorGitLab.project) &&
        Objects.equals(this.pullRequestState, v1alpha1PullRequestGeneratorGitLab.pullRequestState) &&
        Objects.equals(this.tokenRef, v1alpha1PullRequestGeneratorGitLab.tokenRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(api, labels, project, pullRequestState, tokenRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PullRequestGeneratorGitLab {\n");
    
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    pullRequestState: ").append(toIndentedString(pullRequestState)).append("\n");
    sb.append("    tokenRef: ").append(toIndentedString(tokenRef)).append("\n");
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
