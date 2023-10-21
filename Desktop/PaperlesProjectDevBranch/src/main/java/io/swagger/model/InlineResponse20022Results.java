package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ApistoragePathsidPermissions;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20022Results
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")


public class InlineResponse20022Results   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("slug")
  private String slug = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("match")
  private String match = null;

  @JsonProperty("matching_algorithm")
  private Integer matchingAlgorithm = null;

  @JsonProperty("is_insensitive")
  private Boolean isInsensitive = null;

  @JsonProperty("document_count")
  private Integer documentCount = null;

  @JsonProperty("owner")
  private Integer owner = null;

  @JsonProperty("permissions")
  private ApistoragePathsidPermissions permissions = null;

  public InlineResponse20022Results id(Integer id) {
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

  public InlineResponse20022Results slug(String slug) {
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

  public InlineResponse20022Results name(String name) {
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

  public InlineResponse20022Results path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public InlineResponse20022Results match(String match) {
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

  public InlineResponse20022Results matchingAlgorithm(Integer matchingAlgorithm) {
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

  public InlineResponse20022Results isInsensitive(Boolean isInsensitive) {
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

  public InlineResponse20022Results documentCount(Integer documentCount) {
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

  public InlineResponse20022Results owner(Integer owner) {
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

  public InlineResponse20022Results permissions(ApistoragePathsidPermissions permissions) {
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
    public ApistoragePathsidPermissions getPermissions() {
    return permissions;
  }

  public void setPermissions(ApistoragePathsidPermissions permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20022Results inlineResponse20022Results = (InlineResponse20022Results) o;
    return Objects.equals(this.id, inlineResponse20022Results.id) &&
        Objects.equals(this.slug, inlineResponse20022Results.slug) &&
        Objects.equals(this.name, inlineResponse20022Results.name) &&
        Objects.equals(this.path, inlineResponse20022Results.path) &&
        Objects.equals(this.match, inlineResponse20022Results.match) &&
        Objects.equals(this.matchingAlgorithm, inlineResponse20022Results.matchingAlgorithm) &&
        Objects.equals(this.isInsensitive, inlineResponse20022Results.isInsensitive) &&
        Objects.equals(this.documentCount, inlineResponse20022Results.documentCount) &&
        Objects.equals(this.owner, inlineResponse20022Results.owner) &&
        Objects.equals(this.permissions, inlineResponse20022Results.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, slug, name, path, match, matchingAlgorithm, isInsensitive, documentCount, owner, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20022Results {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    matchingAlgorithm: ").append(toIndentedString(matchingAlgorithm)).append("\n");
    sb.append("    isInsensitive: ").append(toIndentedString(isInsensitive)).append("\n");
    sb.append("    documentCount: ").append(toIndentedString(documentCount)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
