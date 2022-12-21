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
 * SessionGetUserInfoResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class SessionGetUserInfoResponse  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("groups")
  @Valid
  private List<String> groups = null;

  @JsonProperty("iss")
  private String iss = null;

  @JsonProperty("loggedIn")
  private Boolean loggedIn = null;

  @JsonProperty("username")
  private String username = null;

  public SessionGetUserInfoResponse groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public SessionGetUserInfoResponse addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
   **/
  @Schema(description = "")
  
    public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public SessionGetUserInfoResponse iss(String iss) {
    this.iss = iss;
    return this;
  }

  /**
   * Get iss
   * @return iss
   **/
  @Schema(description = "")
  
    public String getIss() {
    return iss;
  }

  public void setIss(String iss) {
    this.iss = iss;
  }

  public SessionGetUserInfoResponse loggedIn(Boolean loggedIn) {
    this.loggedIn = loggedIn;
    return this;
  }

  /**
   * Get loggedIn
   * @return loggedIn
   **/
  @Schema(description = "")
  
    public Boolean isLoggedIn() {
    return loggedIn;
  }

  public void setLoggedIn(Boolean loggedIn) {
    this.loggedIn = loggedIn;
  }

  public SessionGetUserInfoResponse username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   **/
  @Schema(description = "")
  
    public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionGetUserInfoResponse sessionGetUserInfoResponse = (SessionGetUserInfoResponse) o;
    return Objects.equals(this.groups, sessionGetUserInfoResponse.groups) &&
        Objects.equals(this.iss, sessionGetUserInfoResponse.iss) &&
        Objects.equals(this.loggedIn, sessionGetUserInfoResponse.loggedIn) &&
        Objects.equals(this.username, sessionGetUserInfoResponse.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, iss, loggedIn, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionGetUserInfoResponse {\n");
    
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
    sb.append("    loggedIn: ").append(toIndentedString(loggedIn)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
