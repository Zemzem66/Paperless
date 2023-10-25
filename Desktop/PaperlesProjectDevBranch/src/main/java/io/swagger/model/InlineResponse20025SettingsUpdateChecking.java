package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20025SettingsUpdateChecking
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")


public class InlineResponse20025SettingsUpdateChecking   {
  @JsonProperty("backend_setting")
  private String backendSetting = null;

  public InlineResponse20025SettingsUpdateChecking backendSetting(String backendSetting) {
    this.backendSetting = backendSetting;
    return this;
  }

  /**
   * Get backendSetting
   * @return backendSetting
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getBackendSetting() {
    return backendSetting;
  }

  public void setBackendSetting(String backendSetting) {
    this.backendSetting = backendSetting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20025SettingsUpdateChecking inlineResponse20025SettingsUpdateChecking = (InlineResponse20025SettingsUpdateChecking) o;
    return Objects.equals(this.backendSetting, inlineResponse20025SettingsUpdateChecking.backendSetting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backendSetting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20025SettingsUpdateChecking {\n");
    
    sb.append("    backendSetting: ").append(toIndentedString(backendSetting)).append("\n");
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
