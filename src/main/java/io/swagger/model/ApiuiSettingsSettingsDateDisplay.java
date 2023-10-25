package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApiuiSettingsSettingsDateDisplay
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class ApiuiSettingsSettingsDateDisplay   {
  @JsonProperty("date_locale")
  private String dateLocale = null;

  @JsonProperty("date_format")
  private String dateFormat = null;

  public ApiuiSettingsSettingsDateDisplay dateLocale(String dateLocale) {
    this.dateLocale = dateLocale;
    return this;
  }

  /**
   * Get dateLocale
   * @return dateLocale
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getDateLocale() {
    return dateLocale;
  }

  public void setDateLocale(String dateLocale) {
    this.dateLocale = dateLocale;
  }

  public ApiuiSettingsSettingsDateDisplay dateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

  /**
   * Get dateFormat
   * @return dateFormat
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiuiSettingsSettingsDateDisplay apiuiSettingsSettingsDateDisplay = (ApiuiSettingsSettingsDateDisplay) o;
    return Objects.equals(this.dateLocale, apiuiSettingsSettingsDateDisplay.dateLocale) &&
        Objects.equals(this.dateFormat, apiuiSettingsSettingsDateDisplay.dateFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateLocale, dateFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiuiSettingsSettingsDateDisplay {\n");
    
    sb.append("    dateLocale: ").append(toIndentedString(dateLocale)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
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
