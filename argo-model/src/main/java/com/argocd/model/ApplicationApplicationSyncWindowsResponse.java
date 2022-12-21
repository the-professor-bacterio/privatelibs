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
 * ApplicationApplicationSyncWindowsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class ApplicationApplicationSyncWindowsResponse  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("activeWindows")
  @Valid
  private List<ApplicationApplicationSyncWindow> activeWindows = null;

  @JsonProperty("assignedWindows")
  @Valid
  private List<ApplicationApplicationSyncWindow> assignedWindows = null;

  @JsonProperty("canSync")
  private Boolean canSync = null;

  public ApplicationApplicationSyncWindowsResponse activeWindows(List<ApplicationApplicationSyncWindow> activeWindows) {
    this.activeWindows = activeWindows;
    return this;
  }

  public ApplicationApplicationSyncWindowsResponse addActiveWindowsItem(ApplicationApplicationSyncWindow activeWindowsItem) {
    if (this.activeWindows == null) {
      this.activeWindows = new ArrayList<>();
    }
    this.activeWindows.add(activeWindowsItem);
    return this;
  }

  /**
   * Get activeWindows
   * @return activeWindows
   **/
  @Schema(description = "")
      @Valid
    public List<ApplicationApplicationSyncWindow> getActiveWindows() {
    return activeWindows;
  }

  public void setActiveWindows(List<ApplicationApplicationSyncWindow> activeWindows) {
    this.activeWindows = activeWindows;
  }

  public ApplicationApplicationSyncWindowsResponse assignedWindows(List<ApplicationApplicationSyncWindow> assignedWindows) {
    this.assignedWindows = assignedWindows;
    return this;
  }

  public ApplicationApplicationSyncWindowsResponse addAssignedWindowsItem(ApplicationApplicationSyncWindow assignedWindowsItem) {
    if (this.assignedWindows == null) {
      this.assignedWindows = new ArrayList<>();
    }
    this.assignedWindows.add(assignedWindowsItem);
    return this;
  }

  /**
   * Get assignedWindows
   * @return assignedWindows
   **/
  @Schema(description = "")
      @Valid
    public List<ApplicationApplicationSyncWindow> getAssignedWindows() {
    return assignedWindows;
  }

  public void setAssignedWindows(List<ApplicationApplicationSyncWindow> assignedWindows) {
    this.assignedWindows = assignedWindows;
  }

  public ApplicationApplicationSyncWindowsResponse canSync(Boolean canSync) {
    this.canSync = canSync;
    return this;
  }

  /**
   * Get canSync
   * @return canSync
   **/
  @Schema(description = "")
  
    public Boolean isCanSync() {
    return canSync;
  }

  public void setCanSync(Boolean canSync) {
    this.canSync = canSync;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationApplicationSyncWindowsResponse applicationApplicationSyncWindowsResponse = (ApplicationApplicationSyncWindowsResponse) o;
    return Objects.equals(this.activeWindows, applicationApplicationSyncWindowsResponse.activeWindows) &&
        Objects.equals(this.assignedWindows, applicationApplicationSyncWindowsResponse.assignedWindows) &&
        Objects.equals(this.canSync, applicationApplicationSyncWindowsResponse.canSync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeWindows, assignedWindows, canSync);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationApplicationSyncWindowsResponse {\n");
    
    sb.append("    activeWindows: ").append(toIndentedString(activeWindows)).append("\n");
    sb.append("    assignedWindows: ").append(toIndentedString(assignedWindows)).append("\n");
    sb.append("    canSync: ").append(toIndentedString(canSync)).append("\n");
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
