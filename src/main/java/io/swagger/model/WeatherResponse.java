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
 * WeatherResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-06T14:20:51.790816423Z[GMT]")

@JsonInclude(Include.NON_NULL)
public class WeatherResponse {
  @JsonProperty("forecast")
  private WeatherResponseForecast forecast = null;

  public WeatherResponse forecast(WeatherResponseForecast forecast) {
    this.forecast = forecast;
    return this;
  }

  /**
   * Get forecast
   * 
   * @return forecast
   **/
  @Schema(description = "")
  @NotNull

  @Valid
  public WeatherResponseForecast getForecast() {
    return forecast;
  }

  public void setForecast(WeatherResponseForecast forecast) {
    this.forecast = forecast;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeatherResponse weatherResponse = (WeatherResponse) o;
    return Objects.equals(this.forecast, weatherResponse.forecast);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forecast);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeatherResponse {\n");

    sb.append("    forecast: ").append(toIndentedString(forecast)).append("\n");
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
