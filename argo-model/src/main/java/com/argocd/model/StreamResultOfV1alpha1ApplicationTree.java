package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * StreamResultOfV1alpha1ApplicationTree
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class StreamResultOfV1alpha1ApplicationTree  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("error")
  private RuntimeStreamError error = null;

  @JsonProperty("result")
  private V1alpha1ApplicationTree result = null;

  public StreamResultOfV1alpha1ApplicationTree error(RuntimeStreamError error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   **/
  @Schema(description = "")
  
    @Valid
    public RuntimeStreamError getError() {
    return error;
  }

  public void setError(RuntimeStreamError error) {
    this.error = error;
  }

  public StreamResultOfV1alpha1ApplicationTree result(V1alpha1ApplicationTree result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ApplicationTree getResult() {
    return result;
  }

  public void setResult(V1alpha1ApplicationTree result) {
    this.result = result;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamResultOfV1alpha1ApplicationTree streamResultOfV1alpha1ApplicationTree = (StreamResultOfV1alpha1ApplicationTree) o;
    return Objects.equals(this.error, streamResultOfV1alpha1ApplicationTree.error) &&
        Objects.equals(this.result, streamResultOfV1alpha1ApplicationTree.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamResultOfV1alpha1ApplicationTree {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
