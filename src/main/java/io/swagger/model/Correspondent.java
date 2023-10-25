package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Correspondent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class Correspondent   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("slug")
  private String slug = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("match")
  private String match = null;

  @JsonProperty("matching_algorithm")
  private Long matchingAlgorithm = null;

  @JsonProperty("is_insensitive")
  private Boolean isInsensitive = null;

  @JsonProperty("document_count")
  private Long documentCount = null;

  @JsonProperty("last_correspondence")
  private OffsetDateTime lastCorrespondence = null;

  public Correspondent id(Long id) {
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

  public Correspondent slug(String slug) {
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

  public Correspondent name(String name) {
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

  public Correspondent match(String match) {
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

  public Correspondent matchingAlgorithm(Long matchingAlgorithm) {
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

  public Correspondent isInsensitive(Boolean isInsensitive) {
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

  public Correspondent documentCount(Long documentCount) {
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

  public Correspondent lastCorrespondence(OffsetDateTime lastCorrespondence) {
    this.lastCorrespondence = lastCorrespondence;
    return this;
  }

  /**
   * Get lastCorrespondence
   * @return lastCorrespondence
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getLastCorrespondence() {
    return lastCorrespondence;
  }

  public void setLastCorrespondence(OffsetDateTime lastCorrespondence) {
    this.lastCorrespondence = lastCorrespondence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Correspondent correspondent = (Correspondent) o;
    return Objects.equals(this.id, correspondent.id) &&
        Objects.equals(this.slug, correspondent.slug) &&
        Objects.equals(this.name, correspondent.name) &&
        Objects.equals(this.match, correspondent.match) &&
        Objects.equals(this.matchingAlgorithm, correspondent.matchingAlgorithm) &&
        Objects.equals(this.isInsensitive, correspondent.isInsensitive) &&
        Objects.equals(this.documentCount, correspondent.documentCount) &&
        Objects.equals(this.lastCorrespondence, correspondent.lastCorrespondence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, slug, name, match, matchingAlgorithm, isInsensitive, documentCount, lastCorrespondence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Correspondent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    matchingAlgorithm: ").append(toIndentedString(matchingAlgorithm)).append("\n");
    sb.append("    isInsensitive: ").append(toIndentedString(isInsensitive)).append("\n");
    sb.append("    documentCount: ").append(toIndentedString(documentCount)).append("\n");
    sb.append("    lastCorrespondence: ").append(toIndentedString(lastCorrespondence)).append("\n");
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
