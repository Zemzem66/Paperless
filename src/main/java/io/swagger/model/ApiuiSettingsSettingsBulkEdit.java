package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApiuiSettingsSettingsBulkEdit
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class ApiuiSettingsSettingsBulkEdit   {
  @JsonProperty("apply_on_close")
  private Boolean applyOnClose = null;

  @JsonProperty("confirmation_dialogs")
  private Boolean confirmationDialogs = null;

  public ApiuiSettingsSettingsBulkEdit applyOnClose(Boolean applyOnClose) {
    this.applyOnClose = applyOnClose;
    return this;
  }

  /**
   * Get applyOnClose
   * @return applyOnClose
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isApplyOnClose() {
    return applyOnClose;
  }

  public void setApplyOnClose(Boolean applyOnClose) {
    this.applyOnClose = applyOnClose;
  }

  public ApiuiSettingsSettingsBulkEdit confirmationDialogs(Boolean confirmationDialogs) {
    this.confirmationDialogs = confirmationDialogs;
    return this;
  }

  /**
   * Get confirmationDialogs
   * @return confirmationDialogs
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isConfirmationDialogs() {
    return confirmationDialogs;
  }

  public void setConfirmationDialogs(Boolean confirmationDialogs) {
    this.confirmationDialogs = confirmationDialogs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiuiSettingsSettingsBulkEdit apiuiSettingsSettingsBulkEdit = (ApiuiSettingsSettingsBulkEdit) o;
    return Objects.equals(this.applyOnClose, apiuiSettingsSettingsBulkEdit.applyOnClose) &&
        Objects.equals(this.confirmationDialogs, apiuiSettingsSettingsBulkEdit.confirmationDialogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyOnClose, confirmationDialogs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiuiSettingsSettingsBulkEdit {\n");
    
    sb.append("    applyOnClose: ").append(toIndentedString(applyOnClose)).append("\n");
    sb.append("    confirmationDialogs: ").append(toIndentedString(confirmationDialogs)).append("\n");
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
