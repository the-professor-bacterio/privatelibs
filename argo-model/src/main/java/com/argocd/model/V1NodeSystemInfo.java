package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * NodeSystemInfo is a set of ids/uuids to uniquely identify the node.
 */
@Schema(description = "NodeSystemInfo is a set of ids/uuids to uniquely identify the node.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1NodeSystemInfo  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("architecture")
  private String architecture = null;

  @JsonProperty("bootID")
  private String bootID = null;

  @JsonProperty("containerRuntimeVersion")
  private String containerRuntimeVersion = null;

  @JsonProperty("kernelVersion")
  private String kernelVersion = null;

  @JsonProperty("kubeProxyVersion")
  private String kubeProxyVersion = null;

  @JsonProperty("kubeletVersion")
  private String kubeletVersion = null;

  @JsonProperty("machineID")
  private String machineID = null;

  @JsonProperty("operatingSystem")
  private String operatingSystem = null;

  @JsonProperty("osImage")
  private String osImage = null;

  @JsonProperty("systemUUID")
  private String systemUUID = null;

  public V1NodeSystemInfo architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * Get architecture
   * @return architecture
   **/
  @Schema(description = "")
  
    public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public V1NodeSystemInfo bootID(String bootID) {
    this.bootID = bootID;
    return this;
  }

  /**
   * Boot ID reported by the node.
   * @return bootID
   **/
  @Schema(description = "Boot ID reported by the node.")
  
    public String getBootID() {
    return bootID;
  }

  public void setBootID(String bootID) {
    this.bootID = bootID;
  }

  public V1NodeSystemInfo containerRuntimeVersion(String containerRuntimeVersion) {
    this.containerRuntimeVersion = containerRuntimeVersion;
    return this;
  }

  /**
   * ContainerRuntime Version reported by the node through runtime remote API (e.g. containerd://1.4.2).
   * @return containerRuntimeVersion
   **/
  @Schema(description = "ContainerRuntime Version reported by the node through runtime remote API (e.g. containerd://1.4.2).")
  
    public String getContainerRuntimeVersion() {
    return containerRuntimeVersion;
  }

  public void setContainerRuntimeVersion(String containerRuntimeVersion) {
    this.containerRuntimeVersion = containerRuntimeVersion;
  }

  public V1NodeSystemInfo kernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
    return this;
  }

  /**
   * Kernel Version reported by the node from 'uname -r' (e.g. 3.16.0-0.bpo.4-amd64).
   * @return kernelVersion
   **/
  @Schema(description = "Kernel Version reported by the node from 'uname -r' (e.g. 3.16.0-0.bpo.4-amd64).")
  
    public String getKernelVersion() {
    return kernelVersion;
  }

  public void setKernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
  }

  public V1NodeSystemInfo kubeProxyVersion(String kubeProxyVersion) {
    this.kubeProxyVersion = kubeProxyVersion;
    return this;
  }

  /**
   * KubeProxy Version reported by the node.
   * @return kubeProxyVersion
   **/
  @Schema(description = "KubeProxy Version reported by the node.")
  
    public String getKubeProxyVersion() {
    return kubeProxyVersion;
  }

  public void setKubeProxyVersion(String kubeProxyVersion) {
    this.kubeProxyVersion = kubeProxyVersion;
  }

  public V1NodeSystemInfo kubeletVersion(String kubeletVersion) {
    this.kubeletVersion = kubeletVersion;
    return this;
  }

  /**
   * Kubelet Version reported by the node.
   * @return kubeletVersion
   **/
  @Schema(description = "Kubelet Version reported by the node.")
  
    public String getKubeletVersion() {
    return kubeletVersion;
  }

  public void setKubeletVersion(String kubeletVersion) {
    this.kubeletVersion = kubeletVersion;
  }

  public V1NodeSystemInfo machineID(String machineID) {
    this.machineID = machineID;
    return this;
  }

  /**
   * Get machineID
   * @return machineID
   **/
  @Schema(description = "")
  
    public String getMachineID() {
    return machineID;
  }

  public void setMachineID(String machineID) {
    this.machineID = machineID;
  }

  public V1NodeSystemInfo operatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

  /**
   * Get operatingSystem
   * @return operatingSystem
   **/
  @Schema(description = "")
  
    public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public V1NodeSystemInfo osImage(String osImage) {
    this.osImage = osImage;
    return this;
  }

  /**
   * OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).
   * @return osImage
   **/
  @Schema(description = "OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).")
  
    public String getOsImage() {
    return osImage;
  }

  public void setOsImage(String osImage) {
    this.osImage = osImage;
  }

  public V1NodeSystemInfo systemUUID(String systemUUID) {
    this.systemUUID = systemUUID;
    return this;
  }

  /**
   * Get systemUUID
   * @return systemUUID
   **/
  @Schema(description = "")
  
    public String getSystemUUID() {
    return systemUUID;
  }

  public void setSystemUUID(String systemUUID) {
    this.systemUUID = systemUUID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeSystemInfo v1NodeSystemInfo = (V1NodeSystemInfo) o;
    return Objects.equals(this.architecture, v1NodeSystemInfo.architecture) &&
        Objects.equals(this.bootID, v1NodeSystemInfo.bootID) &&
        Objects.equals(this.containerRuntimeVersion, v1NodeSystemInfo.containerRuntimeVersion) &&
        Objects.equals(this.kernelVersion, v1NodeSystemInfo.kernelVersion) &&
        Objects.equals(this.kubeProxyVersion, v1NodeSystemInfo.kubeProxyVersion) &&
        Objects.equals(this.kubeletVersion, v1NodeSystemInfo.kubeletVersion) &&
        Objects.equals(this.machineID, v1NodeSystemInfo.machineID) &&
        Objects.equals(this.operatingSystem, v1NodeSystemInfo.operatingSystem) &&
        Objects.equals(this.osImage, v1NodeSystemInfo.osImage) &&
        Objects.equals(this.systemUUID, v1NodeSystemInfo.systemUUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(architecture, bootID, containerRuntimeVersion, kernelVersion, kubeProxyVersion, kubeletVersion, machineID, operatingSystem, osImage, systemUUID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeSystemInfo {\n");
    
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    bootID: ").append(toIndentedString(bootID)).append("\n");
    sb.append("    containerRuntimeVersion: ").append(toIndentedString(containerRuntimeVersion)).append("\n");
    sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
    sb.append("    kubeProxyVersion: ").append(toIndentedString(kubeProxyVersion)).append("\n");
    sb.append("    kubeletVersion: ").append(toIndentedString(kubeletVersion)).append("\n");
    sb.append("    machineID: ").append(toIndentedString(machineID)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    osImage: ").append(toIndentedString(osImage)).append("\n");
    sb.append("    systemUUID: ").append(toIndentedString(systemUUID)).append("\n");
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
