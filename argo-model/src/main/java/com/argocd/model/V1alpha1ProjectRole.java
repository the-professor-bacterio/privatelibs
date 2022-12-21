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
 * V1alpha1ProjectRole
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ProjectRole  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("groups")
  @Valid
  private List<String> groups = null;

  @JsonProperty("jwtTokens")
  @Valid
  private List<V1alpha1JWTToken> jwtTokens = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("policies")
  @Valid
  private List<String> policies = null;

  public V1alpha1ProjectRole description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(description = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public V1alpha1ProjectRole groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public V1alpha1ProjectRole addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
   **/
  @Schema(description = "")
  
    public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public V1alpha1ProjectRole jwtTokens(List<V1alpha1JWTToken> jwtTokens) {
    this.jwtTokens = jwtTokens;
    return this;
  }

  public V1alpha1ProjectRole addJwtTokensItem(V1alpha1JWTToken jwtTokensItem) {
    if (this.jwtTokens == null) {
      this.jwtTokens = new ArrayList<>();
    }
    this.jwtTokens.add(jwtTokensItem);
    return this;
  }

  /**
   * Get jwtTokens
   * @return jwtTokens
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1JWTToken> getJwtTokens() {
    return jwtTokens;
  }

  public void setJwtTokens(List<V1alpha1JWTToken> jwtTokens) {
    this.jwtTokens = jwtTokens;
  }

  public V1alpha1ProjectRole name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1alpha1ProjectRole policies(List<String> policies) {
    this.policies = policies;
    return this;
  }

  public V1alpha1ProjectRole addPoliciesItem(String policiesItem) {
    if (this.policies == null) {
      this.policies = new ArrayList<>();
    }
    this.policies.add(policiesItem);
    return this;
  }

  /**
   * Get policies
   * @return policies
   **/
  @Schema(description = "")
  
    public List<String> getPolicies() {
    return policies;
  }

  public void setPolicies(List<String> policies) {
    this.policies = policies;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ProjectRole v1alpha1ProjectRole = (V1alpha1ProjectRole) o;
    return Objects.equals(this.description, v1alpha1ProjectRole.description) &&
        Objects.equals(this.groups, v1alpha1ProjectRole.groups) &&
        Objects.equals(this.jwtTokens, v1alpha1ProjectRole.jwtTokens) &&
        Objects.equals(this.name, v1alpha1ProjectRole.name) &&
        Objects.equals(this.policies, v1alpha1ProjectRole.policies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, groups, jwtTokens, name, policies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ProjectRole {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    jwtTokens: ").append(toIndentedString(jwtTokens)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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
