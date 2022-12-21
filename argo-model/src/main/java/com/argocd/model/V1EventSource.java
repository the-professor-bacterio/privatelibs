package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * EventSource contains information for an event.
 */
@Schema(description = "EventSource contains information for an event.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1EventSource  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("component")
  private String component = null;

  @JsonProperty("host")
  private String host = null;

  public V1EventSource component(String component) {
    this.component = component;
    return this;
  }

  /**
   * Get component
   * @return component
   **/
  @Schema(description = "")
  
    public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }

  public V1EventSource host(String host) {
    this.host = host;
    return this;
  }

  /**
   * Get host
   * @return host
   **/
  @Schema(description = "")
  
    public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EventSource v1EventSource = (V1EventSource) o;
    return Objects.equals(this.component, v1EventSource.component) &&
        Objects.equals(this.host, v1EventSource.host);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, host);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EventSource {\n");
    
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
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
