package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ApistoragePathsidPermissions;
import io.swagger.model.ApistoragePathsidPermissionsForm;
import io.swagger.model.ApistoragePathsidSetPermissions;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StoragePathsIdBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class StoragePathsIdBody   {
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

  @JsonProperty("set_permissions")
  private ApistoragePathsidSetPermissions setPermissions = null;

  @JsonProperty("permissions_form")
  private ApistoragePathsidPermissionsForm permissionsForm = null;

  public StoragePathsIdBody id(Integer id) {
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

  public StoragePathsIdBody slug(String slug) {
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

  public StoragePathsIdBody name(String name) {
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

  public StoragePathsIdBody path(String path) {
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

  public StoragePathsIdBody match(String match) {
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

  public StoragePathsIdBody matchingAlgorithm(Integer matchingAlgorithm) {
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

  public StoragePathsIdBody isInsensitive(Boolean isInsensitive) {
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

  public StoragePathsIdBody documentCount(Integer documentCount) {
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

  public StoragePathsIdBody owner(Integer owner) {
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

  public StoragePathsIdBody permissions(ApistoragePathsidPermissions permissions) {
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

  public StoragePathsIdBody setPermissions(ApistoragePathsidSetPermissions setPermissions) {
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
    public ApistoragePathsidSetPermissions getSetPermissions() {
    return setPermissions;
  }

  public void setSetPermissions(ApistoragePathsidSetPermissions setPermissions) {
    this.setPermissions = setPermissions;
  }

  public StoragePathsIdBody permissionsForm(ApistoragePathsidPermissionsForm permissionsForm) {
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
    public ApistoragePathsidPermissionsForm getPermissionsForm() {
    return permissionsForm;
  }

  public void setPermissionsForm(ApistoragePathsidPermissionsForm permissionsForm) {
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
    StoragePathsIdBody storagePathsIdBody = (StoragePathsIdBody) o;
    return Objects.equals(this.id, storagePathsIdBody.id) &&
        Objects.equals(this.slug, storagePathsIdBody.slug) &&
        Objects.equals(this.name, storagePathsIdBody.name) &&
        Objects.equals(this.path, storagePathsIdBody.path) &&
        Objects.equals(this.match, storagePathsIdBody.match) &&
        Objects.equals(this.matchingAlgorithm, storagePathsIdBody.matchingAlgorithm) &&
        Objects.equals(this.isInsensitive, storagePathsIdBody.isInsensitive) &&
        Objects.equals(this.documentCount, storagePathsIdBody.documentCount) &&
        Objects.equals(this.owner, storagePathsIdBody.owner) &&
        Objects.equals(this.permissions, storagePathsIdBody.permissions) &&
        Objects.equals(this.setPermissions, storagePathsIdBody.setPermissions) &&
        Objects.equals(this.permissionsForm, storagePathsIdBody.permissionsForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, slug, name, path, match, matchingAlgorithm, isInsensitive, documentCount, owner, permissions, setPermissions, permissionsForm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoragePathsIdBody {\n");
    
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
