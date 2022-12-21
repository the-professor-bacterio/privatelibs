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
 * ClusterGenerator defines a generator to match against clusters registered with ArgoCD.
 */
@Schema(description = "ClusterGenerator defines a generator to match against clusters registered with ArgoCD.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ClusterGenerator  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("selector")
  private V1LabelSelector selector = null;

  @JsonProperty("template")
  private V1alpha1ApplicationSetTemplate template = null;

  @JsonProperty("values")
  @Valid
  private Map<String, String> values = null;

  public V1alpha1ClusterGenerator selector(V1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

  /**
   * Get selector
   * @return selector
   **/
  @Schema(description = "")
  
    @Valid
    public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }

  public V1alpha1ClusterGenerator template(V1alpha1ApplicationSetTemplate template) {
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

  public V1alpha1ClusterGenerator values(Map<String, String> values) {
    this.values = values;
    return this;
  }

  public V1alpha1ClusterGenerator putValuesItem(String key, String valuesItem) {
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
    V1alpha1ClusterGenerator v1alpha1ClusterGenerator = (V1alpha1ClusterGenerator) o;
    return Objects.equals(this.selector, v1alpha1ClusterGenerator.selector) &&
        Objects.equals(this.template, v1alpha1ClusterGenerator.template) &&
        Objects.equals(this.values, v1alpha1ClusterGenerator.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selector, template, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterGenerator {\n");
    
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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
