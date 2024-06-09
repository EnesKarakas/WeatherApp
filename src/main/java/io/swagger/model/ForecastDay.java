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
 * ForecastDay
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-06T14:20:51.790816423Z[GMT]")
@JsonInclude(Include.NON_NULL)
public class ForecastDay {
  @JsonProperty("date")
  private String date = null;

  @JsonProperty("date_epoch")
  private Integer dateEpoch = null;

  @JsonProperty("day")
  private DayCondition day = new DayCondition();

  @JsonProperty("astro")
  private Astro astro = new Astro();

  @JsonProperty("hour")
  @Valid
  private List<HourCondition> hour = null;

  public ForecastDay date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * 
   * @return date
   **/
  @Schema(description = "")
  @NotNull

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public ForecastDay dateEpoch(Integer dateEpoch) {
    this.dateEpoch = dateEpoch;
    return this;
  }

  /**
   * Get dateEpoch
   * 
   * @return dateEpoch
   **/
  @Schema(description = "")
  @NotNull

  public Integer getDateEpoch() {
    return dateEpoch;
  }

  public void setDateEpoch(Integer dateEpoch) {
    this.dateEpoch = dateEpoch;
  }

  public ForecastDay day(DayCondition day) {
    this.day = day;
    return this;
  }

  /**
   * Get day
   * 
   * @return day
   **/
  @Schema(description = "")
  @NotNull

  @Valid
  public DayCondition getDay() {
    return day;
  }

  public void setDay(DayCondition day) {
    this.day = day;
  }

  public ForecastDay astro(Astro astro) {
    this.astro = astro;
    return this;
  }

  /**
   * Get astro
   * 
   * @return astro
   **/
  @Schema(description = "")
  @NotNull

  @Valid
  public Astro getAstro() {
    return astro;
  }

  public void setAstro(Astro astro) {
    this.astro = astro;
  }

  public ForecastDay hour(List<HourCondition> hour) {
    this.hour = hour;
    return this;
  }

  public ForecastDay addHourItem(HourCondition hourItem) {
    if (this.hour == null) {
      this.hour = new ArrayList<HourCondition>();
    }
    this.hour.add(hourItem);
    return this;
  }

  /**
   * Get hour
   * 
   * @return hour
   **/
  @Schema(description = "")
  @NotNull
  @Valid
  public List<HourCondition> getHour() {
    return hour;
  }

  public void setHour(List<HourCondition> hour) {
    this.hour = hour;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastDay forecastDay = (ForecastDay) o;
    return Objects.equals(this.date, forecastDay.date) &&
        Objects.equals(this.dateEpoch, forecastDay.dateEpoch) &&
        Objects.equals(this.day, forecastDay.day) &&
        Objects.equals(this.astro, forecastDay.astro) &&
        Objects.equals(this.hour, forecastDay.hour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, dateEpoch, day, astro, hour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastDay {\n");

    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateEpoch: ").append(toIndentedString(dateEpoch)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    astro: ").append(toIndentedString(astro)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
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
