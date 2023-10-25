package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2006
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class InlineResponse2006   {
  @JsonProperty("correspondents")
  @Valid
  private List<Object> correspondents = new ArrayList<Object>();

  @JsonProperty("tags")
  @Valid
  private List<Object> tags = new ArrayList<Object>();

  @JsonProperty("document_types")
  @Valid
  private List<Object> documentTypes = new ArrayList<Object>();

  @JsonProperty("storage_paths")
  @Valid
  private List<Object> storagePaths = new ArrayList<Object>();

  @JsonProperty("dates")
  @Valid
  private List<Object> dates = new ArrayList<Object>();

  public InlineResponse2006 correspondents(List<Object> correspondents) {
    this.correspondents = correspondents;
    return this;
  }

  public InlineResponse2006 addCorrespondentsItem(Object correspondentsItem) {
    this.correspondents.add(correspondentsItem);
    return this;
  }

  /**
   * Get correspondents
   * @return correspondents
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<Object> getCorrespondents() {
    return correspondents;
  }

  public void setCorrespondents(List<Object> correspondents) {
    this.correspondents = correspondents;
  }

  public InlineResponse2006 tags(List<Object> tags) {
    this.tags = tags;
    return this;
  }

  public InlineResponse2006 addTagsItem(Object tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<Object> getTags() {
    return tags;
  }

  public void setTags(List<Object> tags) {
    this.tags = tags;
  }

  public InlineResponse2006 documentTypes(List<Object> documentTypes) {
    this.documentTypes = documentTypes;
    return this;
  }

  public InlineResponse2006 addDocumentTypesItem(Object documentTypesItem) {
    this.documentTypes.add(documentTypesItem);
    return this;
  }

  /**
   * Get documentTypes
   * @return documentTypes
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<Object> getDocumentTypes() {
    return documentTypes;
  }

  public void setDocumentTypes(List<Object> documentTypes) {
    this.documentTypes = documentTypes;
  }

  public InlineResponse2006 storagePaths(List<Object> storagePaths) {
    this.storagePaths = storagePaths;
    return this;
  }

  public InlineResponse2006 addStoragePathsItem(Object storagePathsItem) {
    this.storagePaths.add(storagePathsItem);
    return this;
  }

  /**
   * Get storagePaths
   * @return storagePaths
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<Object> getStoragePaths() {
    return storagePaths;
  }

  public void setStoragePaths(List<Object> storagePaths) {
    this.storagePaths = storagePaths;
  }

  public InlineResponse2006 dates(List<Object> dates) {
    this.dates = dates;
    return this;
  }

  public InlineResponse2006 addDatesItem(Object datesItem) {
    this.dates.add(datesItem);
    return this;
  }

  /**
   * Get dates
   * @return dates
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<Object> getDates() {
    return dates;
  }

  public void setDates(List<Object> dates) {
    this.dates = dates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006 inlineResponse2006 = (InlineResponse2006) o;
    return Objects.equals(this.correspondents, inlineResponse2006.correspondents) &&
        Objects.equals(this.tags, inlineResponse2006.tags) &&
        Objects.equals(this.documentTypes, inlineResponse2006.documentTypes) &&
        Objects.equals(this.storagePaths, inlineResponse2006.storagePaths) &&
        Objects.equals(this.dates, inlineResponse2006.dates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondents, tags, documentTypes, storagePaths, dates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006 {\n");
    
    sb.append("    correspondents: ").append(toIndentedString(correspondents)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    documentTypes: ").append(toIndentedString(documentTypes)).append("\n");
    sb.append("    storagePaths: ").append(toIndentedString(storagePaths)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
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
