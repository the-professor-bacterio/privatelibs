package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1ApplicationSetTemplate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ApplicationSetTemplate  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("metadata")
  private V1alpha1ApplicationSetTemplateMeta metadata = null;

  @JsonProperty("spec")
  private V1alpha1ApplicationSpec spec = null;

  public V1alpha1ApplicationSetTemplate metadata(V1alpha1ApplicationSetTemplateMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ApplicationSetTemplateMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1alpha1ApplicationSetTemplateMeta metadata) {
    this.metadata = metadata;
  }

  public V1alpha1ApplicationSetTemplate spec(V1alpha1ApplicationSpec spec) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ApplicationSetTemplate v1alpha1ApplicationSetTemplate = (V1alpha1ApplicationSetTemplate) o;
    return Objects.equals(this.metadata, v1alpha1ApplicationSetTemplate.metadata) &&
        Objects.equals(this.spec, v1alpha1ApplicationSetTemplate.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, spec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ApplicationSetTemplate {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
