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
 * ApiAcknowledgeTasksBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-21T16:54:24.115980863Z[GMT]")


public class ApiAcknowledgeTasksBody   {
  @JsonProperty("tasks")
  @Valid
  private List<Integer> tasks = new ArrayList<Integer>();

  public ApiAcknowledgeTasksBody tasks(List<Integer> tasks) {
    this.tasks = tasks;
    return this;
  }

  public ApiAcknowledgeTasksBody addTasksItem(Integer tasksItem) {
    this.tasks.add(tasksItem);
    return this;
  }

  /**
   * Get tasks
   * @return tasks
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<Integer> getTasks() {
    return tasks;
  }

  public void setTasks(List<Integer> tasks) {
    this.tasks = tasks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiAcknowledgeTasksBody apiAcknowledgeTasksBody = (ApiAcknowledgeTasksBody) o;
    return Objects.equals(this.tasks, apiAcknowledgeTasksBody.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAcknowledgeTasksBody {\n");
    
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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
