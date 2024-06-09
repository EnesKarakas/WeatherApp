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
 * WeatherAirQuality
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-04T09:41:03.559554872Z[GMT]")

@JsonInclude(Include.NON_NULL)
public class WeatherAirQuality {
  @JsonProperty("co")
  private BigDecimal co = null;

  @JsonProperty("no2")
  private BigDecimal no2 = null;

  @JsonProperty("o3")
  private BigDecimal o3 = null;

  @JsonProperty("so2")
  private BigDecimal so2 = null;

  @JsonProperty("pm2_5")
  private BigDecimal pm25 = null;

  @JsonProperty("pm10")
  private BigDecimal pm10 = null;

  @JsonProperty("us-epa-index")
  private Integer usEpaIndex = null;

  @JsonProperty("gb-defra-index")
  private Integer gbDefraIndex = null;

  public WeatherAirQuality co(BigDecimal co) {
    this.co = co;
    return this;
  }

  /**
   * Get co
   * 
   * @return co
   **/
  @Schema(example = "234.32", description = "")
  @NotNull

  @Valid
  public BigDecimal getCo() {
    return co;
  }

  public void setCo(BigDecimal co) {
    this.co = co;
  }

  public WeatherAirQuality no2(BigDecimal no2) {
    this.no2 = no2;
    return this;
  }

  /**
   * Get no2
   * 
   * @return no2
   **/
  @Schema(example = "3.4", description = "")
  @NotNull

  @Valid
  public BigDecimal getNo2() {
    return no2;
  }

  public void setNo2(BigDecimal no2) {
    this.no2 = no2;
  }

  public WeatherAirQuality o3(BigDecimal o3) {
    this.o3 = o3;
    return this;
  }

  /**
   * Get o3
   * 
   * @return o3
   **/
  @Schema(example = "234.3", description = "")
  @NotNull

  @Valid
  public BigDecimal getO3() {
    return o3;
  }

  public void setO3(BigDecimal o3) {
    this.o3 = o3;
  }

  public WeatherAirQuality so2(BigDecimal so2) {
    this.so2 = so2;
    return this;
  }

  /**
   * Get so2
   * 
   * @return so2
   **/
  @Schema(example = "490.34", description = "")
  @NotNull

  @Valid
  public BigDecimal getSo2() {
    return so2;
  }

  public void setSo2(BigDecimal so2) {
    this.so2 = so2;
  }

  public WeatherAirQuality pm25(BigDecimal pm25) {
    this.pm25 = pm25;
    return this;
  }

  /**
   * Get pm25
   * 
   * @return pm25
   **/
  @Schema(example = "96.34", description = "")
  @NotNull

  @Valid
  public BigDecimal getPm25() {
    return pm25;
  }

  public void setPm25(BigDecimal pm25) {
    this.pm25 = pm25;
  }

  public WeatherAirQuality pm10(BigDecimal pm10) {
    this.pm10 = pm10;
    return this;
  }

  /**
   * Get pm10
   * 
   * @return pm10
   **/
  @Schema(example = "22.3", description = "")
  @NotNull

  @Valid
  public BigDecimal getPm10() {
    return pm10;
  }

  public void setPm10(BigDecimal pm10) {
    this.pm10 = pm10;
  }

  public WeatherAirQuality usEpaIndex(Integer usEpaIndex) {
    this.usEpaIndex = usEpaIndex;
    return this;
  }

  /**
   * Get usEpaIndex
   * 
   * @return usEpaIndex
   **/
  @Schema(example = "32", description = "")
  @NotNull

  public Integer getUsEpaIndex() {
    return usEpaIndex;
  }

  public void setUsEpaIndex(Integer usEpaIndex) {
    this.usEpaIndex = usEpaIndex;
  }

  public WeatherAirQuality gbDefraIndex(Integer gbDefraIndex) {
    this.gbDefraIndex = gbDefraIndex;
    return this;
  }

  /**
   * Get gbDefraIndex
   * 
   * @return gbDefraIndex
   **/
  @Schema(example = "9999", description = "")
  @NotNull

  public Integer getGbDefraIndex() {
    return gbDefraIndex;
  }

  public void setGbDefraIndex(Integer gbDefraIndex) {
    this.gbDefraIndex = gbDefraIndex;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeatherAirQuality weatherAirQuality = (WeatherAirQuality) o;
    return Objects.equals(this.co, weatherAirQuality.co) &&
        Objects.equals(this.no2, weatherAirQuality.no2) &&
        Objects.equals(this.o3, weatherAirQuality.o3) &&
        Objects.equals(this.so2, weatherAirQuality.so2) &&
        Objects.equals(this.pm25, weatherAirQuality.pm25) &&
        Objects.equals(this.pm10, weatherAirQuality.pm10) &&
        Objects.equals(this.usEpaIndex, weatherAirQuality.usEpaIndex) &&
        Objects.equals(this.gbDefraIndex, weatherAirQuality.gbDefraIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(co, no2, o3, so2, pm25, pm10, usEpaIndex, gbDefraIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeatherAirQuality {\n");

    sb.append("    co: ").append(toIndentedString(co)).append("\n");
    sb.append("    no2: ").append(toIndentedString(no2)).append("\n");
    sb.append("    o3: ").append(toIndentedString(o3)).append("\n");
    sb.append("    so2: ").append(toIndentedString(so2)).append("\n");
    sb.append("    pm25: ").append(toIndentedString(pm25)).append("\n");
    sb.append("    pm10: ").append(toIndentedString(pm10)).append("\n");
    sb.append("    usEpaIndex: ").append(toIndentedString(usEpaIndex)).append("\n");
    sb.append("    gbDefraIndex: ").append(toIndentedString(gbDefraIndex)).append("\n");
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
