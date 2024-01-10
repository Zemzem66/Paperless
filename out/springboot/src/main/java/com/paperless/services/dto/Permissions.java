package com.paperless.services.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.validation.Valid;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * GetDocument200ResponsePermissions
 */

@JsonTypeName("GetDocument_200_response_permissions")
@Generated(value = "com.paperless.codegen.languages.SpringCodegen", date = "2023-10-22T12:32:07.613318Z[Etc/UTC]")
public class Permissions {

  private PermissionsView view;

  private PermissionsView change;

  public Permissions() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Permissions(PermissionsView view, PermissionsView change) {
    this.view = view;
    this.change = change;
  }

  public Permissions view(PermissionsView view) {
    this.view = view;
    return this;
  }

  /**
   * Get view
   * @return view
  */
  @NotNull @Valid 
  @Schema(name = "view", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("view")
  public PermissionsView getView() {
    return view;
  }

  public void setView(PermissionsView view) {
    this.view = view;
  }

  public Permissions change(PermissionsView change) {
    this.change = change;
    return this;
  }

  /**
   * Get change
   * @return change
  */
  @NotNull @Valid 
  @Schema(name = "change", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("change")
  public PermissionsView getChange() {
    return change;
  }

  public void setChange(PermissionsView change) {
    this.change = change;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Permissions permissions = (Permissions) o;
    return Objects.equals(this.view, permissions.view) &&
        Objects.equals(this.change, permissions.change);
  }

  @Override
  public int hashCode() {
    return Objects.hash(view, change);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocument200ResponsePermissions {\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
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

