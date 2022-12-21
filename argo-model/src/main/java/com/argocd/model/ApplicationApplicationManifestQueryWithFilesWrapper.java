package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * ApplicationApplicationManifestQueryWithFilesWrapper
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class ApplicationApplicationManifestQueryWithFilesWrapper  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("chunk")
  private ApplicationFileChunk chunk = null;

  @JsonProperty("query")
  private ApplicationApplicationManifestQueryWithFiles query = null;

  public ApplicationApplicationManifestQueryWithFilesWrapper chunk(ApplicationFileChunk chunk) {
    this.chunk = chunk;
    return this;
  }

  /**
   * Get chunk
   * @return chunk
   **/
  @Schema(description = "")
  
    @Valid
    public ApplicationFileChunk getChunk() {
    return chunk;
  }

  public void setChunk(ApplicationFileChunk chunk) {
    this.chunk = chunk;
  }

  public ApplicationApplicationManifestQueryWithFilesWrapper query(ApplicationApplicationManifestQueryWithFiles query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
   **/
  @Schema(description = "")
  
    @Valid
    public ApplicationApplicationManifestQueryWithFiles getQuery() {
    return query;
  }

  public void setQuery(ApplicationApplicationManifestQueryWithFiles query) {
    this.query = query;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationApplicationManifestQueryWithFilesWrapper applicationApplicationManifestQueryWithFilesWrapper = (ApplicationApplicationManifestQueryWithFilesWrapper) o;
    return Objects.equals(this.chunk, applicationApplicationManifestQueryWithFilesWrapper.chunk) &&
        Objects.equals(this.query, applicationApplicationManifestQueryWithFilesWrapper.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chunk, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationApplicationManifestQueryWithFilesWrapper {\n");
    
    sb.append("    chunk: ").append(toIndentedString(chunk)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
