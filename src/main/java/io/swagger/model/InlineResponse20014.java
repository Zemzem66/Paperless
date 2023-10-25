package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.InlineResponse20015;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20014
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class InlineResponse20014   {
  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("next")
  private Integer next = null;

  @JsonProperty("previous")
  private Integer previous = null;

  @JsonProperty("all")
  @Valid
  private List<Integer> all = new ArrayList<Integer>();

  @JsonProperty("results")
  @Valid
  private List<InlineResponse20015> results = new ArrayList<InlineResponse20015>();

  public InlineResponse20014 count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public InlineResponse20014 next(Integer next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getNext() {
    return next;
  }

  public void setNext(Integer next) {
    this.next = next;
  }

  public InlineResponse20014 previous(Integer previous) {
    this.previous = previous;
    return this;
  }

  /**
   * Get previous
   * @return previous
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getPrevious() {
    return previous;
  }

  public void setPrevious(Integer previous) {
    this.previous = previous;
  }

  public InlineResponse20014 all(List<Integer> all) {
    this.all = all;
    return this;
  }

  public InlineResponse20014 addAllItem(Integer allItem) {
    this.all.add(allItem);
    return this;
  }

  /**
   * Get all
   * @return all
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<Integer> getAll() {
    return all;
  }

  public void setAll(List<Integer> all) {
    this.all = all;
  }

  public InlineResponse20014 results(List<InlineResponse20015> results) {
    this.results = results;
    return this;
  }

  public InlineResponse20014 addResultsItem(InlineResponse20015 resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<InlineResponse20015> getResults() {
    return results;
  }

  public void setResults(List<InlineResponse20015> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014 inlineResponse20014 = (InlineResponse20014) o;
    return Objects.equals(this.count, inlineResponse20014.count) &&
        Objects.equals(this.next, inlineResponse20014.next) &&
        Objects.equals(this.previous, inlineResponse20014.previous) &&
        Objects.equals(this.all, inlineResponse20014.all) &&
        Objects.equals(this.results, inlineResponse20014.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, all, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014 {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
