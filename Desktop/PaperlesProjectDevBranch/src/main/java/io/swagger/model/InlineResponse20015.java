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
 * InlineResponse20015
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")


public class InlineResponse20015   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("date_joined")
  private String dateJoined = null;

  @JsonProperty("is_staff")
  private Boolean isStaff = null;

  @JsonProperty("is_active")
  private Boolean isActive = null;

  @JsonProperty("is_superuser")
  private Boolean isSuperuser = null;

  @JsonProperty("groups")
  @Valid
  private List<Object> groups = new ArrayList<Object>();

  @JsonProperty("user_permissions")
  @Valid
  private List<Object> userPermissions = new ArrayList<Object>();

  @JsonProperty("inherited_permissions")
  @Valid
  private List<String> inheritedPermissions = new ArrayList<String>();

  public InlineResponse20015 id(Integer id) {
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

  public InlineResponse20015 username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public InlineResponse20015 email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public InlineResponse20015 password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public InlineResponse20015 firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public InlineResponse20015 lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public InlineResponse20015 dateJoined(String dateJoined) {
    this.dateJoined = dateJoined;
    return this;
  }

  /**
   * Get dateJoined
   * @return dateJoined
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getDateJoined() {
    return dateJoined;
  }

  public void setDateJoined(String dateJoined) {
    this.dateJoined = dateJoined;
  }

  public InlineResponse20015 isStaff(Boolean isStaff) {
    this.isStaff = isStaff;
    return this;
  }

  /**
   * Get isStaff
   * @return isStaff
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isIsStaff() {
    return isStaff;
  }

  public void setIsStaff(Boolean isStaff) {
    this.isStaff = isStaff;
  }

  public InlineResponse20015 isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public InlineResponse20015 isSuperuser(Boolean isSuperuser) {
    this.isSuperuser = isSuperuser;
    return this;
  }

  /**
   * Get isSuperuser
   * @return isSuperuser
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isIsSuperuser() {
    return isSuperuser;
  }

  public void setIsSuperuser(Boolean isSuperuser) {
    this.isSuperuser = isSuperuser;
  }

  public InlineResponse20015 groups(List<Object> groups) {
    this.groups = groups;
    return this;
  }

  public InlineResponse20015 addGroupsItem(Object groupsItem) {
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

  public InlineResponse20015 userPermissions(List<Object> userPermissions) {
    this.userPermissions = userPermissions;
    return this;
  }

  public InlineResponse20015 addUserPermissionsItem(Object userPermissionsItem) {
    this.userPermissions.add(userPermissionsItem);
    return this;
  }

  /**
   * Get userPermissions
   * @return userPermissions
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<Object> getUserPermissions() {
    return userPermissions;
  }

  public void setUserPermissions(List<Object> userPermissions) {
    this.userPermissions = userPermissions;
  }

  public InlineResponse20015 inheritedPermissions(List<String> inheritedPermissions) {
    this.inheritedPermissions = inheritedPermissions;
    return this;
  }

  public InlineResponse20015 addInheritedPermissionsItem(String inheritedPermissionsItem) {
    this.inheritedPermissions.add(inheritedPermissionsItem);
    return this;
  }

  /**
   * Get inheritedPermissions
   * @return inheritedPermissions
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<String> getInheritedPermissions() {
    return inheritedPermissions;
  }

  public void setInheritedPermissions(List<String> inheritedPermissions) {
    this.inheritedPermissions = inheritedPermissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20015 inlineResponse20015 = (InlineResponse20015) o;
    return Objects.equals(this.id, inlineResponse20015.id) &&
        Objects.equals(this.username, inlineResponse20015.username) &&
        Objects.equals(this.email, inlineResponse20015.email) &&
        Objects.equals(this.password, inlineResponse20015.password) &&
        Objects.equals(this.firstName, inlineResponse20015.firstName) &&
        Objects.equals(this.lastName, inlineResponse20015.lastName) &&
        Objects.equals(this.dateJoined, inlineResponse20015.dateJoined) &&
        Objects.equals(this.isStaff, inlineResponse20015.isStaff) &&
        Objects.equals(this.isActive, inlineResponse20015.isActive) &&
        Objects.equals(this.isSuperuser, inlineResponse20015.isSuperuser) &&
        Objects.equals(this.groups, inlineResponse20015.groups) &&
        Objects.equals(this.userPermissions, inlineResponse20015.userPermissions) &&
        Objects.equals(this.inheritedPermissions, inlineResponse20015.inheritedPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, email, password, firstName, lastName, dateJoined, isStaff, isActive, isSuperuser, groups, userPermissions, inheritedPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20015 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dateJoined: ").append(toIndentedString(dateJoined)).append("\n");
    sb.append("    isStaff: ").append(toIndentedString(isStaff)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isSuperuser: ").append(toIndentedString(isSuperuser)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    userPermissions: ").append(toIndentedString(userPermissions)).append("\n");
    sb.append("    inheritedPermissions: ").append(toIndentedString(inheritedPermissions)).append("\n");
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
