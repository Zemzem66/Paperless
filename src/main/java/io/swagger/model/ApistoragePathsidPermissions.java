package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ApistoragePathsidPermissionsView;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApistoragePathsidPermissions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class ApistoragePathsidPermissions   {
  @JsonProperty("view")
  private ApistoragePathsidPermissionsView view = null;

  @JsonProperty("change")
  private ApistoragePathsidPermissionsView change = null;

  public ApistoragePathsidPermissions view(ApistoragePathsidPermissionsView view) {
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
    public ApistoragePathsidPermissionsView getView() {
    return view;
  }

  public void setView(ApistoragePathsidPermissionsView view) {
    this.view = view;
  }

  public ApistoragePathsidPermissions change(ApistoragePathsidPermissionsView change) {
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
    public ApistoragePathsidPermissionsView getChange() {
    return change;
  }

  public void setChange(ApistoragePathsidPermissionsView change) {
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
    ApistoragePathsidPermissions apistoragePathsidPermissions = (ApistoragePathsidPermissions) o;
    return Objects.equals(this.view, apistoragePathsidPermissions.view) &&
        Objects.equals(this.change, apistoragePathsidPermissions.change);
  }

  @Override
  public int hashCode() {
    return Objects.hash(view, change);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApistoragePathsidPermissions {\n");
    
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
