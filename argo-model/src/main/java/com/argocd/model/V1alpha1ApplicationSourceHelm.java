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
 * V1alpha1ApplicationSourceHelm
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ApplicationSourceHelm  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("fileParameters")
  @Valid
  private List<V1alpha1HelmFileParameter> fileParameters = null;

  @JsonProperty("ignoreMissingValueFiles")
  private Boolean ignoreMissingValueFiles = null;

  @JsonProperty("parameters")
  @Valid
  private List<V1alpha1HelmParameter> parameters = null;

  @JsonProperty("passCredentials")
  private Boolean passCredentials = null;

  @JsonProperty("releaseName")
  private String releaseName = null;

  @JsonProperty("skipCrds")
  private Boolean skipCrds = null;

  @JsonProperty("valueFiles")
  @Valid
  private List<String> valueFiles = null;

  @JsonProperty("values")
  private String values = null;

  @JsonProperty("version")
  private String version = null;

  public V1alpha1ApplicationSourceHelm fileParameters(List<V1alpha1HelmFileParameter> fileParameters) {
    this.fileParameters = fileParameters;
    return this;
  }

  public V1alpha1ApplicationSourceHelm addFileParametersItem(V1alpha1HelmFileParameter fileParametersItem) {
    if (this.fileParameters == null) {
      this.fileParameters = new ArrayList<>();
    }
    this.fileParameters.add(fileParametersItem);
    return this;
  }

  /**
   * Get fileParameters
   * @return fileParameters
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1HelmFileParameter> getFileParameters() {
    return fileParameters;
  }

  public void setFileParameters(List<V1alpha1HelmFileParameter> fileParameters) {
    this.fileParameters = fileParameters;
  }

  public V1alpha1ApplicationSourceHelm ignoreMissingValueFiles(Boolean ignoreMissingValueFiles) {
    this.ignoreMissingValueFiles = ignoreMissingValueFiles;
    return this;
  }

  /**
   * Get ignoreMissingValueFiles
   * @return ignoreMissingValueFiles
   **/
  @Schema(description = "")
  
    public Boolean isIgnoreMissingValueFiles() {
    return ignoreMissingValueFiles;
  }

  public void setIgnoreMissingValueFiles(Boolean ignoreMissingValueFiles) {
    this.ignoreMissingValueFiles = ignoreMissingValueFiles;
  }

  public V1alpha1ApplicationSourceHelm parameters(List<V1alpha1HelmParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public V1alpha1ApplicationSourceHelm addParametersItem(V1alpha1HelmParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Get parameters
   * @return parameters
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1HelmParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<V1alpha1HelmParameter> parameters) {
    this.parameters = parameters;
  }

  public V1alpha1ApplicationSourceHelm passCredentials(Boolean passCredentials) {
    this.passCredentials = passCredentials;
    return this;
  }

  /**
   * Get passCredentials
   * @return passCredentials
   **/
  @Schema(description = "")
  
    public Boolean isPassCredentials() {
    return passCredentials;
  }

  public void setPassCredentials(Boolean passCredentials) {
    this.passCredentials = passCredentials;
  }

  public V1alpha1ApplicationSourceHelm releaseName(String releaseName) {
    this.releaseName = releaseName;
    return this;
  }

  /**
   * Get releaseName
   * @return releaseName
   **/
  @Schema(description = "")
  
    public String getReleaseName() {
    return releaseName;
  }

  public void setReleaseName(String releaseName) {
    this.releaseName = releaseName;
  }

  public V1alpha1ApplicationSourceHelm skipCrds(Boolean skipCrds) {
    this.skipCrds = skipCrds;
    return this;
  }

  /**
   * Get skipCrds
   * @return skipCrds
   **/
  @Schema(description = "")
  
    public Boolean isSkipCrds() {
    return skipCrds;
  }

  public void setSkipCrds(Boolean skipCrds) {
    this.skipCrds = skipCrds;
  }

  public V1alpha1ApplicationSourceHelm valueFiles(List<String> valueFiles) {
    this.valueFiles = valueFiles;
    return this;
  }

  public V1alpha1ApplicationSourceHelm addValueFilesItem(String valueFilesItem) {
    if (this.valueFiles == null) {
      this.valueFiles = new ArrayList<>();
    }
    this.valueFiles.add(valueFilesItem);
    return this;
  }

  /**
   * Get valueFiles
   * @return valueFiles
   **/
  @Schema(description = "")
  
    public List<String> getValueFiles() {
    return valueFiles;
  }

  public void setValueFiles(List<String> valueFiles) {
    this.valueFiles = valueFiles;
  }

  public V1alpha1ApplicationSourceHelm values(String values) {
    this.values = values;
    return this;
  }

  /**
   * Get values
   * @return values
   **/
  @Schema(description = "")
  
    public String getValues() {
    return values;
  }

  public void setValues(String values) {
    this.values = values;
  }

  public V1alpha1ApplicationSourceHelm version(String version) {
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
    V1alpha1ApplicationSourceHelm v1alpha1ApplicationSourceHelm = (V1alpha1ApplicationSourceHelm) o;
    return Objects.equals(this.fileParameters, v1alpha1ApplicationSourceHelm.fileParameters) &&
        Objects.equals(this.ignoreMissingValueFiles, v1alpha1ApplicationSourceHelm.ignoreMissingValueFiles) &&
        Objects.equals(this.parameters, v1alpha1ApplicationSourceHelm.parameters) &&
        Objects.equals(this.passCredentials, v1alpha1ApplicationSourceHelm.passCredentials) &&
        Objects.equals(this.releaseName, v1alpha1ApplicationSourceHelm.releaseName) &&
        Objects.equals(this.skipCrds, v1alpha1ApplicationSourceHelm.skipCrds) &&
        Objects.equals(this.valueFiles, v1alpha1ApplicationSourceHelm.valueFiles) &&
        Objects.equals(this.values, v1alpha1ApplicationSourceHelm.values) &&
        Objects.equals(this.version, v1alpha1ApplicationSourceHelm.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileParameters, ignoreMissingValueFiles, parameters, passCredentials, releaseName, skipCrds, valueFiles, values, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ApplicationSourceHelm {\n");
    
    sb.append("    fileParameters: ").append(toIndentedString(fileParameters)).append("\n");
    sb.append("    ignoreMissingValueFiles: ").append(toIndentedString(ignoreMissingValueFiles)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    passCredentials: ").append(toIndentedString(passCredentials)).append("\n");
    sb.append("    releaseName: ").append(toIndentedString(releaseName)).append("\n");
    sb.append("    skipCrds: ").append(toIndentedString(skipCrds)).append("\n");
    sb.append("    valueFiles: ").append(toIndentedString(valueFiles)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
