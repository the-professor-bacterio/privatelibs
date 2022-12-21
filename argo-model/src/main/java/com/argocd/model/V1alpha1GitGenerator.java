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
 * V1alpha1GitGenerator
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1GitGenerator  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("directories")
  @Valid
  private List<V1alpha1GitDirectoryGeneratorItem> directories = null;

  @JsonProperty("files")
  @Valid
  private List<V1alpha1GitFileGeneratorItem> files = null;

  @JsonProperty("repoURL")
  private String repoURL = null;

  @JsonProperty("requeueAfterSeconds")
  private String requeueAfterSeconds = null;

  @JsonProperty("revision")
  private String revision = null;

  @JsonProperty("template")
  private V1alpha1ApplicationSetTemplate template = null;

  public V1alpha1GitGenerator directories(List<V1alpha1GitDirectoryGeneratorItem> directories) {
    this.directories = directories;
    return this;
  }

  public V1alpha1GitGenerator addDirectoriesItem(V1alpha1GitDirectoryGeneratorItem directoriesItem) {
    if (this.directories == null) {
      this.directories = new ArrayList<>();
    }
    this.directories.add(directoriesItem);
    return this;
  }

  /**
   * Get directories
   * @return directories
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1GitDirectoryGeneratorItem> getDirectories() {
    return directories;
  }

  public void setDirectories(List<V1alpha1GitDirectoryGeneratorItem> directories) {
    this.directories = directories;
  }

  public V1alpha1GitGenerator files(List<V1alpha1GitFileGeneratorItem> files) {
    this.files = files;
    return this;
  }

  public V1alpha1GitGenerator addFilesItem(V1alpha1GitFileGeneratorItem filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

  /**
   * Get files
   * @return files
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1GitFileGeneratorItem> getFiles() {
    return files;
  }

  public void setFiles(List<V1alpha1GitFileGeneratorItem> files) {
    this.files = files;
  }

  public V1alpha1GitGenerator repoURL(String repoURL) {
    this.repoURL = repoURL;
    return this;
  }

  /**
   * Get repoURL
   * @return repoURL
   **/
  @Schema(description = "")
  
    public String getRepoURL() {
    return repoURL;
  }

  public void setRepoURL(String repoURL) {
    this.repoURL = repoURL;
  }

  public V1alpha1GitGenerator requeueAfterSeconds(String requeueAfterSeconds) {
    this.requeueAfterSeconds = requeueAfterSeconds;
    return this;
  }

  /**
   * Get requeueAfterSeconds
   * @return requeueAfterSeconds
   **/
  @Schema(description = "")
  
    public String getRequeueAfterSeconds() {
    return requeueAfterSeconds;
  }

  public void setRequeueAfterSeconds(String requeueAfterSeconds) {
    this.requeueAfterSeconds = requeueAfterSeconds;
  }

  public V1alpha1GitGenerator revision(String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Get revision
   * @return revision
   **/
  @Schema(description = "")
  
    public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  public V1alpha1GitGenerator template(V1alpha1ApplicationSetTemplate template) {
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
    V1alpha1GitGenerator v1alpha1GitGenerator = (V1alpha1GitGenerator) o;
    return Objects.equals(this.directories, v1alpha1GitGenerator.directories) &&
        Objects.equals(this.files, v1alpha1GitGenerator.files) &&
        Objects.equals(this.repoURL, v1alpha1GitGenerator.repoURL) &&
        Objects.equals(this.requeueAfterSeconds, v1alpha1GitGenerator.requeueAfterSeconds) &&
        Objects.equals(this.revision, v1alpha1GitGenerator.revision) &&
        Objects.equals(this.template, v1alpha1GitGenerator.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directories, files, repoURL, requeueAfterSeconds, revision, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1GitGenerator {\n");
    
    sb.append("    directories: ").append(toIndentedString(directories)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    repoURL: ").append(toIndentedString(repoURL)).append("\n");
    sb.append("    requeueAfterSeconds: ").append(toIndentedString(requeueAfterSeconds)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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
