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
 * MergeGenerator merges the output of two or more generators. Where the values for all specified merge keys are equal between two sets of generated parameters, the parameter sets will be merged with the parameters from the latter generator taking precedence. Parameter sets with merge keys not present in the base generator&#x27;s params will be ignored. For example, if the first generator produced [{a: &#x27;1&#x27;, b: &#x27;2&#x27;}, {c: &#x27;1&#x27;, d: &#x27;1&#x27;}] and the second generator produced [{&#x27;a&#x27;: &#x27;override&#x27;}], the united parameters for merge keys &#x3D; [&#x27;a&#x27;] would be [{a: &#x27;override&#x27;, b: &#x27;1&#x27;}, {c: &#x27;1&#x27;, d: &#x27;1&#x27;}].  MergeGenerator supports template overriding. If a MergeGenerator is one of multiple top-level generators, its template will be merged with the top-level generator before the parameters are applied.
 */
@Schema(description = "MergeGenerator merges the output of two or more generators. Where the values for all specified merge keys are equal between two sets of generated parameters, the parameter sets will be merged with the parameters from the latter generator taking precedence. Parameter sets with merge keys not present in the base generator's params will be ignored. For example, if the first generator produced [{a: '1', b: '2'}, {c: '1', d: '1'}] and the second generator produced [{'a': 'override'}], the united parameters for merge keys = ['a'] would be [{a: 'override', b: '1'}, {c: '1', d: '1'}].  MergeGenerator supports template overriding. If a MergeGenerator is one of multiple top-level generators, its template will be merged with the top-level generator before the parameters are applied.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1MergeGenerator  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("generators")
  @Valid
  private List<V1alpha1ApplicationSetNestedGenerator> generators = null;

  @JsonProperty("mergeKeys")
  @Valid
  private List<String> mergeKeys = null;

  @JsonProperty("template")
  private V1alpha1ApplicationSetTemplate template = null;

  public V1alpha1MergeGenerator generators(List<V1alpha1ApplicationSetNestedGenerator> generators) {
    this.generators = generators;
    return this;
  }

  public V1alpha1MergeGenerator addGeneratorsItem(V1alpha1ApplicationSetNestedGenerator generatorsItem) {
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

  public V1alpha1MergeGenerator mergeKeys(List<String> mergeKeys) {
    this.mergeKeys = mergeKeys;
    return this;
  }

  public V1alpha1MergeGenerator addMergeKeysItem(String mergeKeysItem) {
    if (this.mergeKeys == null) {
      this.mergeKeys = new ArrayList<>();
    }
    this.mergeKeys.add(mergeKeysItem);
    return this;
  }

  /**
   * Get mergeKeys
   * @return mergeKeys
   **/
  @Schema(description = "")
  
    public List<String> getMergeKeys() {
    return mergeKeys;
  }

  public void setMergeKeys(List<String> mergeKeys) {
    this.mergeKeys = mergeKeys;
  }

  public V1alpha1MergeGenerator template(V1alpha1ApplicationSetTemplate template) {
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
    V1alpha1MergeGenerator v1alpha1MergeGenerator = (V1alpha1MergeGenerator) o;
    return Objects.equals(this.generators, v1alpha1MergeGenerator.generators) &&
        Objects.equals(this.mergeKeys, v1alpha1MergeGenerator.mergeKeys) &&
        Objects.equals(this.template, v1alpha1MergeGenerator.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generators, mergeKeys, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1MergeGenerator {\n");
    
    sb.append("    generators: ").append(toIndentedString(generators)).append("\n");
    sb.append("    mergeKeys: ").append(toIndentedString(mergeKeys)).append("\n");
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
