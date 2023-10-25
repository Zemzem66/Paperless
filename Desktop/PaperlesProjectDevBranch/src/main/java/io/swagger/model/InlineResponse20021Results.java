package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ApisavedViewsFilterRules;
import io.swagger.model.InlineResponse20021Owner;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20021Results
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")


public class InlineResponse20021Results   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("show_on_dashboard")
  private Boolean showOnDashboard = null;

  @JsonProperty("show_in_sidebar")
  private Boolean showInSidebar = null;

  @JsonProperty("sort_field")
  private String sortField = null;

  @JsonProperty("sort_reverse")
  private Boolean sortReverse = null;

  @JsonProperty("filter_rules")
  @Valid
  private List<ApisavedViewsFilterRules> filterRules = new ArrayList<ApisavedViewsFilterRules>();

  @JsonProperty("owner")
  private InlineResponse20021Owner owner = null;

  @JsonProperty("user_can_change")
  private Boolean userCanChange = null;

  public InlineResponse20021Results id(Integer id) {
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

  public InlineResponse20021Results name(String name) {
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

  public InlineResponse20021Results showOnDashboard(Boolean showOnDashboard) {
    this.showOnDashboard = showOnDashboard;
    return this;
  }

  /**
   * Get showOnDashboard
   * @return showOnDashboard
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isShowOnDashboard() {
    return showOnDashboard;
  }

  public void setShowOnDashboard(Boolean showOnDashboard) {
    this.showOnDashboard = showOnDashboard;
  }

  public InlineResponse20021Results showInSidebar(Boolean showInSidebar) {
    this.showInSidebar = showInSidebar;
    return this;
  }

  /**
   * Get showInSidebar
   * @return showInSidebar
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isShowInSidebar() {
    return showInSidebar;
  }

  public void setShowInSidebar(Boolean showInSidebar) {
    this.showInSidebar = showInSidebar;
  }

  public InlineResponse20021Results sortField(String sortField) {
    this.sortField = sortField;
    return this;
  }

  /**
   * Get sortField
   * @return sortField
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getSortField() {
    return sortField;
  }

  public void setSortField(String sortField) {
    this.sortField = sortField;
  }

  public InlineResponse20021Results sortReverse(Boolean sortReverse) {
    this.sortReverse = sortReverse;
    return this;
  }

  /**
   * Get sortReverse
   * @return sortReverse
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isSortReverse() {
    return sortReverse;
  }

  public void setSortReverse(Boolean sortReverse) {
    this.sortReverse = sortReverse;
  }

  public InlineResponse20021Results filterRules(List<ApisavedViewsFilterRules> filterRules) {
    this.filterRules = filterRules;
    return this;
  }

  public InlineResponse20021Results addFilterRulesItem(ApisavedViewsFilterRules filterRulesItem) {
    this.filterRules.add(filterRulesItem);
    return this;
  }

  /**
   * Get filterRules
   * @return filterRules
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<ApisavedViewsFilterRules> getFilterRules() {
    return filterRules;
  }

  public void setFilterRules(List<ApisavedViewsFilterRules> filterRules) {
    this.filterRules = filterRules;
  }

  public InlineResponse20021Results owner(InlineResponse20021Owner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public InlineResponse20021Owner getOwner() {
    return owner;
  }

  public void setOwner(InlineResponse20021Owner owner) {
    this.owner = owner;
  }

  public InlineResponse20021Results userCanChange(Boolean userCanChange) {
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
    InlineResponse20021Results inlineResponse20021Results = (InlineResponse20021Results) o;
    return Objects.equals(this.id, inlineResponse20021Results.id) &&
        Objects.equals(this.name, inlineResponse20021Results.name) &&
        Objects.equals(this.showOnDashboard, inlineResponse20021Results.showOnDashboard) &&
        Objects.equals(this.showInSidebar, inlineResponse20021Results.showInSidebar) &&
        Objects.equals(this.sortField, inlineResponse20021Results.sortField) &&
        Objects.equals(this.sortReverse, inlineResponse20021Results.sortReverse) &&
        Objects.equals(this.filterRules, inlineResponse20021Results.filterRules) &&
        Objects.equals(this.owner, inlineResponse20021Results.owner) &&
        Objects.equals(this.userCanChange, inlineResponse20021Results.userCanChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, showOnDashboard, showInSidebar, sortField, sortReverse, filterRules, owner, userCanChange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20021Results {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    showOnDashboard: ").append(toIndentedString(showOnDashboard)).append("\n");
    sb.append("    showInSidebar: ").append(toIndentedString(showInSidebar)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
    sb.append("    sortReverse: ").append(toIndentedString(sortReverse)).append("\n");
    sb.append("    filterRules: ").append(toIndentedString(filterRules)).append("\n");
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
