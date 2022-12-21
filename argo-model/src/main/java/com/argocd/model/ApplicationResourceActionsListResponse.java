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
 * ApplicationResourceActionsListResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class ApplicationResourceActionsListResponse  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("actions")
  @Valid
  private List<V1alpha1ResourceAction> actions = null;

  public ApplicationResourceActionsListResponse actions(List<V1alpha1ResourceAction> actions) {
    this.actions = actions;
    return this;
  }

  public ApplicationResourceActionsListResponse addActionsItem(V1alpha1ResourceAction actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * Get actions
   * @return actions
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1ResourceAction> getActions() {
    return actions;
  }

  public void setActions(List<V1alpha1ResourceAction> actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationResourceActionsListResponse applicationResourceActionsListResponse = (ApplicationResourceActionsListResponse) o;
    return Objects.equals(this.actions, applicationResourceActionsListResponse.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationResourceActionsListResponse {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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
