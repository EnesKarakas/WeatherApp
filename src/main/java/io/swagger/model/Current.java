package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Weather
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-04T09:41:03.559554872Z[GMT]")

@JsonInclude(Include.NON_NULL)
public class Current {
  @JsonProperty("last_updated_epoch")
  private Integer lastUpdatedEpoch = null;

  @JsonProperty("last_updated")
  private String lastUpdated = null;

  @JsonProperty("temp_c")
  private BigDecimal tempC = null;

  @JsonProperty("temp_f")
  private BigDecimal tempF = null;

  @JsonProperty("id_day")
  private BigDecimal idDay = null;

  @JsonProperty("condition")
  private WeatherCondition condition = null;

  @JsonProperty("wind_mph")
  private BigDecimal windMph = null;

  @JsonProperty("wind_kph")
  private BigDecimal windKph = null;

  @JsonProperty("wind_degree")
  private Integer windDegree = null;

  @JsonProperty("wind_dir")
  private String windDir = null;

  @JsonProperty("pressure_mb")
  private BigDecimal pressureMb = null;

  @JsonProperty("pressure_in")
  private BigDecimal pressureIn = null;

  @JsonProperty("precip_mm")
  private BigDecimal precipMm = null;

  @JsonProperty("precip_in")
  private BigDecimal precipIn = null;

  @JsonProperty("humidity")
  private Integer humidity = null;

  @JsonProperty("cloud")
  private Integer cloud = null;

  @JsonProperty("feelslike_c")
  private BigDecimal feelslikeC = null;

  @JsonProperty("feelslike_f")
  private BigDecimal feelslikeF = null;

  @JsonProperty("windchill_c")
  private BigDecimal windchillC = null;

  @JsonProperty("windchill_f")
  private BigDecimal windchillF = null;

  @JsonProperty("heatindex_c")
  private Integer heatindexC = null;

  @JsonProperty("heatindex_f")
  private BigDecimal heatindexF = null;

  @JsonProperty("dewpoint_c")
  private BigDecimal dewpointC = null;

  @JsonProperty("dewpoint_f")
  private BigDecimal dewpointF = null;

  @JsonProperty("vis_km")
  private BigDecimal visKm = null;

  @JsonProperty("vis_miles")
  private BigDecimal visMiles = null;

  @JsonProperty("uv")
  private BigDecimal uv = null;

  @JsonProperty("gust_mph")
  private BigDecimal gustMph = null;

  @JsonProperty("gust_kph")
  private BigDecimal gustKph = null;

  @JsonProperty("air_quality")
  private WeatherAirQuality airQuality = null;

  public Current lastUpdatedEpoch(Integer lastUpdatedEpoch) {
    this.lastUpdatedEpoch = lastUpdatedEpoch;
    return this;
  }

  /**
   * uptated epoch
   * 
   * @return lastUpdatedEpoch
   **/
  @Schema(example = "1238213521", description = "uptated epoch")
  @NotNull

  public Integer getLastUpdatedEpoch() {
    return lastUpdatedEpoch;
  }

  public void setLastUpdatedEpoch(Integer lastUpdatedEpoch) {
    this.lastUpdatedEpoch = lastUpdatedEpoch;
  }

  public Current lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * last updated
   * 
   * @return lastUpdated
   **/
  @Schema(example = "2001-10-09 10:07", description = "last updated")
  @NotNull

  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public Current tempC(BigDecimal tempC) {
    this.tempC = tempC;
    return this;
  }

  /**
   * temperature celcius
   * 
   * @return tempC
   **/
  @Schema(example = "8.3", description = "temperature celcius")
  @NotNull

  @Valid
  public BigDecimal getTempC() {
    return tempC;
  }

  public void setTempC(BigDecimal tempC) {
    this.tempC = tempC;
  }

  public Current tempF(BigDecimal tempF) {
    this.tempF = tempF;
    return this;
  }

  /**
   * temperature fahrenheit
   * 
   * @return tempF
   **/
  @Schema(example = "8.8", description = "temperature fahrenheit")
  @NotNull

