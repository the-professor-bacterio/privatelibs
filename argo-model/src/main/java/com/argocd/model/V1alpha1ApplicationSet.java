package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1ApplicationSet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ApplicationSet  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("metadata")
  private V1ObjectMeta metadata = null;

  @JsonProperty("spec")
  private V1alpha1ApplicationSetSpec spec = null;

  @JsonProperty("status")
  private V1alpha1ApplicationSetStatus status = null;

  public V1alpha1ApplicationSet metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   **/
  @Schema(description = "")
  
    @Valid
    public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1alpha1ApplicationSet spec(V1alpha1ApplicationSetSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Get spec
   * @return spec
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ApplicationSetSpec getSpec() {
    return spec;
  }

  public void setSpec(V1alpha1ApplicationSetSpec spec) {
    this.spec = spec;
  }

  public V1alpha1ApplicationSet status(V1alpha1ApplicationSetStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ApplicationSetStatus getStatus() {
    return status;
  }

  public void setStatus(V1alpha1ApplicationSetStatus status) {
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
    V1alpha1ApplicationSet v1alpha1ApplicationSet = (V1alpha1ApplicationSet) o;
    return Objects.equals(this.metadata, v1alpha1ApplicationSet.metadata) &&
        Objects.equals(this.spec, v1alpha1ApplicationSet.spec) &&
        Objects.equals(this.status, v1alpha1ApplicationSet.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, spec, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ApplicationSet {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
