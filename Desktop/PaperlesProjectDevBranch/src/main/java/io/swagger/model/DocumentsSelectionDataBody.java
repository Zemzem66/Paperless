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
 * DocumentsSelectionDataBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")


public class DocumentsSelectionDataBody   {
  @JsonProperty("documents")
  @Valid
  private List<Integer> documents = new ArrayList<Integer>();

  public DocumentsSelectionDataBody documents(List<Integer> documents) {
    this.documents = documents;
    return this;
  }

  public DocumentsSelectionDataBody addDocumentsItem(Integer documentsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentsSelectionDataBody documentsSelectionDataBody = (DocumentsSelectionDataBody) o;
    return Objects.equals(this.documents, documentsSelectionDataBody.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentsSelectionDataBody {\n");
    
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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
