package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * ApplicationApplicationManifestQueryWithFiles
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class ApplicationApplicationManifestQueryWithFiles  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("appNamespace")
  private String appNamespace = null;

  @JsonProperty("checksum")
  private String checksum = null;

  @JsonProperty("name")
  private String name = null;

  public ApplicationApplicationManifestQueryWithFiles appNamespace(String appNamespace) {
    this.appNamespace = appNamespace;
    return this;
  }

  /**
   * Get appNamespace
   * @return appNamespace
   **/
  @Schema(description = "")
  
    public String getAppNamespace() {
    return appNamespace;
  }

  public void setAppNamespace(String appNamespace) {
    this.appNamespace = appNamespace;
  }

  public ApplicationApplicationManifestQueryWithFiles checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * Get checksum
   * @return checksum
   **/
  @Schema(description = "")
  
    public String getChecksum() {
    return checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  public ApplicationApplicationManifestQueryWithFiles name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationApplicationManifestQueryWithFiles applicationApplicationManifestQueryWithFiles = (ApplicationApplicationManifestQueryWithFiles) o;
    return Objects.equals(this.appNamespace, applicationApplicationManifestQueryWithFiles.appNamespace) &&
        Objects.equals(this.checksum, applicationApplicationManifestQueryWithFiles.checksum) &&
        Objects.equals(this.name, applicationApplicationManifestQueryWithFiles.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appNamespace, checksum, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationApplicationManifestQueryWithFiles {\n");
    
    sb.append("    appNamespace: ").append(toIndentedString(appNamespace)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
