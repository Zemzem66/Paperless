package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ApistoragePathsidSetPermissionsView;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApistoragePathsidSetPermissions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")


public class ApistoragePathsidSetPermissions   {
  @JsonProperty("view")
  private ApistoragePathsidSetPermissionsView view = null;

  @JsonProperty("change")
  private ApistoragePathsidSetPermissionsView change = null;

  public ApistoragePathsidSetPermissions view(ApistoragePathsidSetPermissionsView view) {
    this.view = view;
    return this;
  }

  /**
   * Get view
   * @return view
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ApistoragePathsidSetPermissionsView getView() {
    return view;
  }

  public void setView(ApistoragePathsidSetPermissionsView view) {
    this.view = view;
  }

  public ApistoragePathsidSetPermissions change(ApistoragePathsidSetPermissionsView change) {
    this.change = change;
    return this;
  }

  /**
   * Get change
   * @return change
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ApistoragePathsidSetPermissionsView getChange() {
    return change;
  }

  public void setChange(ApistoragePathsidSetPermissionsView change) {
    this.change = change;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApistoragePathsidSetPermissions apistoragePathsidSetPermissions = (ApistoragePathsidSetPermissions) o;
    return Objects.equals(this.view, apistoragePathsidSetPermissions.view) &&
        Objects.equals(this.change, apistoragePathsidSetPermissions.change);
  }

  @Override
  public int hashCode() {
    return Objects.hash(view, change);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApistoragePathsidSetPermissions {\n");
    
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
