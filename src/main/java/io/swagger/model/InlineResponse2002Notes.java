package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2002Notes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class InlineResponse2002Notes   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("created")
  private String created = null;

  @JsonProperty("document")
  private Integer document = null;

  @JsonProperty("user")
  private Integer user = null;

  public InlineResponse2002Notes id(Integer id) {
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

  public InlineResponse2002Notes note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Get note
   * @return note
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public InlineResponse2002Notes created(String created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public InlineResponse2002Notes document(Integer document) {
    this.document = document;
    return this;
  }

  /**
   * Get document
   * @return document
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getDocument() {
    return document;
  }

  public void setDocument(Integer document) {
    this.document = document;
  }

  public InlineResponse2002Notes user(Integer user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getUser() {
    return user;
  }

  public void setUser(Integer user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002Notes inlineResponse2002Notes = (InlineResponse2002Notes) o;
    return Objects.equals(this.id, inlineResponse2002Notes.id) &&
        Objects.equals(this.note, inlineResponse2002Notes.note) &&
        Objects.equals(this.created, inlineResponse2002Notes.created) &&
        Objects.equals(this.document, inlineResponse2002Notes.document) &&
        Objects.equals(this.user, inlineResponse2002Notes.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, note, created, document, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002Notes {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
