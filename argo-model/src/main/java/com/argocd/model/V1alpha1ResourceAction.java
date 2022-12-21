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
 * V1alpha1ResourceAction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ResourceAction  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("disabled")
  private Boolean disabled = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("params")
  @Valid
  private List<V1alpha1ResourceActionParam> params = null;

  public V1alpha1ResourceAction disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Get disabled
   * @return disabled
   **/
  @Schema(description = "")
  
    public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public V1alpha1ResourceAction name(String name) {
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

  public V1alpha1ResourceAction params(List<V1alpha1ResourceActionParam> params) {
    this.params = params;
    return this;
  }

  public V1alpha1ResourceAction addParamsItem(V1alpha1ResourceActionParam paramsItem) {
    if (this.params == null) {
      this.params = new ArrayList<>();
    }
    this.params.add(paramsItem);
    return this;
  }

  /**
   * Get params
   * @return params
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1ResourceActionParam> getParams() {
    return params;
  }

  public void setParams(List<V1alpha1ResourceActionParam> params) {
    this.params = params;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ResourceAction v1alpha1ResourceAction = (V1alpha1ResourceAction) o;
    return Objects.equals(this.disabled, v1alpha1ResourceAction.disabled) &&
        Objects.equals(this.name, v1alpha1ResourceAction.name) &&
        Objects.equals(this.params, v1alpha1ResourceAction.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, name, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ResourceAction {\n");
    
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
