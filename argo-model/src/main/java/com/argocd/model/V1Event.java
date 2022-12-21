package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * Event is a report of an event somewhere in the cluster.  Events have a limited retention time and triggers and messages may evolve with time.  Event consumers should not rely on the timing of an event with a given Reason reflecting a consistent underlying trigger, or the continued existence of events with that Reason.  Events should be treated as informative, best-effort, supplemental data.
 */
@Schema(description = "Event is a report of an event somewhere in the cluster.  Events have a limited retention time and triggers and messages may evolve with time.  Event consumers should not rely on the timing of an event with a given Reason reflecting a consistent underlying trigger, or the continued existence of events with that Reason.  Events should be treated as informative, best-effort, supplemental data.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1Event  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("action")
  private String action = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("eventTime")
  private V1MicroTime eventTime = null;

  @JsonProperty("firstTimestamp")
  private V1Time firstTimestamp = null;

  @JsonProperty("involvedObject")
  private V1ObjectReference involvedObject = null;

  @JsonProperty("lastTimestamp")
  private V1Time lastTimestamp = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("metadata")
  private V1ObjectMeta metadata = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("related")
  private V1ObjectReference related = null;

  @JsonProperty("reportingComponent")
  private String reportingComponent = null;

  @JsonProperty("reportingInstance")
  private String reportingInstance = null;

  @JsonProperty("series")
  private V1EventSeries series = null;

  @JsonProperty("source")
  private V1EventSource source = null;

  @JsonProperty("type")
  private String type = null;

  public V1Event action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   **/
  @Schema(description = "")
  
    public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public V1Event count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
   **/
  @Schema(description = "")
  
    public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public V1Event eventTime(V1MicroTime eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Get eventTime
   * @return eventTime
   **/
  @Schema(description = "")
  
    @Valid
    public V1MicroTime getEventTime() {
    return eventTime;
  }

  public void setEventTime(V1MicroTime eventTime) {
    this.eventTime = eventTime;
  }

  public V1Event firstTimestamp(V1Time firstTimestamp) {
    this.firstTimestamp = firstTimestamp;
    return this;
  }

  /**
   * Get firstTimestamp
   * @return firstTimestamp
   **/
  @Schema(description = "")
  
    @Valid
    public V1Time getFirstTimestamp() {
    return firstTimestamp;
  }

  public void setFirstTimestamp(V1Time firstTimestamp) {
    this.firstTimestamp = firstTimestamp;
  }

  public V1Event involvedObject(V1ObjectReference involvedObject) {
    this.involvedObject = involvedObject;
    return this;
  }

  /**
   * Get involvedObject
   * @return involvedObject
   **/
  @Schema(description = "")
  
    @Valid
    public V1ObjectReference getInvolvedObject() {
    return involvedObject;
  }

  public void setInvolvedObject(V1ObjectReference involvedObject) {
    this.involvedObject = involvedObject;
  }

  public V1Event lastTimestamp(V1Time lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
    return this;
  }

  /**
   * Get lastTimestamp
   * @return lastTimestamp
   **/
  @Schema(description = "")
  
    @Valid
    public V1Time getLastTimestamp() {
    return lastTimestamp;
  }

  public void setLastTimestamp(V1Time lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
  }

  public V1Event message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @Schema(description = "")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1Event metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   **/
  @Schema(description = "")
  
    @Valid
    public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1Event reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
   **/
  @Schema(description = "")
  
    public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1Event related(V1ObjectReference related) {
    this.related = related;
    return this;
  }

  /**
   * Get related
   * @return related
   **/
  @Schema(description = "")
  
    @Valid
    public V1ObjectReference getRelated() {
    return related;
  }

  public void setRelated(V1ObjectReference related) {
    this.related = related;
  }

  public V1Event reportingComponent(String reportingComponent) {
    this.reportingComponent = reportingComponent;
    return this;
  }

  /**
   * Get reportingComponent
   * @return reportingComponent
   **/
  @Schema(description = "")
  
    public String getReportingComponent() {
    return reportingComponent;
  }

  public void setReportingComponent(String reportingComponent) {
    this.reportingComponent = reportingComponent;
  }

  public V1Event reportingInstance(String reportingInstance) {
    this.reportingInstance = reportingInstance;
    return this;
  }

  /**
   * Get reportingInstance
   * @return reportingInstance
   **/
  @Schema(description = "")
  
    public String getReportingInstance() {
    return reportingInstance;
  }

  public void setReportingInstance(String reportingInstance) {
    this.reportingInstance = reportingInstance;
  }

  public V1Event series(V1EventSeries series) {
    this.series = series;
    return this;
  }

  /**
   * Get series
   * @return series
   **/
  @Schema(description = "")
  
    @Valid
    public V1EventSeries getSeries() {
    return series;
  }

  public void setSeries(V1EventSeries series) {
    this.series = series;
  }

  public V1Event source(V1EventSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   **/
  @Schema(description = "")
  
    @Valid
    public V1EventSource getSource() {
    return source;
  }

  public void setSource(V1EventSource source) {
    this.source = source;
  }

  public V1Event type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(description = "")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Event v1Event = (V1Event) o;
    return Objects.equals(this.action, v1Event.action) &&
        Objects.equals(this.count, v1Event.count) &&
        Objects.equals(this.eventTime, v1Event.eventTime) &&
        Objects.equals(this.firstTimestamp, v1Event.firstTimestamp) &&
        Objects.equals(this.involvedObject, v1Event.involvedObject) &&
        Objects.equals(this.lastTimestamp, v1Event.lastTimestamp) &&
        Objects.equals(this.message, v1Event.message) &&
        Objects.equals(this.metadata, v1Event.metadata) &&
        Objects.equals(this.reason, v1Event.reason) &&
        Objects.equals(this.related, v1Event.related) &&
        Objects.equals(this.reportingComponent, v1Event.reportingComponent) &&
        Objects.equals(this.reportingInstance, v1Event.reportingInstance) &&
        Objects.equals(this.series, v1Event.series) &&
        Objects.equals(this.source, v1Event.source) &&
        Objects.equals(this.type, v1Event.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, count, eventTime, firstTimestamp, involvedObject, lastTimestamp, message, metadata, reason, related, reportingComponent, reportingInstance, series, source, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Event {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    firstTimestamp: ").append(toIndentedString(firstTimestamp)).append("\n");
    sb.append("    involvedObject: ").append(toIndentedString(involvedObject)).append("\n");
    sb.append("    lastTimestamp: ").append(toIndentedString(lastTimestamp)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    reportingComponent: ").append(toIndentedString(reportingComponent)).append("\n");
    sb.append("    reportingInstance: ").append(toIndentedString(reportingInstance)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
