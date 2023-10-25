package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ApicorrespondentsidPermissions;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApicorrespondentsidPermissionsForm
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")


public class ApicorrespondentsidPermissionsForm   {
  @JsonProperty("owner")
  private Integer owner = null;

  @JsonProperty("set_permissions")
  private ApicorrespondentsidPermissions setPermissions = null;

  public ApicorrespondentsidPermissionsForm owner(Integer owner) {
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

  public ApicorrespondentsidPermissionsForm setPermissions(ApicorrespondentsidPermissions setPermissions) {
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
    public ApicorrespondentsidPermissions getSetPermissions() {
    return setPermissions;
  }

  public void setSetPermissions(ApicorrespondentsidPermissions setPermissions) {
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
    ApicorrespondentsidPermissionsForm apicorrespondentsidPermissionsForm = (ApicorrespondentsidPermissionsForm) o;
    return Objects.equals(this.owner, apicorrespondentsidPermissionsForm.owner) &&
        Objects.equals(this.setPermissions, apicorrespondentsidPermissionsForm.setPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, setPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApicorrespondentsidPermissionsForm {\n");
    
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
