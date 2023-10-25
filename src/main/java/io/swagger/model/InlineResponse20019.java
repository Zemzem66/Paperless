package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20019
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class InlineResponse20019   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("task_id")
  private String taskId = null;

  @JsonProperty("task_file_name")
  private String taskFileName = null;

  @JsonProperty("date_created")
  private String dateCreated = null;

  @JsonProperty("date_done")
  private String dateDone = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("result")
  private String result = null;

  @JsonProperty("acknowledged")
  private Boolean acknowledged = null;

  @JsonProperty("related_document")
  private String relatedDocument = null;

  public InlineResponse20019 id(Integer id) {
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

  public InlineResponse20019 taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   * @return taskId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public InlineResponse20019 taskFileName(String taskFileName) {
    this.taskFileName = taskFileName;
    return this;
  }

  /**
   * Get taskFileName
   * @return taskFileName
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getTaskFileName() {
    return taskFileName;
  }

  public void setTaskFileName(String taskFileName) {
    this.taskFileName = taskFileName;
  }

  public InlineResponse20019 dateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * Get dateCreated
   * @return dateCreated
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }

  public InlineResponse20019 dateDone(String dateDone) {
    this.dateDone = dateDone;
    return this;
  }

  /**
   * Get dateDone
   * @return dateDone
   **/
  @Schema(description = "")
  
    public String getDateDone() {
    return dateDone;
  }

  public void setDateDone(String dateDone) {
    this.dateDone = dateDone;
  }

  public InlineResponse20019 type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public InlineResponse20019 status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InlineResponse20019 result(String result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public InlineResponse20019 acknowledged(Boolean acknowledged) {
    this.acknowledged = acknowledged;
    return this;
  }

  /**
   * Get acknowledged
   * @return acknowledged
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isAcknowledged() {
    return acknowledged;
  }

  public void setAcknowledged(Boolean acknowledged) {
    this.acknowledged = acknowledged;
  }

  public InlineResponse20019 relatedDocument(String relatedDocument) {
    this.relatedDocument = relatedDocument;
    return this;
  }

  /**
   * Get relatedDocument
   * @return relatedDocument
   **/
  @Schema(description = "")
  
    public String getRelatedDocument() {
    return relatedDocument;
  }

  public void setRelatedDocument(String relatedDocument) {
    this.relatedDocument = relatedDocument;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20019 inlineResponse20019 = (InlineResponse20019) o;
    return Objects.equals(this.id, inlineResponse20019.id) &&
        Objects.equals(this.taskId, inlineResponse20019.taskId) &&
        Objects.equals(this.taskFileName, inlineResponse20019.taskFileName) &&
        Objects.equals(this.dateCreated, inlineResponse20019.dateCreated) &&
        Objects.equals(this.dateDone, inlineResponse20019.dateDone) &&
        Objects.equals(this.type, inlineResponse20019.type) &&
        Objects.equals(this.status, inlineResponse20019.status) &&
        Objects.equals(this.result, inlineResponse20019.result) &&
        Objects.equals(this.acknowledged, inlineResponse20019.acknowledged) &&
        Objects.equals(this.relatedDocument, inlineResponse20019.relatedDocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, taskId, taskFileName, dateCreated, dateDone, type, status, result, acknowledged, relatedDocument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20019 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskFileName: ").append(toIndentedString(taskFileName)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateDone: ").append(toIndentedString(dateDone)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    acknowledged: ").append(toIndentedString(acknowledged)).append("\n");
    sb.append("    relatedDocument: ").append(toIndentedString(relatedDocument)).append("\n");
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