  @Valid
  public BigDecimal getTempF() {
    return tempF;
  }

  public void setTempF(BigDecimal tempF) {
    this.tempF = tempF;
  }

  public Current idDay(BigDecimal idDay) {
    this.idDay = idDay;
    return this;
  }

  /**
   * day id
   * 
   * @return idDay
   **/
  @Schema(example = "803.29", description = "day id")
  @NotNull

  @Valid
  public BigDecimal getIdDay() {
    return idDay;
  }

  public void setIdDay(BigDecimal idDay) {
    this.idDay = idDay;
  }

  public Current condition(WeatherCondition condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Get condition
   * 
   * @return condition
   **/
  @Schema(description = "")
  @NotNull

  @Valid
  public WeatherCondition getCondition() {
    return condition;
  }

  public void setCondition(WeatherCondition condition) {
    this.condition = condition;
  }

  public Current windMph(BigDecimal windMph) {
    this.windMph = windMph;
    return this;
  }

  /**
   * Get windMph
   * 
   * @return windMph
   **/
  @Schema(example = "80.39", description = "")
  @NotNull

  @Valid
  public BigDecimal getWindMph() {
    return windMph;
  }

  public void setWindMph(BigDecimal windMph) {
    this.windMph = windMph;
  }

  public Current windKph(BigDecimal windKph) {
    this.windKph = windKph;
    return this;
  }

  /**
   * Get windKph
   * 
   * @return windKph
   **/
  @Schema(example = "803.29", description = "")
  @NotNull

  @Valid
  public BigDecimal getWindKph() {
    return windKph;
  }

  public void setWindKph(BigDecimal windKph) {
    this.windKph = windKph;
  }

  public Current windDegree(Integer windDegree) {
    this.windDegree = windDegree;
    return this;
  }

  /**
   * Get windDegree
   * 
   * @return windDegree
   **/
  @Schema(example = "803234", description = "")
  @NotNull

  public Integer getWindDegree() {
    return windDegree;
  }

  public void setWindDegree(Integer windDegree) {
    this.windDegree = windDegree;
  }

  public Current windDir(String windDir) {
    this.windDir = windDir;
    return this;
  }

  /**
   * Get windDir
   * 
   * @return windDir
   **/
  @Schema(example = "SSE", description = "")
  @NotNull

  public String getWindDir() {
    return windDir;
  }

  public void setWindDir(String windDir) {
    this.windDir = windDir;
  }

  public Current pressureMb(BigDecimal pressureMb) {
    this.pressureMb = pressureMb;
    return this;
  }

  /**
   * Get pressureMb
   * 
   * @return pressureMb
   **/
  @Schema(example = "86.5", description = "")
  @NotNull

  @Valid
  public BigDecimal getPressureMb() {
    return pressureMb;
  }

  public void setPressureMb(BigDecimal pressureMb) {
    this.pressureMb = pressureMb;
  }

  public Current pressureIn(BigDecimal pressureIn) {
    this.pressureIn = pressureIn;
    return this;
  }

  /**
   * Get pressureIn
   * 
   * @return pressureIn
   **/
  @Schema(example = "803.3841", description = "")
  @NotNull

  @Valid
  public BigDecimal getPressureIn() {
    return pressureIn;
  }

  public void setPressureIn(BigDecimal pressureIn) {
    this.pressureIn = pressureIn;
  }

  public Current precipMm(BigDecimal precipMm) {
    this.precipMm = precipMm;
    return this;
  }

  /**
   * Get precipMm
   * 
   * @return precipMm
   **/
  @Schema(example = "803.438", description = "")
  @NotNull

  @Valid
  public BigDecimal getPrecipMm() {
    return precipMm;
  }

  public void setPrecipMm(BigDecimal precipMm) {
    this.precipMm = precipMm;
  }

  public Current precipIn(BigDecimal precipIn) {
    this.precipIn = precipIn;
    return this;
  }

  /**
   * Get precipIn
   * 
   * @return precipIn
   **/
  @Schema(example = "803.473", description = "")
  @NotNull

  @Valid
  public BigDecimal getPrecipIn() {
    return precipIn;
  }

  public void setPrecipIn(BigDecimal precipIn) {
    this.precipIn = precipIn;
  }

  public Current humidity(Integer humidity) {
    this.humidity = humidity;
    return this;
  }

  /**
   * Get humidity
   * 
   * @return humidity
   **/
  @Schema(example = "8039", description = "")
  @NotNull

  public Integer getHumidity() {
    return humidity;
  }

  public void setHumidity(Integer humidity) {
    this.humidity = humidity;
  }

  public Current cloud(Integer cloud) {
    this.cloud = cloud;
    return this;
  }

  /**
   * Get cloud
   * 
   * @return cloud
   **/
  @Schema(example = "80338", description = "")
  @NotNull

  public Integer getCloud() {
    return cloud;
  }

  public void setCloud(Integer cloud) {
    this.cloud = cloud;
  }

  public Current feelslikeC(BigDecimal feelslikeC) {
    this.feelslikeC = feelslikeC;
    return this;
  }

  /**
   * Get feelslikeC
   * 
   * @return feelslikeC
   **/
  @Schema(example = "803.463", description = "")
  @NotNull

  @Valid
  public BigDecimal getFeelslikeC() {
    return feelslikeC;
  }

  public void setFeelslikeC(BigDecimal feelslikeC) {
    this.feelslikeC = feelslikeC;
  }

  public Current feelslikeF(BigDecimal feelslikeF) {
    this.feelslikeF = feelslikeF;
    return this;
  }

  /**
   * Get feelslikeF
   * 
   * @return feelslikeF
   **/
  @Schema(example = "803.463", description = "")
  @NotNull

  @Valid
  public BigDecimal getFeelslikeF() {
    return feelslikeF;
  }

  public void setFeelslikeF(BigDecimal feelslikeF) {
    this.feelslikeF = feelslikeF;
  }

  public Current windchillC(BigDecimal windchillC) {
    this.windchillC = windchillC;
    return this;
  }

  /**
   * Get windchillC
   * 
   * @return windchillC
   **/
  @Schema(example = "803.367", description = "")
  @NotNull

  @Valid
  public BigDecimal getWindchillC() {
    return windchillC;
  }

  public void setWindchillC(BigDecimal windchillC) {
    this.windchillC = windchillC;
  }

  public Current windchillF(BigDecimal windchillF) {
    this.windchillF = windchillF;
    return this;
  }

  /**
   * Get windchillF
   * 
   * @return windchillF
   **/
  @Schema(example = "803.478", description = "")
  @NotNull

  @Valid
  public BigDecimal getWindchillF() {
    return windchillF;
  }

  public void setWindchillF(BigDecimal windchillF) {
    this.windchillF = windchillF;
  }

  public Current heatindexC(Integer heatindexC) {
    this.heatindexC = heatindexC;
    return this;
  }

  /**
   * Get heatindexC
   * 
   * @return heatindexC
   **/
  @Schema(example = "803287", description = "")
  @NotNull

  public Integer getHeatindexC() {
    return heatindexC;
  }

  public void setHeatindexC(Integer heatindexC) {
    this.heatindexC = heatindexC;
  }

  public Current heatindexF(BigDecimal heatindexF) {
    this.heatindexF = heatindexF;
    return this;
  }

  /**
   * Get heatindexF
   * 
   * @return heatindexF
   **/
  @Schema(example = "803.736", description = "")
  @NotNull

  @Valid
  public BigDecimal getHeatindexF() {
    return heatindexF;
  }

  public void setHeatindexF(BigDecimal heatindexF) {
    this.heatindexF = heatindexF;
  }

  public Current dewpointC(BigDecimal dewpointC) {
    this.dewpointC = dewpointC;
    return this;
  }

  /**
   * Get dewpointC
   * 
   * @return dewpointC
   **/
  @Schema(example = "803.83", description = "")
  @NotNull

  @Valid
  public BigDecimal getDewpointC() {
    return dewpointC;
  }

  public void setDewpointC(BigDecimal dewpointC) {
    this.dewpointC = dewpointC;
  }

  public Current dewpointF(BigDecimal dewpointF) {
    this.dewpointF = dewpointF;
    return this;
  }

  /**
   * Get dewpointF
   * 
   * @return dewpointF
   **/
  @Schema(example = "803.38", description = "")
  @NotNull

  @Valid
  public BigDecimal getDewpointF() {
    return dewpointF;
  }

  public void setDewpointF(BigDecimal dewpointF) {
    this.dewpointF = dewpointF;
  }

  public Current visKm(BigDecimal visKm) {
    this.visKm = visKm;
    return this;
  }

  /**
   * Get visKm
   * 
   * @return visKm
   **/
  @Schema(example = "803.37", description = "")
  @NotNull

  @Valid
  public BigDecimal getVisKm() {
    return visKm;
  }

  public void setVisKm(BigDecimal visKm) {
    this.visKm = visKm;
  }

  public Current visMiles(BigDecimal visMiles) {
    this.visMiles = visMiles;
    return this;
  }

  /**
   * Get visMiles
   * 
   * @return visMiles
   **/
  @Schema(example = "803.48", description = "")
  @NotNull

  @Valid
  public BigDecimal getVisMiles() {
    return visMiles;
  }

  public void setVisMiles(BigDecimal visMiles) {
    this.visMiles = visMiles;
  }

  public Current uv(BigDecimal uv) {
    this.uv = uv;
    return this;
  }

  /**
   * Get uv
   * 
   * @return uv
   **/
  @Schema(example = "803.473", description = "")
  @NotNull

  @Valid
  public BigDecimal getUv() {
    return uv;
  }

  public void setUv(BigDecimal uv) {
    this.uv = uv;
  }

  public Current gustMph(BigDecimal gustMph) {
    this.gustMph = gustMph;
    return this;
  }

  /**
   * Get gustMph
   * 
   * @return gustMph
   **/
  @Schema(example = "803.37", description = "")
  @NotNull

  @Valid
  public BigDecimal getGustMph() {
    return gustMph;
  }

  public void setGustMph(BigDecimal gustMph) {
    this.gustMph = gustMph;
  }

  public Current gustKph(BigDecimal gustKph) {
    this.gustKph = gustKph;
    return this;
  }

  /**
   * Get gustKph
   * 
   * @return gustKph
   **/
  @Schema(example = "803.3662", description = "")
  @NotNull

  @Valid
  public BigDecimal getGustKph() {
    return gustKph;
  }

  public void setGustKph(BigDecimal gustKph) {
    this.gustKph = gustKph;
  }

  public Current airQuality(WeatherAirQuality airQuality) {
    this.airQuality = airQuality;
    return this;
  }

  /**
   * Get airQuality
   * 
   * @return airQuality
   **/
  @Schema(description = "")
  @NotNull

  @Valid
  public WeatherAirQuality getAirQuality() {
    return airQuality;
  }

  public void setAirQuality(WeatherAirQuality airQuality) {
    this.airQuality = airQuality;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Current weather = (Current) o;
    return Objects.equals(this.lastUpdatedEpoch, weather.lastUpdatedEpoch) &&
        Objects.equals(this.lastUpdated, weather.lastUpdated) &&
        Objects.equals(this.tempC, weather.tempC) &&
        Objects.equals(this.tempF, weather.tempF) &&
        Objects.equals(this.idDay, weather.idDay) &&
        Objects.equals(this.condition, weather.condition) &&
        Objects.equals(this.windMph, weather.windMph) &&
        Objects.equals(this.windKph, weather.windKph) &&
        Objects.equals(this.windDegree, weather.windDegree) &&
        Objects.equals(this.windDir, weather.windDir) &&
        Objects.equals(this.pressureMb, weather.pressureMb) &&
        Objects.equals(this.pressureIn, weather.pressureIn) &&
        Objects.equals(this.precipMm, weather.precipMm) &&
        Objects.equals(this.precipIn, weather.precipIn) &&
        Objects.equals(this.humidity, weather.humidity) &&
        Objects.equals(this.cloud, weather.cloud) &&
        Objects.equals(this.feelslikeC, weather.feelslikeC) &&
        Objects.equals(this.feelslikeF, weather.feelslikeF) &&
        Objects.equals(this.windchillC, weather.windchillC) &&
        Objects.equals(this.windchillF, weather.windchillF) &&
        Objects.equals(this.heatindexC, weather.heatindexC) &&
        Objects.equals(this.heatindexF, weather.heatindexF) &&
        Objects.equals(this.dewpointC, weather.dewpointC) &&
        Objects.equals(this.dewpointF, weather.dewpointF) &&
        Objects.equals(this.visKm, weather.visKm) &&
        Objects.equals(this.visMiles, weather.visMiles) &&
        Objects.equals(this.uv, weather.uv) &&
        Objects.equals(this.gustMph, weather.gustMph) &&
        Objects.equals(this.gustKph, weather.gustKph) &&
        Objects.equals(this.airQuality, weather.airQuality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdatedEpoch, lastUpdated, tempC, tempF, idDay, condition, windMph, windKph, windDegree,
        windDir, pressureMb, pressureIn, precipMm, precipIn, humidity, cloud, feelslikeC, feelslikeF, windchillC,
        windchillF, heatindexC, heatindexF, dewpointC, dewpointF, visKm, visMiles, uv, gustMph, gustKph, airQuality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Weather {\n");

    sb.append("    lastUpdatedEpoch: ").append(toIndentedString(lastUpdatedEpoch)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    tempC: ").append(toIndentedString(tempC)).append("\n");
    sb.append("    tempF: ").append(toIndentedString(tempF)).append("\n");
    sb.append("    idDay: ").append(toIndentedString(idDay)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    windMph: ").append(toIndentedString(windMph)).append("\n");
    sb.append("    windKph: ").append(toIndentedString(windKph)).append("\n");
    sb.append("    windDegree: ").append(toIndentedString(windDegree)).append("\n");
    sb.append("    windDir: ").append(toIndentedString(windDir)).append("\n");
    sb.append("    pressureMb: ").append(toIndentedString(pressureMb)).append("\n");
    sb.append("    pressureIn: ").append(toIndentedString(pressureIn)).append("\n");
    sb.append("    precipMm: ").append(toIndentedString(precipMm)).append("\n");
    sb.append("    precipIn: ").append(toIndentedString(precipIn)).append("\n");
    sb.append("    humidity: ").append(toIndentedString(humidity)).append("\n");
    sb.append("    cloud: ").append(toIndentedString(cloud)).append("\n");
    sb.append("    feelslikeC: ").append(toIndentedString(feelslikeC)).append("\n");
    sb.append("    feelslikeF: ").append(toIndentedString(feelslikeF)).append("\n");
    sb.append("    windchillC: ").append(toIndentedString(windchillC)).append("\n");
    sb.append("    windchillF: ").append(toIndentedString(windchillF)).append("\n");
    sb.append("    heatindexC: ").append(toIndentedString(heatindexC)).append("\n");
    sb.append("    heatindexF: ").append(toIndentedString(heatindexF)).append("\n");
    sb.append("    dewpointC: ").append(toIndentedString(dewpointC)).append("\n");
    sb.append("    dewpointF: ").append(toIndentedString(dewpointF)).append("\n");
    sb.append("    visKm: ").append(toIndentedString(visKm)).append("\n");
    sb.append("    visMiles: ").append(toIndentedString(visMiles)).append("\n");
    sb.append("    uv: ").append(toIndentedString(uv)).append("\n");
    sb.append("    gustMph: ").append(toIndentedString(gustMph)).append("\n");
    sb.append("    gustKph: ").append(toIndentedString(gustKph)).append("\n");
    sb.append("    airQuality: ").append(toIndentedString(airQuality)).append("\n");
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
