package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1SyncStatus
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1SyncStatus  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("comparedTo")
  private V1alpha1ComparedTo comparedTo = null;

  @JsonProperty("revision")
  private String revision = null;

  @JsonProperty("status")
  private String status = null;

  public V1alpha1SyncStatus comparedTo(V1alpha1ComparedTo comparedTo) {
    this.comparedTo = comparedTo;
    return this;
  }

  /**
   * Get comparedTo
   * @return comparedTo
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1ComparedTo getComparedTo() {
    return comparedTo;
  }

  public void setComparedTo(V1alpha1ComparedTo comparedTo) {
    this.comparedTo = comparedTo;
  }

  public V1alpha1SyncStatus revision(String revision) {
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

  public V1alpha1SyncStatus status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1SyncStatus v1alpha1SyncStatus = (V1alpha1SyncStatus) o;
    return Objects.equals(this.comparedTo, v1alpha1SyncStatus.comparedTo) &&
        Objects.equals(this.revision, v1alpha1SyncStatus.revision) &&
        Objects.equals(this.status, v1alpha1SyncStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparedTo, revision, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1SyncStatus {\n");
    
    sb.append("    comparedTo: ").append(toIndentedString(comparedTo)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
