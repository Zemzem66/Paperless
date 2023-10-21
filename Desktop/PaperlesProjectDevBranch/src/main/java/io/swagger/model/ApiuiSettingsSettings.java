package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ApiuiSettingsSettingsBulkEdit;
import io.swagger.model.ApiuiSettingsSettingsDarkMode;
import io.swagger.model.ApiuiSettingsSettingsDateDisplay;
import io.swagger.model.ApiuiSettingsSettingsDocumentDetails;
import io.swagger.model.ApiuiSettingsSettingsNotifications;
import io.swagger.model.ApiuiSettingsSettingsSavedViews;
import io.swagger.model.ApiuiSettingsSettingsTheme;
import io.swagger.model.ApiuiSettingsSettingsUpdateChecking;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApiuiSettingsSettings
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")


public class ApiuiSettingsSettings   {
  @JsonProperty("update_checking")
  private ApiuiSettingsSettingsUpdateChecking updateChecking = null;

  @JsonProperty("tour_complete")
  private Boolean tourComplete = null;

  @JsonProperty("bulk_edit")
  private ApiuiSettingsSettingsBulkEdit bulkEdit = null;

  @JsonProperty("documentListSize")
  private Integer documentListSize = null;

  @JsonProperty("slim_sidebar")
  private Boolean slimSidebar = null;

  @JsonProperty("dark_mode")
  private ApiuiSettingsSettingsDarkMode darkMode = null;

  @JsonProperty("theme")
  private ApiuiSettingsSettingsTheme theme = null;

  @JsonProperty("document_details")
  private ApiuiSettingsSettingsDocumentDetails documentDetails = null;

  @JsonProperty("date_display")
  private ApiuiSettingsSettingsDateDisplay dateDisplay = null;

  @JsonProperty("notifications")
  private ApiuiSettingsSettingsNotifications notifications = null;

  @JsonProperty("notes_enabled")
  private Boolean notesEnabled = null;

  @JsonProperty("saved_views")
  private ApiuiSettingsSettingsSavedViews savedViews = null;

  @JsonProperty("language")
  private String language = null;

