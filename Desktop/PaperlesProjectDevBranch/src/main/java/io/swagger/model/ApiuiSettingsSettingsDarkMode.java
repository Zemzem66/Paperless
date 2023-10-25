package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApiuiSettingsSettingsDarkMode
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")


public class ApiuiSettingsSettingsDarkMode   {
  @JsonProperty("use_system")
  private Boolean useSystem = null;

  @JsonProperty("enabled")
  private String enabled = null;

  @JsonProperty("thumb_inverted")
  private String thumbInverted = null;

  public ApiuiSettingsSettingsDarkMode useSystem(Boolean useSystem) {
    this.useSystem = useSystem;
    return this;
  }

  /**
   * Get useSystem
   * @return useSystem
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isUseSystem() {
    return useSystem;
  }

  public void setUseSystem(Boolean useSystem) {
    this.useSystem = useSystem;
  }

  public ApiuiSettingsSettingsDarkMode enabled(String enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getEnabled() {
    return enabled;
  }

  public void setEnabled(String enabled) {
    this.enabled = enabled;
  }

  public ApiuiSettingsSettingsDarkMode thumbInverted(String thumbInverted) {
    this.thumbInverted = thumbInverted;
    return this;
  }

  /**
   * Get thumbInverted
   * @return thumbInverted
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getThumbInverted() {
    return thumbInverted;
  }

  public void setThumbInverted(String thumbInverted) {
    this.thumbInverted = thumbInverted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiuiSettingsSettingsDarkMode apiuiSettingsSettingsDarkMode = (ApiuiSettingsSettingsDarkMode) o;
    return Objects.equals(this.useSystem, apiuiSettingsSettingsDarkMode.useSystem) &&
        Objects.equals(this.enabled, apiuiSettingsSettingsDarkMode.enabled) &&
        Objects.equals(this.thumbInverted, apiuiSettingsSettingsDarkMode.thumbInverted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useSystem, enabled, thumbInverted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiuiSettingsSettingsDarkMode {\n");
    
    sb.append("    useSystem: ").append(toIndentedString(useSystem)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    thumbInverted: ").append(toIndentedString(thumbInverted)).append("\n");
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
