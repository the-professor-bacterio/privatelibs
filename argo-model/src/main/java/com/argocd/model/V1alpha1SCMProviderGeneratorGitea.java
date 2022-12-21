package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * SCMProviderGeneratorGitea defines a connection info specific to Gitea.
 */
@Schema(description = "SCMProviderGeneratorGitea defines a connection info specific to Gitea.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1SCMProviderGeneratorGitea  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("allBranches")
  private Boolean allBranches = null;

  @JsonProperty("api")
  private String api = null;

  @JsonProperty("insecure")
  private Boolean insecure = null;

  @JsonProperty("owner")
  private String owner = null;

  @JsonProperty("tokenRef")
  private V1alpha1SecretRef tokenRef = null;

  public V1alpha1SCMProviderGeneratorGitea allBranches(Boolean allBranches) {
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

  public V1alpha1SCMProviderGeneratorGitea api(String api) {
    this.api = api;
    return this;
  }

  /**
   * The Gitea URL to talk to. For example https://gitea.mydomain.com/.
   * @return api
   **/
  @Schema(description = "The Gitea URL to talk to. For example https://gitea.mydomain.com/.")
  
    public String getApi() {
    return api;
  }

  public void setApi(String api) {
    this.api = api;
  }

  public V1alpha1SCMProviderGeneratorGitea insecure(Boolean insecure) {
    this.insecure = insecure;
    return this;
  }

  /**
   * Get insecure
   * @return insecure
   **/
  @Schema(description = "")
  
    public Boolean isInsecure() {
    return insecure;
  }

  public void setInsecure(Boolean insecure) {
    this.insecure = insecure;
  }

  public V1alpha1SCMProviderGeneratorGitea owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Gitea organization or user to scan. Required.
   * @return owner
   **/
  @Schema(description = "Gitea organization or user to scan. Required.")
  
    public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public V1alpha1SCMProviderGeneratorGitea tokenRef(V1alpha1SecretRef tokenRef) {
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
    V1alpha1SCMProviderGeneratorGitea v1alpha1SCMProviderGeneratorGitea = (V1alpha1SCMProviderGeneratorGitea) o;
    return Objects.equals(this.allBranches, v1alpha1SCMProviderGeneratorGitea.allBranches) &&
        Objects.equals(this.api, v1alpha1SCMProviderGeneratorGitea.api) &&
        Objects.equals(this.insecure, v1alpha1SCMProviderGeneratorGitea.insecure) &&
        Objects.equals(this.owner, v1alpha1SCMProviderGeneratorGitea.owner) &&
        Objects.equals(this.tokenRef, v1alpha1SCMProviderGeneratorGitea.tokenRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allBranches, api, insecure, owner, tokenRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1SCMProviderGeneratorGitea {\n");
    
    sb.append("    allBranches: ").append(toIndentedString(allBranches)).append("\n");
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
