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
 * RepositoryHelmChartsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class RepositoryHelmChartsResponse  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("items")
  @Valid
  private List<RepositoryHelmChart> items = null;

  public RepositoryHelmChartsResponse items(List<RepositoryHelmChart> items) {
    this.items = items;
    return this;
  }

  public RepositoryHelmChartsResponse addItemsItem(RepositoryHelmChart itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   **/
  @Schema(description = "")
      @Valid
    public List<RepositoryHelmChart> getItems() {
    return items;
  }

  public void setItems(List<RepositoryHelmChart> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryHelmChartsResponse repositoryHelmChartsResponse = (RepositoryHelmChartsResponse) o;
    return Objects.equals(this.items, repositoryHelmChartsResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryHelmChartsResponse {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
