package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ClusterHelp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class ClusterHelp  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("binaryUrls")
  @Valid
  private Map<String, String> binaryUrls = null;

  @JsonProperty("chatText")
  private String chatText = null;

  @JsonProperty("chatUrl")
  private String chatUrl = null;

  public ClusterHelp binaryUrls(Map<String, String> binaryUrls) {
    this.binaryUrls = binaryUrls;
    return this;
  }

  public ClusterHelp putBinaryUrlsItem(String key, String binaryUrlsItem) {
    if (this.binaryUrls == null) {
      this.binaryUrls = new HashMap<>();
    }
    this.binaryUrls.put(key, binaryUrlsItem);
    return this;
  }

  /**
   * Get binaryUrls
   * @return binaryUrls
   **/
  @Schema(description = "")
  
    public Map<String, String> getBinaryUrls() {
    return binaryUrls;
  }

  public void setBinaryUrls(Map<String, String> binaryUrls) {
    this.binaryUrls = binaryUrls;
  }

  public ClusterHelp chatText(String chatText) {
    this.chatText = chatText;
    return this;
  }

  /**
   * Get chatText
   * @return chatText
   **/
  @Schema(description = "")
  
    public String getChatText() {
    return chatText;
  }

  public void setChatText(String chatText) {
    this.chatText = chatText;
  }

  public ClusterHelp chatUrl(String chatUrl) {
    this.chatUrl = chatUrl;
    return this;
  }

  /**
   * Get chatUrl
   * @return chatUrl
   **/
  @Schema(description = "")
  
    public String getChatUrl() {
    return chatUrl;
  }

  public void setChatUrl(String chatUrl) {
    this.chatUrl = chatUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterHelp clusterHelp = (ClusterHelp) o;
    return Objects.equals(this.binaryUrls, clusterHelp.binaryUrls) &&
        Objects.equals(this.chatText, clusterHelp.chatText) &&
        Objects.equals(this.chatUrl, clusterHelp.chatUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binaryUrls, chatText, chatUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterHelp {\n");
    
    sb.append("    binaryUrls: ").append(toIndentedString(binaryUrls)).append("\n");
    sb.append("    chatText: ").append(toIndentedString(chatText)).append("\n");
    sb.append("    chatUrl: ").append(toIndentedString(chatUrl)).append("\n");
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
