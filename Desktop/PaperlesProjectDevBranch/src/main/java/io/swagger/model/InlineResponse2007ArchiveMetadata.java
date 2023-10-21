package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2007ArchiveMetadata
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")


public class InlineResponse2007ArchiveMetadata   {
  @JsonProperty("namespace")
  private String namespace = null;

  @JsonProperty("prefix")
  private String prefix = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("value")
  private String value = null;

  public InlineResponse2007ArchiveMetadata namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Get namespace
   * @return namespace
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public InlineResponse2007ArchiveMetadata prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Get prefix
   * @return prefix
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public InlineResponse2007ArchiveMetadata key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public InlineResponse2007ArchiveMetadata value(String value) {
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
    InlineResponse2007ArchiveMetadata inlineResponse2007ArchiveMetadata = (InlineResponse2007ArchiveMetadata) o;
    return Objects.equals(this.namespace, inlineResponse2007ArchiveMetadata.namespace) &&
        Objects.equals(this.prefix, inlineResponse2007ArchiveMetadata.prefix) &&
        Objects.equals(this.key, inlineResponse2007ArchiveMetadata.key) &&
        Objects.equals(this.value, inlineResponse2007ArchiveMetadata.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, prefix, key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007ArchiveMetadata {\n");
    
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
