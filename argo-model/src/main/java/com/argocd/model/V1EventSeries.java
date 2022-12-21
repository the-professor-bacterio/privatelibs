package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.
 */
@Schema(description = "EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1EventSeries  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("lastObservedTime")
  private V1MicroTime lastObservedTime = null;

  public V1EventSeries count(Integer count) {
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

  public V1EventSeries lastObservedTime(V1MicroTime lastObservedTime) {
    this.lastObservedTime = lastObservedTime;
    return this;
  }

  /**
   * Get lastObservedTime
   * @return lastObservedTime
   **/
  @Schema(description = "")
  
    @Valid
    public V1MicroTime getLastObservedTime() {
    return lastObservedTime;
  }

  public void setLastObservedTime(V1MicroTime lastObservedTime) {
    this.lastObservedTime = lastObservedTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EventSeries v1EventSeries = (V1EventSeries) o;
    return Objects.equals(this.count, v1EventSeries.count) &&
        Objects.equals(this.lastObservedTime, v1EventSeries.lastObservedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, lastObservedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EventSeries {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    lastObservedTime: ").append(toIndentedString(lastObservedTime)).append("\n");
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
