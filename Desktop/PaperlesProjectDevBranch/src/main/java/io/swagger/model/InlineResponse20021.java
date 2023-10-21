package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.InlineResponse20021Results;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20021
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")


public class InlineResponse20021   {
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
  private List<InlineResponse20021Results> results = new ArrayList<InlineResponse20021Results>();

  public InlineResponse20021 count(Integer count) {
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

  public InlineResponse20021 next(Integer next) {
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

  public InlineResponse20021 previous(Integer previous) {
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

  public InlineResponse20021 all(List<Integer> all) {
    this.all = all;
    return this;
  }

  public InlineResponse20021 addAllItem(Integer allItem) {
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

  public InlineResponse20021 results(List<InlineResponse20021Results> results) {
    this.results = results;
    return this;
  }

  public InlineResponse20021 addResultsItem(InlineResponse20021Results resultsItem) {
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
    public List<InlineResponse20021Results> getResults() {
    return results;
  }

  public void setResults(List<InlineResponse20021Results> results) {
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
    InlineResponse20021 inlineResponse20021 = (InlineResponse20021) o;
    return Objects.equals(this.count, inlineResponse20021.count) &&
        Objects.equals(this.next, inlineResponse20021.next) &&
        Objects.equals(this.previous, inlineResponse20021.previous) &&
        Objects.equals(this.all, inlineResponse20021.all) &&
        Objects.equals(this.results, inlineResponse20021.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, all, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20021 {\n");
    
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
