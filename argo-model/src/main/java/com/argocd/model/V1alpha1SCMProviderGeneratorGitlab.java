package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * SCMProviderGeneratorGitlab defines connection info specific to Gitlab.
 */
@Schema(description = "SCMProviderGeneratorGitlab defines connection info specific to Gitlab.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1SCMProviderGeneratorGitlab  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("allBranches")
  private Boolean allBranches = null;

  @JsonProperty("api")
  private String api = null;

  @JsonProperty("group")
  private String group = null;

  @JsonProperty("includeSubgroups")
  private Boolean includeSubgroups = null;

  @JsonProperty("tokenRef")
  private V1alpha1SecretRef tokenRef = null;

  public V1alpha1SCMProviderGeneratorGitlab allBranches(Boolean allBranches) {
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

  public V1alpha1SCMProviderGeneratorGitlab api(String api) {
    this.api = api;
    return this;
  }

  /**
   * The Gitlab API URL to talk to.
   * @return api
   **/
  @Schema(description = "The Gitlab API URL to talk to.")
  
    public String getApi() {
    return api;
  }

  public void setApi(String api) {
    this.api = api;
  }

  public V1alpha1SCMProviderGeneratorGitlab group(String group) {
    this.group = group;
    return this;
  }

  /**
   * Gitlab group to scan. Required.  You can use either the project id (recommended) or the full namespaced path.
   * @return group
   **/
  @Schema(description = "Gitlab group to scan. Required.  You can use either the project id (recommended) or the full namespaced path.")
  
    public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public V1alpha1SCMProviderGeneratorGitlab includeSubgroups(Boolean includeSubgroups) {
    this.includeSubgroups = includeSubgroups;
    return this;
  }

  /**
   * Get includeSubgroups
   * @return includeSubgroups
   **/
  @Schema(description = "")
  
    public Boolean isIncludeSubgroups() {
    return includeSubgroups;
  }

  public void setIncludeSubgroups(Boolean includeSubgroups) {
    this.includeSubgroups = includeSubgroups;
  }

  public V1alpha1SCMProviderGeneratorGitlab tokenRef(V1alpha1SecretRef tokenRef) {
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
    V1alpha1SCMProviderGeneratorGitlab v1alpha1SCMProviderGeneratorGitlab = (V1alpha1SCMProviderGeneratorGitlab) o;
    return Objects.equals(this.allBranches, v1alpha1SCMProviderGeneratorGitlab.allBranches) &&
        Objects.equals(this.api, v1alpha1SCMProviderGeneratorGitlab.api) &&
        Objects.equals(this.group, v1alpha1SCMProviderGeneratorGitlab.group) &&
        Objects.equals(this.includeSubgroups, v1alpha1SCMProviderGeneratorGitlab.includeSubgroups) &&
        Objects.equals(this.tokenRef, v1alpha1SCMProviderGeneratorGitlab.tokenRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allBranches, api, group, includeSubgroups, tokenRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1SCMProviderGeneratorGitlab {\n");
    
    sb.append("    allBranches: ").append(toIndentedString(allBranches)).append("\n");
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    includeSubgroups: ").append(toIndentedString(includeSubgroups)).append("\n");
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
