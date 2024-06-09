package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.*;

/**
 * DayCondition
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-06T14:20:51.790816423Z[GMT]")
@JsonInclude(Include.NON_NULL)
public class DayCondition {
  @JsonProperty("maxtemp_c")
  private Float maxtempC = null;

  @JsonProperty("maxtemp_f")
  private Float maxtempF = null;

  @JsonProperty("mintemp_c")
  private Float mintempC = null;

  @JsonProperty("mintemp_f")
  private Float mintempF = null;

  @JsonProperty("avgtemp_c")
  private Float avgtempC = null;

  @JsonProperty("avgtemp_f")
  private Float avgtempF = null;

  @JsonProperty("maxwind_mph")
  private Float maxwindMph = null;

  @JsonProperty("maxwind_kph")
  private Float maxwindKph = null;

  @JsonProperty("totalprecip_mm")
  private Float totalprecipMm = null;

  @JsonProperty("totalprecip_in")
  private Float totalprecipIn = null;

  @JsonProperty("avgvis_km")
  private Float avgvisKm = null;

  @JsonProperty("avgvis_miles")
  private Float avgvisMiles = null;

  @JsonProperty("avghumidity")
  private Integer avghumidity = null;

  @JsonProperty("daily_will_it_rain")
  private Integer dailyWillItRain = null;

  @JsonProperty("daily_chance_of_rain")
  private Integer dailyChanceOfRain = null;

  @JsonProperty("daily_will_it_snow")
  private Integer dailyWillItSnow = null;

  @JsonProperty("daily_chance_of_snow")
  private Integer dailyChanceOfSnow = null;

  @JsonProperty("uv")
  private Float uv = null;

  public DayCondition maxtempC(Float maxtempC) {
    this.maxtempC = maxtempC;
    return this;
  }

  /**
   * Get maxtempC
   * 
   * @return maxtempC
   **/
  @Schema(description = "")
  @NotNull

  public Float getMaxtempC() {
    return maxtempC;
  }

  public void setMaxtempC(Float maxtempC) {
    this.maxtempC = maxtempC;
  }

  public DayCondition maxtempF(Float maxtempF) {
    this.maxtempF = maxtempF;
    return this;
  }

  /**
   * Get maxtempF
   * 
   * @return maxtempF
   **/
  @Schema(description = "")
  @NotNull

  public Float getMaxtempF() {
    return maxtempF;
  }

  public void setMaxtempF(Float maxtempF) {
    this.maxtempF = maxtempF;
  }

  public DayCondition mintempC(Float mintempC) {
    this.mintempC = mintempC;
    return this;
  }

  /**
   * Get mintempC
   * 
   * @return mintempC
   **/
  @Schema(description = "")
  @NotNull

  public Float getMintempC() {
    return mintempC;
  }

  public void setMintempC(Float mintempC) {
    this.mintempC = mintempC;
  }

  public DayCondition mintempF(Float mintempF) {
    this.mintempF = mintempF;
    return this;
  }

  /**
   * Get mintempF
   * 
   * @return mintempF
   **/
  @Schema(description = "")
  @NotNull

  public Float getMintempF() {
    return mintempF;
  }

  public void setMintempF(Float mintempF) {
    this.mintempF = mintempF;
  }

  public DayCondition avgtempC(Float avgtempC) {
    this.avgtempC = avgtempC;
    return this;
  }

  /**
   * Get avgtempC
   * 
   * @return avgtempC
   **/
  @Schema(description = "")
  @NotNull

  public Float getAvgtempC() {
    return avgtempC;
  }

  public void setAvgtempC(Float avgtempC) {
    this.avgtempC = avgtempC;
  }

  public DayCondition avgtempF(Float avgtempF) {
    this.avgtempF = avgtempF;
    return this;
  }

  /**
   * Get avgtempF
   * 
   * @return avgtempF
   **/
  @Schema(description = "")
  @NotNull

  public Float getAvgtempF() {
    return avgtempF;
  }

  public void setAvgtempF(Float avgtempF) {
    this.avgtempF = avgtempF;
  }

  public DayCondition maxwindMph(Float maxwindMph) {
    this.maxwindMph = maxwindMph;
    return this;
  }

  /**
   * Get maxwindMph
   * 
   * @return maxwindMph
   **/
  @Schema(description = "")
  @NotNull

  public Float getMaxwindMph() {
    return maxwindMph;
  }

  public void setMaxwindMph(Float maxwindMph) {
    this.maxwindMph = maxwindMph;
  }

  public DayCondition maxwindKph(Float maxwindKph) {
    this.maxwindKph = maxwindKph;
    return this;
  }

  /**
   * Get maxwindKph
   * 
   * @return maxwindKph
   **/
  @Schema(description = "")
  @NotNull

  public Float getMaxwindKph() {
    return maxwindKph;
  }

  public void setMaxwindKph(Float maxwindKph) {
    this.maxwindKph = maxwindKph;
  }

  public DayCondition totalprecipMm(Float totalprecipMm) {
    this.totalprecipMm = totalprecipMm;
    return this;
  }

  /**
   * Get totalprecipMm
   * 
   * @return totalprecipMm
   **/
  @Schema(description = "")
  @NotNull

  public Float getTotalprecipMm() {
    return totalprecipMm;
  }

  public void setTotalprecipMm(Float totalprecipMm) {
    this.totalprecipMm = totalprecipMm;
  }

  public DayCondition totalprecipIn(Float totalprecipIn) {
    this.totalprecipIn = totalprecipIn;
    return this;
  }

  /**
   * Get totalprecipIn
   * 
   * @return totalprecipIn
   **/
  @Schema(description = "")
  @NotNull

  public Float getTotalprecipIn() {
    return totalprecipIn;
  }

  public void setTotalprecipIn(Float totalprecipIn) {
    this.totalprecipIn = totalprecipIn;
  }

  public DayCondition avgvisKm(Float avgvisKm) {
    this.avgvisKm = avgvisKm;
    return this;
  }

  /**
   * Get avgvisKm
   * 
   * @return avgvisKm
   **/
  @Schema(description = "")
  @NotNull

  public Float getAvgvisKm() {
    return avgvisKm;
  }

  public void setAvgvisKm(Float avgvisKm) {
    this.avgvisKm = avgvisKm;
  }

  public DayCondition avgvisMiles(Float avgvisMiles) {
    this.avgvisMiles = avgvisMiles;
    return this;
  }

  /**
   * Get avgvisMiles
   * 
   * @return avgvisMiles
   **/
  @Schema(description = "")
  @NotNull

  public Float getAvgvisMiles() {
    return avgvisMiles;
  }

  public void setAvgvisMiles(Float avgvisMiles) {
    this.avgvisMiles = avgvisMiles;
  }

  public DayCondition avghumidity(Integer avghumidity) {
    this.avghumidity = avghumidity;
    return this;
  }

  /**
   * Get avghumidity
   * 
   * @return avghumidity
   **/
  @Schema(description = "")
  @NotNull

  public Integer getAvghumidity() {
    return avghumidity;
  }

  public void setAvghumidity(Integer avghumidity) {
    this.avghumidity = avghumidity;
  }

  public DayCondition dailyWillItRain(Integer dailyWillItRain) {
    this.dailyWillItRain = dailyWillItRain;
    return this;
  }

  /**
   * Get dailyWillItRain
   * 
   * @return dailyWillItRain
   **/
  @Schema(description = "")
  @NotNull

  public Integer getDailyWillItRain() {
    return dailyWillItRain;
  }

  public void setDailyWillItRain(Integer dailyWillItRain) {
    this.dailyWillItRain = dailyWillItRain;
  }

  public DayCondition dailyChanceOfRain(Integer dailyChanceOfRain) {
    this.dailyChanceOfRain = dailyChanceOfRain;
    return this;
  }

  /**
   * Get dailyChanceOfRain
   * 
   * @return dailyChanceOfRain
   **/
  @Schema(description = "")
  @NotNull

  public Integer getDailyChanceOfRain() {
    return dailyChanceOfRain;
  }

  public void setDailyChanceOfRain(Integer dailyChanceOfRain) {
    this.dailyChanceOfRain = dailyChanceOfRain;
  }

  public DayCondition dailyWillItSnow(Integer dailyWillItSnow) {
    this.dailyWillItSnow = dailyWillItSnow;
    return this;
  }

  /**
   * Get dailyWillItSnow
   * 
   * @return dailyWillItSnow
   **/
  @Schema(description = "")
  @NotNull

  public Integer getDailyWillItSnow() {
    return dailyWillItSnow;
  }

  public void setDailyWillItSnow(Integer dailyWillItSnow) {
    this.dailyWillItSnow = dailyWillItSnow;
  }

  public DayCondition dailyChanceOfSnow(Integer dailyChanceOfSnow) {
    this.dailyChanceOfSnow = dailyChanceOfSnow;
    return this;
  }

  /**
   * Get dailyChanceOfSnow
   * 
   * @return dailyChanceOfSnow
   **/
  @Schema(description = "")
  @NotNull

  public Integer getDailyChanceOfSnow() {
    return dailyChanceOfSnow;
  }

  public void setDailyChanceOfSnow(Integer dailyChanceOfSnow) {
    this.dailyChanceOfSnow = dailyChanceOfSnow;
  }

  public DayCondition uv(Float uv) {
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
    DayCondition dayCondition = (DayCondition) o;
    return Objects.equals(this.maxtempC, dayCondition.maxtempC) &&
        Objects.equals(this.maxtempF, dayCondition.maxtempF) &&
        Objects.equals(this.mintempC, dayCondition.mintempC) &&
        Objects.equals(this.mintempF, dayCondition.mintempF) &&
        Objects.equals(this.avgtempC, dayCondition.avgtempC) &&
        Objects.equals(this.avgtempF, dayCondition.avgtempF) &&
        Objects.equals(this.maxwindMph, dayCondition.maxwindMph) &&
        Objects.equals(this.maxwindKph, dayCondition.maxwindKph) &&
        Objects.equals(this.totalprecipMm, dayCondition.totalprecipMm) &&
        Objects.equals(this.totalprecipIn, dayCondition.totalprecipIn) &&
        Objects.equals(this.avgvisKm, dayCondition.avgvisKm) &&
        Objects.equals(this.avgvisMiles, dayCondition.avgvisMiles) &&
        Objects.equals(this.avghumidity, dayCondition.avghumidity) &&
        Objects.equals(this.dailyWillItRain, dayCondition.dailyWillItRain) &&
        Objects.equals(this.dailyChanceOfRain, dayCondition.dailyChanceOfRain) &&
        Objects.equals(this.dailyWillItSnow, dayCondition.dailyWillItSnow) &&
        Objects.equals(this.dailyChanceOfSnow, dayCondition.dailyChanceOfSnow) &&
        Objects.equals(this.uv, dayCondition.uv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxtempC, maxtempF, mintempC, mintempF, avgtempC, avgtempF, maxwindMph, maxwindKph,
        totalprecipMm, totalprecipIn, avgvisKm, avgvisMiles, avghumidity, dailyWillItRain, dailyChanceOfRain,
        dailyWillItSnow, dailyChanceOfSnow, uv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DayCondition {\n");

    sb.append("    maxtempC: ").append(toIndentedString(maxtempC)).append("\n");
    sb.append("    maxtempF: ").append(toIndentedString(maxtempF)).append("\n");
    sb.append("    mintempC: ").append(toIndentedString(mintempC)).append("\n");
    sb.append("    mintempF: ").append(toIndentedString(mintempF)).append("\n");
    sb.append("    avgtempC: ").append(toIndentedString(avgtempC)).append("\n");
    sb.append("    avgtempF: ").append(toIndentedString(avgtempF)).append("\n");
    sb.append("    maxwindMph: ").append(toIndentedString(maxwindMph)).append("\n");
    sb.append("    maxwindKph: ").append(toIndentedString(maxwindKph)).append("\n");
    sb.append("    totalprecipMm: ").append(toIndentedString(totalprecipMm)).append("\n");
    sb.append("    totalprecipIn: ").append(toIndentedString(totalprecipIn)).append("\n");
    sb.append("    avgvisKm: ").append(toIndentedString(avgvisKm)).append("\n");
    sb.append("    avgvisMiles: ").append(toIndentedString(avgvisMiles)).append("\n");
    sb.append("    avghumidity: ").append(toIndentedString(avghumidity)).append("\n");
    sb.append("    dailyWillItRain: ").append(toIndentedString(dailyWillItRain)).append("\n");
    sb.append("    dailyChanceOfRain: ").append(toIndentedString(dailyChanceOfRain)).append("\n");
    sb.append("    dailyWillItSnow: ").append(toIndentedString(dailyWillItSnow)).append("\n");
    sb.append("    dailyChanceOfSnow: ").append(toIndentedString(dailyChanceOfSnow)).append("\n");
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
