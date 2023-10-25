package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.InlineResponse2005SelectedCorrespondents;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2005
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")


public class InlineResponse2005   {
  @JsonProperty("selected_correspondents")
  @Valid
  private List<InlineResponse2005SelectedCorrespondents> selectedCorrespondents = new ArrayList<InlineResponse2005SelectedCorrespondents>();

  @JsonProperty("selected_tags")
  @Valid
  private List<InlineResponse2005SelectedCorrespondents> selectedTags = new ArrayList<InlineResponse2005SelectedCorrespondents>();

  @JsonProperty("selected_document_types")
  @Valid
  private List<InlineResponse2005SelectedCorrespondents> selectedDocumentTypes = new ArrayList<InlineResponse2005SelectedCorrespondents>();

  @JsonProperty("selected_storage_paths")
  @Valid
  private List<InlineResponse2005SelectedCorrespondents> selectedStoragePaths = new ArrayList<InlineResponse2005SelectedCorrespondents>();

  public InlineResponse2005 selectedCorrespondents(List<InlineResponse2005SelectedCorrespondents> selectedCorrespondents) {
    this.selectedCorrespondents = selectedCorrespondents;
    return this;
  }

  public InlineResponse2005 addSelectedCorrespondentsItem(InlineResponse2005SelectedCorrespondents selectedCorrespondentsItem) {
    this.selectedCorrespondents.add(selectedCorrespondentsItem);
    return this;
  }

  /**
   * Get selectedCorrespondents
   * @return selectedCorrespondents
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<InlineResponse2005SelectedCorrespondents> getSelectedCorrespondents() {
    return selectedCorrespondents;
  }

  public void setSelectedCorrespondents(List<InlineResponse2005SelectedCorrespondents> selectedCorrespondents) {
    this.selectedCorrespondents = selectedCorrespondents;
  }

  public InlineResponse2005 selectedTags(List<InlineResponse2005SelectedCorrespondents> selectedTags) {
    this.selectedTags = selectedTags;
    return this;
  }

  public InlineResponse2005 addSelectedTagsItem(InlineResponse2005SelectedCorrespondents selectedTagsItem) {
    this.selectedTags.add(selectedTagsItem);
    return this;
  }

  /**
   * Get selectedTags
   * @return selectedTags
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<InlineResponse2005SelectedCorrespondents> getSelectedTags() {
    return selectedTags;
  }

  public void setSelectedTags(List<InlineResponse2005SelectedCorrespondents> selectedTags) {
    this.selectedTags = selectedTags;
  }

  public InlineResponse2005 selectedDocumentTypes(List<InlineResponse2005SelectedCorrespondents> selectedDocumentTypes) {
    this.selectedDocumentTypes = selectedDocumentTypes;
    return this;
  }

  public InlineResponse2005 addSelectedDocumentTypesItem(InlineResponse2005SelectedCorrespondents selectedDocumentTypesItem) {
    this.selectedDocumentTypes.add(selectedDocumentTypesItem);
    return this;
  }

  /**
   * Get selectedDocumentTypes
   * @return selectedDocumentTypes
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<InlineResponse2005SelectedCorrespondents> getSelectedDocumentTypes() {
    return selectedDocumentTypes;
  }

  public void setSelectedDocumentTypes(List<InlineResponse2005SelectedCorrespondents> selectedDocumentTypes) {
    this.selectedDocumentTypes = selectedDocumentTypes;
  }

  public InlineResponse2005 selectedStoragePaths(List<InlineResponse2005SelectedCorrespondents> selectedStoragePaths) {
    this.selectedStoragePaths = selectedStoragePaths;
    return this;
  }

  public InlineResponse2005 addSelectedStoragePathsItem(InlineResponse2005SelectedCorrespondents selectedStoragePathsItem) {
    this.selectedStoragePaths.add(selectedStoragePathsItem);
    return this;
  }

  /**
   * Get selectedStoragePaths
   * @return selectedStoragePaths
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<InlineResponse2005SelectedCorrespondents> getSelectedStoragePaths() {
    return selectedStoragePaths;
  }

  public void setSelectedStoragePaths(List<InlineResponse2005SelectedCorrespondents> selectedStoragePaths) {
    this.selectedStoragePaths = selectedStoragePaths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005 inlineResponse2005 = (InlineResponse2005) o;
    return Objects.equals(this.selectedCorrespondents, inlineResponse2005.selectedCorrespondents) &&
        Objects.equals(this.selectedTags, inlineResponse2005.selectedTags) &&
        Objects.equals(this.selectedDocumentTypes, inlineResponse2005.selectedDocumentTypes) &&
        Objects.equals(this.selectedStoragePaths, inlineResponse2005.selectedStoragePaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectedCorrespondents, selectedTags, selectedDocumentTypes, selectedStoragePaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005 {\n");
    
    sb.append("    selectedCorrespondents: ").append(toIndentedString(selectedCorrespondents)).append("\n");
    sb.append("    selectedTags: ").append(toIndentedString(selectedTags)).append("\n");
    sb.append("    selectedDocumentTypes: ").append(toIndentedString(selectedDocumentTypes)).append("\n");
    sb.append("    selectedStoragePaths: ").append(toIndentedString(selectedStoragePaths)).append("\n");
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
