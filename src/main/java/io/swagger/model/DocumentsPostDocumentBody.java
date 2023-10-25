package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.core.io.Resource;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DocumentsPostDocumentBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class DocumentsPostDocumentBody   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("document_type")
  private Integer documentType = null;

  @JsonProperty("tags")
  @Valid
  private List<Integer> tags = null;

  @JsonProperty("correspondent")
  private Integer correspondent = null;

  @JsonProperty("document")
  @Valid
  private List<Resource> document = null;

  public DocumentsPostDocumentBody title(String title) {
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

  public DocumentsPostDocumentBody created(OffsetDateTime created) {
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

  public DocumentsPostDocumentBody documentType(Integer documentType) {
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

  public DocumentsPostDocumentBody tags(List<Integer> tags) {
    this.tags = tags;
    return this;
  }

  public DocumentsPostDocumentBody addTagsItem(Integer tagsItem) {
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

  public DocumentsPostDocumentBody correspondent(Integer correspondent) {
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

  public DocumentsPostDocumentBody document(List<Resource> document) {
    this.document = document;
    return this;
  }

  public DocumentsPostDocumentBody addDocumentItem(Resource documentItem) {
    if (this.document == null) {
      this.document = new ArrayList<Resource>();
    }
    this.document.add(documentItem);
    return this;
  }

  /**
   * Get document
   * @return document
   **/
  @Schema(description = "")
      @Valid
    public List<Resource> getDocument() {
    return document;
  }

  public void setDocument(List<Resource> document) {
    this.document = document;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentsPostDocumentBody documentsPostDocumentBody = (DocumentsPostDocumentBody) o;
    return Objects.equals(this.title, documentsPostDocumentBody.title) &&
        Objects.equals(this.created, documentsPostDocumentBody.created) &&
        Objects.equals(this.documentType, documentsPostDocumentBody.documentType) &&
        Objects.equals(this.tags, documentsPostDocumentBody.tags) &&
        Objects.equals(this.correspondent, documentsPostDocumentBody.correspondent) &&
        Objects.equals(this.document, documentsPostDocumentBody.document);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, created, documentType, tags, correspondent, document);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentsPostDocumentBody {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    correspondent: ").append(toIndentedString(correspondent)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
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
