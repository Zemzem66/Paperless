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
 * InlineResponse20021Owner
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")


public class InlineResponse20021Owner   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("last_login")
  private String lastLogin = null;

  @JsonProperty("is_superuser")
  private Boolean isSuperuser = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("is_staff")
  private Boolean isStaff = null;

  @JsonProperty("is_active")
  private Boolean isActive = null;

  @JsonProperty("date_joined")
  private String dateJoined = null;

  @JsonProperty("groups")
  @Valid
  private List<Object> groups = new ArrayList<Object>();

  @JsonProperty("user_permissions")
  @Valid
  private List<Integer> userPermissions = new ArrayList<Integer>();

  public InlineResponse20021Owner id(Integer id) {
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

  public InlineResponse20021Owner password(String password) {
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

  public InlineResponse20021Owner lastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

  /**
   * Get lastLogin
   * @return lastLogin
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
  }

  public InlineResponse20021Owner isSuperuser(Boolean isSuperuser) {
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

  public InlineResponse20021Owner username(String username) {
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

  public InlineResponse20021Owner firstName(String firstName) {
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

  public InlineResponse20021Owner lastName(String lastName) {
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

  public InlineResponse20021Owner email(String email) {
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

  public InlineResponse20021Owner isStaff(Boolean isStaff) {
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

  public InlineResponse20021Owner isActive(Boolean isActive) {
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

  public InlineResponse20021Owner dateJoined(String dateJoined) {
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

  public InlineResponse20021Owner groups(List<Object> groups) {
    this.groups = groups;
    return this;
  }

  public InlineResponse20021Owner addGroupsItem(Object groupsItem) {
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

  public InlineResponse20021Owner userPermissions(List<Integer> userPermissions) {
    this.userPermissions = userPermissions;
    return this;
  }

  public InlineResponse20021Owner addUserPermissionsItem(Integer userPermissionsItem) {
    this.userPermissions.add(userPermissionsItem);
    return this;
  }

  /**
   * Get userPermissions
   * @return userPermissions
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<Integer> getUserPermissions() {
    return userPermissions;
  }

  public void setUserPermissions(List<Integer> userPermissions) {
    this.userPermissions = userPermissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20021Owner inlineResponse20021Owner = (InlineResponse20021Owner) o;
    return Objects.equals(this.id, inlineResponse20021Owner.id) &&
        Objects.equals(this.password, inlineResponse20021Owner.password) &&
        Objects.equals(this.lastLogin, inlineResponse20021Owner.lastLogin) &&
        Objects.equals(this.isSuperuser, inlineResponse20021Owner.isSuperuser) &&
        Objects.equals(this.username, inlineResponse20021Owner.username) &&
        Objects.equals(this.firstName, inlineResponse20021Owner.firstName) &&
        Objects.equals(this.lastName, inlineResponse20021Owner.lastName) &&
        Objects.equals(this.email, inlineResponse20021Owner.email) &&
        Objects.equals(this.isStaff, inlineResponse20021Owner.isStaff) &&
        Objects.equals(this.isActive, inlineResponse20021Owner.isActive) &&
        Objects.equals(this.dateJoined, inlineResponse20021Owner.dateJoined) &&
        Objects.equals(this.groups, inlineResponse20021Owner.groups) &&
        Objects.equals(this.userPermissions, inlineResponse20021Owner.userPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, password, lastLogin, isSuperuser, username, firstName, lastName, email, isStaff, isActive, dateJoined, groups, userPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20021Owner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    isSuperuser: ").append(toIndentedString(isSuperuser)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    isStaff: ").append(toIndentedString(isStaff)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    dateJoined: ").append(toIndentedString(dateJoined)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    userPermissions: ").append(toIndentedString(userPermissions)).append("\n");
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
