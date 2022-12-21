package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * SCMProviderGeneratorGithub defines connection info specific to GitHub.
 */
@Schema(description = "SCMProviderGeneratorGithub defines connection info specific to GitHub.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1SCMProviderGeneratorGithub  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("allBranches")
  private Boolean allBranches = null;

  @JsonProperty("api")
  private String api = null;

  @JsonProperty("appSecretName")
  private String appSecretName = null;

  @JsonProperty("organization")
  private String organization = null;

  @JsonProperty("tokenRef")
  private V1alpha1SecretRef tokenRef = null;

  public V1alpha1SCMProviderGeneratorGithub allBranches(Boolean allBranches) {
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

  public V1alpha1SCMProviderGeneratorGithub api(String api) {
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

  public V1alpha1SCMProviderGeneratorGithub appSecretName(String appSecretName) {
    this.appSecretName = appSecretName;
    return this;
  }

  /**
   * AppSecretName is a reference to a GitHub App repo-creds secret.
   * @return appSecretName
   **/
  @Schema(description = "AppSecretName is a reference to a GitHub App repo-creds secret.")
  
    public String getAppSecretName() {
    return appSecretName;
  }

  public void setAppSecretName(String appSecretName) {
    this.appSecretName = appSecretName;
  }

  public V1alpha1SCMProviderGeneratorGithub organization(String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * GitHub org to scan. Required.
   * @return organization
   **/
  @Schema(description = "GitHub org to scan. Required.")
  
    public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public V1alpha1SCMProviderGeneratorGithub tokenRef(V1alpha1SecretRef tokenRef) {
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
    V1alpha1SCMProviderGeneratorGithub v1alpha1SCMProviderGeneratorGithub = (V1alpha1SCMProviderGeneratorGithub) o;
    return Objects.equals(this.allBranches, v1alpha1SCMProviderGeneratorGithub.allBranches) &&
        Objects.equals(this.api, v1alpha1SCMProviderGeneratorGithub.api) &&
        Objects.equals(this.appSecretName, v1alpha1SCMProviderGeneratorGithub.appSecretName) &&
        Objects.equals(this.organization, v1alpha1SCMProviderGeneratorGithub.organization) &&
        Objects.equals(this.tokenRef, v1alpha1SCMProviderGeneratorGithub.tokenRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allBranches, api, appSecretName, organization, tokenRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1SCMProviderGeneratorGithub {\n");
    
    sb.append("    allBranches: ").append(toIndentedString(allBranches)).append("\n");
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    appSecretName: ").append(toIndentedString(appSecretName)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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
