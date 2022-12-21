package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * ApplicationLogEntry
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class ApplicationLogEntry  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("last")
  private Boolean last = null;

  @JsonProperty("podName")
  private String podName = null;

  @JsonProperty("timeStamp")
  private V1Time timeStamp = null;

  @JsonProperty("timeStampStr")
  private String timeStampStr = null;

  public ApplicationLogEntry content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   **/
  @Schema(description = "")
  
    public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ApplicationLogEntry last(Boolean last) {
    this.last = last;
    return this;
  }

  /**
   * Get last
   * @return last
   **/
  @Schema(description = "")
  
    public Boolean isLast() {
    return last;
  }

  public void setLast(Boolean last) {
    this.last = last;
  }

  public ApplicationLogEntry podName(String podName) {
    this.podName = podName;
    return this;
  }

  /**
   * Get podName
   * @return podName
   **/
  @Schema(description = "")
  
    public String getPodName() {
    return podName;
  }

  public void setPodName(String podName) {
    this.podName = podName;
  }

  public ApplicationLogEntry timeStamp(V1Time timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

  /**
   * Get timeStamp
   * @return timeStamp
   **/
  @Schema(description = "")
  
    @Valid
    public V1Time getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(V1Time timeStamp) {
    this.timeStamp = timeStamp;
  }

  public ApplicationLogEntry timeStampStr(String timeStampStr) {
    this.timeStampStr = timeStampStr;
    return this;
  }

  /**
   * Get timeStampStr
   * @return timeStampStr
   **/
  @Schema(description = "")
  
    public String getTimeStampStr() {
    return timeStampStr;
  }

  public void setTimeStampStr(String timeStampStr) {
    this.timeStampStr = timeStampStr;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationLogEntry applicationLogEntry = (ApplicationLogEntry) o;
    return Objects.equals(this.content, applicationLogEntry.content) &&
        Objects.equals(this.last, applicationLogEntry.last) &&
        Objects.equals(this.podName, applicationLogEntry.podName) &&
        Objects.equals(this.timeStamp, applicationLogEntry.timeStamp) &&
        Objects.equals(this.timeStampStr, applicationLogEntry.timeStampStr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, last, podName, timeStamp, timeStampStr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationLogEntry {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    timeStampStr: ").append(toIndentedString(timeStampStr)).append("\n");
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
