package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OidcClaim
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class OidcClaim  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("essential")
  private Boolean essential = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("values")
  @Valid
  private List<String> values = null;

  public OidcClaim essential(Boolean essential) {
    this.essential = essential;
    return this;
  }

  /**
   * Get essential
   * @return essential
   **/
  @Schema(description = "")
  
    public Boolean isEssential() {
    return essential;
  }

  public void setEssential(Boolean essential) {
    this.essential = essential;
  }

  public OidcClaim value(String value) {
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

  public OidcClaim values(List<String> values) {
    this.values = values;
    return this;
  }

  public OidcClaim addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
   **/
  @Schema(description = "")
  
    public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OidcClaim oidcClaim = (OidcClaim) o;
    return Objects.equals(this.essential, oidcClaim.essential) &&
        Objects.equals(this.value, oidcClaim.value) &&
        Objects.equals(this.values, oidcClaim.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(essential, value, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OidcClaim {\n");
    
    sb.append("    essential: ").append(toIndentedString(essential)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
