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
 * V1alpha1ApplicationSetStatus
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ApplicationSetStatus  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("conditions")
  @Valid
  private List<V1alpha1ApplicationSetCondition> conditions = null;

  public V1alpha1ApplicationSetStatus conditions(List<V1alpha1ApplicationSetCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1alpha1ApplicationSetStatus addConditionsItem(V1alpha1ApplicationSetCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Get conditions
   * @return conditions
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1ApplicationSetCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1alpha1ApplicationSetCondition> conditions) {
    this.conditions = conditions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ApplicationSetStatus v1alpha1ApplicationSetStatus = (V1alpha1ApplicationSetStatus) o;
    return Objects.equals(this.conditions, v1alpha1ApplicationSetStatus.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ApplicationSetStatus {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
