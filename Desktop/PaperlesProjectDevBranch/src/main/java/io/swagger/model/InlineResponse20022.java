package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.InlineResponse20022Results;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20022
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")


public class InlineResponse20022   {
  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("next")
  private Boolean next = null;

  @JsonProperty("previous")
  private Boolean previous = null;

  @JsonProperty("all")
  @Valid
  private List<Integer> all = new ArrayList<Integer>();

  @JsonProperty("results")
  @Valid
  private List<InlineResponse20022Results> results = new ArrayList<InlineResponse20022Results>();

  public InlineResponse20022 count(Integer count) {
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

  public InlineResponse20022 next(Boolean next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isNext() {
    return next;
  }

  public void setNext(Boolean next) {
    this.next = next;
  }

  public InlineResponse20022 previous(Boolean previous) {
    this.previous = previous;
    return this;
  }

  /**
   * Get previous
   * @return previous
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isPrevious() {
    return previous;
  }

  public void setPrevious(Boolean previous) {
    this.previous = previous;
  }

  public InlineResponse20022 all(List<Integer> all) {
    this.all = all;
    return this;
  }

  public InlineResponse20022 addAllItem(Integer allItem) {
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

  public InlineResponse20022 results(List<InlineResponse20022Results> results) {
    this.results = results;
    return this;
  }

  public InlineResponse20022 addResultsItem(InlineResponse20022Results resultsItem) {
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
    public List<InlineResponse20022Results> getResults() {
    return results;
  }

  public void setResults(List<InlineResponse20022Results> results) {
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
    InlineResponse20022 inlineResponse20022 = (InlineResponse20022) o;
    return Objects.equals(this.count, inlineResponse20022.count) &&
        Objects.equals(this.next, inlineResponse20022.next) &&
        Objects.equals(this.previous, inlineResponse20022.previous) &&
        Objects.equals(this.all, inlineResponse20022.all) &&
        Objects.equals(this.results, inlineResponse20022.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, all, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20022 {\n");
    
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
