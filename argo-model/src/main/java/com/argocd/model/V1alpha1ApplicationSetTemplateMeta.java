package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.*;

/**
 * V1alpha1ApplicationSetTemplateMeta
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ApplicationSetTemplateMeta  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("annotations")
  @Valid
  private Map<String, String> annotations = null;

  @JsonProperty("finalizers")
  @Valid
  private List<String> finalizers = null;

  @JsonProperty("labels")
  @Valid
  private Map<String, String> labels = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("namespace")
  private String namespace = null;

  public V1alpha1ApplicationSetTemplateMeta annotations(Map<String, String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public V1alpha1ApplicationSetTemplateMeta putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

  /**
   * Get annotations
   * @return annotations
   **/
  @Schema(description = "")
  
    public Map<String, String> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }

  public V1alpha1ApplicationSetTemplateMeta finalizers(List<String> finalizers) {
    this.finalizers = finalizers;
    return this;
  }

  public V1alpha1ApplicationSetTemplateMeta addFinalizersItem(String finalizersItem) {
    if (this.finalizers == null) {
      this.finalizers = new ArrayList<>();
    }
    this.finalizers.add(finalizersItem);
    return this;
  }

  /**
   * Get finalizers
   * @return finalizers
   **/
  @Schema(description = "")
  
    public List<String> getFinalizers() {
    return finalizers;
  }

  public void setFinalizers(List<String> finalizers) {
    this.finalizers = finalizers;
  }

  public V1alpha1ApplicationSetTemplateMeta labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public V1alpha1ApplicationSetTemplateMeta putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
   **/
  @Schema(description = "")
  
    public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public V1alpha1ApplicationSetTemplateMeta name(String name) {
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

  public V1alpha1ApplicationSetTemplateMeta namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Get namespace
   * @return namespace
   **/
  @Schema(description = "")
  
    public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ApplicationSetTemplateMeta v1alpha1ApplicationSetTemplateMeta = (V1alpha1ApplicationSetTemplateMeta) o;
    return Objects.equals(this.annotations, v1alpha1ApplicationSetTemplateMeta.annotations) &&
        Objects.equals(this.finalizers, v1alpha1ApplicationSetTemplateMeta.finalizers) &&
        Objects.equals(this.labels, v1alpha1ApplicationSetTemplateMeta.labels) &&
        Objects.equals(this.name, v1alpha1ApplicationSetTemplateMeta.name) &&
        Objects.equals(this.namespace, v1alpha1ApplicationSetTemplateMeta.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, finalizers, labels, name, namespace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ApplicationSetTemplateMeta {\n");
    
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    finalizers: ").append(toIndentedString(finalizers)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
