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
 * MatrixGenerator generates the cartesian product of two sets of parameters. The parameters are defined by two nested generators.
 */
@Schema(description = "MatrixGenerator generates the cartesian product of two sets of parameters. The parameters are defined by two nested generators.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1MatrixGenerator  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("generators")
  @Valid
  private List<V1alpha1ApplicationSetNestedGenerator> generators = null;

  @JsonProperty("template")
  private V1alpha1ApplicationSetTemplate template = null;

  public V1alpha1MatrixGenerator generators(List<V1alpha1ApplicationSetNestedGenerator> generators) {
    this.generators = generators;
    return this;
  }

  public V1alpha1MatrixGenerator addGeneratorsItem(V1alpha1ApplicationSetNestedGenerator generatorsItem) {
    if (this.generators == null) {
      this.generators = new ArrayList<>();
    }
    this.generators.add(generatorsItem);
    return this;
  }

  /**
   * Get generators
   * @return generators
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1ApplicationSetNestedGenerator> getGenerators() {
    return generators;
  }

  public void setGenerators(List<V1alpha1ApplicationSetNestedGenerator> generators) {
    this.generators = generators;
  }

  public V1alpha1MatrixGenerator template(V1alpha1ApplicationSetTemplate template) {
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
    V1alpha1MatrixGenerator v1alpha1MatrixGenerator = (V1alpha1MatrixGenerator) o;
    return Objects.equals(this.generators, v1alpha1MatrixGenerator.generators) &&
        Objects.equals(this.template, v1alpha1MatrixGenerator.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generators, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1MatrixGenerator {\n");
    
    sb.append("    generators: ").append(toIndentedString(generators)).append("\n");
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
