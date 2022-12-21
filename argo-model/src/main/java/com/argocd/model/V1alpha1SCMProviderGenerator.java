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
 * SCMProviderGenerator defines a generator that scrapes a SCMaaS API to find candidate repos.
 */
@Schema(description = "SCMProviderGenerator defines a generator that scrapes a SCMaaS API to find candidate repos.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1SCMProviderGenerator  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("azureDevOps")
  private V1alpha1SCMProviderGeneratorAzureDevOps azureDevOps = null;

  @JsonProperty("bitbucket")
  private V1alpha1SCMProviderGeneratorBitbucket bitbucket = null;

  @JsonProperty("bitbucketServer")
  private V1alpha1SCMProviderGeneratorBitbucketServer bitbucketServer = null;

  @JsonProperty("cloneProtocol")
  private String cloneProtocol = null;

  @JsonProperty("filters")
  @Valid
  private List<V1alpha1SCMProviderGeneratorFilter> filters = null;

  @JsonProperty("gitea")
  private V1alpha1SCMProviderGeneratorGitea gitea = null;

  @JsonProperty("github")
  private V1alpha1SCMProviderGeneratorGithub github = null;

  @JsonProperty("gitlab")
  private V1alpha1SCMProviderGeneratorGitlab gitlab = null;

  @JsonProperty("requeueAfterSeconds")
  private String requeueAfterSeconds = null;

  @JsonProperty("template")
  private V1alpha1ApplicationSetTemplate template = null;

  public V1alpha1SCMProviderGenerator azureDevOps(V1alpha1SCMProviderGeneratorAzureDevOps azureDevOps) {
    this.azureDevOps = azureDevOps;
    return this;
  }

  /**
   * Get azureDevOps
   * @return azureDevOps
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1SCMProviderGeneratorAzureDevOps getAzureDevOps() {
    return azureDevOps;
  }

  public void setAzureDevOps(V1alpha1SCMProviderGeneratorAzureDevOps azureDevOps) {
    this.azureDevOps = azureDevOps;
  }

  public V1alpha1SCMProviderGenerator bitbucket(V1alpha1SCMProviderGeneratorBitbucket bitbucket) {
    this.bitbucket = bitbucket;
    return this;
  }

  /**
   * Get bitbucket
   * @return bitbucket
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1SCMProviderGeneratorBitbucket getBitbucket() {
    return bitbucket;
  }

  public void setBitbucket(V1alpha1SCMProviderGeneratorBitbucket bitbucket) {
    this.bitbucket = bitbucket;
  }

  public V1alpha1SCMProviderGenerator bitbucketServer(V1alpha1SCMProviderGeneratorBitbucketServer bitbucketServer) {
    this.bitbucketServer = bitbucketServer;
    return this;
  }

  /**
   * Get bitbucketServer
   * @return bitbucketServer
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1SCMProviderGeneratorBitbucketServer getBitbucketServer() {
    return bitbucketServer;
  }

  public void setBitbucketServer(V1alpha1SCMProviderGeneratorBitbucketServer bitbucketServer) {
    this.bitbucketServer = bitbucketServer;
  }

  public V1alpha1SCMProviderGenerator cloneProtocol(String cloneProtocol) {
    this.cloneProtocol = cloneProtocol;
    return this;
  }

  /**
   * Which protocol to use for the SCM URL. Default is provider-specific but ssh if possible. Not all providers necessarily support all protocols.
   * @return cloneProtocol
   **/
  @Schema(description = "Which protocol to use for the SCM URL. Default is provider-specific but ssh if possible. Not all providers necessarily support all protocols.")
  
    public String getCloneProtocol() {
    return cloneProtocol;
  }

  public void setCloneProtocol(String cloneProtocol) {
    this.cloneProtocol = cloneProtocol;
  }

  public V1alpha1SCMProviderGenerator filters(List<V1alpha1SCMProviderGeneratorFilter> filters) {
    this.filters = filters;
    return this;
  }

  public V1alpha1SCMProviderGenerator addFiltersItem(V1alpha1SCMProviderGeneratorFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Filters for which repos should be considered.
   * @return filters
   **/
  @Schema(description = "Filters for which repos should be considered.")
      @Valid
    public List<V1alpha1SCMProviderGeneratorFilter> getFilters() {
    return filters;
  }

  public void setFilters(List<V1alpha1SCMProviderGeneratorFilter> filters) {
    this.filters = filters;
  }

  public V1alpha1SCMProviderGenerator gitea(V1alpha1SCMProviderGeneratorGitea gitea) {
    this.gitea = gitea;
    return this;
  }

  /**
   * Get gitea
   * @return gitea
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1SCMProviderGeneratorGitea getGitea() {
    return gitea;
  }

  public void setGitea(V1alpha1SCMProviderGeneratorGitea gitea) {
    this.gitea = gitea;
  }

  public V1alpha1SCMProviderGenerator github(V1alpha1SCMProviderGeneratorGithub github) {
    this.github = github;
    return this;
  }

  /**
   * Get github
   * @return github
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1SCMProviderGeneratorGithub getGithub() {
    return github;
  }

  public void setGithub(V1alpha1SCMProviderGeneratorGithub github) {
    this.github = github;
  }

  public V1alpha1SCMProviderGenerator gitlab(V1alpha1SCMProviderGeneratorGitlab gitlab) {
    this.gitlab = gitlab;
    return this;
  }

  /**
   * Get gitlab
   * @return gitlab
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1SCMProviderGeneratorGitlab getGitlab() {
    return gitlab;
  }

  public void setGitlab(V1alpha1SCMProviderGeneratorGitlab gitlab) {
    this.gitlab = gitlab;
  }

  public V1alpha1SCMProviderGenerator requeueAfterSeconds(String requeueAfterSeconds) {
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

  public V1alpha1SCMProviderGenerator template(V1alpha1ApplicationSetTemplate template) {
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
    V1alpha1SCMProviderGenerator v1alpha1SCMProviderGenerator = (V1alpha1SCMProviderGenerator) o;
    return Objects.equals(this.azureDevOps, v1alpha1SCMProviderGenerator.azureDevOps) &&
        Objects.equals(this.bitbucket, v1alpha1SCMProviderGenerator.bitbucket) &&
        Objects.equals(this.bitbucketServer, v1alpha1SCMProviderGenerator.bitbucketServer) &&
        Objects.equals(this.cloneProtocol, v1alpha1SCMProviderGenerator.cloneProtocol) &&
        Objects.equals(this.filters, v1alpha1SCMProviderGenerator.filters) &&
        Objects.equals(this.gitea, v1alpha1SCMProviderGenerator.gitea) &&
        Objects.equals(this.github, v1alpha1SCMProviderGenerator.github) &&
        Objects.equals(this.gitlab, v1alpha1SCMProviderGenerator.gitlab) &&
        Objects.equals(this.requeueAfterSeconds, v1alpha1SCMProviderGenerator.requeueAfterSeconds) &&
        Objects.equals(this.template, v1alpha1SCMProviderGenerator.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azureDevOps, bitbucket, bitbucketServer, cloneProtocol, filters, gitea, github, gitlab, requeueAfterSeconds, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1SCMProviderGenerator {\n");
    
    sb.append("    azureDevOps: ").append(toIndentedString(azureDevOps)).append("\n");
    sb.append("    bitbucket: ").append(toIndentedString(bitbucket)).append("\n");
    sb.append("    bitbucketServer: ").append(toIndentedString(bitbucketServer)).append("\n");
    sb.append("    cloneProtocol: ").append(toIndentedString(cloneProtocol)).append("\n");
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
