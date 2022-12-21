package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.*;

/**
 * V1alpha1ResourceNetworkingInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ResourceNetworkingInfo  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("externalURLs")
  @Valid
  private List<String> externalURLs = null;

  @JsonProperty("ingress")
  @Valid
  private List<V1LoadBalancerIngress> ingress = null;

  @JsonProperty("labels")
  @Valid
  private Map<String, String> labels = null;

  @JsonProperty("targetLabels")
  @Valid
  private Map<String, String> targetLabels = null;

  @JsonProperty("targetRefs")
  @Valid
  private List<V1alpha1ResourceRef> targetRefs = null;

  public V1alpha1ResourceNetworkingInfo externalURLs(List<String> externalURLs) {
    this.externalURLs = externalURLs;
    return this;
  }

  public V1alpha1ResourceNetworkingInfo addExternalURLsItem(String externalURLsItem) {
    if (this.externalURLs == null) {
      this.externalURLs = new ArrayList<>();
    }
    this.externalURLs.add(externalURLsItem);
    return this;
  }

  /**
   * ExternalURLs holds list of URLs which should be available externally. List is populated for ingress resources using rules hostnames.
   * @return externalURLs
   **/
  @Schema(description = "ExternalURLs holds list of URLs which should be available externally. List is populated for ingress resources using rules hostnames.")
  
    public List<String> getExternalURLs() {
    return externalURLs;
  }

  public void setExternalURLs(List<String> externalURLs) {
    this.externalURLs = externalURLs;
  }

  public V1alpha1ResourceNetworkingInfo ingress(List<V1LoadBalancerIngress> ingress) {
    this.ingress = ingress;
    return this;
  }

  public V1alpha1ResourceNetworkingInfo addIngressItem(V1LoadBalancerIngress ingressItem) {
    if (this.ingress == null) {
      this.ingress = new ArrayList<>();
    }
    this.ingress.add(ingressItem);
    return this;
  }

  /**
   * Get ingress
   * @return ingress
   **/
  @Schema(description = "")
      @Valid
    public List<V1LoadBalancerIngress> getIngress() {
    return ingress;
  }

  public void setIngress(List<V1LoadBalancerIngress> ingress) {
    this.ingress = ingress;
  }

  public V1alpha1ResourceNetworkingInfo labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public V1alpha1ResourceNetworkingInfo putLabelsItem(String key, String labelsItem) {
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

  public V1alpha1ResourceNetworkingInfo targetLabels(Map<String, String> targetLabels) {
    this.targetLabels = targetLabels;
    return this;
  }

  public V1alpha1ResourceNetworkingInfo putTargetLabelsItem(String key, String targetLabelsItem) {
    if (this.targetLabels == null) {
      this.targetLabels = new HashMap<>();
    }
    this.targetLabels.put(key, targetLabelsItem);
    return this;
  }

  /**
   * Get targetLabels
   * @return targetLabels
   **/
  @Schema(description = "")
  
    public Map<String, String> getTargetLabels() {
    return targetLabels;
  }

  public void setTargetLabels(Map<String, String> targetLabels) {
    this.targetLabels = targetLabels;
  }

  public V1alpha1ResourceNetworkingInfo targetRefs(List<V1alpha1ResourceRef> targetRefs) {
    this.targetRefs = targetRefs;
    return this;
  }

  public V1alpha1ResourceNetworkingInfo addTargetRefsItem(V1alpha1ResourceRef targetRefsItem) {
    if (this.targetRefs == null) {
      this.targetRefs = new ArrayList<>();
    }
    this.targetRefs.add(targetRefsItem);
    return this;
  }

  /**
   * Get targetRefs
   * @return targetRefs
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1ResourceRef> getTargetRefs() {
    return targetRefs;
  }

  public void setTargetRefs(List<V1alpha1ResourceRef> targetRefs) {
    this.targetRefs = targetRefs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ResourceNetworkingInfo v1alpha1ResourceNetworkingInfo = (V1alpha1ResourceNetworkingInfo) o;
    return Objects.equals(this.externalURLs, v1alpha1ResourceNetworkingInfo.externalURLs) &&
        Objects.equals(this.ingress, v1alpha1ResourceNetworkingInfo.ingress) &&
        Objects.equals(this.labels, v1alpha1ResourceNetworkingInfo.labels) &&
        Objects.equals(this.targetLabels, v1alpha1ResourceNetworkingInfo.targetLabels) &&
        Objects.equals(this.targetRefs, v1alpha1ResourceNetworkingInfo.targetRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalURLs, ingress, labels, targetLabels, targetRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ResourceNetworkingInfo {\n");
    
    sb.append("    externalURLs: ").append(toIndentedString(externalURLs)).append("\n");
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    targetLabels: ").append(toIndentedString(targetLabels)).append("\n");
    sb.append("    targetRefs: ").append(toIndentedString(targetRefs)).append("\n");
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
