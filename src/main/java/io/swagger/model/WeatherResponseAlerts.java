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
 * WeatherResponseAlerts
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-06T13:05:28.829911948Z[GMT]")

@JsonInclude(Include.NON_NULL)
public class WeatherResponseAlerts {
  @JsonProperty("alert")
  @Valid
  private List<Alerts> alert = null;

  public WeatherResponseAlerts alert(List<Alerts> alert) {
    this.alert = alert;
    return this;
  }

  public WeatherResponseAlerts addAlertItem(Alerts alertItem) {
    if (this.alert == null) {
      this.alert = new ArrayList<Alerts>();
    }
    this.alert.add(alertItem);
    return this;
  }

  /**
   * Get alert
   * 
   * @return alert
   **/
  @Schema(description = "")
  @NotNull
  @Valid
  public List<Alerts> getAlert() {
    return alert;
  }

  public void setAlert(List<Alerts> alert) {
    this.alert = alert;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeatherResponseAlerts weatherResponseAlerts = (WeatherResponseAlerts) o;
    return Objects.equals(this.alert, weatherResponseAlerts.alert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeatherResponseAlerts {\n");

    sb.append("    alert: ").append(toIndentedString(alert)).append("\n");
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
