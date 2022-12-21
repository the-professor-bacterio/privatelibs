package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.*;

/**
 * V1alpha1ApplicationSourceKustomize
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ApplicationSourceKustomize  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("commonAnnotations")
  @Valid
  private Map<String, String> commonAnnotations = null;

  @JsonProperty("commonLabels")
  @Valid
  private Map<String, String> commonLabels = null;

  @JsonProperty("forceCommonAnnotations")
  private Boolean forceCommonAnnotations = null;

  @JsonProperty("forceCommonLabels")
  private Boolean forceCommonLabels = null;

  @JsonProperty("images")
  @Valid
  private List<String> images = null;

  @JsonProperty("namePrefix")
  private String namePrefix = null;

  @JsonProperty("nameSuffix")
  private String nameSuffix = null;

  @JsonProperty("version")
  private String version = null;

  public V1alpha1ApplicationSourceKustomize commonAnnotations(Map<String, String> commonAnnotations) {
    this.commonAnnotations = commonAnnotations;
    return this;
  }

  public V1alpha1ApplicationSourceKustomize putCommonAnnotationsItem(String key, String commonAnnotationsItem) {
    if (this.commonAnnotations == null) {
      this.commonAnnotations = new HashMap<>();
    }
    this.commonAnnotations.put(key, commonAnnotationsItem);
    return this;
  }

  /**
   * Get commonAnnotations
   * @return commonAnnotations
   **/
  @Schema(description = "")
  
    public Map<String, String> getCommonAnnotations() {
    return commonAnnotations;
  }

  public void setCommonAnnotations(Map<String, String> commonAnnotations) {
    this.commonAnnotations = commonAnnotations;
  }

  public V1alpha1ApplicationSourceKustomize commonLabels(Map<String, String> commonLabels) {
    this.commonLabels = commonLabels;
    return this;
  }

  public V1alpha1ApplicationSourceKustomize putCommonLabelsItem(String key, String commonLabelsItem) {
    if (this.commonLabels == null) {
      this.commonLabels = new HashMap<>();
    }
    this.commonLabels.put(key, commonLabelsItem);
    return this;
  }

  /**
   * Get commonLabels
   * @return commonLabels
   **/
  @Schema(description = "")
  
    public Map<String, String> getCommonLabels() {
    return commonLabels;
  }

  public void setCommonLabels(Map<String, String> commonLabels) {
    this.commonLabels = commonLabels;
  }

  public V1alpha1ApplicationSourceKustomize forceCommonAnnotations(Boolean forceCommonAnnotations) {
    this.forceCommonAnnotations = forceCommonAnnotations;
    return this;
  }

  /**
   * Get forceCommonAnnotations
   * @return forceCommonAnnotations
   **/
  @Schema(description = "")
  
    public Boolean isForceCommonAnnotations() {
    return forceCommonAnnotations;
  }

  public void setForceCommonAnnotations(Boolean forceCommonAnnotations) {
    this.forceCommonAnnotations = forceCommonAnnotations;
  }

  public V1alpha1ApplicationSourceKustomize forceCommonLabels(Boolean forceCommonLabels) {
    this.forceCommonLabels = forceCommonLabels;
    return this;
  }

  /**
   * Get forceCommonLabels
   * @return forceCommonLabels
   **/
  @Schema(description = "")
  
    public Boolean isForceCommonLabels() {
    return forceCommonLabels;
  }

  public void setForceCommonLabels(Boolean forceCommonLabels) {
    this.forceCommonLabels = forceCommonLabels;
  }

  public V1alpha1ApplicationSourceKustomize images(List<String> images) {
    this.images = images;
    return this;
  }

  public V1alpha1ApplicationSourceKustomize addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
   **/
  @Schema(description = "")
  
    public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public V1alpha1ApplicationSourceKustomize namePrefix(String namePrefix) {
    this.namePrefix = namePrefix;
    return this;
  }

  /**
   * Get namePrefix
   * @return namePrefix
   **/
  @Schema(description = "")
  
    public String getNamePrefix() {
    return namePrefix;
  }

  public void setNamePrefix(String namePrefix) {
    this.namePrefix = namePrefix;
  }

  public V1alpha1ApplicationSourceKustomize nameSuffix(String nameSuffix) {
    this.nameSuffix = nameSuffix;
    return this;
  }

  /**
   * Get nameSuffix
   * @return nameSuffix
   **/
  @Schema(description = "")
  
    public String getNameSuffix() {
    return nameSuffix;
  }

  public void setNameSuffix(String nameSuffix) {
    this.nameSuffix = nameSuffix;
  }

  public V1alpha1ApplicationSourceKustomize version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @Schema(description = "")
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ApplicationSourceKustomize v1alpha1ApplicationSourceKustomize = (V1alpha1ApplicationSourceKustomize) o;
    return Objects.equals(this.commonAnnotations, v1alpha1ApplicationSourceKustomize.commonAnnotations) &&
        Objects.equals(this.commonLabels, v1alpha1ApplicationSourceKustomize.commonLabels) &&
        Objects.equals(this.forceCommonAnnotations, v1alpha1ApplicationSourceKustomize.forceCommonAnnotations) &&
        Objects.equals(this.forceCommonLabels, v1alpha1ApplicationSourceKustomize.forceCommonLabels) &&
        Objects.equals(this.images, v1alpha1ApplicationSourceKustomize.images) &&
        Objects.equals(this.namePrefix, v1alpha1ApplicationSourceKustomize.namePrefix) &&
        Objects.equals(this.nameSuffix, v1alpha1ApplicationSourceKustomize.nameSuffix) &&
        Objects.equals(this.version, v1alpha1ApplicationSourceKustomize.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonAnnotations, commonLabels, forceCommonAnnotations, forceCommonLabels, images, namePrefix, nameSuffix, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ApplicationSourceKustomize {\n");
    
    sb.append("    commonAnnotations: ").append(toIndentedString(commonAnnotations)).append("\n");
    sb.append("    commonLabels: ").append(toIndentedString(commonLabels)).append("\n");
    sb.append("    forceCommonAnnotations: ").append(toIndentedString(forceCommonAnnotations)).append("\n");
    sb.append("    forceCommonLabels: ").append(toIndentedString(forceCommonLabels)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    namePrefix: ").append(toIndentedString(namePrefix)).append("\n");
    sb.append("    nameSuffix: ").append(toIndentedString(nameSuffix)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
