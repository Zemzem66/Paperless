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
 * ApistoragePathsidPermissionsView
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")


public class ApistoragePathsidPermissionsView   {
  @JsonProperty("users")
  @Valid
  private List<Integer> users = new ArrayList<Integer>();

  @JsonProperty("groups")
  @Valid
  private List<Object> groups = new ArrayList<Object>();

  public ApistoragePathsidPermissionsView users(List<Integer> users) {
    this.users = users;
    return this;
  }

  public ApistoragePathsidPermissionsView addUsersItem(Integer usersItem) {
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<Integer> getUsers() {
    return users;
  }

  public void setUsers(List<Integer> users) {
    this.users = users;
  }

  public ApistoragePathsidPermissionsView groups(List<Object> groups) {
    this.groups = groups;
    return this;
  }

  public ApistoragePathsidPermissionsView addGroupsItem(Object groupsItem) {
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
    ApistoragePathsidPermissionsView apistoragePathsidPermissionsView = (ApistoragePathsidPermissionsView) o;
    return Objects.equals(this.users, apistoragePathsidPermissionsView.users) &&
        Objects.equals(this.groups, apistoragePathsidPermissionsView.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApistoragePathsidPermissionsView {\n");
    
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
