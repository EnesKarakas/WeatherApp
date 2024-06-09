package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.*;

/**
 * HourCondition
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-06T14:20:51.790816423Z[GMT]")
@JsonInclude(Include.NON_NULL)
public class HourCondition {
  @JsonProperty("time_epoch")
  private Integer timeEpoch = null;

  @JsonProperty("time")
  private String time = null;

  @JsonProperty("temp_c")
  private Float tempC = null;

  @JsonProperty("temp_f")
  private Float tempF = null;

  @JsonProperty("is_day")
  private Integer isDay = null;

  @JsonProperty("wind_mph")
  private Float windMph = null;

  @JsonProperty("wind_kph")
  private Float windKph = null;

  @JsonProperty("wind_degree")
  private Integer windDegree = null;

  @JsonProperty("wind_dir")
  private String windDir = null;

  @JsonProperty("pressure_mb")
  private Float pressureMb = null;

  @JsonProperty("pressure_in")
  private Float pressureIn = null;

  @JsonProperty("precip_mm")
  private Float precipMm = null;

  @JsonProperty("precip_in")
  private Float precipIn = null;

  @JsonProperty("humidity")
  private Integer humidity = null;

  @JsonProperty("cloud")
  private Integer cloud = null;

  @JsonProperty("feelslike_c")
  private Float feelslikeC = null;

  @JsonProperty("feelslike_f")
  private Float feelslikeF = null;

  @JsonProperty("windchill_c")
  private Float windchillC = null;

  @JsonProperty("windchill_f")
  private Float windchillF = null;

  @JsonProperty("heatindex_c")
  private Float heatindexC = null;

  @JsonProperty("heatindex_f")
  private Float heatindexF = null;

  @JsonProperty("dewpoint_c")
  private Float dewpointC = null;

  @JsonProperty("dewpoint_f")
  private Float dewpointF = null;

  @JsonProperty("will_it_rain")
  private Integer willItRain = null;

  @JsonProperty("chance_of_rain")
  private Integer chanceOfRain = null;

  @JsonProperty("will_it_snow")
  private Integer willItSnow = null;

  @JsonProperty("chance_of_snow")
  private Integer chanceOfSnow = null;

  @JsonProperty("vis_km")
  private Float visKm = null;

  @JsonProperty("vis_miles")
  private Float visMiles = null;

  @JsonProperty("gust_mph")
  private Float gustMph = null;

  @JsonProperty("gust_kph")
  private Float gustKph = null;

  @JsonProperty("uv")
  private Float uv = null;

  public HourCondition timeEpoch(Integer timeEpoch) {
    this.timeEpoch = timeEpoch;
    return this;
  }

  /**
   * Get timeEpoch
   * 
   * @return timeEpoch
   **/
  @Schema(description = "")
  @NotNull

  public Integer getTimeEpoch() {
    return timeEpoch;
  }

  public void setTimeEpoch(Integer timeEpoch) {
    this.timeEpoch = timeEpoch;
  }

  public HourCondition time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * 
   * @return time
   **/
  @Schema(description = "")
  @NotNull

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public HourCondition tempC(Float tempC) {
    this.tempC = tempC;
    return this;
  }

  /**
   * Get tempC
   * 
   * @return tempC
   **/
  @Schema(description = "")
  @NotNull

  public Float getTempC() {
    return tempC;
  }

  public void setTempC(Float tempC) {
    this.tempC = tempC;
  }

  public HourCondition tempF(Float tempF) {
    this.tempF = tempF;
    return this;
  }

  /**
   * Get tempF
   * 
   * @return tempF
   **/
  @Schema(description = "")
  @NotNull

  public Float getTempF() {
    return tempF;
  }

  public void setTempF(Float tempF) {
    this.tempF = tempF;
  }

  public HourCondition isDay(Integer isDay) {
    this.isDay = isDay;
    return this;
  }

  /**
   * Get isDay
   * 
   * @return isDay
   **/
  @Schema(description = "")
  @NotNull

  public Integer getIsDay() {
    return isDay;
  }

  public void setIsDay(Integer isDay) {
    this.isDay = isDay;
  }

  public HourCondition windMph(Float windMph) {
    this.windMph = windMph;
    return this;
  }

  /**
   * Get windMph
   * 
   * @return windMph
   **/
  @Schema(description = "")
  @NotNull

  public Float getWindMph() {
    return windMph;
  }

  public void setWindMph(Float windMph) {
    this.windMph = windMph;
  }

  public HourCondition windKph(Float windKph) {
    this.windKph = windKph;
    return this;
  }

  /**
   * Get windKph
   * 
   * @return windKph
   **/
  @Schema(description = "")
  @NotNull

  public Float getWindKph() {
    return windKph;
  }

  public void setWindKph(Float windKph) {
    this.windKph = windKph;
  }

  public HourCondition windDegree(Integer windDegree) {
    this.windDegree = windDegree;
    return this;
  }

  /**
   * Get windDegree
   * 
   * @return windDegree
   **/
  @Schema(description = "")
  @NotNull

  public Integer getWindDegree() {
    return windDegree;
  }

  public void setWindDegree(Integer windDegree) {
    this.windDegree = windDegree;
  }

  public HourCondition windDir(String windDir) {
    this.windDir = windDir;
    return this;
  }

  /**
   * Get windDir
   * 
   * @return windDir
   **/
  @Schema(description = "")
  @NotNull

  public String getWindDir() {
    return windDir;
  }

  public void setWindDir(String windDir) {
    this.windDir = windDir;
  }

  public HourCondition pressureMb(Float pressureMb) {
    this.pressureMb = pressureMb;
    return this;
  }

  /**
   * Get pressureMb
   * 
   * @return pressureMb
   **/
  @Schema(description = "")
  @NotNull

  public Float getPressureMb() {
    return pressureMb;
  }

  public void setPressureMb(Float pressureMb) {
    this.pressureMb = pressureMb;
  }

  public HourCondition pressureIn(Float pressureIn) {
    this.pressureIn = pressureIn;
    return this;
  }

  /**
   * Get pressureIn
   * 
   * @return pressureIn
   **/
  @Schema(description = "")
  @NotNull

  public Float getPressureIn() {
    return pressureIn;
  }

  public void setPressureIn(Float pressureIn) {
    this.pressureIn = pressureIn;
  }

  public HourCondition precipMm(Float precipMm) {
    this.precipMm = precipMm;
    return this;
  }

  /**
   * Get precipMm
   * 
   * @return precipMm
   **/
  @Schema(description = "")
  @NotNull

  public Float getPrecipMm() {
    return precipMm;
  }

  public void setPrecipMm(Float precipMm) {
    this.precipMm = precipMm;
  }

  public HourCondition precipIn(Float precipIn) {
    this.precipIn = precipIn;
    return this;
  }

  /**
   * Get precipIn
   * 
   * @return precipIn
   **/
  @Schema(description = "")
  @NotNull

  public Float getPrecipIn() {
    return precipIn;
  }

  public void setPrecipIn(Float precipIn) {
    this.precipIn = precipIn;
  }

  public HourCondition humidity(Integer humidity) {
    this.humidity = humidity;
    return this;
  }

  /**
   * Get humidity
   * 
   * @return humidity
   **/
  @Schema(description = "")
  @NotNull

  public Integer getHumidity() {
    return humidity;
  }

  public void setHumidity(Integer humidity) {
    this.humidity = humidity;
  }

  public HourCondition cloud(Integer cloud) {
    this.cloud = cloud;
    return this;
  }

  /**
   * Get cloud
   * 
   * @return cloud
   **/
  @Schema(description = "")
  @NotNull

  public Integer getCloud() {
    return cloud;
  }

  public void setCloud(Integer cloud) {
    this.cloud = cloud;
  }

  public HourCondition feelslikeC(Float feelslikeC) {
    this.feelslikeC = feelslikeC;
    return this;
  }

  /**
   * Get feelslikeC
   * 
   * @return feelslikeC
   **/
  @Schema(description = "")
  @NotNull

  public Float getFeelslikeC() {
    return feelslikeC;
  }

  public void setFeelslikeC(Float feelslikeC) {
    this.feelslikeC = feelslikeC;
  }

  public HourCondition feelslikeF(Float feelslikeF) {
    this.feelslikeF = feelslikeF;
    return this;
  }

  /**
   * Get feelslikeF
   * 
   * @return feelslikeF
   **/
  @Schema(description = "")
  @NotNull

  public Float getFeelslikeF() {
    return feelslikeF;
  }

  public void setFeelslikeF(Float feelslikeF) {
    this.feelslikeF = feelslikeF;
  }

  public HourCondition windchillC(Float windchillC) {
    this.windchillC = windchillC;
    return this;
  }

  /**
   * Get windchillC
   * 
   * @return windchillC
   **/
  @Schema(description = "")
  @NotNull

  public Float getWindchillC() {
    return windchillC;
  }

  public void setWindchillC(Float windchillC) {
    this.windchillC = windchillC;
  }

  public HourCondition windchillF(Float windchillF) {
    this.windchillF = windchillF;
    return this;
  }

  /**
   * Get windchillF
   * 
   * @return windchillF
   **/
  @Schema(description = "")
  @NotNull

  public Float getWindchillF() {
    return windchillF;
  }

  public void setWindchillF(Float windchillF) {
    this.windchillF = windchillF;
  }

  public HourCondition heatindexC(Float heatindexC) {
    this.heatindexC = heatindexC;
    return this;
  }

  /**
   * Get heatindexC
   * 
   * @return heatindexC
   **/
  @Schema(description = "")
  @NotNull

  public Float getHeatindexC() {
    return heatindexC;
  }

  public void setHeatindexC(Float heatindexC) {
    this.heatindexC = heatindexC;
  }

  public HourCondition heatindexF(Float heatindexF) {
    this.heatindexF = heatindexF;
    return this;
  }

  /**
   * Get heatindexF
   * 
   * @return heatindexF
   **/
  @Schema(description = "")
  @NotNull

  public Float getHeatindexF() {
    return heatindexF;
  }

  public void setHeatindexF(Float heatindexF) {
    this.heatindexF = heatindexF;
  }

  public HourCondition dewpointC(Float dewpointC) {
    this.dewpointC = dewpointC;
    return this;
  }

  /**
   * Get dewpointC
   * 
   * @return dewpointC
   **/
  @Schema(description = "")
  @NotNull

  public Float getDewpointC() {
    return dewpointC;
  }

  public void setDewpointC(Float dewpointC) {
    this.dewpointC = dewpointC;
  }

  public HourCondition dewpointF(Float dewpointF) {
    this.dewpointF = dewpointF;
    return this;
  }

  /**
   * Get dewpointF
   * 
   * @return dewpointF
   **/
  @Schema(description = "")
  @NotNull

  public Float getDewpointF() {
    return dewpointF;
  }

  public void setDewpointF(Float dewpointF) {
    this.dewpointF = dewpointF;
  }

  public HourCondition willItRain(Integer willItRain) {
    this.willItRain = willItRain;
    return this;
  }

  /**
   * Get willItRain
   * 
   * @return willItRain
   **/
  @Schema(description = "")
  @NotNull

  public Integer getWillItRain() {
    return willItRain;
  }

  public void setWillItRain(Integer willItRain) {
    this.willItRain = willItRain;
  }

  public HourCondition chanceOfRain(Integer chanceOfRain) {
    this.chanceOfRain = chanceOfRain;
    return this;
  }

  /**
   * Get chanceOfRain
   * 
   * @return chanceOfRain
   **/
  @Schema(description = "")
  @NotNull

  public Integer getChanceOfRain() {
    return chanceOfRain;
  }

  public void setChanceOfRain(Integer chanceOfRain) {
    this.chanceOfRain = chanceOfRain;
  }

  public HourCondition willItSnow(Integer willItSnow) {
    this.willItSnow = willItSnow;
    return this;
  }

  /**
   * Get willItSnow
   * 
   * @return willItSnow
   **/
  @Schema(description = "")
  @NotNull

  public Integer getWillItSnow() {
    return willItSnow;
  }

  public void setWillItSnow(Integer willItSnow) {
    this.willItSnow = willItSnow;
  }

  public HourCondition chanceOfSnow(Integer chanceOfSnow) {
    this.chanceOfSnow = chanceOfSnow;
    return this;
  }

  /**
   * Get chanceOfSnow
   * 
   * @return chanceOfSnow
   **/
  @Schema(description = "")
  @NotNull

  public Integer getChanceOfSnow() {
    return chanceOfSnow;
  }

  public void setChanceOfSnow(Integer chanceOfSnow) {
    this.chanceOfSnow = chanceOfSnow;
  }

  public HourCondition visKm(Float visKm) {
    this.visKm = visKm;
    return this;
  }

  /**
   * Get visKm
   * 
   * @return visKm
   **/
  @Schema(description = "")
  @NotNull

  public Float getVisKm() {
    return visKm;
  }

  public void setVisKm(Float visKm) {
    this.visKm = visKm;
  }

  public HourCondition visMiles(Float visMiles) {
    this.visMiles = visMiles;
    return this;
  }

  /**
   * Get visMiles
   * 
   * @return visMiles
   **/
  @Schema(description = "")
  @NotNull

  public Float getVisMiles() {
    return visMiles;
  }

  public void setVisMiles(Float visMiles) {
    this.visMiles = visMiles;
  }

  public HourCondition gustMph(Float gustMph) {
    this.gustMph = gustMph;
    return this;
  }

  /**
   * Get gustMph
   * 
   * @return gustMph
   **/
  @Schema(description = "")
  @NotNull

  public Float getGustMph() {
    return gustMph;
  }

  public void setGustMph(Float gustMph) {
    this.gustMph = gustMph;
  }

  public HourCondition gustKph(Float gustKph) {
    this.gustKph = gustKph;
    return this;
  }

  /**
   * Get gustKph
   * 
   * @return gustKph
   **/
  @Schema(description = "")
  @NotNull

  public Float getGustKph() {
    return gustKph;
  }

  public void setGustKph(Float gustKph) {
    this.gustKph = gustKph;
  }

  public HourCondition uv(Float uv) {
    this.uv = uv;
    return this;
  }

  /**
   * Get uv
   * 
   * @return uv
   **/
  @Schema(description = "")
  @NotNull

  public Float getUv() {
    return uv;
  }

  public void setUv(Float uv) {
    this.uv = uv;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HourCondition hourCondition = (HourCondition) o;
    return Objects.equals(this.timeEpoch, hourCondition.timeEpoch) &&
        Objects.equals(this.time, hourCondition.time) &&
        Objects.equals(this.tempC, hourCondition.tempC) &&
        Objects.equals(this.tempF, hourCondition.tempF) &&
        Objects.equals(this.isDay, hourCondition.isDay) &&
        Objects.equals(this.windMph, hourCondition.windMph) &&
        Objects.equals(this.windKph, hourCondition.windKph) &&
        Objects.equals(this.windDegree, hourCondition.windDegree) &&
        Objects.equals(this.windDir, hourCondition.windDir) &&
        Objects.equals(this.pressureMb, hourCondition.pressureMb) &&
        Objects.equals(this.pressureIn, hourCondition.pressureIn) &&
        Objects.equals(this.precipMm, hourCondition.precipMm) &&
        Objects.equals(this.precipIn, hourCondition.precipIn) &&
        Objects.equals(this.humidity, hourCondition.humidity) &&
        Objects.equals(this.cloud, hourCondition.cloud) &&
        Objects.equals(this.feelslikeC, hourCondition.feelslikeC) &&
        Objects.equals(this.feelslikeF, hourCondition.feelslikeF) &&
        Objects.equals(this.windchillC, hourCondition.windchillC) &&
        Objects.equals(this.windchillF, hourCondition.windchillF) &&
        Objects.equals(this.heatindexC, hourCondition.heatindexC) &&
        Objects.equals(this.heatindexF, hourCondition.heatindexF) &&
        Objects.equals(this.dewpointC, hourCondition.dewpointC) &&
        Objects.equals(this.dewpointF, hourCondition.dewpointF) &&
        Objects.equals(this.willItRain, hourCondition.willItRain) &&
        Objects.equals(this.chanceOfRain, hourCondition.chanceOfRain) &&
        Objects.equals(this.willItSnow, hourCondition.willItSnow) &&
        Objects.equals(this.chanceOfSnow, hourCondition.chanceOfSnow) &&
        Objects.equals(this.visKm, hourCondition.visKm) &&
        Objects.equals(this.visMiles, hourCondition.visMiles) &&
        Objects.equals(this.gustMph, hourCondition.gustMph) &&
        Objects.equals(this.gustKph, hourCondition.gustKph) &&
        Objects.equals(this.uv, hourCondition.uv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeEpoch, time, tempC, tempF, isDay, windMph,
        windKph, windDegree, windDir, pressureMb, pressureIn, precipMm,
        precipIn, humidity, cloud, feelslikeC, feelslikeF, windchillC,
        windchillF, heatindexC, heatindexF, dewpointC, dewpointF, willItRain,
        chanceOfRain, willItSnow, chanceOfSnow, visKm, visMiles, gustMph,
        gustKph, uv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HourCondition {\n");

    sb.append("    timeEpoch: ").append(toIndentedString(timeEpoch)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    tempC: ").append(toIndentedString(tempC)).append("\n");
    sb.append("    tempF: ").append(toIndentedString(tempF)).append("\n");
    sb.append("    isDay: ").append(toIndentedString(isDay)).append("\n");
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
    sb.append("    willItRain: ").append(toIndentedString(willItRain)).append("\n");
    sb.append("    chanceOfRain: ").append(toIndentedString(chanceOfRain)).append("\n");
    sb.append("    willItSnow: ").append(toIndentedString(willItSnow)).append("\n");
    sb.append("    chanceOfSnow: ").append(toIndentedString(chanceOfSnow)).append("\n");
    sb.append("    visKm: ").append(toIndentedString(visKm)).append("\n");
    sb.append("    visMiles: ").append(toIndentedString(visMiles)).append("\n");
    sb.append("    gustMph: ").append(toIndentedString(gustMph)).append("\n");
    sb.append("    gustKph: ").append(toIndentedString(gustKph)).append("\n");
    sb.append("    uv: ").append(toIndentedString(uv)).append("\n");
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
