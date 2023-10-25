package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ApicorrespondentsidPermissionsView;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApicorrespondentsidPermissions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class ApicorrespondentsidPermissions   {
  @JsonProperty("view")
  private ApicorrespondentsidPermissionsView view = null;

  @JsonProperty("change")
  private ApicorrespondentsidPermissionsView change = null;

  public ApicorrespondentsidPermissions view(ApicorrespondentsidPermissionsView view) {
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
    public ApicorrespondentsidPermissionsView getView() {
    return view;
  }

  public void setView(ApicorrespondentsidPermissionsView view) {
    this.view = view;
  }

  public ApicorrespondentsidPermissions change(ApicorrespondentsidPermissionsView change) {
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
    public ApicorrespondentsidPermissionsView getChange() {
    return change;
  }

  public void setChange(ApicorrespondentsidPermissionsView change) {
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
    ApicorrespondentsidPermissions apicorrespondentsidPermissions = (ApicorrespondentsidPermissions) o;
    return Objects.equals(this.view, apicorrespondentsidPermissions.view) &&
        Objects.equals(this.change, apicorrespondentsidPermissions.change);
  }

  @Override
  public int hashCode() {
    return Objects.hash(view, change);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApicorrespondentsidPermissions {\n");
    
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
