package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * ApplicationApplicationResourceResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class ApplicationApplicationResourceResponse  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("manifest")
  private String manifest = null;

  public ApplicationApplicationResourceResponse manifest(String manifest) {
    this.manifest = manifest;
    return this;
  }

  /**
   * Get manifest
   * @return manifest
   **/
  @Schema(description = "")
  
    public String getManifest() {
    return manifest;
  }

  public void setManifest(String manifest) {
    this.manifest = manifest;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationApplicationResourceResponse applicationApplicationResourceResponse = (ApplicationApplicationResourceResponse) o;
    return Objects.equals(this.manifest, applicationApplicationResourceResponse.manifest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationApplicationResourceResponse {\n");
    
    sb.append("    manifest: ").append(toIndentedString(manifest)).append("\n");
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
