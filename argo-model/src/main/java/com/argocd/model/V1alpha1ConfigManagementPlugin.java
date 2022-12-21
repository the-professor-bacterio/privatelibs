package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * V1alpha1ConfigManagementPlugin
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ConfigManagementPlugin  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("generate")
  private V1alpha1Command generate = null;

  @JsonProperty("init")
  private V1alpha1Command init = null;

  @JsonProperty("lockRepo")
  private Boolean lockRepo = null;

  @JsonProperty("name")
  private String name = null;

  public V1alpha1ConfigManagementPlugin generate(V1alpha1Command generate) {
    this.generate = generate;
    return this;
  }

  /**
   * Get generate
   * @return generate
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1Command getGenerate() {
    return generate;
  }

  public void setGenerate(V1alpha1Command generate) {
    this.generate = generate;
  }

  public V1alpha1ConfigManagementPlugin init(V1alpha1Command init) {
    this.init = init;
    return this;
  }

  /**
   * Get init
   * @return init
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1Command getInit() {
    return init;
  }

  public void setInit(V1alpha1Command init) {
    this.init = init;
  }

  public V1alpha1ConfigManagementPlugin lockRepo(Boolean lockRepo) {
    this.lockRepo = lockRepo;
    return this;
  }

  /**
   * Get lockRepo
   * @return lockRepo
   **/
  @Schema(description = "")
  
    public Boolean isLockRepo() {
    return lockRepo;
  }

  public void setLockRepo(Boolean lockRepo) {
    this.lockRepo = lockRepo;
  }

  public V1alpha1ConfigManagementPlugin name(String name) {
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
    V1alpha1ConfigManagementPlugin v1alpha1ConfigManagementPlugin = (V1alpha1ConfigManagementPlugin) o;
    return Objects.equals(this.generate, v1alpha1ConfigManagementPlugin.generate) &&
        Objects.equals(this.init, v1alpha1ConfigManagementPlugin.init) &&
        Objects.equals(this.lockRepo, v1alpha1ConfigManagementPlugin.lockRepo) &&
        Objects.equals(this.name, v1alpha1ConfigManagementPlugin.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generate, init, lockRepo, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ConfigManagementPlugin {\n");
    
    sb.append("    generate: ").append(toIndentedString(generate)).append("\n");
    sb.append("    init: ").append(toIndentedString(init)).append("\n");
    sb.append("    lockRepo: ").append(toIndentedString(lockRepo)).append("\n");
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
