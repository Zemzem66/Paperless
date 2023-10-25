package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApigroupsidPermissionsForm
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class ApigroupsidPermissionsForm   {
  @JsonProperty("set_permissions")
  @Valid
  private List<String> setPermissions = new ArrayList<String>();

  public ApigroupsidPermissionsForm setPermissions(List<String> setPermissions) {
    this.setPermissions = setPermissions;
    return this;
  }

  public ApigroupsidPermissionsForm addSetPermissionsItem(String setPermissionsItem) {
    this.setPermissions.add(setPermissionsItem);
    return this;
  }

  /**
   * Get setPermissions
   * @return setPermissions
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<String> getSetPermissions() {
    return setPermissions;
  }

  public void setSetPermissions(List<String> setPermissions) {
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
    ApigroupsidPermissionsForm apigroupsidPermissionsForm = (ApigroupsidPermissionsForm) o;
    return Objects.equals(this.setPermissions, apigroupsidPermissionsForm.setPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(setPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApigroupsidPermissionsForm {\n");
    
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
