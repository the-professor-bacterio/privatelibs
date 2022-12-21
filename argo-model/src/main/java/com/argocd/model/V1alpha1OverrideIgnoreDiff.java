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
 * V1alpha1OverrideIgnoreDiff
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1OverrideIgnoreDiff  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("jSONPointers")
  @Valid
  private List<String> jSONPointers = null;

  @JsonProperty("jqPathExpressions")
  @Valid
  private List<String> jqPathExpressions = null;

  @JsonProperty("managedFieldsManagers")
  @Valid
  private List<String> managedFieldsManagers = null;

  public V1alpha1OverrideIgnoreDiff jSONPointers(List<String> jSONPointers) {
    this.jSONPointers = jSONPointers;
    return this;
  }

  public V1alpha1OverrideIgnoreDiff addJSONPointersItem(String jSONPointersItem) {
    if (this.jSONPointers == null) {
      this.jSONPointers = new ArrayList<>();
    }
    this.jSONPointers.add(jSONPointersItem);
    return this;
  }

  /**
   * Get jSONPointers
   * @return jSONPointers
   **/
  @Schema(description = "")
  
    public List<String> getJSONPointers() {
    return jSONPointers;
  }

  public void setJSONPointers(List<String> jSONPointers) {
    this.jSONPointers = jSONPointers;
  }

  public V1alpha1OverrideIgnoreDiff jqPathExpressions(List<String> jqPathExpressions) {
    this.jqPathExpressions = jqPathExpressions;
    return this;
  }

  public V1alpha1OverrideIgnoreDiff addJqPathExpressionsItem(String jqPathExpressionsItem) {
    if (this.jqPathExpressions == null) {
      this.jqPathExpressions = new ArrayList<>();
    }
    this.jqPathExpressions.add(jqPathExpressionsItem);
    return this;
  }

  /**
   * Get jqPathExpressions
   * @return jqPathExpressions
   **/
  @Schema(description = "")
  
    public List<String> getJqPathExpressions() {
    return jqPathExpressions;
  }

  public void setJqPathExpressions(List<String> jqPathExpressions) {
    this.jqPathExpressions = jqPathExpressions;
  }

  public V1alpha1OverrideIgnoreDiff managedFieldsManagers(List<String> managedFieldsManagers) {
    this.managedFieldsManagers = managedFieldsManagers;
    return this;
  }

  public V1alpha1OverrideIgnoreDiff addManagedFieldsManagersItem(String managedFieldsManagersItem) {
    if (this.managedFieldsManagers == null) {
      this.managedFieldsManagers = new ArrayList<>();
    }
    this.managedFieldsManagers.add(managedFieldsManagersItem);
    return this;
  }

  /**
   * Get managedFieldsManagers
   * @return managedFieldsManagers
   **/
  @Schema(description = "")
  
    public List<String> getManagedFieldsManagers() {
    return managedFieldsManagers;
  }

  public void setManagedFieldsManagers(List<String> managedFieldsManagers) {
    this.managedFieldsManagers = managedFieldsManagers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OverrideIgnoreDiff v1alpha1OverrideIgnoreDiff = (V1alpha1OverrideIgnoreDiff) o;
    return Objects.equals(this.jSONPointers, v1alpha1OverrideIgnoreDiff.jSONPointers) &&
        Objects.equals(this.jqPathExpressions, v1alpha1OverrideIgnoreDiff.jqPathExpressions) &&
        Objects.equals(this.managedFieldsManagers, v1alpha1OverrideIgnoreDiff.managedFieldsManagers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jSONPointers, jqPathExpressions, managedFieldsManagers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OverrideIgnoreDiff {\n");
    
    sb.append("    jSONPointers: ").append(toIndentedString(jSONPointers)).append("\n");
    sb.append("    jqPathExpressions: ").append(toIndentedString(jqPathExpressions)).append("\n");
    sb.append("    managedFieldsManagers: ").append(toIndentedString(managedFieldsManagers)).append("\n");
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
