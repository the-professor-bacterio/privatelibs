package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * SCMProviderGeneratorBitbucketServer defines connection info specific to Bitbucket Server.
 */
@Schema(description = "SCMProviderGeneratorBitbucketServer defines connection info specific to Bitbucket Server.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1SCMProviderGeneratorBitbucketServer  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("allBranches")
  private Boolean allBranches = null;

  @JsonProperty("api")
  private String api = null;

  @JsonProperty("basicAuth")
  private V1alpha1BasicAuthBitbucketServer basicAuth = null;

  @JsonProperty("project")
  private String project = null;

  public V1alpha1SCMProviderGeneratorBitbucketServer allBranches(Boolean allBranches) {
    this.allBranches = allBranches;
    return this;
  }

  /**
   * Scan all branches instead of just the default branch.
   * @return allBranches
   **/
  @Schema(description = "Scan all branches instead of just the default branch.")
  
    public Boolean isAllBranches() {
    return allBranches;
  }

  public void setAllBranches(Boolean allBranches) {
    this.allBranches = allBranches;
  }

  public V1alpha1SCMProviderGeneratorBitbucketServer api(String api) {
    this.api = api;
    return this;
  }

  /**
   * The Bitbucket Server REST API URL to talk to. Required.
   * @return api
   **/
  @Schema(description = "The Bitbucket Server REST API URL to talk to. Required.")
  
    public String getApi() {
    return api;
  }

  public void setApi(String api) {
    this.api = api;
  }

  public V1alpha1SCMProviderGeneratorBitbucketServer basicAuth(V1alpha1BasicAuthBitbucketServer basicAuth) {
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

  public V1alpha1SCMProviderGeneratorBitbucketServer project(String project) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1SCMProviderGeneratorBitbucketServer v1alpha1SCMProviderGeneratorBitbucketServer = (V1alpha1SCMProviderGeneratorBitbucketServer) o;
    return Objects.equals(this.allBranches, v1alpha1SCMProviderGeneratorBitbucketServer.allBranches) &&
        Objects.equals(this.api, v1alpha1SCMProviderGeneratorBitbucketServer.api) &&
        Objects.equals(this.basicAuth, v1alpha1SCMProviderGeneratorBitbucketServer.basicAuth) &&
        Objects.equals(this.project, v1alpha1SCMProviderGeneratorBitbucketServer.project);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allBranches, api, basicAuth, project);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1SCMProviderGeneratorBitbucketServer {\n");
    
    sb.append("    allBranches: ").append(toIndentedString(allBranches)).append("\n");
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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
