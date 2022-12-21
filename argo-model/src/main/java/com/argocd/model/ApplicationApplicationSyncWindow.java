package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * ApplicationApplicationSyncWindow
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class ApplicationApplicationSyncWindow  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("duration")
  private String duration = null;

  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("manualSync")
  private Boolean manualSync = null;

  @JsonProperty("schedule")
  private String schedule = null;

  public ApplicationApplicationSyncWindow duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   **/
  @Schema(description = "")
  
    public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public ApplicationApplicationSyncWindow kind(String kind) {
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

  public ApplicationApplicationSyncWindow manualSync(Boolean manualSync) {
    this.manualSync = manualSync;
    return this;
  }

  /**
   * Get manualSync
   * @return manualSync
   **/
  @Schema(description = "")
  
    public Boolean isManualSync() {
    return manualSync;
  }

  public void setManualSync(Boolean manualSync) {
    this.manualSync = manualSync;
  }

  public ApplicationApplicationSyncWindow schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
   **/
  @Schema(description = "")
  
    public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationApplicationSyncWindow applicationApplicationSyncWindow = (ApplicationApplicationSyncWindow) o;
    return Objects.equals(this.duration, applicationApplicationSyncWindow.duration) &&
        Objects.equals(this.kind, applicationApplicationSyncWindow.kind) &&
        Objects.equals(this.manualSync, applicationApplicationSyncWindow.manualSync) &&
        Objects.equals(this.schedule, applicationApplicationSyncWindow.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, kind, manualSync, schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationApplicationSyncWindow {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    manualSync: ").append(toIndentedString(manualSync)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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
