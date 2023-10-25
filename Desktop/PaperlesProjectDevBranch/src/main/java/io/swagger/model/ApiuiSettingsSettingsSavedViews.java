package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApiuiSettingsSettingsSavedViews
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")


public class ApiuiSettingsSettingsSavedViews   {
  @JsonProperty("warn_on_unsaved_change")
  private Boolean warnOnUnsavedChange = null;

  public ApiuiSettingsSettingsSavedViews warnOnUnsavedChange(Boolean warnOnUnsavedChange) {
    this.warnOnUnsavedChange = warnOnUnsavedChange;
    return this;
  }

  /**
   * Get warnOnUnsavedChange
   * @return warnOnUnsavedChange
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isWarnOnUnsavedChange() {
    return warnOnUnsavedChange;
  }

  public void setWarnOnUnsavedChange(Boolean warnOnUnsavedChange) {
    this.warnOnUnsavedChange = warnOnUnsavedChange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiuiSettingsSettingsSavedViews apiuiSettingsSettingsSavedViews = (ApiuiSettingsSettingsSavedViews) o;
    return Objects.equals(this.warnOnUnsavedChange, apiuiSettingsSettingsSavedViews.warnOnUnsavedChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warnOnUnsavedChange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiuiSettingsSettingsSavedViews {\n");
    
    sb.append("    warnOnUnsavedChange: ").append(toIndentedString(warnOnUnsavedChange)).append("\n");
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
