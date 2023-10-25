package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApisavedViewsFilterRules
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class ApisavedViewsFilterRules   {
  @JsonProperty("rule_type")
  private Integer ruleType = null;

  @JsonProperty("value")
  private String value = null;

  public ApisavedViewsFilterRules ruleType(Integer ruleType) {
    this.ruleType = ruleType;
    return this;
  }

  /**
   * Get ruleType
   * @return ruleType
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getRuleType() {
    return ruleType;
  }

  public void setRuleType(Integer ruleType) {
    this.ruleType = ruleType;
  }

  public ApisavedViewsFilterRules value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApisavedViewsFilterRules apisavedViewsFilterRules = (ApisavedViewsFilterRules) o;
    return Objects.equals(this.ruleType, apisavedViewsFilterRules.ruleType) &&
        Objects.equals(this.value, apisavedViewsFilterRules.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApisavedViewsFilterRules {\n");
    
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
