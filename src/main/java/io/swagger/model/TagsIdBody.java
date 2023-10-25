package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ApicorrespondentsidPermissions;
import io.swagger.model.ApicorrespondentsidPermissionsForm;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TagsIdBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class TagsIdBody   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("slug")
  private String slug = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("color")
  private String color = null;

  @JsonProperty("text_color")
  private String textColor = null;

  @JsonProperty("match")
  private String match = null;

  @JsonProperty("matching_algorithm")
  private Integer matchingAlgorithm = null;

  @JsonProperty("is_insensitive")
  private Boolean isInsensitive = null;

  @JsonProperty("is_inbox_tag")
  private Boolean isInboxTag = null;

  @JsonProperty("document_count")
  private Integer documentCount = null;

  @JsonProperty("owner")
  private Integer owner = null;

  @JsonProperty("permissions")
  private ApicorrespondentsidPermissions permissions = null;

  @JsonProperty("set_permissions")
  private ApicorrespondentsidPermissions setPermissions = null;

  @JsonProperty("permissions_form")
  private ApicorrespondentsidPermissionsForm permissionsForm = null;

  public TagsIdBody id(Integer id) {
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

  public TagsIdBody slug(String slug) {
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

  public TagsIdBody name(String name) {
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

  public TagsIdBody color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public TagsIdBody textColor(String textColor) {
    this.textColor = textColor;
    return this;
  }

  /**
   * Get textColor
   * @return textColor
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getTextColor() {
    return textColor;
  }

  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }

  public TagsIdBody match(String match) {
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

  public TagsIdBody matchingAlgorithm(Integer matchingAlgorithm) {
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

  public TagsIdBody isInsensitive(Boolean isInsensitive) {
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

  public TagsIdBody isInboxTag(Boolean isInboxTag) {
    this.isInboxTag = isInboxTag;
    return this;
  }

  /**
   * Get isInboxTag
   * @return isInboxTag
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isIsInboxTag() {
    return isInboxTag;
  }

  public void setIsInboxTag(Boolean isInboxTag) {
    this.isInboxTag = isInboxTag;
  }

  public TagsIdBody documentCount(Integer documentCount) {
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

  public TagsIdBody owner(Integer owner) {
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

  public TagsIdBody permissions(ApicorrespondentsidPermissions permissions) {
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

  public TagsIdBody getPermissions(ApicorrespondentsidPermissions setPermissions) {
    this.setPermissions = setPermissions;
    return this;
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

  public TagsIdBody permissionsForm(ApicorrespondentsidPermissionsForm permissionsForm) {
    this.permissionsForm = permissionsForm;
    return this;
  }

  /**
   * Get permissionsForm
   * @return permissionsForm
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ApicorrespondentsidPermissionsForm getPermissionsForm() {
    return permissionsForm;
  }

  public void setPermissionsForm(ApicorrespondentsidPermissionsForm permissionsForm) {
    this.permissionsForm = permissionsForm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagsIdBody tagsIdBody = (TagsIdBody) o;
    return Objects.equals(this.id, tagsIdBody.id) &&
        Objects.equals(this.slug, tagsIdBody.slug) &&
        Objects.equals(this.name, tagsIdBody.name) &&
        Objects.equals(this.color, tagsIdBody.color) &&
        Objects.equals(this.textColor, tagsIdBody.textColor) &&
        Objects.equals(this.match, tagsIdBody.match) &&
        Objects.equals(this.matchingAlgorithm, tagsIdBody.matchingAlgorithm) &&
        Objects.equals(this.isInsensitive, tagsIdBody.isInsensitive) &&
        Objects.equals(this.isInboxTag, tagsIdBody.isInboxTag) &&
        Objects.equals(this.documentCount, tagsIdBody.documentCount) &&
        Objects.equals(this.owner, tagsIdBody.owner) &&
        Objects.equals(this.permissions, tagsIdBody.permissions) &&
        Objects.equals(this.setPermissions, tagsIdBody.setPermissions) &&
        Objects.equals(this.permissionsForm, tagsIdBody.permissionsForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, slug, name, color, textColor, match, matchingAlgorithm, isInsensitive, isInboxTag, documentCount, owner, permissions, setPermissions, permissionsForm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagsIdBody {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    matchingAlgorithm: ").append(toIndentedString(matchingAlgorithm)).append("\n");
    sb.append("    isInsensitive: ").append(toIndentedString(isInsensitive)).append("\n");
    sb.append("    isInboxTag: ").append(toIndentedString(isInboxTag)).append("\n");
    sb.append("    documentCount: ").append(toIndentedString(documentCount)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    setPermissions: ").append(toIndentedString(setPermissions)).append("\n");
    sb.append("    permissionsForm: ").append(toIndentedString(permissionsForm)).append("\n");
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
