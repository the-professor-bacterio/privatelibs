package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.*;

/**
 * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
 */
@Schema(description = "ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1ObjectMeta  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("annotations")
  @Valid
  private Map<String, String> annotations = null;

  @JsonProperty("clusterName")
  private String clusterName = null;

  @JsonProperty("creationTimestamp")
  private V1Time creationTimestamp = null;

  @JsonProperty("deletionGracePeriodSeconds")
  private String deletionGracePeriodSeconds = null;

  @JsonProperty("deletionTimestamp")
  private V1Time deletionTimestamp = null;

  @JsonProperty("finalizers")
  @Valid
  private List<String> finalizers = null;

  @JsonProperty("generateName")
  private String generateName = null;

  @JsonProperty("generation")
  private String generation = null;

  @JsonProperty("labels")
  @Valid
  private Map<String, String> labels = null;

  @JsonProperty("managedFields")
  @Valid
  private List<V1ManagedFieldsEntry> managedFields = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("namespace")
  private String namespace = null;

  @JsonProperty("ownerReferences")
  @Valid
  private List<V1OwnerReference> ownerReferences = null;

  @JsonProperty("resourceVersion")
  private String resourceVersion = null;

  @JsonProperty("selfLink")
  private String selfLink = null;

  @JsonProperty("uid")
  private String uid = null;

  public V1ObjectMeta annotations(Map<String, String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public V1ObjectMeta putAnnotationsItem(String key, String annotationsItem) {
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

  public V1ObjectMeta clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * Deprecated: ClusterName is a legacy field that was always cleared by the system and never used; it will be removed completely in 1.25.  The name in the go struct is changed to help clients detect accidental use.  +optional
   * @return clusterName
   **/
  @Schema(description = "Deprecated: ClusterName is a legacy field that was always cleared by the system and never used; it will be removed completely in 1.25.  The name in the go struct is changed to help clients detect accidental use.  +optional")
  
    public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public V1ObjectMeta creationTimestamp(V1Time creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * Get creationTimestamp
   * @return creationTimestamp
   **/
  @Schema(description = "")
  
    @Valid
    public V1Time getCreationTimestamp() {
    return creationTimestamp;
  }

  public void setCreationTimestamp(V1Time creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
  }

  public V1ObjectMeta deletionGracePeriodSeconds(String deletionGracePeriodSeconds) {
    this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
    return this;
  }

  /**
   * Get deletionGracePeriodSeconds
   * @return deletionGracePeriodSeconds
   **/
  @Schema(description = "")
  
    public String getDeletionGracePeriodSeconds() {
    return deletionGracePeriodSeconds;
  }

  public void setDeletionGracePeriodSeconds(String deletionGracePeriodSeconds) {
    this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
  }

  public V1ObjectMeta deletionTimestamp(V1Time deletionTimestamp) {
    this.deletionTimestamp = deletionTimestamp;
    return this;
  }

  /**
   * Get deletionTimestamp
   * @return deletionTimestamp
   **/
  @Schema(description = "")
  
    @Valid
    public V1Time getDeletionTimestamp() {
    return deletionTimestamp;
  }

  public void setDeletionTimestamp(V1Time deletionTimestamp) {
    this.deletionTimestamp = deletionTimestamp;
  }

  public V1ObjectMeta finalizers(List<String> finalizers) {
    this.finalizers = finalizers;
    return this;
  }

  public V1ObjectMeta addFinalizersItem(String finalizersItem) {
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

  public V1ObjectMeta generateName(String generateName) {
    this.generateName = generateName;
    return this;
  }

  /**
   * GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided. If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server.  If this field is specified and the generated name exists, the server will return a 409.  Applied only if Name is not specified. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#idempotency +optional
   * @return generateName
   **/
  @Schema(description = "GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided. If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server.  If this field is specified and the generated name exists, the server will return a 409.  Applied only if Name is not specified. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#idempotency +optional")
  
    public String getGenerateName() {
    return generateName;
  }

  public void setGenerateName(String generateName) {
    this.generateName = generateName;
  }

  public V1ObjectMeta generation(String generation) {
    this.generation = generation;
    return this;
  }

  /**
   * Get generation
   * @return generation
   **/
  @Schema(description = "")
  
    public String getGeneration() {
    return generation;
  }

  public void setGeneration(String generation) {
    this.generation = generation;
  }

  public V1ObjectMeta labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public V1ObjectMeta putLabelsItem(String key, String labelsItem) {
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

  public V1ObjectMeta managedFields(List<V1ManagedFieldsEntry> managedFields) {
    this.managedFields = managedFields;
    return this;
  }

  public V1ObjectMeta addManagedFieldsItem(V1ManagedFieldsEntry managedFieldsItem) {
    if (this.managedFields == null) {
      this.managedFields = new ArrayList<>();
    }
    this.managedFields.add(managedFieldsItem);
    return this;
  }

  /**
   * ManagedFields maps workflow-id and version to the set of fields that are managed by that workflow. This is mostly for internal housekeeping, and users typically shouldn't need to set or understand this field. A workflow can be the user's name, a controller's name, or the name of a specific apply path like \"ci-cd\". The set of fields is always in the version that the workflow used when modifying the object.  +optional
   * @return managedFields
   **/
  @Schema(description = "ManagedFields maps workflow-id and version to the set of fields that are managed by that workflow. This is mostly for internal housekeeping, and users typically shouldn't need to set or understand this field. A workflow can be the user's name, a controller's name, or the name of a specific apply path like \"ci-cd\". The set of fields is always in the version that the workflow used when modifying the object.  +optional")
      @Valid
    public List<V1ManagedFieldsEntry> getManagedFields() {
    return managedFields;
  }

  public void setManagedFields(List<V1ManagedFieldsEntry> managedFields) {
    this.managedFields = managedFields;
  }

  public V1ObjectMeta name(String name) {
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

  public V1ObjectMeta namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Namespace defines the space within which each name must be unique. An empty namespace is equivalent to the \"default\" namespace, but \"default\" is the canonical representation. Not all objects are required to be scoped to a namespace - the value of this field for those objects will be empty.  Must be a DNS_LABEL. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/namespaces +optional
   * @return namespace
   **/
  @Schema(description = "Namespace defines the space within which each name must be unique. An empty namespace is equivalent to the \"default\" namespace, but \"default\" is the canonical representation. Not all objects are required to be scoped to a namespace - the value of this field for those objects will be empty.  Must be a DNS_LABEL. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/namespaces +optional")
  
    public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public V1ObjectMeta ownerReferences(List<V1OwnerReference> ownerReferences) {
    this.ownerReferences = ownerReferences;
    return this;
  }

  public V1ObjectMeta addOwnerReferencesItem(V1OwnerReference ownerReferencesItem) {
    if (this.ownerReferences == null) {
      this.ownerReferences = new ArrayList<>();
    }
    this.ownerReferences.add(ownerReferencesItem);
    return this;
  }

  /**
   * Get ownerReferences
   * @return ownerReferences
   **/
  @Schema(description = "")
      @Valid
    public List<V1OwnerReference> getOwnerReferences() {
    return ownerReferences;
  }

  public void setOwnerReferences(List<V1OwnerReference> ownerReferences) {
    this.ownerReferences = ownerReferences;
  }

  public V1ObjectMeta resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

  /**
   * An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be valid for a particular resource or set of resources.  Populated by the system. Read-only. Value must be treated as opaque by clients and . More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency +optional
   * @return resourceVersion
   **/
  @Schema(description = "An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be valid for a particular resource or set of resources.  Populated by the system. Read-only. Value must be treated as opaque by clients and . More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency +optional")
  
    public String getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }

  public V1ObjectMeta selfLink(String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Get selfLink
   * @return selfLink
   **/
  @Schema(description = "")
  
    public String getSelfLink() {
    return selfLink;
  }

  public void setSelfLink(String selfLink) {
    this.selfLink = selfLink;
  }

  public V1ObjectMeta uid(String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.  Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-guide/identifiers#uids +optional
   * @return uid
   **/
  @Schema(description = "UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.  Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-guide/identifiers#uids +optional")
  
    public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ObjectMeta v1ObjectMeta = (V1ObjectMeta) o;
    return Objects.equals(this.annotations, v1ObjectMeta.annotations) &&
        Objects.equals(this.clusterName, v1ObjectMeta.clusterName) &&
        Objects.equals(this.creationTimestamp, v1ObjectMeta.creationTimestamp) &&
        Objects.equals(this.deletionGracePeriodSeconds, v1ObjectMeta.deletionGracePeriodSeconds) &&
        Objects.equals(this.deletionTimestamp, v1ObjectMeta.deletionTimestamp) &&
        Objects.equals(this.finalizers, v1ObjectMeta.finalizers) &&
        Objects.equals(this.generateName, v1ObjectMeta.generateName) &&
        Objects.equals(this.generation, v1ObjectMeta.generation) &&
        Objects.equals(this.labels, v1ObjectMeta.labels) &&
        Objects.equals(this.managedFields, v1ObjectMeta.managedFields) &&
        Objects.equals(this.name, v1ObjectMeta.name) &&
        Objects.equals(this.namespace, v1ObjectMeta.namespace) &&
        Objects.equals(this.ownerReferences, v1ObjectMeta.ownerReferences) &&
        Objects.equals(this.resourceVersion, v1ObjectMeta.resourceVersion) &&
        Objects.equals(this.selfLink, v1ObjectMeta.selfLink) &&
        Objects.equals(this.uid, v1ObjectMeta.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, clusterName, creationTimestamp, deletionGracePeriodSeconds, deletionTimestamp, finalizers, generateName, generation, labels, managedFields, name, namespace, ownerReferences, resourceVersion, selfLink, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ObjectMeta {\n");
    
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
    sb.append("    deletionGracePeriodSeconds: ").append(toIndentedString(deletionGracePeriodSeconds)).append("\n");
    sb.append("    deletionTimestamp: ").append(toIndentedString(deletionTimestamp)).append("\n");
    sb.append("    finalizers: ").append(toIndentedString(finalizers)).append("\n");
    sb.append("    generateName: ").append(toIndentedString(generateName)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    managedFields: ").append(toIndentedString(managedFields)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    ownerReferences: ").append(toIndentedString(ownerReferences)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    selfLink: ").append(toIndentedString(selfLink)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
