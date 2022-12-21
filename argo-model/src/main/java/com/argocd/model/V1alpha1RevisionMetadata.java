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
 * V1alpha1RevisionMetadata
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1RevisionMetadata  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("author")
  private String author = null;

  @JsonProperty("date")
  private V1Time date = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("signatureInfo")
  private String signatureInfo = null;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = null;

  public V1alpha1RevisionMetadata author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
   **/
  @Schema(description = "")
  
    public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public V1alpha1RevisionMetadata date(V1Time date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   **/
  @Schema(description = "")
  
    @Valid
    public V1Time getDate() {
    return date;
  }

  public void setDate(V1Time date) {
    this.date = date;
  }

  public V1alpha1RevisionMetadata message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @Schema(description = "")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1alpha1RevisionMetadata signatureInfo(String signatureInfo) {
    this.signatureInfo = signatureInfo;
    return this;
  }

  /**
   * SignatureInfo contains a hint on the signer if the revision was signed with GPG, and signature verification is enabled.
   * @return signatureInfo
   **/
  @Schema(description = "SignatureInfo contains a hint on the signer if the revision was signed with GPG, and signature verification is enabled.")
  
    public String getSignatureInfo() {
    return signatureInfo;
  }

  public void setSignatureInfo(String signatureInfo) {
    this.signatureInfo = signatureInfo;
  }

  public V1alpha1RevisionMetadata tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public V1alpha1RevisionMetadata addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
   **/
  @Schema(description = "")
  
    public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RevisionMetadata v1alpha1RevisionMetadata = (V1alpha1RevisionMetadata) o;
    return Objects.equals(this.author, v1alpha1RevisionMetadata.author) &&
        Objects.equals(this.date, v1alpha1RevisionMetadata.date) &&
        Objects.equals(this.message, v1alpha1RevisionMetadata.message) &&
        Objects.equals(this.signatureInfo, v1alpha1RevisionMetadata.signatureInfo) &&
        Objects.equals(this.tags, v1alpha1RevisionMetadata.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, date, message, signatureInfo, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RevisionMetadata {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    signatureInfo: ").append(toIndentedString(signatureInfo)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
