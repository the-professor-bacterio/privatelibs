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
 * RepositoryList is a collection of Repositories.
 */
@Schema(description = "RepositoryList is a collection of Repositories.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1alpha1RepositoryList  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("items")
  @Valid
  private List<V1alpha1Repository> items = null;

  @JsonProperty("metadata")
  private V1ListMeta metadata = null;

  public V1alpha1RepositoryList items(List<V1alpha1Repository> items) {
    this.items = items;
    return this;
  }

  public V1alpha1RepositoryList addItemsItem(V1alpha1Repository itemsItem) {
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
    public List<V1alpha1Repository> getItems() {
    return items;
  }

  public void setItems(List<V1alpha1Repository> items) {
    this.items = items;
  }

  public V1alpha1RepositoryList metadata(V1ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   **/
  @Schema(description = "")
  
    @Valid
    public V1ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ListMeta metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RepositoryList v1alpha1RepositoryList = (V1alpha1RepositoryList) o;
    return Objects.equals(this.items, v1alpha1RepositoryList.items) &&
        Objects.equals(this.metadata, v1alpha1RepositoryList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RepositoryList {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