  public ApiuiSettingsSettings updateChecking(ApiuiSettingsSettingsUpdateChecking updateChecking) {
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
    public ApiuiSettingsSettingsUpdateChecking getUpdateChecking() {
    return updateChecking;
  }

  public void setUpdateChecking(ApiuiSettingsSettingsUpdateChecking updateChecking) {
    this.updateChecking = updateChecking;
  }

  public ApiuiSettingsSettings tourComplete(Boolean tourComplete) {
    this.tourComplete = tourComplete;
    return this;
  }

  /**
   * Get tourComplete
   * @return tourComplete
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isTourComplete() {
    return tourComplete;
  }

  public void setTourComplete(Boolean tourComplete) {
    this.tourComplete = tourComplete;
  }

  public ApiuiSettingsSettings bulkEdit(ApiuiSettingsSettingsBulkEdit bulkEdit) {
    this.bulkEdit = bulkEdit;
    return this;
  }

  /**
   * Get bulkEdit
   * @return bulkEdit
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ApiuiSettingsSettingsBulkEdit getBulkEdit() {
    return bulkEdit;
  }

  public void setBulkEdit(ApiuiSettingsSettingsBulkEdit bulkEdit) {
    this.bulkEdit = bulkEdit;
  }

  public ApiuiSettingsSettings documentListSize(Integer documentListSize) {
    this.documentListSize = documentListSize;
    return this;
  }

  /**
   * Get documentListSize
   * @return documentListSize
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getDocumentListSize() {
    return documentListSize;
  }

  public void setDocumentListSize(Integer documentListSize) {
    this.documentListSize = documentListSize;
  }

  public ApiuiSettingsSettings slimSidebar(Boolean slimSidebar) {
    this.slimSidebar = slimSidebar;
    return this;
  }

  /**
   * Get slimSidebar
   * @return slimSidebar
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isSlimSidebar() {
    return slimSidebar;
  }

  public void setSlimSidebar(Boolean slimSidebar) {
    this.slimSidebar = slimSidebar;
  }

  public ApiuiSettingsSettings darkMode(ApiuiSettingsSettingsDarkMode darkMode) {
    this.darkMode = darkMode;
    return this;
  }

  /**
   * Get darkMode
   * @return darkMode
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ApiuiSettingsSettingsDarkMode getDarkMode() {
    return darkMode;
  }

  public void setDarkMode(ApiuiSettingsSettingsDarkMode darkMode) {
    this.darkMode = darkMode;
  }

  public ApiuiSettingsSettings theme(ApiuiSettingsSettingsTheme theme) {
    this.theme = theme;
    return this;
  }

  /**
   * Get theme
   * @return theme
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ApiuiSettingsSettingsTheme getTheme() {
    return theme;
  }

  public void setTheme(ApiuiSettingsSettingsTheme theme) {
    this.theme = theme;
  }

  public ApiuiSettingsSettings documentDetails(ApiuiSettingsSettingsDocumentDetails documentDetails) {
    this.documentDetails = documentDetails;
    return this;
  }

  /**
   * Get documentDetails
   * @return documentDetails
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ApiuiSettingsSettingsDocumentDetails getDocumentDetails() {
    return documentDetails;
  }

  public void setDocumentDetails(ApiuiSettingsSettingsDocumentDetails documentDetails) {
    this.documentDetails = documentDetails;
  }

  public ApiuiSettingsSettings dateDisplay(ApiuiSettingsSettingsDateDisplay dateDisplay) {
    this.dateDisplay = dateDisplay;
    return this;
  }

  /**
   * Get dateDisplay
   * @return dateDisplay
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ApiuiSettingsSettingsDateDisplay getDateDisplay() {
    return dateDisplay;
  }

  public void setDateDisplay(ApiuiSettingsSettingsDateDisplay dateDisplay) {
    this.dateDisplay = dateDisplay;
  }

  public ApiuiSettingsSettings notifications(ApiuiSettingsSettingsNotifications notifications) {
    this.notifications = notifications;
    return this;
  }

  /**
   * Get notifications
   * @return notifications
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ApiuiSettingsSettingsNotifications getNotifications() {
    return notifications;
  }

  public void setNotifications(ApiuiSettingsSettingsNotifications notifications) {
    this.notifications = notifications;
  }

  public ApiuiSettingsSettings notesEnabled(Boolean notesEnabled) {
    this.notesEnabled = notesEnabled;
    return this;
  }

  /**
   * Get notesEnabled
   * @return notesEnabled
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isNotesEnabled() {
    return notesEnabled;
  }

  public void setNotesEnabled(Boolean notesEnabled) {
    this.notesEnabled = notesEnabled;
  }

  public ApiuiSettingsSettings savedViews(ApiuiSettingsSettingsSavedViews savedViews) {
    this.savedViews = savedViews;
    return this;
  }

  /**
   * Get savedViews
   * @return savedViews
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ApiuiSettingsSettingsSavedViews getSavedViews() {
    return savedViews;
  }

  public void setSavedViews(ApiuiSettingsSettingsSavedViews savedViews) {
    this.savedViews = savedViews;
  }

  public ApiuiSettingsSettings language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiuiSettingsSettings apiuiSettingsSettings = (ApiuiSettingsSettings) o;
    return Objects.equals(this.updateChecking, apiuiSettingsSettings.updateChecking) &&
        Objects.equals(this.tourComplete, apiuiSettingsSettings.tourComplete) &&
        Objects.equals(this.bulkEdit, apiuiSettingsSettings.bulkEdit) &&
        Objects.equals(this.documentListSize, apiuiSettingsSettings.documentListSize) &&
        Objects.equals(this.slimSidebar, apiuiSettingsSettings.slimSidebar) &&
        Objects.equals(this.darkMode, apiuiSettingsSettings.darkMode) &&
        Objects.equals(this.theme, apiuiSettingsSettings.theme) &&
        Objects.equals(this.documentDetails, apiuiSettingsSettings.documentDetails) &&
        Objects.equals(this.dateDisplay, apiuiSettingsSettings.dateDisplay) &&
        Objects.equals(this.notifications, apiuiSettingsSettings.notifications) &&
        Objects.equals(this.notesEnabled, apiuiSettingsSettings.notesEnabled) &&
        Objects.equals(this.savedViews, apiuiSettingsSettings.savedViews) &&
        Objects.equals(this.language, apiuiSettingsSettings.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateChecking, tourComplete, bulkEdit, documentListSize, slimSidebar, darkMode, theme, documentDetails, dateDisplay, notifications, notesEnabled, savedViews, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiuiSettingsSettings {\n");
    
    sb.append("    updateChecking: ").append(toIndentedString(updateChecking)).append("\n");
    sb.append("    tourComplete: ").append(toIndentedString(tourComplete)).append("\n");
    sb.append("    bulkEdit: ").append(toIndentedString(bulkEdit)).append("\n");
    sb.append("    documentListSize: ").append(toIndentedString(documentListSize)).append("\n");
    sb.append("    slimSidebar: ").append(toIndentedString(slimSidebar)).append("\n");
    sb.append("    darkMode: ").append(toIndentedString(darkMode)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    documentDetails: ").append(toIndentedString(documentDetails)).append("\n");
    sb.append("    dateDisplay: ").append(toIndentedString(dateDisplay)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    notesEnabled: ").append(toIndentedString(notesEnabled)).append("\n");
    sb.append("    savedViews: ").append(toIndentedString(savedViews)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
