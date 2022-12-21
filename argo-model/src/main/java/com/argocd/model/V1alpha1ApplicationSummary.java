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
 * V1alpha1ApplicationSummary
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ApplicationSummary  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("externalURLs")
  @Valid
  private List<String> externalURLs = null;

  @JsonProperty("images")
  @Valid
  private List<String> images = null;

  public V1alpha1ApplicationSummary externalURLs(List<String> externalURLs) {
    this.externalURLs = externalURLs;
    return this;
  }

  public V1alpha1ApplicationSummary addExternalURLsItem(String externalURLsItem) {
    if (this.externalURLs == null) {
      this.externalURLs = new ArrayList<>();
    }
    this.externalURLs.add(externalURLsItem);
    return this;
  }

  /**
   * ExternalURLs holds all external URLs of application child resources.
   * @return externalURLs
   **/
  @Schema(description = "ExternalURLs holds all external URLs of application child resources.")
  
    public List<String> getExternalURLs() {
    return externalURLs;
  }

  public void setExternalURLs(List<String> externalURLs) {
    this.externalURLs = externalURLs;
  }

  public V1alpha1ApplicationSummary images(List<String> images) {
    this.images = images;
    return this;
  }

  public V1alpha1ApplicationSummary addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Images holds all images of application child resources.
   * @return images
   **/
  @Schema(description = "Images holds all images of application child resources.")
  
    public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ApplicationSummary v1alpha1ApplicationSummary = (V1alpha1ApplicationSummary) o;
    return Objects.equals(this.externalURLs, v1alpha1ApplicationSummary.externalURLs) &&
        Objects.equals(this.images, v1alpha1ApplicationSummary.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalURLs, images);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ApplicationSummary {\n");
    
    sb.append("    externalURLs: ").append(toIndentedString(externalURLs)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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
