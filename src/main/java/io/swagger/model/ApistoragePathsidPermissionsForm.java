package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ApistoragePathsidPermissions;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApistoragePathsidPermissionsForm
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class ApistoragePathsidPermissionsForm   {
  @JsonProperty("owner")
  private Integer owner = null;

  @JsonProperty("set_permissions")
  private ApistoragePathsidPermissions setPermissions = null;

  public ApistoragePathsidPermissionsForm owner(Integer owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getOwner() {
    return owner;
  }

  public void setOwner(Integer owner) {
    this.owner = owner;
  }

  public ApistoragePathsidPermissionsForm setPermissions(ApistoragePathsidPermissions setPermissions) {
    this.setPermissions = setPermissions;
    return this;
  }

  /**
   * Get setPermissions
   * @return setPermissions
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ApistoragePathsidPermissions getSetPermissions() {
    return setPermissions;
  }

  public void setSetPermissions(ApistoragePathsidPermissions setPermissions) {
    this.setPermissions = setPermissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApistoragePathsidPermissionsForm apistoragePathsidPermissionsForm = (ApistoragePathsidPermissionsForm) o;
    return Objects.equals(this.owner, apistoragePathsidPermissionsForm.owner) &&
        Objects.equals(this.setPermissions, apistoragePathsidPermissionsForm.setPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, setPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApistoragePathsidPermissionsForm {\n");
    
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    setPermissions: ").append(toIndentedString(setPermissions)).append("\n");
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
