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
 * ProjectSyncWindowsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class ProjectSyncWindowsResponse  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("windows")
  @Valid
  private List<V1alpha1SyncWindow> windows = null;

  public ProjectSyncWindowsResponse windows(List<V1alpha1SyncWindow> windows) {
    this.windows = windows;
    return this;
  }

  public ProjectSyncWindowsResponse addWindowsItem(V1alpha1SyncWindow windowsItem) {
    if (this.windows == null) {
      this.windows = new ArrayList<>();
    }
    this.windows.add(windowsItem);
    return this;
  }

  /**
   * Get windows
   * @return windows
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1SyncWindow> getWindows() {
    return windows;
  }

  public void setWindows(List<V1alpha1SyncWindow> windows) {
    this.windows = windows;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectSyncWindowsResponse projectSyncWindowsResponse = (ProjectSyncWindowsResponse) o;
    return Objects.equals(this.windows, projectSyncWindowsResponse.windows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(windows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectSyncWindowsResponse {\n");
    
    sb.append("    windows: ").append(toIndentedString(windows)).append("\n");
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
