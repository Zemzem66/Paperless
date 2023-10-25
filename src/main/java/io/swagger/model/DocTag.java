package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DocTag
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class DocTag   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("slug")
  private String slug = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("color")
  private String color = null;

  @JsonProperty("match")
  private String match = null;

  @JsonProperty("matching_algorithm")
  private Long matchingAlgorithm = null;

  @JsonProperty("is_insensitive")
  private Boolean isInsensitive = null;

  @JsonProperty("is_inbox_tag")
  private Boolean isInboxTag = null;

  @JsonProperty("document_count")
  private Long documentCount = null;

  public DocTag id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DocTag slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * Get slug
   * @return slug
   **/
  @Schema(description = "")
  
    public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public DocTag name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DocTag color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
   **/
  @Schema(description = "")
  
    public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public DocTag match(String match) {
    this.match = match;
    return this;
  }

  /**
   * Get match
   * @return match
   **/
  @Schema(description = "")
  
    public String getMatch() {
    return match;
  }

  public void setMatch(String match) {
    this.match = match;
  }

  public DocTag matchingAlgorithm(Long matchingAlgorithm) {
    this.matchingAlgorithm = matchingAlgorithm;
    return this;
  }

  /**
   * Get matchingAlgorithm
   * @return matchingAlgorithm
   **/
  @Schema(description = "")
  
    public Long getMatchingAlgorithm() {
    return matchingAlgorithm;
  }

  public void setMatchingAlgorithm(Long matchingAlgorithm) {
    this.matchingAlgorithm = matchingAlgorithm;
  }

  public DocTag isInsensitive(Boolean isInsensitive) {
    this.isInsensitive = isInsensitive;
    return this;
  }

  /**
   * Get isInsensitive
   * @return isInsensitive
   **/
  @Schema(description = "")
  
    public Boolean isIsInsensitive() {
    return isInsensitive;
  }

  public void setIsInsensitive(Boolean isInsensitive) {
    this.isInsensitive = isInsensitive;
  }

  public DocTag isInboxTag(Boolean isInboxTag) {
    this.isInboxTag = isInboxTag;
    return this;
  }

  /**
   * Get isInboxTag
   * @return isInboxTag
   **/
  @Schema(description = "")
  
    public Boolean isIsInboxTag() {
    return isInboxTag;
  }

  public void setIsInboxTag(Boolean isInboxTag) {
    this.isInboxTag = isInboxTag;
  }

  public DocTag documentCount(Long documentCount) {
    this.documentCount = documentCount;
    return this;
  }

  /**
   * Get documentCount
   * @return documentCount
   **/
  @Schema(description = "")
  
    public Long getDocumentCount() {
    return documentCount;
  }

  public void setDocumentCount(Long documentCount) {
    this.documentCount = documentCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocTag docTag = (DocTag) o;
    return Objects.equals(this.id, docTag.id) &&
        Objects.equals(this.slug, docTag.slug) &&
        Objects.equals(this.name, docTag.name) &&
        Objects.equals(this.color, docTag.color) &&
        Objects.equals(this.match, docTag.match) &&
        Objects.equals(this.matchingAlgorithm, docTag.matchingAlgorithm) &&
        Objects.equals(this.isInsensitive, docTag.isInsensitive) &&
        Objects.equals(this.isInboxTag, docTag.isInboxTag) &&
        Objects.equals(this.documentCount, docTag.documentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, slug, name, color, match, matchingAlgorithm, isInsensitive, isInboxTag, documentCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocTag {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    matchingAlgorithm: ").append(toIndentedString(matchingAlgorithm)).append("\n");
    sb.append("    isInsensitive: ").append(toIndentedString(isInsensitive)).append("\n");
    sb.append("    isInboxTag: ").append(toIndentedString(isInboxTag)).append("\n");
    sb.append("    documentCount: ").append(toIndentedString(documentCount)).append("\n");
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
