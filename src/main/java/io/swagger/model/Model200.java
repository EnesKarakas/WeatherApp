package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Model200
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-04T09:41:03.559554872Z[GMT]")
@JsonInclude(Include.NON_NULL)
public class Model200 {

  @JsonProperty("location")
  private Location location = new Location();

  @JsonProperty("current")
  private Current current = new Current();

  public Model200 location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * 
   * @return location
   **/
  @Schema(description = "")
  @NotNull

  @Valid
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Model200 current(Current current) {
    this.current = current;
    return this;
  }

  /**
   * Get current
   * 
   * @return current
   **/
  @Schema(description = "")
  @NotNull

  @Valid
  public Current getCurrent() {
    return current;
  }

  public void setCurrent(Current current) {
    this.current = current;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model200 _200 = (Model200) o;
    return Objects.equals(this.location, _200.location) &&
        Objects.equals(this.current, _200.current);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, current);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model200 {\n");

    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
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
