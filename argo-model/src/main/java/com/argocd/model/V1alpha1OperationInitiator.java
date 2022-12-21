package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1OperationInitiator
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1OperationInitiator  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("automated")
  private Boolean automated = null;

  @JsonProperty("username")
  private String username = null;

  public V1alpha1OperationInitiator automated(Boolean automated) {
    this.automated = automated;
    return this;
  }

  /**
   * Automated is set to true if operation was initiated automatically by the application controller.
   * @return automated
   **/
  @Schema(description = "Automated is set to true if operation was initiated automatically by the application controller.")
  
    public Boolean isAutomated() {
    return automated;
  }

  public void setAutomated(Boolean automated) {
    this.automated = automated;
  }

  public V1alpha1OperationInitiator username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   **/
  @Schema(description = "")
  
    public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OperationInitiator v1alpha1OperationInitiator = (V1alpha1OperationInitiator) o;
    return Objects.equals(this.automated, v1alpha1OperationInitiator.automated) &&
        Objects.equals(this.username, v1alpha1OperationInitiator.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automated, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OperationInitiator {\n");
    
    sb.append("    automated: ").append(toIndentedString(automated)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
