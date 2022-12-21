package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DuckType defines a generator to match against clusters registered with ArgoCD.
 */
@Schema(description = "DuckType defines a generator to match against clusters registered with ArgoCD.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1DuckTypeGenerator  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("configMapRef")
  private String configMapRef = null;

  @JsonProperty("labelSelector")
  private V1LabelSelector labelSelector = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("requeueAfterSeconds")
  private String requeueAfterSeconds = null;

  @JsonProperty("template")
  private V1alpha1ApplicationSetTemplate template = null;

  @JsonProperty("values")
  @Valid
  private Map<String, String> values = null;

  public V1alpha1DuckTypeGenerator configMapRef(String configMapRef) {
    this.configMapRef = configMapRef;
    return this;
  }

  /**
   * Get configMapRef
   * @return configMapRef
   **/
  @Schema(description = "")
  
    public String getConfigMapRef() {
    return configMapRef;
  }

  public void setConfigMapRef(String configMapRef) {
    this.configMapRef = configMapRef;
  }

  public V1alpha1DuckTypeGenerator labelSelector(V1LabelSelector labelSelector) {
    this.labelSelector = labelSelector;
    return this;
  }

  /**
   * Get labelSelector
   * @return labelSelector
   **/
  @Schema(description = "")
  
    @Valid
    public V1LabelSelector getLabelSelector() {
    return labelSelector;
  }

  public void setLabelSelector(V1LabelSelector labelSelector) {
    this.labelSelector = labelSelector;
  }

  public V1alpha1DuckTypeGenerator name(String name) {
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

  public V1alpha1DuckTypeGenerator requeueAfterSeconds(String requeueAfterSeconds) {
    this.requeueAfterSeconds = requeueAfterSeconds;
    return this;
  }

  /**
   * Get requeueAfterSeconds
   * @return requeueAfterSeconds
   **/
  @Schema(description = "")
  
    public String getRequeueAfterSeconds() {
    return requeueAfterSeconds;
  }

  public void setRequeueAfterSeconds(String requeueAfterSeconds) {
    this.requeueAfterSeconds = requeueAfterSeconds;
  }

  public V1alpha1DuckTypeGenerator template(V1alpha1ApplicationSetTemplate template) {
    this.template = template;
    return this;
  }

  /**
   * Get template
   * @return template
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ApplicationSetTemplate getTemplate() {
    return template;
  }

  public void setTemplate(V1alpha1ApplicationSetTemplate template) {
    this.template = template;
  }

  public V1alpha1DuckTypeGenerator values(Map<String, String> values) {
    this.values = values;
    return this;
  }

  public V1alpha1DuckTypeGenerator putValuesItem(String key, String valuesItem) {
    if (this.values == null) {
      this.values = new HashMap<>();
    }
    this.values.put(key, valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
   **/
  @Schema(description = "")
  
    public Map<String, String> getValues() {
    return values;
  }

  public void setValues(Map<String, String> values) {
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
    V1alpha1DuckTypeGenerator v1alpha1DuckTypeGenerator = (V1alpha1DuckTypeGenerator) o;
    return Objects.equals(this.configMapRef, v1alpha1DuckTypeGenerator.configMapRef) &&
        Objects.equals(this.labelSelector, v1alpha1DuckTypeGenerator.labelSelector) &&
        Objects.equals(this.name, v1alpha1DuckTypeGenerator.name) &&
        Objects.equals(this.requeueAfterSeconds, v1alpha1DuckTypeGenerator.requeueAfterSeconds) &&
        Objects.equals(this.template, v1alpha1DuckTypeGenerator.template) &&
        Objects.equals(this.values, v1alpha1DuckTypeGenerator.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMapRef, labelSelector, name, requeueAfterSeconds, template, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1DuckTypeGenerator {\n");
    
    sb.append("    configMapRef: ").append(toIndentedString(configMapRef)).append("\n");
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    requeueAfterSeconds: ").append(toIndentedString(requeueAfterSeconds)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
