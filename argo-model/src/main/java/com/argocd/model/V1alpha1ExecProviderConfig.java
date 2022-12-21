package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.*;

/**
 * V1alpha1ExecProviderConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1ExecProviderConfig  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("apiVersion")
  private String apiVersion = null;

  @JsonProperty("args")
  @Valid
  private List<String> args = null;

  @JsonProperty("command")
  private String command = null;

  @JsonProperty("env")
  @Valid
  private Map<String, String> env = null;

  @JsonProperty("installHint")
  private String installHint = null;

  public V1alpha1ExecProviderConfig apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Get apiVersion
   * @return apiVersion
   **/
  @Schema(description = "")
  
    public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1alpha1ExecProviderConfig args(List<String> args) {
    this.args = args;
    return this;
  }

  public V1alpha1ExecProviderConfig addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

  /**
   * Get args
   * @return args
   **/
  @Schema(description = "")
  
    public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }

  public V1alpha1ExecProviderConfig command(String command) {
    this.command = command;
    return this;
  }

  /**
   * Get command
   * @return command
   **/
  @Schema(description = "")
  
    public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public V1alpha1ExecProviderConfig env(Map<String, String> env) {
    this.env = env;
    return this;
  }

  public V1alpha1ExecProviderConfig putEnvItem(String key, String envItem) {
    if (this.env == null) {
      this.env = new HashMap<>();
    }
    this.env.put(key, envItem);
    return this;
  }

  /**
   * Get env
   * @return env
   **/
  @Schema(description = "")
  
    public Map<String, String> getEnv() {
    return env;
  }

  public void setEnv(Map<String, String> env) {
    this.env = env;
  }

  public V1alpha1ExecProviderConfig installHint(String installHint) {
    this.installHint = installHint;
    return this;
  }

  /**
   * Get installHint
   * @return installHint
   **/
  @Schema(description = "")
  
    public String getInstallHint() {
    return installHint;
  }

  public void setInstallHint(String installHint) {
    this.installHint = installHint;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ExecProviderConfig v1alpha1ExecProviderConfig = (V1alpha1ExecProviderConfig) o;
    return Objects.equals(this.apiVersion, v1alpha1ExecProviderConfig.apiVersion) &&
        Objects.equals(this.args, v1alpha1ExecProviderConfig.args) &&
        Objects.equals(this.command, v1alpha1ExecProviderConfig.command) &&
        Objects.equals(this.env, v1alpha1ExecProviderConfig.env) &&
        Objects.equals(this.installHint, v1alpha1ExecProviderConfig.installHint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, args, command, env, installHint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ExecProviderConfig {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    installHint: ").append(toIndentedString(installHint)).append("\n");
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
