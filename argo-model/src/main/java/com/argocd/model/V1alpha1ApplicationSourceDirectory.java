package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1ApplicationSourceDirectory
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ApplicationSourceDirectory  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("exclude")
  private String exclude = null;

  @JsonProperty("include")
  private String include = null;

  @JsonProperty("jsonnet")
  private V1alpha1ApplicationSourceJsonnet jsonnet = null;

  @JsonProperty("recurse")
  private Boolean recurse = null;

  public V1alpha1ApplicationSourceDirectory exclude(String exclude) {
    this.exclude = exclude;
    return this;
  }

  /**
   * Get exclude
   * @return exclude
   **/
  @Schema(description = "")
  
    public String getExclude() {
    return exclude;
  }

  public void setExclude(String exclude) {
    this.exclude = exclude;
  }

  public V1alpha1ApplicationSourceDirectory include(String include) {
    this.include = include;
    return this;
  }

  /**
   * Get include
   * @return include
   **/
  @Schema(description = "")
  
    public String getInclude() {
    return include;
  }

  public void setInclude(String include) {
    this.include = include;
  }

  public V1alpha1ApplicationSourceDirectory jsonnet(V1alpha1ApplicationSourceJsonnet jsonnet) {
    this.jsonnet = jsonnet;
    return this;
  }

  /**
   * Get jsonnet
   * @return jsonnet
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ApplicationSourceJsonnet getJsonnet() {
    return jsonnet;
  }

  public void setJsonnet(V1alpha1ApplicationSourceJsonnet jsonnet) {
    this.jsonnet = jsonnet;
  }

  public V1alpha1ApplicationSourceDirectory recurse(Boolean recurse) {
    this.recurse = recurse;
    return this;
  }

  /**
   * Get recurse
   * @return recurse
   **/
  @Schema(description = "")
  
    public Boolean isRecurse() {
    return recurse;
  }

  public void setRecurse(Boolean recurse) {
    this.recurse = recurse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ApplicationSourceDirectory v1alpha1ApplicationSourceDirectory = (V1alpha1ApplicationSourceDirectory) o;
    return Objects.equals(this.exclude, v1alpha1ApplicationSourceDirectory.exclude) &&
        Objects.equals(this.include, v1alpha1ApplicationSourceDirectory.include) &&
        Objects.equals(this.jsonnet, v1alpha1ApplicationSourceDirectory.jsonnet) &&
        Objects.equals(this.recurse, v1alpha1ApplicationSourceDirectory.recurse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exclude, include, jsonnet, recurse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ApplicationSourceDirectory {\n");
    
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    jsonnet: ").append(toIndentedString(jsonnet)).append("\n");
    sb.append("    recurse: ").append(toIndentedString(recurse)).append("\n");
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
