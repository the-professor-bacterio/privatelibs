package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1ConnectionState
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ConnectionState  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("attemptedAt")
  private V1Time attemptedAt = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("status")
  private String status = null;

  public V1alpha1ConnectionState attemptedAt(V1Time attemptedAt) {
    this.attemptedAt = attemptedAt;
    return this;
  }

  /**
   * Get attemptedAt
   * @return attemptedAt
   **/
  @Schema(description = "")
  
    @Valid
    public V1Time getAttemptedAt() {
    return attemptedAt;
  }

  public void setAttemptedAt(V1Time attemptedAt) {
    this.attemptedAt = attemptedAt;
  }

  public V1alpha1ConnectionState message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @Schema(description = "")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1alpha1ConnectionState status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ConnectionState v1alpha1ConnectionState = (V1alpha1ConnectionState) o;
    return Objects.equals(this.attemptedAt, v1alpha1ConnectionState.attemptedAt) &&
        Objects.equals(this.message, v1alpha1ConnectionState.message) &&
        Objects.equals(this.status, v1alpha1ConnectionState.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attemptedAt, message, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ConnectionState {\n");
    
    sb.append("    attemptedAt: ").append(toIndentedString(attemptedAt)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
