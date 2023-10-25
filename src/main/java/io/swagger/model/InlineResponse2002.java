package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.InlineResponse2002Results;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2002
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class InlineResponse2002   {
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
  private List<InlineResponse2002Results> results = new ArrayList<InlineResponse2002Results>();

  public InlineResponse2002 count(Integer count) {
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

  public InlineResponse2002 next(Integer next) {
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

  public InlineResponse2002 previous(Integer previous) {
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

  public InlineResponse2002 all(List<Integer> all) {
    this.all = all;
    return this;
  }

  public InlineResponse2002 addAllItem(Integer allItem) {
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

  public InlineResponse2002 results(List<InlineResponse2002Results> results) {
    this.results = results;
    return this;
  }

  public InlineResponse2002 addResultsItem(InlineResponse2002Results resultsItem) {
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
    public List<InlineResponse2002Results> getResults() {
    return results;
  }

  public void setResults(List<InlineResponse2002Results> results) {
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
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(this.count, inlineResponse2002.count) &&
        Objects.equals(this.next, inlineResponse2002.next) &&
        Objects.equals(this.previous, inlineResponse2002.previous) &&
        Objects.equals(this.all, inlineResponse2002.all) &&
        Objects.equals(this.results, inlineResponse2002.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, all, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
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
