package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1GitDirectoryGeneratorItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1GitDirectoryGeneratorItem  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("exclude")
  private Boolean exclude = null;

  @JsonProperty("path")
  private String path = null;

  public V1alpha1GitDirectoryGeneratorItem exclude(Boolean exclude) {
    this.exclude = exclude;
    return this;
  }

  /**
   * Get exclude
   * @return exclude
   **/
  @Schema(description = "")
  
    public Boolean isExclude() {
    return exclude;
  }

  public void setExclude(Boolean exclude) {
    this.exclude = exclude;
  }

  public V1alpha1GitDirectoryGeneratorItem path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   **/
  @Schema(description = "")
  
    public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1GitDirectoryGeneratorItem v1alpha1GitDirectoryGeneratorItem = (V1alpha1GitDirectoryGeneratorItem) o;
    return Objects.equals(this.exclude, v1alpha1GitDirectoryGeneratorItem.exclude) &&
        Objects.equals(this.path, v1alpha1GitDirectoryGeneratorItem.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exclude, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1GitDirectoryGeneratorItem {\n");
    
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
