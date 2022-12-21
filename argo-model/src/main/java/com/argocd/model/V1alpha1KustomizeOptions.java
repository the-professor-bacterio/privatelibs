package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1KustomizeOptions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1KustomizeOptions  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("binaryPath")
  private String binaryPath = null;

  @JsonProperty("buildOptions")
  private String buildOptions = null;

  public V1alpha1KustomizeOptions binaryPath(String binaryPath) {
    this.binaryPath = binaryPath;
    return this;
  }

  /**
   * Get binaryPath
   * @return binaryPath
   **/
  @Schema(description = "")
  
    public String getBinaryPath() {
    return binaryPath;
  }

  public void setBinaryPath(String binaryPath) {
    this.binaryPath = binaryPath;
  }

  public V1alpha1KustomizeOptions buildOptions(String buildOptions) {
    this.buildOptions = buildOptions;
    return this;
  }

  /**
   * Get buildOptions
   * @return buildOptions
   **/
  @Schema(description = "")
  
    public String getBuildOptions() {
    return buildOptions;
  }

  public void setBuildOptions(String buildOptions) {
    this.buildOptions = buildOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1KustomizeOptions v1alpha1KustomizeOptions = (V1alpha1KustomizeOptions) o;
    return Objects.equals(this.binaryPath, v1alpha1KustomizeOptions.binaryPath) &&
        Objects.equals(this.buildOptions, v1alpha1KustomizeOptions.buildOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binaryPath, buildOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1KustomizeOptions {\n");
    
    sb.append("    binaryPath: ").append(toIndentedString(binaryPath)).append("\n");
    sb.append("    buildOptions: ").append(toIndentedString(buildOptions)).append("\n");
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
