package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * ApplicationWatchEvent contains information about application change.
 */
@Schema(description = "ApplicationWatchEvent contains information about application change.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ApplicationWatchEvent  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("application")
  private V1alpha1Application application = null;

  @JsonProperty("type")
  private String type = null;

  public V1alpha1ApplicationWatchEvent application(V1alpha1Application application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1Application getApplication() {
    return application;
  }

  public void setApplication(V1alpha1Application application) {
    this.application = application;
  }

  public V1alpha1ApplicationWatchEvent type(String type) {
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
    V1alpha1ApplicationWatchEvent v1alpha1ApplicationWatchEvent = (V1alpha1ApplicationWatchEvent) o;
    return Objects.equals(this.application, v1alpha1ApplicationWatchEvent.application) &&
        Objects.equals(this.type, v1alpha1ApplicationWatchEvent.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ApplicationWatchEvent {\n");
    
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
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
