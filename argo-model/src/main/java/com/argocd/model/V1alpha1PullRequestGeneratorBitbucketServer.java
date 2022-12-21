package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * PullRequestGenerator defines connection info specific to BitbucketServer.
 */
@Schema(description = "PullRequestGenerator defines connection info specific to BitbucketServer.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1PullRequestGeneratorBitbucketServer  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("api")
  private String api = null;

  @JsonProperty("basicAuth")
  private V1alpha1BasicAuthBitbucketServer basicAuth = null;

  @JsonProperty("project")
  private String project = null;

  @JsonProperty("repo")
  private String repo = null;

  public V1alpha1PullRequestGeneratorBitbucketServer api(String api) {
    this.api = api;
    return this;
  }

  /**
   * The Bitbucket REST API URL to talk to e.g. https://bitbucket.org/rest Required.
   * @return api
   **/
  @Schema(description = "The Bitbucket REST API URL to talk to e.g. https://bitbucket.org/rest Required.")
  
    public String getApi() {
    return api;
  }

  public void setApi(String api) {
    this.api = api;
  }

  public V1alpha1PullRequestGeneratorBitbucketServer basicAuth(V1alpha1BasicAuthBitbucketServer basicAuth) {
    this.basicAuth = basicAuth;
    return this;
  }

  /**
   * Get basicAuth
   * @return basicAuth
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1BasicAuthBitbucketServer getBasicAuth() {
    return basicAuth;
  }

  public void setBasicAuth(V1alpha1BasicAuthBitbucketServer basicAuth) {
    this.basicAuth = basicAuth;
  }

  public V1alpha1PullRequestGeneratorBitbucketServer project(String project) {
    this.project = project;
    return this;
  }

  /**
   * Project to scan. Required.
   * @return project
   **/
  @Schema(description = "Project to scan. Required.")
  
    public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public V1alpha1PullRequestGeneratorBitbucketServer repo(String repo) {
    this.repo = repo;
    return this;
  }

  /**
   * Repo name to scan. Required.
   * @return repo
   **/
  @Schema(description = "Repo name to scan. Required.")
  
    public String getRepo() {
    return repo;
  }

  public void setRepo(String repo) {
    this.repo = repo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PullRequestGeneratorBitbucketServer v1alpha1PullRequestGeneratorBitbucketServer = (V1alpha1PullRequestGeneratorBitbucketServer) o;
    return Objects.equals(this.api, v1alpha1PullRequestGeneratorBitbucketServer.api) &&
        Objects.equals(this.basicAuth, v1alpha1PullRequestGeneratorBitbucketServer.basicAuth) &&
        Objects.equals(this.project, v1alpha1PullRequestGeneratorBitbucketServer.project) &&
        Objects.equals(this.repo, v1alpha1PullRequestGeneratorBitbucketServer.repo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(api, basicAuth, project, repo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PullRequestGeneratorBitbucketServer {\n");
    
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
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
