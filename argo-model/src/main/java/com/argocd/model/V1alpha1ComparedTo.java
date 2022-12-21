package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1ComparedTo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ComparedTo  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("destination")
  private V1alpha1ApplicationDestination destination = null;

  @JsonProperty("source")
  private V1alpha1ApplicationSource source = null;

  public V1alpha1ComparedTo destination(V1alpha1ApplicationDestination destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Get destination
   * @return destination
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ApplicationDestination getDestination() {
    return destination;
  }

  public void setDestination(V1alpha1ApplicationDestination destination) {
    this.destination = destination;
  }

  public V1alpha1ComparedTo source(V1alpha1ApplicationSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ApplicationSource getSource() {
    return source;
  }

  public void setSource(V1alpha1ApplicationSource source) {
    this.source = source;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComparedTo v1alpha1ComparedTo = (V1alpha1ComparedTo) o;
    return Objects.equals(this.destination, v1alpha1ComparedTo.destination) &&
        Objects.equals(this.source, v1alpha1ComparedTo.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComparedTo {\n");
    
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
