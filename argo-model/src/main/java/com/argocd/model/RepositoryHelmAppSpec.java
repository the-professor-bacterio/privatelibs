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
 * RepositoryHelmAppSpec
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class RepositoryHelmAppSpec  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("fileParameters")
  @Valid
  private List<V1alpha1HelmFileParameter> fileParameters = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parameters")
  @Valid
  private List<V1alpha1HelmParameter> parameters = null;

  @JsonProperty("valueFiles")
  @Valid
  private List<String> valueFiles = null;

  @JsonProperty("values")
  private String values = null;

  public RepositoryHelmAppSpec fileParameters(List<V1alpha1HelmFileParameter> fileParameters) {
    this.fileParameters = fileParameters;
    return this;
  }

  public RepositoryHelmAppSpec addFileParametersItem(V1alpha1HelmFileParameter fileParametersItem) {
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

  public RepositoryHelmAppSpec name(String name) {
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

  public RepositoryHelmAppSpec parameters(List<V1alpha1HelmParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public RepositoryHelmAppSpec addParametersItem(V1alpha1HelmParameter parametersItem) {
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

  public RepositoryHelmAppSpec valueFiles(List<String> valueFiles) {
    this.valueFiles = valueFiles;
    return this;
  }

  public RepositoryHelmAppSpec addValueFilesItem(String valueFilesItem) {
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

  public RepositoryHelmAppSpec values(String values) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryHelmAppSpec repositoryHelmAppSpec = (RepositoryHelmAppSpec) o;
    return Objects.equals(this.fileParameters, repositoryHelmAppSpec.fileParameters) &&
        Objects.equals(this.name, repositoryHelmAppSpec.name) &&
        Objects.equals(this.parameters, repositoryHelmAppSpec.parameters) &&
        Objects.equals(this.valueFiles, repositoryHelmAppSpec.valueFiles) &&
        Objects.equals(this.values, repositoryHelmAppSpec.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileParameters, name, parameters, valueFiles, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryHelmAppSpec {\n");
    
    sb.append("    fileParameters: ").append(toIndentedString(fileParameters)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    valueFiles: ").append(toIndentedString(valueFiles)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
