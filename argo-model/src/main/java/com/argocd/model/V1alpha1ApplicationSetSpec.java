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
 * ApplicationSetSpec represents a class of application set state.
 */
@Schema(description = "ApplicationSetSpec represents a class of application set state.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ApplicationSetSpec  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("generators")
  @Valid
  private List<V1alpha1ApplicationSetGenerator> generators = null;

  @JsonProperty("goTemplate")
  private Boolean goTemplate = null;

  @JsonProperty("syncPolicy")
  private V1alpha1ApplicationSetSyncPolicy syncPolicy = null;

  @JsonProperty("template")
  private V1alpha1ApplicationSetTemplate template = null;

  public V1alpha1ApplicationSetSpec generators(List<V1alpha1ApplicationSetGenerator> generators) {
    this.generators = generators;
    return this;
  }

  public V1alpha1ApplicationSetSpec addGeneratorsItem(V1alpha1ApplicationSetGenerator generatorsItem) {
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
    public List<V1alpha1ApplicationSetGenerator> getGenerators() {
    return generators;
  }

  public void setGenerators(List<V1alpha1ApplicationSetGenerator> generators) {
    this.generators = generators;
  }

  public V1alpha1ApplicationSetSpec goTemplate(Boolean goTemplate) {
    this.goTemplate = goTemplate;
    return this;
  }

  /**
   * Get goTemplate
   * @return goTemplate
   **/
  @Schema(description = "")
  
    public Boolean isGoTemplate() {
    return goTemplate;
  }

  public void setGoTemplate(Boolean goTemplate) {
    this.goTemplate = goTemplate;
  }

  public V1alpha1ApplicationSetSpec syncPolicy(V1alpha1ApplicationSetSyncPolicy syncPolicy) {
    this.syncPolicy = syncPolicy;
    return this;
  }

  /**
   * Get syncPolicy
   * @return syncPolicy
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ApplicationSetSyncPolicy getSyncPolicy() {
    return syncPolicy;
  }

  public void setSyncPolicy(V1alpha1ApplicationSetSyncPolicy syncPolicy) {
    this.syncPolicy = syncPolicy;
  }

  public V1alpha1ApplicationSetSpec template(V1alpha1ApplicationSetTemplate template) {
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
    V1alpha1ApplicationSetSpec v1alpha1ApplicationSetSpec = (V1alpha1ApplicationSetSpec) o;
    return Objects.equals(this.generators, v1alpha1ApplicationSetSpec.generators) &&
        Objects.equals(this.goTemplate, v1alpha1ApplicationSetSpec.goTemplate) &&
        Objects.equals(this.syncPolicy, v1alpha1ApplicationSetSpec.syncPolicy) &&
        Objects.equals(this.template, v1alpha1ApplicationSetSpec.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generators, goTemplate, syncPolicy, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ApplicationSetSpec {\n");
    
    sb.append("    generators: ").append(toIndentedString(generators)).append("\n");
    sb.append("    goTemplate: ").append(toIndentedString(goTemplate)).append("\n");
    sb.append("    syncPolicy: ").append(toIndentedString(syncPolicy)).append("\n");
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
