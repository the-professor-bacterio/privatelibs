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
 * V1alpha1ApplicationSourcePlugin
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ApplicationSourcePlugin  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("env")
  @Valid
  private List<Applicationv1alpha1EnvEntry> env = null;

  @JsonProperty("name")
  private String name = null;

  public V1alpha1ApplicationSourcePlugin env(List<Applicationv1alpha1EnvEntry> env) {
    this.env = env;
    return this;
  }

  public V1alpha1ApplicationSourcePlugin addEnvItem(Applicationv1alpha1EnvEntry envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

  /**
   * Get env
   * @return env
   **/
  @Schema(description = "")
      @Valid
    public List<Applicationv1alpha1EnvEntry> getEnv() {
    return env;
  }

  public void setEnv(List<Applicationv1alpha1EnvEntry> env) {
    this.env = env;
  }

  public V1alpha1ApplicationSourcePlugin name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ApplicationSourcePlugin v1alpha1ApplicationSourcePlugin = (V1alpha1ApplicationSourcePlugin) o;
    return Objects.equals(this.env, v1alpha1ApplicationSourcePlugin.env) &&
        Objects.equals(this.name, v1alpha1ApplicationSourcePlugin.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(env, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ApplicationSourcePlugin {\n");
    
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
