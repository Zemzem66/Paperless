package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.InlineResponse20025SettingsUpdateChecking;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20025Settings
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class InlineResponse20025Settings   {
  @JsonProperty("update_checking")
  private InlineResponse20025SettingsUpdateChecking updateChecking = null;

  public InlineResponse20025Settings updateChecking(InlineResponse20025SettingsUpdateChecking updateChecking) {
    this.updateChecking = updateChecking;
    return this;
  }

  /**
   * Get updateChecking
   * @return updateChecking
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public InlineResponse20025SettingsUpdateChecking getUpdateChecking() {
    return updateChecking;
  }

  public void setUpdateChecking(InlineResponse20025SettingsUpdateChecking updateChecking) {
    this.updateChecking = updateChecking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20025Settings inlineResponse20025Settings = (InlineResponse20025Settings) o;
    return Objects.equals(this.updateChecking, inlineResponse20025Settings.updateChecking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateChecking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20025Settings {\n");
    
    sb.append("    updateChecking: ").append(toIndentedString(updateChecking)).append("\n");
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
