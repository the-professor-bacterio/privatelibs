package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1RetryStrategy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1RetryStrategy  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("backoff")
  private V1alpha1Backoff backoff = null;

  @JsonProperty("limit")
  private String limit = null;

  public V1alpha1RetryStrategy backoff(V1alpha1Backoff backoff) {
    this.backoff = backoff;
    return this;
  }

  /**
   * Get backoff
   * @return backoff
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1Backoff getBackoff() {
    return backoff;
  }

  public void setBackoff(V1alpha1Backoff backoff) {
    this.backoff = backoff;
  }

  public V1alpha1RetryStrategy limit(String limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Limit is the maximum number of attempts for retrying a failed sync. If set to 0, no retries will be performed.
   * @return limit
   **/
  @Schema(description = "Limit is the maximum number of attempts for retrying a failed sync. If set to 0, no retries will be performed.")
  
    public String getLimit() {
    return limit;
  }

  public void setLimit(String limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RetryStrategy v1alpha1RetryStrategy = (V1alpha1RetryStrategy) o;
    return Objects.equals(this.backoff, v1alpha1RetryStrategy.backoff) &&
        Objects.equals(this.limit, v1alpha1RetryStrategy.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backoff, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RetryStrategy {\n");
    
    sb.append("    backoff: ").append(toIndentedString(backoff)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
