package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.InlineResponse20016Results;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20016
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")


public class InlineResponse20016   {
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
  private List<InlineResponse20016Results> results = new ArrayList<InlineResponse20016Results>();

  public InlineResponse20016 count(Integer count) {
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

  public InlineResponse20016 next(Integer next) {
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

  public InlineResponse20016 previous(Integer previous) {
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

  public InlineResponse20016 all(List<Integer> all) {
    this.all = all;
    return this;
  }

  public InlineResponse20016 addAllItem(Integer allItem) {
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

  public InlineResponse20016 results(List<InlineResponse20016Results> results) {
    this.results = results;
    return this;
  }

  public InlineResponse20016 addResultsItem(InlineResponse20016Results resultsItem) {
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
    public List<InlineResponse20016Results> getResults() {
    return results;
  }

  public void setResults(List<InlineResponse20016Results> results) {
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
    InlineResponse20016 inlineResponse20016 = (InlineResponse20016) o;
    return Objects.equals(this.count, inlineResponse20016.count) &&
        Objects.equals(this.next, inlineResponse20016.next) &&
        Objects.equals(this.previous, inlineResponse20016.previous) &&
        Objects.equals(this.all, inlineResponse20016.all) &&
        Objects.equals(this.results, inlineResponse20016.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, all, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20016 {\n");
    
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
