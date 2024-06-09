package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-08T14:34:21.706302463Z[GMT]")

@JsonInclude(Include.NON_NULL)
public class InlineResponse200 {
  @JsonProperty("latitude")
  private Float latitude = null;

  @JsonProperty("longitude")
  private Float longitude = null;

  @JsonProperty("generationtime_ms")
  private Float generationtimeMs = null;

  @JsonProperty("utc_offset_seconds")
  private Integer utcOffsetSeconds = null;

  @JsonProperty("timezone")
  private String timezone = null;

  @JsonProperty("timezone_abbreviation")
  private String timezoneAbbreviation = null;

  @JsonProperty("elevation")
  private Integer elevation = null;

  @JsonProperty("hourly_units")
  private Object hourlyUnits = null;

  @JsonProperty("hourly")
  private Object hourly = null;

  @JsonProperty("daily_units")
  private Object dailyUnits = null;

  @JsonProperty("daily")
  private Object daily = null;

  public InlineResponse200 latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * 
   * @return latitude
   **/
  @Schema(description = "")
  @NotNull

  public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public InlineResponse200 longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * 
   * @return longitude
   **/
  @Schema(description = "")
  @NotNull

  public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  public InlineResponse200 generationtimeMs(Float generationtimeMs) {
    this.generationtimeMs = generationtimeMs;
    return this;
  }

  /**
   * Get generationtimeMs
   * 
   * @return generationtimeMs
   **/
  @Schema(description = "")
  @NotNull

  public Float getGenerationtimeMs() {
    return generationtimeMs;
  }

  public void setGenerationtimeMs(Float generationtimeMs) {
    this.generationtimeMs = generationtimeMs;
  }

  public InlineResponse200 utcOffsetSeconds(Integer utcOffsetSeconds) {
    this.utcOffsetSeconds = utcOffsetSeconds;
    return this;
  }

  /**
   * Get utcOffsetSeconds
   * 
   * @return utcOffsetSeconds
   **/
  @Schema(description = "")
  @NotNull

  public Integer getUtcOffsetSeconds() {
    return utcOffsetSeconds;
  }

  public void setUtcOffsetSeconds(Integer utcOffsetSeconds) {
    this.utcOffsetSeconds = utcOffsetSeconds;
  }

  public InlineResponse200 timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Get timezone
   * 
   * @return timezone
   **/
  @Schema(description = "")
  @NotNull

  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public InlineResponse200 timezoneAbbreviation(String timezoneAbbreviation) {
    this.timezoneAbbreviation = timezoneAbbreviation;
    return this;
  }

  /**
   * Get timezoneAbbreviation
   * 
   * @return timezoneAbbreviation
   **/
  @Schema(description = "")
  @NotNull

  public String getTimezoneAbbreviation() {
    return timezoneAbbreviation;
  }

  public void setTimezoneAbbreviation(String timezoneAbbreviation) {
    this.timezoneAbbreviation = timezoneAbbreviation;
  }

  public InlineResponse200 elevation(Integer elevation) {
    this.elevation = elevation;
    return this;
  }

  /**
   * Get elevation
   * 
   * @return elevation
   **/
  @Schema(description = "")
  @NotNull

  public Integer getElevation() {
    return elevation;
  }

  public void setElevation(Integer elevation) {
    this.elevation = elevation;
  }

  public InlineResponse200 hourlyUnits(Object hourlyUnits) {
    this.hourlyUnits = hourlyUnits;
    return this;
  }

  /**
   * Get hourlyUnits
   * 
   * @return hourlyUnits
   **/
  @Schema(description = "")
  @NotNull

  public Object getHourlyUnits() {
    return hourlyUnits;
  }

  public void setHourlyUnits(Object hourlyUnits) {
    this.hourlyUnits = hourlyUnits;
  }

  public InlineResponse200 hourly(Object hourly) {
    this.hourly = hourly;
    return this;
  }

  /**
   * Get hourly
   * 
   * @return hourly
   **/
  @Schema(description = "")
  @NotNull

  public Object getHourly() {
    return hourly;
  }

  public void setHourly(Object hourly) {
    this.hourly = hourly;
  }

  public InlineResponse200 dailyUnits(Object dailyUnits) {
    this.dailyUnits = dailyUnits;
    return this;
  }

  /**
   * Get dailyUnits
   * 
   * @return dailyUnits
   **/
  @Schema(description = "")
  @NotNull

  public Object getDailyUnits() {
    return dailyUnits;
  }

  public void setDailyUnits(Object dailyUnits) {
    this.dailyUnits = dailyUnits;
  }

  public InlineResponse200 daily(Object daily) {
    this.daily = daily;
    return this;
  }

  /**
   * Get daily
   * 
   * @return daily
   **/
  @Schema(description = "")
  @NotNull

  public Object getDaily() {
    return daily;
  }

  public void setDaily(Object daily) {
    this.daily = daily;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.latitude, inlineResponse200.latitude) &&
        Objects.equals(this.longitude, inlineResponse200.longitude) &&
        Objects.equals(this.generationtimeMs, inlineResponse200.generationtimeMs) &&
        Objects.equals(this.utcOffsetSeconds, inlineResponse200.utcOffsetSeconds) &&
        Objects.equals(this.timezone, inlineResponse200.timezone) &&
        Objects.equals(this.timezoneAbbreviation, inlineResponse200.timezoneAbbreviation) &&
        Objects.equals(this.elevation, inlineResponse200.elevation) &&
        Objects.equals(this.hourlyUnits, inlineResponse200.hourlyUnits) &&
        Objects.equals(this.hourly, inlineResponse200.hourly) &&
        Objects.equals(this.dailyUnits, inlineResponse200.dailyUnits) &&
        Objects.equals(this.daily, inlineResponse200.daily);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, generationtimeMs, utcOffsetSeconds, timezone, timezoneAbbreviation,
        elevation, hourlyUnits, hourly, dailyUnits, daily);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");

    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    generationtimeMs: ").append(toIndentedString(generationtimeMs)).append("\n");
    sb.append("    utcOffsetSeconds: ").append(toIndentedString(utcOffsetSeconds)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    timezoneAbbreviation: ").append(toIndentedString(timezoneAbbreviation)).append("\n");
    sb.append("    elevation: ").append(toIndentedString(elevation)).append("\n");
    sb.append("    hourlyUnits: ").append(toIndentedString(hourlyUnits)).append("\n");
    sb.append("    hourly: ").append(toIndentedString(hourly)).append("\n");
    sb.append("    dailyUnits: ").append(toIndentedString(dailyUnits)).append("\n");
    sb.append("    daily: ").append(toIndentedString(daily)).append("\n");
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
