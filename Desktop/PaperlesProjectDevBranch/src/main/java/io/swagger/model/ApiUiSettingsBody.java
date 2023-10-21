package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ApiuiSettingsSettings;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApiUiSettingsBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")


public class ApiUiSettingsBody   {
  @JsonProperty("settings")
  private ApiuiSettingsSettings settings = null;

  public ApiUiSettingsBody settings(ApiuiSettingsSettings settings) {
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
    public ApiuiSettingsSettings getSettings() {
    return settings;
  }

  public void setSettings(ApiuiSettingsSettings settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiUiSettingsBody apiUiSettingsBody = (ApiUiSettingsBody) o;
    return Objects.equals(this.settings, apiUiSettingsBody.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiUiSettingsBody {\n");
    
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
