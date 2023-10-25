package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2001
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")


public class InlineResponse2001   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("slug")
  private String slug = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("match")
  private String match = null;

  @JsonProperty("matching_algorithm")
  private Integer matchingAlgorithm = null;

  @JsonProperty("is_insensitive")
  private Boolean isInsensitive = null;

  @JsonProperty("document_count")
  private Integer documentCount = null;

  @JsonProperty("last_correspondence")
  private Integer lastCorrespondence = null;

  @JsonProperty("owner")
  private Integer owner = null;

  @JsonProperty("user_can_change")
  private Boolean userCanChange = null;

  public InlineResponse2001 id(Integer id) {
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

  public InlineResponse2001 slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * Get slug
   * @return slug
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public InlineResponse2001 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse2001 match(String match) {
    this.match = match;
    return this;
  }

  /**
   * Get match
   * @return match
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getMatch() {
    return match;
  }

  public void setMatch(String match) {
    this.match = match;
  }

  public InlineResponse2001 matchingAlgorithm(Integer matchingAlgorithm) {
    this.matchingAlgorithm = matchingAlgorithm;
    return this;
  }

  /**
   * Get matchingAlgorithm
   * @return matchingAlgorithm
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getMatchingAlgorithm() {
    return matchingAlgorithm;
  }

  public void setMatchingAlgorithm(Integer matchingAlgorithm) {
    this.matchingAlgorithm = matchingAlgorithm;
  }

  public InlineResponse2001 isInsensitive(Boolean isInsensitive) {
    this.isInsensitive = isInsensitive;
    return this;
  }

  /**
   * Get isInsensitive
   * @return isInsensitive
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isIsInsensitive() {
    return isInsensitive;
  }

  public void setIsInsensitive(Boolean isInsensitive) {
    this.isInsensitive = isInsensitive;
  }

  public InlineResponse2001 documentCount(Integer documentCount) {
    this.documentCount = documentCount;
    return this;
  }

  /**
   * Get documentCount
   * @return documentCount
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getDocumentCount() {
    return documentCount;
  }

  public void setDocumentCount(Integer documentCount) {
    this.documentCount = documentCount;
  }

  public InlineResponse2001 lastCorrespondence(Integer lastCorrespondence) {
    this.lastCorrespondence = lastCorrespondence;
    return this;
  }

  /**
   * Get lastCorrespondence
   * @return lastCorrespondence
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getLastCorrespondence() {
    return lastCorrespondence;
  }

  public void setLastCorrespondence(Integer lastCorrespondence) {
    this.lastCorrespondence = lastCorrespondence;
  }

  public InlineResponse2001 owner(Integer owner) {
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

  public InlineResponse2001 userCanChange(Boolean userCanChange) {
    this.userCanChange = userCanChange;
    return this;
  }

  /**
   * Get userCanChange
   * @return userCanChange
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isUserCanChange() {
    return userCanChange;
  }

  public void setUserCanChange(Boolean userCanChange) {
    this.userCanChange = userCanChange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.id, inlineResponse2001.id) &&
        Objects.equals(this.slug, inlineResponse2001.slug) &&
        Objects.equals(this.name, inlineResponse2001.name) &&
        Objects.equals(this.match, inlineResponse2001.match) &&
        Objects.equals(this.matchingAlgorithm, inlineResponse2001.matchingAlgorithm) &&
        Objects.equals(this.isInsensitive, inlineResponse2001.isInsensitive) &&
        Objects.equals(this.documentCount, inlineResponse2001.documentCount) &&
        Objects.equals(this.lastCorrespondence, inlineResponse2001.lastCorrespondence) &&
        Objects.equals(this.owner, inlineResponse2001.owner) &&
        Objects.equals(this.userCanChange, inlineResponse2001.userCanChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, slug, name, match, matchingAlgorithm, isInsensitive, documentCount, lastCorrespondence, owner, userCanChange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    matchingAlgorithm: ").append(toIndentedString(matchingAlgorithm)).append("\n");
    sb.append("    isInsensitive: ").append(toIndentedString(isInsensitive)).append("\n");
    sb.append("    documentCount: ").append(toIndentedString(documentCount)).append("\n");
    sb.append("    lastCorrespondence: ").append(toIndentedString(lastCorrespondence)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    userCanChange: ").append(toIndentedString(userCanChange)).append("\n");
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
