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
 * PullRequestGenerator defines a generator that scrapes a PullRequest API to find candidate pull requests.
 */
@Schema(description = "PullRequestGenerator defines a generator that scrapes a PullRequest API to find candidate pull requests.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1PullRequestGenerator  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("bitbucketServer")
  private V1alpha1PullRequestGeneratorBitbucketServer bitbucketServer = null;

  @JsonProperty("filters")
  @Valid
  private List<V1alpha1PullRequestGeneratorFilter> filters = null;

  @JsonProperty("gitea")
  private V1alpha1PullRequestGeneratorGitea gitea = null;

  @JsonProperty("github")
  private V1alpha1PullRequestGeneratorGithub github = null;

  @JsonProperty("gitlab")
  private V1alpha1PullRequestGeneratorGitLab gitlab = null;

  @JsonProperty("requeueAfterSeconds")
  private String requeueAfterSeconds = null;

  @JsonProperty("template")
  private V1alpha1ApplicationSetTemplate template = null;

  public V1alpha1PullRequestGenerator bitbucketServer(V1alpha1PullRequestGeneratorBitbucketServer bitbucketServer) {
    this.bitbucketServer = bitbucketServer;
    return this;
  }

  /**
   * Get bitbucketServer
   * @return bitbucketServer
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1PullRequestGeneratorBitbucketServer getBitbucketServer() {
    return bitbucketServer;
  }

  public void setBitbucketServer(V1alpha1PullRequestGeneratorBitbucketServer bitbucketServer) {
    this.bitbucketServer = bitbucketServer;
  }

  public V1alpha1PullRequestGenerator filters(List<V1alpha1PullRequestGeneratorFilter> filters) {
    this.filters = filters;
    return this;
  }

  public V1alpha1PullRequestGenerator addFiltersItem(V1alpha1PullRequestGeneratorFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Filters for which pull requests should be considered.
   * @return filters
   **/
  @Schema(description = "Filters for which pull requests should be considered.")
      @Valid
    public List<V1alpha1PullRequestGeneratorFilter> getFilters() {
    return filters;
  }

  public void setFilters(List<V1alpha1PullRequestGeneratorFilter> filters) {
    this.filters = filters;
  }

  public V1alpha1PullRequestGenerator gitea(V1alpha1PullRequestGeneratorGitea gitea) {
    this.gitea = gitea;
    return this;
  }

  /**
   * Get gitea
   * @return gitea
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1PullRequestGeneratorGitea getGitea() {
    return gitea;
  }

  public void setGitea(V1alpha1PullRequestGeneratorGitea gitea) {
    this.gitea = gitea;
  }

  public V1alpha1PullRequestGenerator github(V1alpha1PullRequestGeneratorGithub github) {
    this.github = github;
    return this;
  }

  /**
   * Get github
   * @return github
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1PullRequestGeneratorGithub getGithub() {
    return github;
  }

  public void setGithub(V1alpha1PullRequestGeneratorGithub github) {
    this.github = github;
  }

  public V1alpha1PullRequestGenerator gitlab(V1alpha1PullRequestGeneratorGitLab gitlab) {
    this.gitlab = gitlab;
    return this;
  }

  /**
   * Get gitlab
   * @return gitlab
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1PullRequestGeneratorGitLab getGitlab() {
    return gitlab;
  }

  public void setGitlab(V1alpha1PullRequestGeneratorGitLab gitlab) {
    this.gitlab = gitlab;
  }

  public V1alpha1PullRequestGenerator requeueAfterSeconds(String requeueAfterSeconds) {
    this.requeueAfterSeconds = requeueAfterSeconds;
    return this;
  }

  /**
   * Standard parameters.
   * @return requeueAfterSeconds
   **/
  @Schema(description = "Standard parameters.")
  
    public String getRequeueAfterSeconds() {
    return requeueAfterSeconds;
  }

  public void setRequeueAfterSeconds(String requeueAfterSeconds) {
    this.requeueAfterSeconds = requeueAfterSeconds;
  }

  public V1alpha1PullRequestGenerator template(V1alpha1ApplicationSetTemplate template) {
    this.template = template;
    return this;
  }

  /**
   * Get template
   * @return template
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ApplicationSetTemplate getTemplate() {
    return template;
  }

  public void setTemplate(V1alpha1ApplicationSetTemplate template) {
    this.template = template;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PullRequestGenerator v1alpha1PullRequestGenerator = (V1alpha1PullRequestGenerator) o;
    return Objects.equals(this.bitbucketServer, v1alpha1PullRequestGenerator.bitbucketServer) &&
        Objects.equals(this.filters, v1alpha1PullRequestGenerator.filters) &&
        Objects.equals(this.gitea, v1alpha1PullRequestGenerator.gitea) &&
        Objects.equals(this.github, v1alpha1PullRequestGenerator.github) &&
        Objects.equals(this.gitlab, v1alpha1PullRequestGenerator.gitlab) &&
        Objects.equals(this.requeueAfterSeconds, v1alpha1PullRequestGenerator.requeueAfterSeconds) &&
        Objects.equals(this.template, v1alpha1PullRequestGenerator.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bitbucketServer, filters, gitea, github, gitlab, requeueAfterSeconds, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PullRequestGenerator {\n");
    
    sb.append("    bitbucketServer: ").append(toIndentedString(bitbucketServer)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    gitea: ").append(toIndentedString(gitea)).append("\n");
    sb.append("    github: ").append(toIndentedString(github)).append("\n");
    sb.append("    gitlab: ").append(toIndentedString(gitlab)).append("\n");
    sb.append("    requeueAfterSeconds: ").append(toIndentedString(requeueAfterSeconds)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
