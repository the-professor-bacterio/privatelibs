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
 * PullRequestGenerator defines connection info specific to GitHub.
 */
@Schema(description = "PullRequestGenerator defines connection info specific to GitHub.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1PullRequestGeneratorGithub  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("api")
  private String api = null;

  @JsonProperty("appSecretName")
  private String appSecretName = null;

  @JsonProperty("labels")
  @Valid
  private List<String> labels = null;

  @JsonProperty("owner")
  private String owner = null;

  @JsonProperty("repo")
  private String repo = null;

  @JsonProperty("tokenRef")
  private V1alpha1SecretRef tokenRef = null;

  public V1alpha1PullRequestGeneratorGithub api(String api) {
    this.api = api;
    return this;
  }

  /**
   * The GitHub API URL to talk to. If blank, use https://api.github.com/.
   * @return api
   **/
  @Schema(description = "The GitHub API URL to talk to. If blank, use https://api.github.com/.")
  
    public String getApi() {
    return api;
  }

  public void setApi(String api) {
    this.api = api;
  }

  public V1alpha1PullRequestGeneratorGithub appSecretName(String appSecretName) {
    this.appSecretName = appSecretName;
    return this;
  }

  /**
   * AppSecretName is a reference to a GitHub App repo-creds secret with permission to access pull requests.
   * @return appSecretName
   **/
  @Schema(description = "AppSecretName is a reference to a GitHub App repo-creds secret with permission to access pull requests.")
  
    public String getAppSecretName() {
    return appSecretName;
  }

  public void setAppSecretName(String appSecretName) {
    this.appSecretName = appSecretName;
  }

  public V1alpha1PullRequestGeneratorGithub labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public V1alpha1PullRequestGeneratorGithub addLabelsItem(String labelsItem) {
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

  public V1alpha1PullRequestGeneratorGithub owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * GitHub org or user to scan. Required.
   * @return owner
   **/
  @Schema(description = "GitHub org or user to scan. Required.")
  
    public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public V1alpha1PullRequestGeneratorGithub repo(String repo) {
    this.repo = repo;
    return this;
  }

  /**
   * GitHub repo name to scan. Required.
   * @return repo
   **/
  @Schema(description = "GitHub repo name to scan. Required.")
  
    public String getRepo() {
    return repo;
  }

  public void setRepo(String repo) {
    this.repo = repo;
  }

  public V1alpha1PullRequestGeneratorGithub tokenRef(V1alpha1SecretRef tokenRef) {
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
    V1alpha1PullRequestGeneratorGithub v1alpha1PullRequestGeneratorGithub = (V1alpha1PullRequestGeneratorGithub) o;
    return Objects.equals(this.api, v1alpha1PullRequestGeneratorGithub.api) &&
        Objects.equals(this.appSecretName, v1alpha1PullRequestGeneratorGithub.appSecretName) &&
        Objects.equals(this.labels, v1alpha1PullRequestGeneratorGithub.labels) &&
        Objects.equals(this.owner, v1alpha1PullRequestGeneratorGithub.owner) &&
        Objects.equals(this.repo, v1alpha1PullRequestGeneratorGithub.repo) &&
        Objects.equals(this.tokenRef, v1alpha1PullRequestGeneratorGithub.tokenRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(api, appSecretName, labels, owner, repo, tokenRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PullRequestGeneratorGithub {\n");
    
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    appSecretName: ").append(toIndentedString(appSecretName)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
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
