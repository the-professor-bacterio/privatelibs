package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1Application
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1Application  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("metadata")
  private V1ObjectMeta metadata = null;

  @JsonProperty("operation")
  private V1alpha1Operation operation = null;

  @JsonProperty("spec")
  private V1alpha1ApplicationSpec spec = null;

  @JsonProperty("status")
  private V1alpha1ApplicationStatus status = null;

  public V1alpha1Application metadata(V1ObjectMeta metadata) {
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

  public V1alpha1Application operation(V1alpha1Operation operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1Operation getOperation() {
    return operation;
  }

  public void setOperation(V1alpha1Operation operation) {
    this.operation = operation;
  }

  public V1alpha1Application spec(V1alpha1ApplicationSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Get spec
   * @return spec
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ApplicationSpec getSpec() {
    return spec;
  }

  public void setSpec(V1alpha1ApplicationSpec spec) {
    this.spec = spec;
  }

  public V1alpha1Application status(V1alpha1ApplicationStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ApplicationStatus getStatus() {
    return status;
  }

  public void setStatus(V1alpha1ApplicationStatus status) {
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
    V1alpha1Application v1alpha1Application = (V1alpha1Application) o;
    return Objects.equals(this.metadata, v1alpha1Application.metadata) &&
        Objects.equals(this.operation, v1alpha1Application.operation) &&
        Objects.equals(this.spec, v1alpha1Application.spec) &&
        Objects.equals(this.status, v1alpha1Application.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, operation, spec, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1Application {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
