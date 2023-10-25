package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApiuiSettingsSettingsDocumentDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class ApiuiSettingsSettingsDocumentDetails   {
  @JsonProperty("native_pdf_viewer")
  private Boolean nativePdfViewer = null;

  public ApiuiSettingsSettingsDocumentDetails nativePdfViewer(Boolean nativePdfViewer) {
    this.nativePdfViewer = nativePdfViewer;
    return this;
  }

  /**
   * Get nativePdfViewer
   * @return nativePdfViewer
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isNativePdfViewer() {
    return nativePdfViewer;
  }

  public void setNativePdfViewer(Boolean nativePdfViewer) {
    this.nativePdfViewer = nativePdfViewer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiuiSettingsSettingsDocumentDetails apiuiSettingsSettingsDocumentDetails = (ApiuiSettingsSettingsDocumentDetails) o;
    return Objects.equals(this.nativePdfViewer, apiuiSettingsSettingsDocumentDetails.nativePdfViewer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nativePdfViewer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiuiSettingsSettingsDocumentDetails {\n");
    
    sb.append("    nativePdfViewer: ").append(toIndentedString(nativePdfViewer)).append("\n");
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
