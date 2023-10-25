package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ApigroupsidPermissionsForm;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GroupsIdBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class GroupsIdBody   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("permissions")
  @Valid
  private List<String> permissions = new ArrayList<String>();

  @JsonProperty("set_permissions")
  @Valid
  private List<String> setPermissions = new ArrayList<String>();

  @JsonProperty("permissions_form")
  private ApigroupsidPermissionsForm permissionsForm = null;

  public GroupsIdBody id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GroupsIdBody name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GroupsIdBody permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public GroupsIdBody addPermissionsItem(String permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Get permissions
   * @return permissions
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public GroupsIdBody getPermissions(List<String> setPermissions) {
    this.setPermissions = setPermissions;
    return this;
  }

  public GroupsIdBody addSetPermissionsItem(String setPermissionsItem) {
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

  public GroupsIdBody permissionsForm(ApigroupsidPermissionsForm permissionsForm) {
    this.permissionsForm = permissionsForm;
    return this;
  }

  /**
   * Get permissionsForm
   * @return permissionsForm
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ApigroupsidPermissionsForm getPermissionsForm() {
    return permissionsForm;
  }

  public void setPermissionsForm(ApigroupsidPermissionsForm permissionsForm) {
    this.permissionsForm = permissionsForm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupsIdBody groupsIdBody = (GroupsIdBody) o;
    return Objects.equals(this.id, groupsIdBody.id) &&
        Objects.equals(this.name, groupsIdBody.name) &&
        Objects.equals(this.permissions, groupsIdBody.permissions) &&
        Objects.equals(this.setPermissions, groupsIdBody.setPermissions) &&
        Objects.equals(this.permissionsForm, groupsIdBody.permissionsForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, permissions, setPermissions, permissionsForm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupsIdBody {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    setPermissions: ").append(toIndentedString(setPermissions)).append("\n");
    sb.append("    permissionsForm: ").append(toIndentedString(permissionsForm)).append("\n");
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
