package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * SCMProviderGeneratorBitbucket defines connection info specific to Bitbucket Cloud (API version 2).
 */
@Schema(description = "SCMProviderGeneratorBitbucket defines connection info specific to Bitbucket Cloud (API version 2).")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1SCMProviderGeneratorBitbucket  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("allBranches")
  private Boolean allBranches = null;

  @JsonProperty("appPasswordRef")
  private V1alpha1SecretRef appPasswordRef = null;

  @JsonProperty("owner")
  private String owner = null;

  @JsonProperty("user")
  private String user = null;

  public V1alpha1SCMProviderGeneratorBitbucket allBranches(Boolean allBranches) {
    this.allBranches = allBranches;
    return this;
  }

  /**
   * Scan all branches instead of just the main branch.
   * @return allBranches
   **/
  @Schema(description = "Scan all branches instead of just the main branch.")
  
    public Boolean isAllBranches() {
    return allBranches;
  }

  public void setAllBranches(Boolean allBranches) {
    this.allBranches = allBranches;
  }

  public V1alpha1SCMProviderGeneratorBitbucket appPasswordRef(V1alpha1SecretRef appPasswordRef) {
    this.appPasswordRef = appPasswordRef;
    return this;
  }

  /**
   * Get appPasswordRef
   * @return appPasswordRef
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1SecretRef getAppPasswordRef() {
    return appPasswordRef;
  }

  public void setAppPasswordRef(V1alpha1SecretRef appPasswordRef) {
    this.appPasswordRef = appPasswordRef;
  }

  public V1alpha1SCMProviderGeneratorBitbucket owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Bitbucket workspace to scan. Required.
   * @return owner
   **/
  @Schema(description = "Bitbucket workspace to scan. Required.")
  
    public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public V1alpha1SCMProviderGeneratorBitbucket user(String user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   **/
  @Schema(description = "")
  
    public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1SCMProviderGeneratorBitbucket v1alpha1SCMProviderGeneratorBitbucket = (V1alpha1SCMProviderGeneratorBitbucket) o;
    return Objects.equals(this.allBranches, v1alpha1SCMProviderGeneratorBitbucket.allBranches) &&
        Objects.equals(this.appPasswordRef, v1alpha1SCMProviderGeneratorBitbucket.appPasswordRef) &&
        Objects.equals(this.owner, v1alpha1SCMProviderGeneratorBitbucket.owner) &&
        Objects.equals(this.user, v1alpha1SCMProviderGeneratorBitbucket.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allBranches, appPasswordRef, owner, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1SCMProviderGeneratorBitbucket {\n");
    
    sb.append("    allBranches: ").append(toIndentedString(allBranches)).append("\n");
    sb.append("    appPasswordRef: ").append(toIndentedString(appPasswordRef)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
