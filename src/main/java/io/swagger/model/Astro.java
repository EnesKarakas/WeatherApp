package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.*;

/**
 * Astro
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-06T14:20:51.790816423Z[GMT]")
@JsonInclude(Include.NON_NULL)

public class Astro {
  @JsonProperty("sunrise")
  private String sunrise = null;

  @JsonProperty("sunset")
  private String sunset = null;

  @JsonProperty("moonrise")
  private String moonrise = null;

  @JsonProperty("moonset")
  private String moonset = null;

  @JsonProperty("moon_phase")
  private String moonPhase = null;

  @JsonProperty("moon_illumination")
  private String moonIllumination = null;

  public Astro sunrise(String sunrise) {
    this.sunrise = sunrise;
    return this;
  }

  /**
   * Get sunrise
   * 
   * @return sunrise
   **/
  @Schema(description = "")
  @NotNull

  public String getSunrise() {
    return sunrise;
  }

  public void setSunrise(String sunrise) {
    this.sunrise = sunrise;
  }

  public Astro sunset(String sunset) {
    this.sunset = sunset;
    return this;
  }

  /**
   * Get sunset
   * 
   * @return sunset
   **/
  @Schema(description = "")
  @NotNull

  public String getSunset() {
    return sunset;
  }

  public void setSunset(String sunset) {
    this.sunset = sunset;
  }

  public Astro moonrise(String moonrise) {
    this.moonrise = moonrise;
    return this;
  }

  /**
   * Get moonrise
   * 
   * @return moonrise
   **/
  @Schema(description = "")
  @NotNull

  public String getMoonrise() {
    return moonrise;
  }

  public void setMoonrise(String moonrise) {
    this.moonrise = moonrise;
  }

  public Astro moonset(String moonset) {
    this.moonset = moonset;
    return this;
  }

  /**
   * Get moonset
   * 
   * @return moonset
   **/
  @Schema(description = "")
  @NotNull

  public String getMoonset() {
    return moonset;
  }

  public void setMoonset(String moonset) {
    this.moonset = moonset;
  }

  public Astro moonPhase(String moonPhase) {
    this.moonPhase = moonPhase;
    return this;
  }

  /**
   * Get moonPhase
   * 
   * @return moonPhase
   **/
  @Schema(description = "")
  @NotNull

  public String getMoonPhase() {
    return moonPhase;
  }

  public void setMoonPhase(String moonPhase) {
    this.moonPhase = moonPhase;
  }

  public Astro moonIllumination(String moonIllumination) {
    this.moonIllumination = moonIllumination;
    return this;
  }

  /**
   * Get moonIllumination
   * 
   * @return moonIllumination
   **/
  @Schema(description = "")
  @NotNull

  public String getMoonIllumination() {
    return moonIllumination;
  }

  public void setMoonIllumination(String moonIllumination) {
    this.moonIllumination = moonIllumination;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Astro astro = (Astro) o;
    return Objects.equals(this.sunrise, astro.sunrise) &&
        Objects.equals(this.sunset, astro.sunset) &&
        Objects.equals(this.moonrise, astro.moonrise) &&
        Objects.equals(this.moonset, astro.moonset) &&
        Objects.equals(this.moonPhase, astro.moonPhase) &&
        Objects.equals(this.moonIllumination, astro.moonIllumination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sunrise, sunset, moonrise, moonset, moonPhase, moonIllumination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Astro {\n");

    sb.append("    sunrise: ").append(toIndentedString(sunrise)).append("\n");
    sb.append("    sunset: ").append(toIndentedString(sunset)).append("\n");
    sb.append("    moonrise: ").append(toIndentedString(moonrise)).append("\n");
    sb.append("    moonset: ").append(toIndentedString(moonset)).append("\n");
    sb.append("    moonPhase: ").append(toIndentedString(moonPhase)).append("\n");
    sb.append("    moonIllumination: ").append(toIndentedString(moonIllumination)).append("\n");
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
