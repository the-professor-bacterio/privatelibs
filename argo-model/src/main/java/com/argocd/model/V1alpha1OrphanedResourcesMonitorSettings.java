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
 * V1alpha1OrphanedResourcesMonitorSettings
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1OrphanedResourcesMonitorSettings  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("ignore")
  @Valid
  private List<V1alpha1OrphanedResourceKey> ignore = null;

  @JsonProperty("warn")
  private Boolean warn = null;

  public V1alpha1OrphanedResourcesMonitorSettings ignore(List<V1alpha1OrphanedResourceKey> ignore) {
    this.ignore = ignore;
    return this;
  }

  public V1alpha1OrphanedResourcesMonitorSettings addIgnoreItem(V1alpha1OrphanedResourceKey ignoreItem) {
    if (this.ignore == null) {
      this.ignore = new ArrayList<>();
    }
    this.ignore.add(ignoreItem);
    return this;
  }

  /**
   * Get ignore
   * @return ignore
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1OrphanedResourceKey> getIgnore() {
    return ignore;
  }

  public void setIgnore(List<V1alpha1OrphanedResourceKey> ignore) {
    this.ignore = ignore;
  }

  public V1alpha1OrphanedResourcesMonitorSettings warn(Boolean warn) {
    this.warn = warn;
    return this;
  }

  /**
   * Get warn
   * @return warn
   **/
  @Schema(description = "")
  
    public Boolean isWarn() {
    return warn;
  }

  public void setWarn(Boolean warn) {
    this.warn = warn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OrphanedResourcesMonitorSettings v1alpha1OrphanedResourcesMonitorSettings = (V1alpha1OrphanedResourcesMonitorSettings) o;
    return Objects.equals(this.ignore, v1alpha1OrphanedResourcesMonitorSettings.ignore) &&
        Objects.equals(this.warn, v1alpha1OrphanedResourcesMonitorSettings.warn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ignore, warn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OrphanedResourcesMonitorSettings {\n");
    
    sb.append("    ignore: ").append(toIndentedString(ignore)).append("\n");
    sb.append("    warn: ").append(toIndentedString(warn)).append("\n");
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
