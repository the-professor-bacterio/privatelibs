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
 * V1alpha1ResourceOverride
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ResourceOverride  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("actions")
  private String actions = null;

  @JsonProperty("healthLua")
  private String healthLua = null;

  @JsonProperty("ignoreDifferences")
  private V1alpha1OverrideIgnoreDiff ignoreDifferences = null;

  @JsonProperty("knownTypeFields")
  @Valid
  private List<V1alpha1KnownTypeField> knownTypeFields = null;

  @JsonProperty("useOpenLibs")
  private Boolean useOpenLibs = null;

  public V1alpha1ResourceOverride actions(String actions) {
    this.actions = actions;
    return this;
  }

  /**
   * Get actions
   * @return actions
   **/
  @Schema(description = "")
  
    public String getActions() {
    return actions;
  }

  public void setActions(String actions) {
    this.actions = actions;
  }

  public V1alpha1ResourceOverride healthLua(String healthLua) {
    this.healthLua = healthLua;
    return this;
  }

  /**
   * Get healthLua
   * @return healthLua
   **/
  @Schema(description = "")
  
    public String getHealthLua() {
    return healthLua;
  }

  public void setHealthLua(String healthLua) {
    this.healthLua = healthLua;
  }

  public V1alpha1ResourceOverride ignoreDifferences(V1alpha1OverrideIgnoreDiff ignoreDifferences) {
    this.ignoreDifferences = ignoreDifferences;
    return this;
  }

  /**
   * Get ignoreDifferences
   * @return ignoreDifferences
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1OverrideIgnoreDiff getIgnoreDifferences() {
    return ignoreDifferences;
  }

  public void setIgnoreDifferences(V1alpha1OverrideIgnoreDiff ignoreDifferences) {
    this.ignoreDifferences = ignoreDifferences;
  }

  public V1alpha1ResourceOverride knownTypeFields(List<V1alpha1KnownTypeField> knownTypeFields) {
    this.knownTypeFields = knownTypeFields;
    return this;
  }

  public V1alpha1ResourceOverride addKnownTypeFieldsItem(V1alpha1KnownTypeField knownTypeFieldsItem) {
    if (this.knownTypeFields == null) {
      this.knownTypeFields = new ArrayList<>();
    }
    this.knownTypeFields.add(knownTypeFieldsItem);
    return this;
  }

  /**
   * Get knownTypeFields
   * @return knownTypeFields
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1KnownTypeField> getKnownTypeFields() {
    return knownTypeFields;
  }

  public void setKnownTypeFields(List<V1alpha1KnownTypeField> knownTypeFields) {
    this.knownTypeFields = knownTypeFields;
  }

  public V1alpha1ResourceOverride useOpenLibs(Boolean useOpenLibs) {
    this.useOpenLibs = useOpenLibs;
    return this;
  }

  /**
   * Get useOpenLibs
   * @return useOpenLibs
   **/
  @Schema(description = "")
  
    public Boolean isUseOpenLibs() {
    return useOpenLibs;
  }

  public void setUseOpenLibs(Boolean useOpenLibs) {
    this.useOpenLibs = useOpenLibs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ResourceOverride v1alpha1ResourceOverride = (V1alpha1ResourceOverride) o;
    return Objects.equals(this.actions, v1alpha1ResourceOverride.actions) &&
        Objects.equals(this.healthLua, v1alpha1ResourceOverride.healthLua) &&
        Objects.equals(this.ignoreDifferences, v1alpha1ResourceOverride.ignoreDifferences) &&
        Objects.equals(this.knownTypeFields, v1alpha1ResourceOverride.knownTypeFields) &&
        Objects.equals(this.useOpenLibs, v1alpha1ResourceOverride.useOpenLibs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, healthLua, ignoreDifferences, knownTypeFields, useOpenLibs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ResourceOverride {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    healthLua: ").append(toIndentedString(healthLua)).append("\n");
    sb.append("    ignoreDifferences: ").append(toIndentedString(ignoreDifferences)).append("\n");
    sb.append("    knownTypeFields: ").append(toIndentedString(knownTypeFields)).append("\n");
    sb.append("    useOpenLibs: ").append(toIndentedString(useOpenLibs)).append("\n");
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
