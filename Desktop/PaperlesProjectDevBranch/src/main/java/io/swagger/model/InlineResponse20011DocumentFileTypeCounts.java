package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20011DocumentFileTypeCounts
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")


public class InlineResponse20011DocumentFileTypeCounts   {
  @JsonProperty("mime_type")
  private String mimeType = null;

  @JsonProperty("mime_type_count")
  private Integer mimeTypeCount = null;

  public InlineResponse20011DocumentFileTypeCounts mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * Get mimeType
   * @return mimeType
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public InlineResponse20011DocumentFileTypeCounts mimeTypeCount(Integer mimeTypeCount) {
    this.mimeTypeCount = mimeTypeCount;
    return this;
  }

  /**
   * Get mimeTypeCount
   * @return mimeTypeCount
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getMimeTypeCount() {
    return mimeTypeCount;
  }

  public void setMimeTypeCount(Integer mimeTypeCount) {
    this.mimeTypeCount = mimeTypeCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20011DocumentFileTypeCounts inlineResponse20011DocumentFileTypeCounts = (InlineResponse20011DocumentFileTypeCounts) o;
    return Objects.equals(this.mimeType, inlineResponse20011DocumentFileTypeCounts.mimeType) &&
        Objects.equals(this.mimeTypeCount, inlineResponse20011DocumentFileTypeCounts.mimeTypeCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mimeType, mimeTypeCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20011DocumentFileTypeCounts {\n");
    
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    mimeTypeCount: ").append(toIndentedString(mimeTypeCount)).append("\n");
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
