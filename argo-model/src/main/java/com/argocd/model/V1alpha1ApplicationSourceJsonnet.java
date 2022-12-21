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
 * V1alpha1ApplicationSourceJsonnet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ApplicationSourceJsonnet  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("extVars")
  @Valid
  private List<V1alpha1JsonnetVar> extVars = null;

  @JsonProperty("libs")
  @Valid
  private List<String> libs = null;

  @JsonProperty("tlas")
  @Valid
  private List<V1alpha1JsonnetVar> tlas = null;

  public V1alpha1ApplicationSourceJsonnet extVars(List<V1alpha1JsonnetVar> extVars) {
    this.extVars = extVars;
    return this;
  }

  public V1alpha1ApplicationSourceJsonnet addExtVarsItem(V1alpha1JsonnetVar extVarsItem) {
    if (this.extVars == null) {
      this.extVars = new ArrayList<>();
    }
    this.extVars.add(extVarsItem);
    return this;
  }

  /**
   * Get extVars
   * @return extVars
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1JsonnetVar> getExtVars() {
    return extVars;
  }

  public void setExtVars(List<V1alpha1JsonnetVar> extVars) {
    this.extVars = extVars;
  }

  public V1alpha1ApplicationSourceJsonnet libs(List<String> libs) {
    this.libs = libs;
    return this;
  }

  public V1alpha1ApplicationSourceJsonnet addLibsItem(String libsItem) {
    if (this.libs == null) {
      this.libs = new ArrayList<>();
    }
    this.libs.add(libsItem);
    return this;
  }

  /**
   * Get libs
   * @return libs
   **/
  @Schema(description = "")
  
    public List<String> getLibs() {
    return libs;
  }

  public void setLibs(List<String> libs) {
    this.libs = libs;
  }

  public V1alpha1ApplicationSourceJsonnet tlas(List<V1alpha1JsonnetVar> tlas) {
    this.tlas = tlas;
    return this;
  }

  public V1alpha1ApplicationSourceJsonnet addTlasItem(V1alpha1JsonnetVar tlasItem) {
    if (this.tlas == null) {
      this.tlas = new ArrayList<>();
    }
    this.tlas.add(tlasItem);
    return this;
  }

  /**
   * Get tlas
   * @return tlas
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1JsonnetVar> getTlas() {
    return tlas;
  }

  public void setTlas(List<V1alpha1JsonnetVar> tlas) {
    this.tlas = tlas;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ApplicationSourceJsonnet v1alpha1ApplicationSourceJsonnet = (V1alpha1ApplicationSourceJsonnet) o;
    return Objects.equals(this.extVars, v1alpha1ApplicationSourceJsonnet.extVars) &&
        Objects.equals(this.libs, v1alpha1ApplicationSourceJsonnet.libs) &&
        Objects.equals(this.tlas, v1alpha1ApplicationSourceJsonnet.tlas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extVars, libs, tlas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ApplicationSourceJsonnet {\n");
    
    sb.append("    extVars: ").append(toIndentedString(extVars)).append("\n");
    sb.append("    libs: ").append(toIndentedString(libs)).append("\n");
    sb.append("    tlas: ").append(toIndentedString(tlas)).append("\n");
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
