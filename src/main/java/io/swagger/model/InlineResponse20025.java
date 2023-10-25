package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.InlineResponse20025Settings;
import io.swagger.model.InlineResponse20025User;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20025
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class InlineResponse20025   {
  @JsonProperty("display_name")
  private String displayName = null;

  @JsonProperty("user")
  private InlineResponse20025User user = null;

  @JsonProperty("settings")
  private InlineResponse20025Settings settings = null;

  @JsonProperty("permissions")
  @Valid
  private List<String> permissions = new ArrayList<String>();

  public InlineResponse20025 displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public InlineResponse20025 user(InlineResponse20025User user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public InlineResponse20025User getUser() {
    return user;
  }

  public void setUser(InlineResponse20025User user) {
    this.user = user;
  }

  public InlineResponse20025 settings(InlineResponse20025Settings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * Get settings
   * @return settings
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public InlineResponse20025Settings getSettings() {
    return settings;
  }

  public void setSettings(InlineResponse20025Settings settings) {
    this.settings = settings;
  }

  public InlineResponse20025 permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public InlineResponse20025 addPermissionsItem(String permissionsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20025 inlineResponse20025 = (InlineResponse20025) o;
    return Objects.equals(this.displayName, inlineResponse20025.displayName) &&
        Objects.equals(this.user, inlineResponse20025.user) &&
        Objects.equals(this.settings, inlineResponse20025.settings) &&
        Objects.equals(this.permissions, inlineResponse20025.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, user, settings, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20025 {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
