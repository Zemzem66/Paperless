package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApiuiSettingsSettingsNotifications
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class ApiuiSettingsSettingsNotifications   {
  @JsonProperty("consumer_new_documents")
  private Boolean consumerNewDocuments = null;

  @JsonProperty("consumer_success")
  private Boolean consumerSuccess = null;

  @JsonProperty("consumer_failed")
  private Boolean consumerFailed = null;

  @JsonProperty("consumer_suppress_on_dashboard")
  private Boolean consumerSuppressOnDashboard = null;

  public ApiuiSettingsSettingsNotifications consumerNewDocuments(Boolean consumerNewDocuments) {
    this.consumerNewDocuments = consumerNewDocuments;
    return this;
  }

  /**
   * Get consumerNewDocuments
   * @return consumerNewDocuments
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isConsumerNewDocuments() {
    return consumerNewDocuments;
  }

  public void setConsumerNewDocuments(Boolean consumerNewDocuments) {
    this.consumerNewDocuments = consumerNewDocuments;
  }

  public ApiuiSettingsSettingsNotifications consumerSuccess(Boolean consumerSuccess) {
    this.consumerSuccess = consumerSuccess;
    return this;
  }

  /**
   * Get consumerSuccess
   * @return consumerSuccess
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isConsumerSuccess() {
    return consumerSuccess;
  }

  public void setConsumerSuccess(Boolean consumerSuccess) {
    this.consumerSuccess = consumerSuccess;
  }

  public ApiuiSettingsSettingsNotifications consumerFailed(Boolean consumerFailed) {
    this.consumerFailed = consumerFailed;
    return this;
  }

  /**
   * Get consumerFailed
   * @return consumerFailed
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isConsumerFailed() {
    return consumerFailed;
  }

  public void setConsumerFailed(Boolean consumerFailed) {
    this.consumerFailed = consumerFailed;
  }

  public ApiuiSettingsSettingsNotifications consumerSuppressOnDashboard(Boolean consumerSuppressOnDashboard) {
    this.consumerSuppressOnDashboard = consumerSuppressOnDashboard;
    return this;
  }

  /**
   * Get consumerSuppressOnDashboard
   * @return consumerSuppressOnDashboard
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isConsumerSuppressOnDashboard() {
    return consumerSuppressOnDashboard;
  }

  public void setConsumerSuppressOnDashboard(Boolean consumerSuppressOnDashboard) {
    this.consumerSuppressOnDashboard = consumerSuppressOnDashboard;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiuiSettingsSettingsNotifications apiuiSettingsSettingsNotifications = (ApiuiSettingsSettingsNotifications) o;
    return Objects.equals(this.consumerNewDocuments, apiuiSettingsSettingsNotifications.consumerNewDocuments) &&
        Objects.equals(this.consumerSuccess, apiuiSettingsSettingsNotifications.consumerSuccess) &&
        Objects.equals(this.consumerFailed, apiuiSettingsSettingsNotifications.consumerFailed) &&
        Objects.equals(this.consumerSuppressOnDashboard, apiuiSettingsSettingsNotifications.consumerSuppressOnDashboard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerNewDocuments, consumerSuccess, consumerFailed, consumerSuppressOnDashboard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiuiSettingsSettingsNotifications {\n");
    
    sb.append("    consumerNewDocuments: ").append(toIndentedString(consumerNewDocuments)).append("\n");
    sb.append("    consumerSuccess: ").append(toIndentedString(consumerSuccess)).append("\n");
    sb.append("    consumerFailed: ").append(toIndentedString(consumerFailed)).append("\n");
    sb.append("    consumerSuppressOnDashboard: ").append(toIndentedString(consumerSuppressOnDashboard)).append("\n");
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
