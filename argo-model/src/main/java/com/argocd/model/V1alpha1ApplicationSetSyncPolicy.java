package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * ApplicationSetSyncPolicy configures how generated Applications will relate to their ApplicationSet.
 */
@Schema(description = "ApplicationSetSyncPolicy configures how generated Applications will relate to their ApplicationSet.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ApplicationSetSyncPolicy  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("preserveResourcesOnDeletion")
  private Boolean preserveResourcesOnDeletion = null;

  public V1alpha1ApplicationSetSyncPolicy preserveResourcesOnDeletion(Boolean preserveResourcesOnDeletion) {
    this.preserveResourcesOnDeletion = preserveResourcesOnDeletion;
    return this;
  }

  /**
   * PreserveResourcesOnDeletion will preserve resources on deletion. If PreserveResourcesOnDeletion is set to true, these Applications will not be deleted.
   * @return preserveResourcesOnDeletion
   **/
  @Schema(description = "PreserveResourcesOnDeletion will preserve resources on deletion. If PreserveResourcesOnDeletion is set to true, these Applications will not be deleted.")
  
    public Boolean isPreserveResourcesOnDeletion() {
    return preserveResourcesOnDeletion;
  }

  public void setPreserveResourcesOnDeletion(Boolean preserveResourcesOnDeletion) {
    this.preserveResourcesOnDeletion = preserveResourcesOnDeletion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ApplicationSetSyncPolicy v1alpha1ApplicationSetSyncPolicy = (V1alpha1ApplicationSetSyncPolicy) o;
    return Objects.equals(this.preserveResourcesOnDeletion, v1alpha1ApplicationSetSyncPolicy.preserveResourcesOnDeletion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preserveResourcesOnDeletion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ApplicationSetSyncPolicy {\n");
    
    sb.append("    preserveResourcesOnDeletion: ").append(toIndentedString(preserveResourcesOnDeletion)).append("\n");
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
