package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.*;

/**
 * WeatherCondition
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-04T09:41:03.559554872Z[GMT]")

@JsonInclude(Include.NON_NULL)
public class WeatherCondition {
  @JsonProperty("text")
  private String text = null;

  @JsonProperty("icon")
  private String icon = null;

  @JsonProperty("code")
  private Integer code = null;

  public WeatherCondition text(String text) {
    this.text = text;
    return this;
  }

  /**
   * weather text
   * 
   * @return text
   **/
  @Schema(example = "overcast", description = "weather text")
  @NotNull

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public WeatherCondition icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * current time
   * 
   * @return icon
   **/
  @Schema(example = "//cdn.weatherapi.com/weather/64x64/day/116.png", description = "current time")
  @NotNull

  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public WeatherCondition code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * updated epoch
   * 
   * @return code
   **/
  @Schema(example = "1003", description = "updated epoch")
  @NotNull

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeatherCondition weatherCondition = (WeatherCondition) o;
    return Objects.equals(this.text, weatherCondition.text) &&
        Objects.equals(this.icon, weatherCondition.icon) &&
        Objects.equals(this.code, weatherCondition.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, icon, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeatherCondition {\n");

    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
