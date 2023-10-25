package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.InlineResponse20011DocumentFileTypeCounts;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20011
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")


public class InlineResponse20011   {
  @JsonProperty("documents_total")
  private Integer documentsTotal = null;

  @JsonProperty("documents_inbox")
  private Integer documentsInbox = null;

  @JsonProperty("inbox_tag")
  private Integer inboxTag = null;

  @JsonProperty("document_file_type_counts")
  @Valid
  private List<InlineResponse20011DocumentFileTypeCounts> documentFileTypeCounts = new ArrayList<InlineResponse20011DocumentFileTypeCounts>();

  @JsonProperty("character_count")
  private Integer characterCount = null;

  public InlineResponse20011 documentsTotal(Integer documentsTotal) {
    this.documentsTotal = documentsTotal;
    return this;
  }

  /**
   * Get documentsTotal
   * @return documentsTotal
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getDocumentsTotal() {
    return documentsTotal;
  }

  public void setDocumentsTotal(Integer documentsTotal) {
    this.documentsTotal = documentsTotal;
  }

  public InlineResponse20011 documentsInbox(Integer documentsInbox) {
    this.documentsInbox = documentsInbox;
    return this;
  }

  /**
   * Get documentsInbox
   * @return documentsInbox
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getDocumentsInbox() {
    return documentsInbox;
  }

  public void setDocumentsInbox(Integer documentsInbox) {
    this.documentsInbox = documentsInbox;
  }

  public InlineResponse20011 inboxTag(Integer inboxTag) {
    this.inboxTag = inboxTag;
    return this;
  }

  /**
   * Get inboxTag
   * @return inboxTag
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getInboxTag() {
    return inboxTag;
  }

  public void setInboxTag(Integer inboxTag) {
    this.inboxTag = inboxTag;
  }

  public InlineResponse20011 documentFileTypeCounts(List<InlineResponse20011DocumentFileTypeCounts> documentFileTypeCounts) {
    this.documentFileTypeCounts = documentFileTypeCounts;
    return this;
  }

  public InlineResponse20011 addDocumentFileTypeCountsItem(InlineResponse20011DocumentFileTypeCounts documentFileTypeCountsItem) {
    this.documentFileTypeCounts.add(documentFileTypeCountsItem);
    return this;
  }

  /**
   * Get documentFileTypeCounts
   * @return documentFileTypeCounts
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<InlineResponse20011DocumentFileTypeCounts> getDocumentFileTypeCounts() {
    return documentFileTypeCounts;
  }

  public void setDocumentFileTypeCounts(List<InlineResponse20011DocumentFileTypeCounts> documentFileTypeCounts) {
    this.documentFileTypeCounts = documentFileTypeCounts;
  }

  public InlineResponse20011 characterCount(Integer characterCount) {
    this.characterCount = characterCount;
    return this;
  }

  /**
   * Get characterCount
   * @return characterCount
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getCharacterCount() {
    return characterCount;
  }

  public void setCharacterCount(Integer characterCount) {
    this.characterCount = characterCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20011 inlineResponse20011 = (InlineResponse20011) o;
    return Objects.equals(this.documentsTotal, inlineResponse20011.documentsTotal) &&
        Objects.equals(this.documentsInbox, inlineResponse20011.documentsInbox) &&
        Objects.equals(this.inboxTag, inlineResponse20011.inboxTag) &&
        Objects.equals(this.documentFileTypeCounts, inlineResponse20011.documentFileTypeCounts) &&
        Objects.equals(this.characterCount, inlineResponse20011.characterCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentsTotal, documentsInbox, inboxTag, documentFileTypeCounts, characterCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20011 {\n");
    
    sb.append("    documentsTotal: ").append(toIndentedString(documentsTotal)).append("\n");
    sb.append("    documentsInbox: ").append(toIndentedString(documentsInbox)).append("\n");
    sb.append("    inboxTag: ").append(toIndentedString(inboxTag)).append("\n");
    sb.append("    documentFileTypeCounts: ").append(toIndentedString(documentFileTypeCounts)).append("\n");
    sb.append("    characterCount: ").append(toIndentedString(characterCount)).append("\n");
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
