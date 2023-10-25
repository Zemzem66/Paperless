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
 * ApistoragePathsidSetPermissionsView
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class ApistoragePathsidSetPermissionsView   {
  @JsonProperty("users")
  @Valid
  private List<Integer> users = new ArrayList<Integer>();

  @JsonProperty("groups")
  @Valid
  private List<Integer> groups = new ArrayList<Integer>();

  public ApistoragePathsidSetPermissionsView users(List<Integer> users) {
    this.users = users;
    return this;
  }

  public ApistoragePathsidSetPermissionsView addUsersItem(Integer usersItem) {
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

  public ApistoragePathsidSetPermissionsView groups(List<Integer> groups) {
    this.groups = groups;
    return this;
  }

  public ApistoragePathsidSetPermissionsView addGroupsItem(Integer groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<Integer> getGroups() {
    return groups;
  }

  public void setGroups(List<Integer> groups) {
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
    ApistoragePathsidSetPermissionsView apistoragePathsidSetPermissionsView = (ApistoragePathsidSetPermissionsView) o;
    return Objects.equals(this.users, apistoragePathsidSetPermissionsView.users) &&
        Objects.equals(this.groups, apistoragePathsidSetPermissionsView.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApistoragePathsidSetPermissionsView {\n");
    
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
