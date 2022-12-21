package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * SyncOperationResource contains resources to sync.
 */
@Schema(description = "SyncOperationResource contains resources to sync.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1SyncOperationResource  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("group")
  private String group = null;

  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("namespace")
  private String namespace = null;

  public V1alpha1SyncOperationResource group(String group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
   **/
  @Schema(description = "")
  
    public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public V1alpha1SyncOperationResource kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Get kind
   * @return kind
   **/
  @Schema(description = "")
  
    public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1alpha1SyncOperationResource name(String name) {
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

  public V1alpha1SyncOperationResource namespace(String namespace) {
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
    V1alpha1SyncOperationResource v1alpha1SyncOperationResource = (V1alpha1SyncOperationResource) o;
    return Objects.equals(this.group, v1alpha1SyncOperationResource.group) &&
        Objects.equals(this.kind, v1alpha1SyncOperationResource.kind) &&
        Objects.equals(this.name, v1alpha1SyncOperationResource.name) &&
        Objects.equals(this.namespace, v1alpha1SyncOperationResource.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, kind, name, namespace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1SyncOperationResource {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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
