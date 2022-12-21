package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * SCMProviderGeneratorAzureDevOps defines connection info specific to Azure DevOps.
 */
@Schema(description = "SCMProviderGeneratorAzureDevOps defines connection info specific to Azure DevOps.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1SCMProviderGeneratorAzureDevOps  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("accessTokenRef")
  private V1alpha1SecretRef accessTokenRef = null;

  @JsonProperty("allBranches")
  private Boolean allBranches = null;

  @JsonProperty("api")
  private String api = null;

  @JsonProperty("organization")
  private String organization = null;

  @JsonProperty("teamProject")
  private String teamProject = null;

  public V1alpha1SCMProviderGeneratorAzureDevOps accessTokenRef(V1alpha1SecretRef accessTokenRef) {
    this.accessTokenRef = accessTokenRef;
    return this;
  }

  /**
   * Get accessTokenRef
   * @return accessTokenRef
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1SecretRef getAccessTokenRef() {
    return accessTokenRef;
  }

  public void setAccessTokenRef(V1alpha1SecretRef accessTokenRef) {
    this.accessTokenRef = accessTokenRef;
  }

  public V1alpha1SCMProviderGeneratorAzureDevOps allBranches(Boolean allBranches) {
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

  public V1alpha1SCMProviderGeneratorAzureDevOps api(String api) {
    this.api = api;
    return this;
  }

  /**
   * The URL to Azure DevOps. If blank, use https://dev.azure.com.
   * @return api
   **/
  @Schema(description = "The URL to Azure DevOps. If blank, use https://dev.azure.com.")
  
    public String getApi() {
    return api;
  }

  public void setApi(String api) {
    this.api = api;
  }

  public V1alpha1SCMProviderGeneratorAzureDevOps organization(String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Azure Devops organization. Required. E.g. \"my-organization\".
   * @return organization
   **/
  @Schema(description = "Azure Devops organization. Required. E.g. \"my-organization\".")
  
    public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public V1alpha1SCMProviderGeneratorAzureDevOps teamProject(String teamProject) {
    this.teamProject = teamProject;
    return this;
  }

  /**
   * Azure Devops team project. Required. E.g. \"my-team\".
   * @return teamProject
   **/
  @Schema(description = "Azure Devops team project. Required. E.g. \"my-team\".")
  
    public String getTeamProject() {
    return teamProject;
  }

  public void setTeamProject(String teamProject) {
    this.teamProject = teamProject;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1SCMProviderGeneratorAzureDevOps v1alpha1SCMProviderGeneratorAzureDevOps = (V1alpha1SCMProviderGeneratorAzureDevOps) o;
    return Objects.equals(this.accessTokenRef, v1alpha1SCMProviderGeneratorAzureDevOps.accessTokenRef) &&
        Objects.equals(this.allBranches, v1alpha1SCMProviderGeneratorAzureDevOps.allBranches) &&
        Objects.equals(this.api, v1alpha1SCMProviderGeneratorAzureDevOps.api) &&
        Objects.equals(this.organization, v1alpha1SCMProviderGeneratorAzureDevOps.organization) &&
        Objects.equals(this.teamProject, v1alpha1SCMProviderGeneratorAzureDevOps.teamProject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessTokenRef, allBranches, api, organization, teamProject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1SCMProviderGeneratorAzureDevOps {\n");
    
    sb.append("    accessTokenRef: ").append(toIndentedString(accessTokenRef)).append("\n");
    sb.append("    allBranches: ").append(toIndentedString(allBranches)).append("\n");
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    teamProject: ").append(toIndentedString(teamProject)).append("\n");
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
