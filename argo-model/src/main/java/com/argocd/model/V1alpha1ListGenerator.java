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
 * V1alpha1ListGenerator
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ListGenerator  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("elements")
  @Valid
  private List<V1JSON> elements = null;

  @JsonProperty("template")
  private V1alpha1ApplicationSetTemplate template = null;

  public V1alpha1ListGenerator elements(List<V1JSON> elements) {
    this.elements = elements;
    return this;
  }

  public V1alpha1ListGenerator addElementsItem(V1JSON elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<>();
    }
    this.elements.add(elementsItem);
    return this;
  }

  /**
   * Get elements
   * @return elements
   **/
  @Schema(description = "")
      @Valid
    public List<V1JSON> getElements() {
    return elements;
  }

  public void setElements(List<V1JSON> elements) {
    this.elements = elements;
  }

  public V1alpha1ListGenerator template(V1alpha1ApplicationSetTemplate template) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ListGenerator v1alpha1ListGenerator = (V1alpha1ListGenerator) o;
    return Objects.equals(this.elements, v1alpha1ListGenerator.elements) &&
        Objects.equals(this.template, v1alpha1ListGenerator.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elements, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ListGenerator {\n");
    
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
