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
 * ApicorrespondentsidPermissionsView
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class ApicorrespondentsidPermissionsView   {
  @JsonProperty("users")
  @Valid
  private List<Object> users = new ArrayList<Object>();

  @JsonProperty("groups")
  @Valid
  private List<Object> groups = new ArrayList<Object>();

  public ApicorrespondentsidPermissionsView users(List<Object> users) {
    this.users = users;
    return this;
  }

  public ApicorrespondentsidPermissionsView addUsersItem(Object usersItem) {
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<Object> getUsers() {
    return users;
  }

  public void setUsers(List<Object> users) {
    this.users = users;
  }

  public ApicorrespondentsidPermissionsView groups(List<Object> groups) {
    this.groups = groups;
    return this;
  }

  public ApicorrespondentsidPermissionsView addGroupsItem(Object groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<Object> getGroups() {
    return groups;
  }

  public void setGroups(List<Object> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApicorrespondentsidPermissionsView apicorrespondentsidPermissionsView = (ApicorrespondentsidPermissionsView) o;
    return Objects.equals(this.users, apicorrespondentsidPermissionsView.users) &&
        Objects.equals(this.groups, apicorrespondentsidPermissionsView.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApicorrespondentsidPermissionsView {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
