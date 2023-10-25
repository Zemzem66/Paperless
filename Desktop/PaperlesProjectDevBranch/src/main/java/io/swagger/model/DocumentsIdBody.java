package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ApicorrespondentsidPermissions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DocumentsIdBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")


public class DocumentsIdBody   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("correspondent")
  private Integer correspondent = null;

  @JsonProperty("document_type")
  private Integer documentType = null;

  @JsonProperty("storage_path")
  private Integer storagePath = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("tags")
  @Valid
  private List<Integer> tags = new ArrayList<Integer>();

  @JsonProperty("created_date")
  private String createdDate = null;

  @JsonProperty("modified")
  private String modified = null;

  @JsonProperty("added")
  private String added = null;

  @JsonProperty("archive_serial_number")
  private Integer archiveSerialNumber = null;

  @JsonProperty("original_file_name")
  private String originalFileName = null;

  @JsonProperty("archived_file_name")
  private String archivedFileName = null;

  @JsonProperty("owner")
  private Integer owner = null;

  @JsonProperty("permissions")
  private ApicorrespondentsidPermissions permissions = null;

  @JsonProperty("notes")
  @Valid
  private List<Object> notes = new ArrayList<Object>();

  @JsonProperty("set_permissions")
  private ApicorrespondentsidPermissions setPermissions = null;

  public DocumentsIdBody id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public DocumentsIdBody correspondent(Integer correspondent) {
    this.correspondent = correspondent;
    return this;
  }

  /**
   * Get correspondent
   * @return correspondent
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getCorrespondent() {
    return correspondent;
  }

  public void setCorrespondent(Integer correspondent) {
    this.correspondent = correspondent;
  }

  public DocumentsIdBody documentType(Integer documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * Get documentType
   * @return documentType
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getDocumentType() {
    return documentType;
  }

  public void setDocumentType(Integer documentType) {
    this.documentType = documentType;
  }

  public DocumentsIdBody storagePath(Integer storagePath) {
    this.storagePath = storagePath;
    return this;
  }

  /**
   * Get storagePath
   * @return storagePath
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getStoragePath() {
    return storagePath;
  }

  public void setStoragePath(Integer storagePath) {
    this.storagePath = storagePath;
  }

  public DocumentsIdBody title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public DocumentsIdBody content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public DocumentsIdBody tags(List<Integer> tags) {
    this.tags = tags;
    return this;
  }

  public DocumentsIdBody addTagsItem(Integer tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<Integer> getTags() {
    return tags;
  }

  public void setTags(List<Integer> tags) {
    this.tags = tags;
  }

  public DocumentsIdBody createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public DocumentsIdBody modified(String modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Get modified
   * @return modified
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getModified() {
    return modified;
  }

  public void setModified(String modified) {
    this.modified = modified;
  }

  public DocumentsIdBody added(String added) {
    this.added = added;
    return this;
  }

  /**
   * Get added
   * @return added
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getAdded() {
    return added;
  }

  public void setAdded(String added) {
    this.added = added;
  }

  public DocumentsIdBody archiveSerialNumber(Integer archiveSerialNumber) {
    this.archiveSerialNumber = archiveSerialNumber;
    return this;
  }

  /**
   * Get archiveSerialNumber
   * @return archiveSerialNumber
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getArchiveSerialNumber() {
    return archiveSerialNumber;
  }

  public void setArchiveSerialNumber(Integer archiveSerialNumber) {
    this.archiveSerialNumber = archiveSerialNumber;
  }

  public DocumentsIdBody originalFileName(String originalFileName) {
    this.originalFileName = originalFileName;
    return this;
  }

  /**
   * Get originalFileName
   * @return originalFileName
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getOriginalFileName() {
    return originalFileName;
  }

  public void setOriginalFileName(String originalFileName) {
    this.originalFileName = originalFileName;
  }

  public DocumentsIdBody archivedFileName(String archivedFileName) {
    this.archivedFileName = archivedFileName;
    return this;
  }

  /**
   * Get archivedFileName
   * @return archivedFileName
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getArchivedFileName() {
    return archivedFileName;
  }

  public void setArchivedFileName(String archivedFileName) {
    this.archivedFileName = archivedFileName;
  }

  public DocumentsIdBody owner(Integer owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getOwner() {
    return owner;
  }

  public void setOwner(Integer owner) {
    this.owner = owner;
  }

  public DocumentsIdBody permissions(ApicorrespondentsidPermissions permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Get permissions
   * @return permissions
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ApicorrespondentsidPermissions getPermissions() {
    return permissions;
  }

  public void setPermissions(ApicorrespondentsidPermissions permissions) {
    this.permissions = permissions;
  }

  public DocumentsIdBody notes(List<Object> notes) {
    this.notes = notes;
    return this;
  }

  public DocumentsIdBody addNotesItem(Object notesItem) {
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Get notes
   * @return notes
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<Object> getNotes() {
    return notes;
  }

  public void setNotes(List<Object> notes) {
    this.notes = notes;
  }



  /**
   * Get setPermissions
   * @return setPermissions
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ApicorrespondentsidPermissions getSetPermissions() {
    return setPermissions;
  }

  public void setSetPermissions(ApicorrespondentsidPermissions setPermissions) {
    this.setPermissions = setPermissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentsIdBody documentsIdBody = (DocumentsIdBody) o;
    return Objects.equals(this.id, documentsIdBody.id) &&
        Objects.equals(this.correspondent, documentsIdBody.correspondent) &&
        Objects.equals(this.documentType, documentsIdBody.documentType) &&
        Objects.equals(this.storagePath, documentsIdBody.storagePath) &&
        Objects.equals(this.title, documentsIdBody.title) &&
        Objects.equals(this.content, documentsIdBody.content) &&
        Objects.equals(this.tags, documentsIdBody.tags) &&
        Objects.equals(this.createdDate, documentsIdBody.createdDate) &&
        Objects.equals(this.modified, documentsIdBody.modified) &&
        Objects.equals(this.added, documentsIdBody.added) &&
        Objects.equals(this.archiveSerialNumber, documentsIdBody.archiveSerialNumber) &&
        Objects.equals(this.originalFileName, documentsIdBody.originalFileName) &&
        Objects.equals(this.archivedFileName, documentsIdBody.archivedFileName) &&
        Objects.equals(this.owner, documentsIdBody.owner) &&
        Objects.equals(this.permissions, documentsIdBody.permissions) &&
        Objects.equals(this.notes, documentsIdBody.notes) &&
        Objects.equals(this.setPermissions, documentsIdBody.setPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, correspondent, documentType, storagePath, title, content, tags, createdDate, modified, added, archiveSerialNumber, originalFileName, archivedFileName, owner, permissions, notes, setPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentsIdBody {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    correspondent: ").append(toIndentedString(correspondent)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    storagePath: ").append(toIndentedString(storagePath)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    added: ").append(toIndentedString(added)).append("\n");
    sb.append("    archiveSerialNumber: ").append(toIndentedString(archiveSerialNumber)).append("\n");
    sb.append("    originalFileName: ").append(toIndentedString(originalFileName)).append("\n");
    sb.append("    archivedFileName: ").append(toIndentedString(archivedFileName)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    setPermissions: ").append(toIndentedString(setPermissions)).append("\n");
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
