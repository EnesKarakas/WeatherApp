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
 * Location
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-04T09:41:03.559554872Z[GMT]")

@JsonInclude(Include.NON_NULL)
public class Location {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("lon")
  private BigDecimal lon = null;

  @JsonProperty("lat")
  private BigDecimal lat = null;

  @JsonProperty("tz_id")
  private String tzId = null;

  @JsonProperty("localtime_epoch")
  private Integer localtimeEpoch = null;

  @JsonProperty("localtime")
  private String localtime = null;

  public Location name(String name) {
    this.name = name;
    return this;
  }

  /**
   * city name
   * 
   * @return name
   **/
  @Schema(example = "stuttgart", description = "city name")
  @NotNull

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Location region(String region) {
    this.region = region;
    return this;
  }

  /**
   * region
   * 
   * @return region
   **/
  @Schema(example = "baden wuerttemberg", description = "region")
  @NotNull

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public Location country(String country) {
    this.country = country;
    return this;
  }

  /**
   * country
   * 
   * @return country
   **/
  @Schema(example = "Germany", description = "country")
  @NotNull

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Location lon(BigDecimal lon) {
    this.lon = lon;
    return this;
  }

  /**
   * City geo location, longitude
   * 
   * @return lon
   **/
  @Schema(example = "48.78", description = "City geo location, longitude")
  @NotNull

  @Valid
  public BigDecimal getLon() {
    return lon;
  }

  public void setLon(BigDecimal lon) {
    this.lon = lon;
  }

  public Location lat(BigDecimal lat) {
    this.lat = lat;
    return this;
  }

  /**
   * City geo location, latitude
   * 
   * @return lat
   **/
  @Schema(example = "9.17", description = "City geo location, latitude")
  @NotNull

  @Valid
  public BigDecimal getLat() {
    return lat;
  }

  public void setLat(BigDecimal lat) {
    this.lat = lat;
  }

  public Location tzId(String tzId) {
    this.tzId = tzId;
    return this;
  }

  /**
   * timezone id
   * 
   * @return tzId
   **/
  @Schema(example = "europa/berlin", description = "timezone id")
  @NotNull

  public String getTzId() {
    return tzId;
  }

  public void setTzId(String tzId) {
    this.tzId = tzId;
  }

  public Location localtimeEpoch(Integer localtimeEpoch) {
    this.localtimeEpoch = localtimeEpoch;
    return this;
  }

  /**
   * unix time
   * 
   * @return localtimeEpoch
   **/
  @Schema(example = "1717491434", description = "unix time")
  @NotNull

  public Integer getLocaltimeEpoch() {
    return localtimeEpoch;
  }

  public void setLocaltimeEpoch(Integer localtimeEpoch) {
    this.localtimeEpoch = localtimeEpoch;
  }

  public Location localtime(String localtime) {
    this.localtime = localtime;
    return this;
  }

  /**
   * current time
   * 
   * @return localtime
   **/
  @Schema(example = "2001-10-09 10:07", description = "current time")
  @NotNull

  public String getLocaltime() {
    return localtime;
  }

  public void setLocaltime(String localtime) {
    this.localtime = localtime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.name, location.name) &&
        Objects.equals(this.region, location.region) &&
        Objects.equals(this.country, location.country) &&
        Objects.equals(this.lon, location.lon) &&
        Objects.equals(this.lat, location.lat) &&
        Objects.equals(this.tzId, location.tzId) &&
        Objects.equals(this.localtimeEpoch, location.localtimeEpoch) &&
        Objects.equals(this.localtime, location.localtime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, region, country, lon, lat, tzId, localtimeEpoch, localtime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    tzId: ").append(toIndentedString(tzId)).append("\n");
    sb.append("    localtimeEpoch: ").append(toIndentedString(localtimeEpoch)).append("\n");
    sb.append("    localtime: ").append(toIndentedString(localtime)).append("\n");
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
