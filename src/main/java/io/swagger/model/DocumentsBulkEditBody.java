package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DocumentsBulkEditBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class DocumentsBulkEditBody   {
  @JsonProperty("documents")
  @Valid
  private List<Integer> documents = new ArrayList<Integer>();

  @JsonProperty("method")
  private String method = null;

  @JsonProperty("parameters")
  private Object parameters = null;

  public DocumentsBulkEditBody documents(List<Integer> documents) {
    this.documents = documents;
    return this;
  }

  public DocumentsBulkEditBody addDocumentsItem(Integer documentsItem) {
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * Get documents
   * @return documents
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<Integer> getDocuments() {
    return documents;
  }

  public void setDocuments(List<Integer> documents) {
    this.documents = documents;
  }

  public DocumentsBulkEditBody method(String method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public DocumentsBulkEditBody parameters(Object parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Get parameters
   * @return parameters
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Object getParameters() {
    return parameters;
  }

  public void setParameters(Object parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentsBulkEditBody documentsBulkEditBody = (DocumentsBulkEditBody) o;
    return Objects.equals(this.documents, documentsBulkEditBody.documents) &&
        Objects.equals(this.method, documentsBulkEditBody.method) &&
        Objects.equals(this.parameters, documentsBulkEditBody.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documents, method, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentsBulkEditBody {\n");
    
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
