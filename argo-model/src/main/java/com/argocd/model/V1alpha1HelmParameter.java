package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1HelmParameter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1HelmParameter  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("forceString")
  private Boolean forceString = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  public V1alpha1HelmParameter forceString(Boolean forceString) {
    this.forceString = forceString;
    return this;
  }

  /**
   * Get forceString
   * @return forceString
   **/
  @Schema(description = "")
  
    public Boolean isForceString() {
    return forceString;
  }

  public void setForceString(Boolean forceString) {
    this.forceString = forceString;
  }

  public V1alpha1HelmParameter name(String name) {
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

  public V1alpha1HelmParameter value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1HelmParameter v1alpha1HelmParameter = (V1alpha1HelmParameter) o;
    return Objects.equals(this.forceString, v1alpha1HelmParameter.forceString) &&
        Objects.equals(this.name, v1alpha1HelmParameter.name) &&
        Objects.equals(this.value, v1alpha1HelmParameter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forceString, name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1HelmParameter {\n");
    
    sb.append("    forceString: ").append(toIndentedString(forceString)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
