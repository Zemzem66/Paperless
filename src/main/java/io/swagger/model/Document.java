package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Document
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class Document   {
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
  private List<Integer> tags = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("created_date")
  private OffsetDateTime createdDate = null;

  @JsonProperty("modified")
  private OffsetDateTime modified = null;

  @JsonProperty("added")
  private OffsetDateTime added = null;

  @JsonProperty("archive_serial_number")
  private String archiveSerialNumber = null;

  @JsonProperty("original_file_name")
  private String originalFileName = null;

  @JsonProperty("archived_file_name")
  private String archivedFileName = null;

  public Document id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Document correspondent(Integer correspondent) {
    this.correspondent = correspondent;
    return this;
  }

  /**
   * Get correspondent
   * @return correspondent
   **/
  @Schema(description = "")
  
    public Integer getCorrespondent() {
    return correspondent;
  }

  public void setCorrespondent(Integer correspondent) {
    this.correspondent = correspondent;
  }

  public Document documentType(Integer documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * Get documentType
   * @return documentType
   **/
  @Schema(description = "")
  
    public Integer getDocumentType() {
    return documentType;
  }

  public void setDocumentType(Integer documentType) {
    this.documentType = documentType;
  }

  public Document storagePath(Integer storagePath) {
    this.storagePath = storagePath;
    return this;
  }

  /**
   * Get storagePath
   * @return storagePath
   **/
  @Schema(description = "")
  
    public Integer getStoragePath() {
    return storagePath;
  }

  public void setStoragePath(Integer storagePath) {
    this.storagePath = storagePath;
  }

  public Document title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   **/
  @Schema(description = "")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Document content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   **/
  @Schema(description = "")
  
    public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Document tags(List<Integer> tags) {
    this.tags = tags;
    return this;
  }

  public Document addTagsItem(Integer tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Integer>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
   **/
  @Schema(description = "")
  
    public List<Integer> getTags() {
    return tags;
  }

  public void setTags(List<Integer> tags) {
    this.tags = tags;
  }

  public Document created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public Document createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public Document modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Get modified
   * @return modified
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }

  public Document added(OffsetDateTime added) {
    this.added = added;
    return this;
  }

  /**
   * Get added
   * @return added
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getAdded() {
    return added;
  }

  public void setAdded(OffsetDateTime added) {
    this.added = added;
  }

  public Document archiveSerialNumber(String archiveSerialNumber) {
    this.archiveSerialNumber = archiveSerialNumber;
    return this;
  }

  /**
   * Get archiveSerialNumber
   * @return archiveSerialNumber
   **/
  @Schema(description = "")
  
    public String getArchiveSerialNumber() {
    return archiveSerialNumber;
  }

  public void setArchiveSerialNumber(String archiveSerialNumber) {
    this.archiveSerialNumber = archiveSerialNumber;
  }

  public Document originalFileName(String originalFileName) {
    this.originalFileName = originalFileName;
    return this;
  }

  /**
   * Get originalFileName
   * @return originalFileName
   **/
  @Schema(description = "")
  
    public String getOriginalFileName() {
    return originalFileName;
  }

  public void setOriginalFileName(String originalFileName) {
    this.originalFileName = originalFileName;
  }

  public Document archivedFileName(String archivedFileName) {
    this.archivedFileName = archivedFileName;
    return this;
  }

  /**
   * Get archivedFileName
   * @return archivedFileName
   **/
  @Schema(description = "")
  
    public String getArchivedFileName() {
    return archivedFileName;
  }

  public void setArchivedFileName(String archivedFileName) {
    this.archivedFileName = archivedFileName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.id, document.id) &&
        Objects.equals(this.correspondent, document.correspondent) &&
        Objects.equals(this.documentType, document.documentType) &&
        Objects.equals(this.storagePath, document.storagePath) &&
        Objects.equals(this.title, document.title) &&
        Objects.equals(this.content, document.content) &&
        Objects.equals(this.tags, document.tags) &&
        Objects.equals(this.created, document.created) &&
        Objects.equals(this.createdDate, document.createdDate) &&
        Objects.equals(this.modified, document.modified) &&
        Objects.equals(this.added, document.added) &&
        Objects.equals(this.archiveSerialNumber, document.archiveSerialNumber) &&
        Objects.equals(this.originalFileName, document.originalFileName) &&
        Objects.equals(this.archivedFileName, document.archivedFileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, correspondent, documentType, storagePath, title, content, tags, created, createdDate, modified, added, archiveSerialNumber, originalFileName, archivedFileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    correspondent: ").append(toIndentedString(correspondent)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    storagePath: ").append(toIndentedString(storagePath)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    added: ").append(toIndentedString(added)).append("\n");
    sb.append("    archiveSerialNumber: ").append(toIndentedString(archiveSerialNumber)).append("\n");
    sb.append("    originalFileName: ").append(toIndentedString(originalFileName)).append("\n");
    sb.append("    archivedFileName: ").append(toIndentedString(archivedFileName)).append("\n");
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
