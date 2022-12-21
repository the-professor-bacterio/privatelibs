package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
 */
@Schema(description = "ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1ManagedFieldsEntry  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("apiVersion")
  private String apiVersion = null;

  @JsonProperty("fieldsType")
  private String fieldsType = null;

  @JsonProperty("fieldsV1")
  private V1FieldsV1 fieldsV1 = null;

  @JsonProperty("manager")
  private String manager = null;

  @JsonProperty("operation")
  private String operation = null;

  @JsonProperty("subresource")
  private String subresource = null;

  @JsonProperty("time")
  private V1Time time = null;

  public V1ManagedFieldsEntry apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * APIVersion defines the version of this resource that this field set applies to. The format is \"group/version\" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
   * @return apiVersion
   **/
  @Schema(description = "APIVersion defines the version of this resource that this field set applies to. The format is \"group/version\" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.")
  
    public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1ManagedFieldsEntry fieldsType(String fieldsType) {
    this.fieldsType = fieldsType;
    return this;
  }

  /**
   * Get fieldsType
   * @return fieldsType
   **/
  @Schema(description = "")
  
    public String getFieldsType() {
    return fieldsType;
  }

  public void setFieldsType(String fieldsType) {
    this.fieldsType = fieldsType;
  }

  public V1ManagedFieldsEntry fieldsV1(V1FieldsV1 fieldsV1) {
    this.fieldsV1 = fieldsV1;
    return this;
  }

  /**
   * Get fieldsV1
   * @return fieldsV1
   **/
  @Schema(description = "")
  
    @Valid
    public V1FieldsV1 getFieldsV1() {
    return fieldsV1;
  }

  public void setFieldsV1(V1FieldsV1 fieldsV1) {
    this.fieldsV1 = fieldsV1;
  }

  public V1ManagedFieldsEntry manager(String manager) {
    this.manager = manager;
    return this;
  }

  /**
   * Manager is an identifier of the workflow managing these fields.
   * @return manager
   **/
  @Schema(description = "Manager is an identifier of the workflow managing these fields.")
  
    public String getManager() {
    return manager;
  }

  public void setManager(String manager) {
    this.manager = manager;
  }

  public V1ManagedFieldsEntry operation(String operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.
   * @return operation
   **/
  @Schema(description = "Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.")
  
    public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public V1ManagedFieldsEntry subresource(String subresource) {
    this.subresource = subresource;
    return this;
  }

  /**
   * Subresource is the name of the subresource used to update that object, or empty string if the object was updated through the main resource. The value of this field is used to distinguish between managers, even if they share the same name. For example, a status update will be distinct from a regular update using the same manager name. Note that the APIVersion field is not related to the Subresource field and it always corresponds to the version of the main resource.
   * @return subresource
   **/
  @Schema(description = "Subresource is the name of the subresource used to update that object, or empty string if the object was updated through the main resource. The value of this field is used to distinguish between managers, even if they share the same name. For example, a status update will be distinct from a regular update using the same manager name. Note that the APIVersion field is not related to the Subresource field and it always corresponds to the version of the main resource.")
  
    public String getSubresource() {
    return subresource;
  }

  public void setSubresource(String subresource) {
    this.subresource = subresource;
  }

  public V1ManagedFieldsEntry time(V1Time time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
   **/
  @Schema(description = "")
  
    @Valid
    public V1Time getTime() {
    return time;
  }

  public void setTime(V1Time time) {
    this.time = time;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ManagedFieldsEntry v1ManagedFieldsEntry = (V1ManagedFieldsEntry) o;
    return Objects.equals(this.apiVersion, v1ManagedFieldsEntry.apiVersion) &&
        Objects.equals(this.fieldsType, v1ManagedFieldsEntry.fieldsType) &&
        Objects.equals(this.fieldsV1, v1ManagedFieldsEntry.fieldsV1) &&
        Objects.equals(this.manager, v1ManagedFieldsEntry.manager) &&
        Objects.equals(this.operation, v1ManagedFieldsEntry.operation) &&
        Objects.equals(this.subresource, v1ManagedFieldsEntry.subresource) &&
        Objects.equals(this.time, v1ManagedFieldsEntry.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, fieldsType, fieldsV1, manager, operation, subresource, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ManagedFieldsEntry {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    fieldsType: ").append(toIndentedString(fieldsType)).append("\n");
    sb.append("    fieldsV1: ").append(toIndentedString(fieldsV1)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    subresource: ").append(toIndentedString(subresource)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
