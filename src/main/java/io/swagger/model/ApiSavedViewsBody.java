package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ApisavedViewsFilterRules;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApiSavedViewsBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class ApiSavedViewsBody   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("show_on_dashboard")
  private Boolean showOnDashboard = null;

  @JsonProperty("show_in_sidebar")
  private Boolean showInSidebar = null;

  @JsonProperty("filter_rules")
  @Valid
  private List<ApisavedViewsFilterRules> filterRules = new ArrayList<ApisavedViewsFilterRules>();

  @JsonProperty("sort_reverse")
  private Boolean sortReverse = null;

  @JsonProperty("sort_field")
  private String sortField = null;

  public ApiSavedViewsBody name(String name) {
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

  public ApiSavedViewsBody showOnDashboard(Boolean showOnDashboard) {
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

  public ApiSavedViewsBody showInSidebar(Boolean showInSidebar) {
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

  public ApiSavedViewsBody filterRules(List<ApisavedViewsFilterRules> filterRules) {
    this.filterRules = filterRules;
    return this;
  }

  public ApiSavedViewsBody addFilterRulesItem(ApisavedViewsFilterRules filterRulesItem) {
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

  public ApiSavedViewsBody sortReverse(Boolean sortReverse) {
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

  public ApiSavedViewsBody sortField(String sortField) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiSavedViewsBody apiSavedViewsBody = (ApiSavedViewsBody) o;
    return Objects.equals(this.name, apiSavedViewsBody.name) &&
        Objects.equals(this.showOnDashboard, apiSavedViewsBody.showOnDashboard) &&
        Objects.equals(this.showInSidebar, apiSavedViewsBody.showInSidebar) &&
        Objects.equals(this.filterRules, apiSavedViewsBody.filterRules) &&
        Objects.equals(this.sortReverse, apiSavedViewsBody.sortReverse) &&
        Objects.equals(this.sortField, apiSavedViewsBody.sortField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, showOnDashboard, showInSidebar, filterRules, sortReverse, sortField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiSavedViewsBody {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    showOnDashboard: ").append(toIndentedString(showOnDashboard)).append("\n");
    sb.append("    showInSidebar: ").append(toIndentedString(showInSidebar)).append("\n");
    sb.append("    filterRules: ").append(toIndentedString(filterRules)).append("\n");
    sb.append("    sortReverse: ").append(toIndentedString(sortReverse)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
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
