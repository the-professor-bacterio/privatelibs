package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * V1alpha1AppProjectStatus
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1AppProjectStatus  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("jwtTokensByRole")
  @Valid
  private Map<String, V1alpha1JWTTokens> jwtTokensByRole = null;

  public V1alpha1AppProjectStatus jwtTokensByRole(Map<String, V1alpha1JWTTokens> jwtTokensByRole) {
    this.jwtTokensByRole = jwtTokensByRole;
    return this;
  }

  public V1alpha1AppProjectStatus putJwtTokensByRoleItem(String key, V1alpha1JWTTokens jwtTokensByRoleItem) {
    if (this.jwtTokensByRole == null) {
      this.jwtTokensByRole = new HashMap<>();
    }
    this.jwtTokensByRole.put(key, jwtTokensByRoleItem);
    return this;
  }

  /**
   * Get jwtTokensByRole
   * @return jwtTokensByRole
   **/
  @Schema(description = "")
      @Valid
    public Map<String, V1alpha1JWTTokens> getJwtTokensByRole() {
    return jwtTokensByRole;
  }

  public void setJwtTokensByRole(Map<String, V1alpha1JWTTokens> jwtTokensByRole) {
    this.jwtTokensByRole = jwtTokensByRole;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1AppProjectStatus v1alpha1AppProjectStatus = (V1alpha1AppProjectStatus) o;
    return Objects.equals(this.jwtTokensByRole, v1alpha1AppProjectStatus.jwtTokensByRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jwtTokensByRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1AppProjectStatus {\n");
    
    sb.append("    jwtTokensByRole: ").append(toIndentedString(jwtTokensByRole)).append("\n");
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
