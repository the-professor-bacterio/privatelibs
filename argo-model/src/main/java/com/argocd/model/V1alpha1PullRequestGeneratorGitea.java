package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * PullRequestGenerator defines connection info specific to Gitea.
 */
@Schema(description = "PullRequestGenerator defines connection info specific to Gitea.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1PullRequestGeneratorGitea  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("api")
  private String api = null;

  @JsonProperty("insecure")
  private Boolean insecure = null;

  @JsonProperty("owner")
  private String owner = null;

  @JsonProperty("repo")
  private String repo = null;

  @JsonProperty("tokenRef")
  private V1alpha1SecretRef tokenRef = null;

  public V1alpha1PullRequestGeneratorGitea api(String api) {
    this.api = api;
    return this;
  }

  /**
   * Get api
   * @return api
   **/
  @Schema(description = "")
  
    public String getApi() {
    return api;
  }

  public void setApi(String api) {
    this.api = api;
  }

  public V1alpha1PullRequestGeneratorGitea insecure(Boolean insecure) {
    this.insecure = insecure;
    return this;
  }

  /**
   * Allow insecure tls, for self-signed certificates; default: false.
   * @return insecure
   **/
  @Schema(description = "Allow insecure tls, for self-signed certificates; default: false.")
  
    public Boolean isInsecure() {
    return insecure;
  }

  public void setInsecure(Boolean insecure) {
    this.insecure = insecure;
  }

  public V1alpha1PullRequestGeneratorGitea owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Gitea org or user to scan. Required.
   * @return owner
   **/
  @Schema(description = "Gitea org or user to scan. Required.")
  
    public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public V1alpha1PullRequestGeneratorGitea repo(String repo) {
    this.repo = repo;
    return this;
  }

  /**
   * Gitea repo name to scan. Required.
   * @return repo
   **/
  @Schema(description = "Gitea repo name to scan. Required.")
  
    public String getRepo() {
    return repo;
  }

  public void setRepo(String repo) {
    this.repo = repo;
  }

  public V1alpha1PullRequestGeneratorGitea tokenRef(V1alpha1SecretRef tokenRef) {
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
    V1alpha1PullRequestGeneratorGitea v1alpha1PullRequestGeneratorGitea = (V1alpha1PullRequestGeneratorGitea) o;
    return Objects.equals(this.api, v1alpha1PullRequestGeneratorGitea.api) &&
        Objects.equals(this.insecure, v1alpha1PullRequestGeneratorGitea.insecure) &&
        Objects.equals(this.owner, v1alpha1PullRequestGeneratorGitea.owner) &&
        Objects.equals(this.repo, v1alpha1PullRequestGeneratorGitea.repo) &&
        Objects.equals(this.tokenRef, v1alpha1PullRequestGeneratorGitea.tokenRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(api, insecure, owner, repo, tokenRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PullRequestGeneratorGitea {\n");
    
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
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
