package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WeatherResponseForecast
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-06T14:20:51.790816423Z[GMT]")
@JsonInclude(Include.NON_NULL)
public class WeatherResponseForecast {
  @JsonProperty("forecastday")
  @Valid
  private List<ForecastDay> forecastday = new ArrayList<>();

  public WeatherResponseForecast forecastday(List<ForecastDay> forecastday) {
    this.forecastday = forecastday;
    return this;
  }

  public WeatherResponseForecast addForecastdayItem(ForecastDay forecastdayItem) {
    if (this.forecastday == null) {
      this.forecastday = new ArrayList<ForecastDay>();
    }
    this.forecastday.add(forecastdayItem);
    return this;
  }

  /**
   * Get forecastday
   * 
   * @return forecastday
   **/
  @Schema(description = "")
  @NotNull
  @Valid
  public List<ForecastDay> getForecastday() {
    return forecastday;
  }

  public void setForecastday(List<ForecastDay> forecastday) {
    this.forecastday = forecastday;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeatherResponseForecast weatherResponseForecast = (WeatherResponseForecast) o;
    return Objects.equals(this.forecastday, weatherResponseForecast.forecastday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forecastday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeatherResponseForecast {\n");

    sb.append("    forecastday: ").append(toIndentedString(forecastday)).append("\n");
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
