package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1Backoff
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1Backoff  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("duration")
  private String duration = null;

  @JsonProperty("factor")
  private String factor = null;

  @JsonProperty("maxDuration")
  private String maxDuration = null;

  public V1alpha1Backoff duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   **/
  @Schema(description = "")
  
    public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public V1alpha1Backoff factor(String factor) {
    this.factor = factor;
    return this;
  }

  /**
   * Get factor
   * @return factor
   **/
  @Schema(description = "")
  
    public String getFactor() {
    return factor;
  }

  public void setFactor(String factor) {
    this.factor = factor;
  }

  public V1alpha1Backoff maxDuration(String maxDuration) {
    this.maxDuration = maxDuration;
    return this;
  }

  /**
   * Get maxDuration
   * @return maxDuration
   **/
  @Schema(description = "")
  
    public String getMaxDuration() {
    return maxDuration;
  }

  public void setMaxDuration(String maxDuration) {
    this.maxDuration = maxDuration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1Backoff v1alpha1Backoff = (V1alpha1Backoff) o;
    return Objects.equals(this.duration, v1alpha1Backoff.duration) &&
        Objects.equals(this.factor, v1alpha1Backoff.factor) &&
        Objects.equals(this.maxDuration, v1alpha1Backoff.maxDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, factor, maxDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1Backoff {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    maxDuration: ").append(toIndentedString(maxDuration)).append("\n");
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
