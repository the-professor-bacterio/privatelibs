package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * StreamResultOfApplicationLogEntry
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class StreamResultOfApplicationLogEntry  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("error")
  private RuntimeStreamError error = null;

  @JsonProperty("result")
  private ApplicationLogEntry result = null;

  public StreamResultOfApplicationLogEntry error(RuntimeStreamError error) {
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

  public StreamResultOfApplicationLogEntry result(ApplicationLogEntry result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   **/
  @Schema(description = "")
  
    @Valid
    public ApplicationLogEntry getResult() {
    return result;
  }

  public void setResult(ApplicationLogEntry result) {
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
    StreamResultOfApplicationLogEntry streamResultOfApplicationLogEntry = (StreamResultOfApplicationLogEntry) o;
    return Objects.equals(this.error, streamResultOfApplicationLogEntry.error) &&
        Objects.equals(this.result, streamResultOfApplicationLogEntry.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamResultOfApplicationLogEntry {\n");
    
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
