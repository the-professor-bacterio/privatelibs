package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * ApplicationFileChunk
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class ApplicationFileChunk  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("chunk")
  private byte[] chunk = null;

  public ApplicationFileChunk chunk(byte[] chunk) {
    this.chunk = chunk;
    return this;
  }

  /**
   * Get chunk
   * @return chunk
   **/
  @Schema(description = "")
  
    public byte[] getChunk() {
    return chunk;
  }

  public void setChunk(byte[] chunk) {
    this.chunk = chunk;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationFileChunk applicationFileChunk = (ApplicationFileChunk) o;
    return Objects.equals(this.chunk, applicationFileChunk.chunk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chunk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationFileChunk {\n");
    
    sb.append("    chunk: ").append(toIndentedString(chunk)).append("\n");
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
