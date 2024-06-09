package io.swagger.api;

import io.swagger.model.ForecastDay;
import io.swagger.model.HourCondition;
import io.swagger.model.Modelforecast;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-04T09:41:03.559554872Z[GMT]")
@RestController
public class ForecastweatherApiController implements ForecastweatherApi {

    private static final Logger log = LoggerFactory.getLogger(ForecastweatherApiController.class);

    private final ObjectMapper objectMapper;

    @SuppressWarnings("unused")
    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ForecastweatherApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Modelforecast> forecastWeatherData(
            @NotNull @Parameter(in = ParameterIn.QUERY, description = "For the query value, type the city name and optionally the country code divided by comma; use ISO 3166 country codes.", required = true, schema = @Schema()) @Valid @RequestParam(value = "q", required = true) String q,

            @Parameter(in = ParameterIn.QUERY, description = "forcast days", required = true, schema = @Schema()) @Valid @RequestParam(value = "days", required = true) int days,

            @Parameter(in = ParameterIn.QUERY, description = "shows alerts", required = true, schema = @Schema()) @Valid @RequestParam(value = "alerts", required = true) String alerts,

            @Parameter(in = ParameterIn.QUERY, description = "filter parameter", required = false, schema = @Schema()) @Valid @RequestParam(value = "filter", required = false) String filter) {

        try {
            String datafree = "{}";
            RestTemplate restTemplate = new RestTemplate();
            ApiService apiService = new ApiService(restTemplate);

            String data = apiService.getDataFromFirstApi(
                    "https://api.weatherapi.com/v1/forecast.json?key=1244099aeaee4b179e6111803241304&q=" + q
                            + "&days=" + days + "&aqi=yes&alerts=" + alerts);

            ResponseEntity<Modelforecast> response = new ResponseEntity<Modelforecast>(objectMapper.readValue(
                    data, Modelforecast.class), HttpStatus.ACCEPTED);

            ResponseEntity<Modelforecast> response2 = new ResponseEntity<Modelforecast>(objectMapper.readValue(
                    datafree, Modelforecast.class), HttpStatus.ACCEPTED);

            String[] filterlist = filter.split(",");

            for (String filterindex : filterlist) {

                switch (filterindex) {
                    case "last_updated_epoch":
                        response2.getBody().getCurrent()
                                .setLastUpdatedEpoch(response.getBody().getCurrent().getLastUpdatedEpoch());
                        break;
                    case "last_updated":
                        response2.getBody().getCurrent()
                                .setLastUpdated(response.getBody().getCurrent().getLastUpdated());
                        break;
                    case "temp_c":
                        response2.getBody().getCurrent().setTempC(response.getBody().getCurrent().getTempC());
                        break;
                    case "temp_f":
                        response2.getBody().getCurrent().setTempF(response.getBody().getCurrent().getTempF());
                        break;
                    case "id_day":
                        response2.getBody().getCurrent().setIdDay(response.getBody().getCurrent().getIdDay());
                        break;
                    case "condition":
                        response2.getBody().getCurrent().setCondition(response.getBody().getCurrent().getCondition());
                        break;
                    case "wind_mph":
                        response2.getBody().getCurrent().setWindMph(response.getBody().getCurrent().getWindMph());
                        break;
                    case "wind_kph":
                        response2.getBody().getCurrent().setWindKph(response.getBody().getCurrent().getWindKph());
                        break;
                    case "wind_degree":
                        response2.getBody().getCurrent().setWindDegree(response.getBody().getCurrent().getWindDegree());
                        break;
                    case "wind_dir":
                        response2.getBody().getCurrent().setWindDir(response.getBody().getCurrent().getWindDir());
                        break;
                    case "pressure_mb":
                        response2.getBody().getCurrent().setPressureMb(response.getBody().getCurrent().getPressureMb());
                        break;
                    case "pressure_in":
                        response2.getBody().getCurrent().setPressureIn(response.getBody().getCurrent().getPressureIn());
                        break;
                    case "precip_mm":
                        response2.getBody().getCurrent().setPrecipMm(response.getBody().getCurrent().getPrecipMm());
                        break;
                    case "precip_in":
                        response2.getBody().getCurrent().setPrecipIn(response.getBody().getCurrent().getPrecipIn());
                        break;
                    case "humidity":
                        response2.getBody().getCurrent().setHumidity(response.getBody().getCurrent().getHumidity());
                        break;
                    case "cloud":
                        response2.getBody().getCurrent().setCloud(response.getBody().getCurrent().getCloud());
                        break;
                    case "feelslike_c":
                        response2.getBody().getCurrent().setFeelslikeC(response.getBody().getCurrent().getFeelslikeC());
                        break;
                    case "feelslike_f":
                        response2.getBody().getCurrent().setFeelslikeF(response.getBody().getCurrent().getFeelslikeF());
                        break;
                    case "windchill_c":
                        response2.getBody().getCurrent().setWindchillC(response.getBody().getCurrent().getWindchillC());
                        break;
                    case "windchill_f":
                        response2.getBody().getCurrent().setWindchillF(response.getBody().getCurrent().getWindchillF());
                        break;
                    case "heatindex_c":
                        response2.getBody().getCurrent().setHeatindexC(response.getBody().getCurrent().getHeatindexC());
                        break;
                    case "heatindex_f":
                        response2.getBody().getCurrent().setHeatindexF(response.getBody().getCurrent().getHeatindexF());
                        break;
                    case "dewpoint_c":
                        response2.getBody().getCurrent().setDewpointC(response.getBody().getCurrent().getDewpointC());
                        break;
                    case "dewpoint_f":
                        response2.getBody().getCurrent().setDewpointF(response.getBody().getCurrent().getDewpointF());
                        break;
                    case "vis_km":
                        response2.getBody().getCurrent().setVisKm(response.getBody().getCurrent().getVisKm());
                        break;
                    case "vis_miles":
                        response2.getBody().getCurrent().setVisMiles(response.getBody().getCurrent().getVisMiles());
                        break;
                    case "uv":
                        response2.getBody().getCurrent().setUv(response.getBody().getCurrent().getUv());
                        break;
                    case "gust_mph":
                        response2.getBody().getCurrent().setGustMph(response.getBody().getCurrent().getGustMph());
                        break;
                    case "gust_kph":
                        response2.getBody().getCurrent().setGustKph(response.getBody().getCurrent().getGustKph());
                        break;
                    case "air_quality":
                        response2.getBody().getCurrent().setAirQuality(response.getBody().getCurrent().getAirQuality());
                        break;
                    case "name":
                        response2.getBody().getLocation().setName(response.getBody().getLocation().getName());
                        break;
                    case "region":
                        response2.getBody().getLocation().setRegion(response.getBody().getLocation().getRegion());
                        break;
                    case "country":
                        response2.getBody().getLocation().setCountry(response.getBody().getLocation().getCountry());
                        break;
                    case "lon":
                        response2.getBody().getLocation().setLon(response.getBody().getLocation().getLon());
                        break;
                    case "lat":
                        response2.getBody().getLocation().setLat(response.getBody().getLocation().getLat());
                        break;
                    case "tz_id":
                        response2.getBody().getLocation().setTzId(response.getBody().getLocation().getTzId());
                        break;
                    case "localtime_epoch":
                        response2.getBody().getLocation()
                                .setLocaltimeEpoch(response.getBody().getLocation().getLocaltimeEpoch());
                        break;
                    case "localtime":
                        response2.getBody().getLocation().setLocaltime(response.getBody().getLocation().getLocaltime());
                        break;
                    case "co":
                        response2.getBody().getCurrent().getAirQuality()
                                .setCo(response.getBody().getCurrent().getAirQuality().getCo());
                        break;
                    case "no2":
                        response2.getBody().getCurrent().getAirQuality()
                                .setNo2(response.getBody().getCurrent().getAirQuality().getNo2());
                        break;
                    case "o3":
                        response2.getBody().getCurrent().getAirQuality()
                                .setO3(response.getBody().getCurrent().getAirQuality().getO3());
                        break;
                    case "so2":
                        response2.getBody().getCurrent().getAirQuality()
                                .setSo2(response.getBody().getCurrent().getAirQuality().getSo2());
                        break;
                    case "pm2_5":
                        response2.getBody().getCurrent().getAirQuality()
                                .setPm25(response.getBody().getCurrent().getAirQuality().getPm25());
                        break;
                    case "pm10":
                        response2.getBody().getCurrent().getAirQuality()
                                .setPm10(response.getBody().getCurrent().getAirQuality().getPm10());
                        break;
                    case "us-epa-index":
                        response2.getBody().getCurrent().getAirQuality()
                                .setUsEpaIndex(response.getBody().getCurrent().getAirQuality().getUsEpaIndex());
                        break;
                    case "gb-defra-index":
                        response2.getBody().getCurrent().getAirQuality()
                                .setGbDefraIndex(response.getBody().getCurrent().getAirQuality().getGbDefraIndex());
                        break;
                    case "text":
                        response2.getBody().getCurrent().getCondition()
                                .setText(response.getBody().getCurrent().getCondition().getText());
                        break;
                    case "icon":
                        response2.getBody().getCurrent().getCondition()
                                .setIcon(response.getBody().getCurrent().getCondition().getIcon());
                        break;
                    case "code":
                        response2.getBody().getCurrent().getCondition()
                                .setCode(response.getBody().getCurrent().getCondition().getCode());
                        break;

                    // Forecast

                    case "date":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .setDate(response.getBody().getForecast().getForecastday().get(i).getDate());
                        }
                        break;

                    case "date_epoch":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .setDateEpoch(
                                            response.getBody().getForecast().getForecastday().get(i).getDateEpoch());
                        }
                        break;

                    case "maxtemp_c":

                        for (int i = 0; i < days; i++) {

                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }

                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getDay().setMaxtempC(
                                            response.getBody().getForecast().getForecastday().get(i).getDay()
                                                    .getMaxtempC());

                        }
                        break;

                    case "maxtemp_f":
                        for (int i = 0; i < days; i++) {

                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }

                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getDay().setMaxtempF(
                                            response.getBody().getForecast().getForecastday().get(i).getDay()
                                                    .getMaxtempF());

                        }
                        break;
                    case "mintemp_c":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getDay().setMintempC(
                                            response.getBody().getForecast().getForecastday().get(i).getDay()
                                                    .getMintempC());
                        }
                        break;
                    case "mintemp_f":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getDay().setMintempF(
                                            response.getBody().getForecast().getForecastday().get(i).getDay()
                                                    .getMintempF());
                        }
                        break;
                    case "avgtemp_c":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getDay().setAvgtempC(
                                            response.getBody().getForecast().getForecastday().get(i).getDay()
                                                    .getAvgtempC());
                        }
                        break;
                    case "avgtemp_f":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getDay().setAvgtempF(
                                            response.getBody().getForecast().getForecastday().get(i).getDay()
                                                    .getAvgtempF());
                        }
                        break;
                    case "maxwind_mph":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getDay().setMaxwindMph(
                                            response.getBody().getForecast().getForecastday().get(i).getDay()
                                                    .getMaxwindMph());
                        }
                        break;
                    case "maxwind_kph":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getDay().setMaxwindKph(
                                            response.getBody().getForecast().getForecastday().get(i).getDay()
                                                    .getMaxwindKph());
                        }
                        break;
                    case "totalprecip_mm":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getDay().setTotalprecipMm(
                                            response.getBody().getForecast().getForecastday().get(i).getDay()
                                                    .getTotalprecipMm());
                        }
                        break;
                    case "totalprecip_in":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getDay().setTotalprecipIn(
                                            response.getBody().getForecast().getForecastday().get(i).getDay()
                                                    .getTotalprecipIn());
                        }
                        break;
                    case "avgvis_km":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getDay().setAvgvisKm(
                                            response.getBody().getForecast().getForecastday().get(i).getDay()
                                                    .getAvgvisKm());
                        }
                        break;
                    case "avgvis_miles":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getDay().setAvgvisMiles(
                                            response.getBody().getForecast().getForecastday().get(i).getDay()
                                                    .getAvgvisMiles());
                        }
                        break;
                    case "avghumidity":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getDay().setAvghumidity(
                                            response.getBody().getForecast().getForecastday().get(i).getDay()
                                                    .getAvghumidity());
                        }
                        break;
                    case "daily_will_it_rain":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getDay().setDailyWillItRain(
                                            response.getBody().getForecast().getForecastday().get(i).getDay()
                                                    .getDailyWillItRain());
                        }
                        break;
                    case "daily_chance_of_rain":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getDay().setDailyChanceOfRain(
                                            response.getBody().getForecast().getForecastday().get(i).getDay()
                                                    .getDailyChanceOfRain());
                        }
                        break;
                    case "daily_will_it_snow":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getDay().setDailyWillItSnow(
                                            response.getBody().getForecast().getForecastday().get(i).getDay()
                                                    .getDailyWillItSnow());
                        }
                        break;
                    case "daily_chance_of_snow":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getDay().setDailyChanceOfSnow(
                                            response.getBody().getForecast().getForecastday().get(i).getDay()
                                                    .getDailyChanceOfSnow());
                        }
                        break;
                    case "uv_day":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getDay().setUv(
                                            response.getBody().getForecast().getForecastday().get(i).getDay()
                                                    .getUv());
                        }
                        break;

                    // astro

                    case "sunrise":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getAstro().setSunrise(
                                            response.getBody().getForecast().getForecastday().get(i).getAstro()
                                                    .getSunrise());
                        }
                        break;
                    case "sunset":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getAstro().setSunset(
                                            response.getBody().getForecast().getForecastday().get(i).getAstro()
                                                    .getSunset());
                        }
                        break;
                    case "moonrise":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getAstro().setMoonrise(
                                            response.getBody().getForecast().getForecastday().get(i).getAstro()
                                                    .getMoonrise());
                        }
                        break;
                    case "moonset":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getAstro().setMoonset(
                                            response.getBody().getForecast().getForecastday().get(i).getAstro()
                                                    .getMoonset());
                        }
                        break;
                    case "moon_phase":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getAstro().setMoonPhase(
                                            response.getBody().getForecast().getForecastday().get(i).getAstro()
                                                    .getMoonPhase());
                        }
                        break;
                    case "moon_illumination":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            response2.getBody().getForecast().getForecastday().get(i)
                                    .getAstro().setMoonIllumination(
                                            response.getBody().getForecast().getForecastday().get(i).getAstro()
                                                    .getMoonIllumination());
                        }
                        break;

                    // hourly

                    case "hourly_time_epoch":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setTimeEpoch(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getTimeEpoch());
                            }
                        }
                        break;

                    case "hourly_time":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setTime(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getTime());
                            }
                        }
                        break;
                    case "hourly_temp_c":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setTempC(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getTempC());
                            }
                        }
                        break;
                    case "hourly_temp_f":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setTempF(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getTempF());
                            }
                        }
                        break;
                    case "hourly_is_day":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setIsDay(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getIsDay());
                            }
                        }
                        break;
                    case "hourly_wind_mph":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setWindMph(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getWindMph());
                            }
                        }
                        break;
                    case "hourly_wind_kph":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setWindKph(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getWindKph());
                            }
                        }
                        break;
                    case "hourly_wind_degree":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setWindDegree(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getWindDegree());
                            }
                        }
                        break;
                    case "hourly_wind_dir":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setWindDir(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getWindDir());
                            }
                        }
                        break;
                    case "hourly_pressure_mb":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setPressureMb(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getPressureMb());
                            }
                        }
                        break;
                    case "hourly_pressure_in":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setPressureIn(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getPressureIn());
                            }
                        }
                        break;
                    case "hourly_precip_mm":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setPrecipMm(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getPrecipMm());
                            }
                        }
                        break;
                    case "hourly_precip_in":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setPrecipIn(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getPrecipIn());
                            }
                        }
                        break;
                    case "hourly_humidity":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setHumidity(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getHumidity());
                            }
                        }
                        break;
                    case "hourly_cloud":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setCloud(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getCloud());
                            }
                        }
                        break;
                    case "hourly_feelslike_c":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setFeelslikeC(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getFeelslikeC());
                            }
                        }
                        break;
                    case "hourly_feelslike_f":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setFeelslikeF(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getFeelslikeF());
                            }
                        }
                        break;
                    case "hourly_windchill_c":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setWindchillC(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getWindchillC());
                            }
                        }
                        break;
                    case "hourly_windchill_f":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setWindchillF(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getWindchillF());
                            }
                        }
                        break;
                    case "hourly_heatindex_c":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setHeatindexC(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getHeatindexC());
                            }
                        }
                        break;
                    case "hourly_heatindex_f":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setHeatindexF(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getHeatindexF());
                            }
                        }
                        break;
                    case "hourly_dewpoint_c":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setDewpointC(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getDewpointC());
                            }
                        }
                        break;
                    case "hourly_dewpoint_f":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setDewpointF(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getDewpointF());
                            }
                        }
                        break;
                    case "hourly_will_it_rain":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setWillItRain(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getWillItRain());
                            }
                        }
                        break;
                    case "hourly_chance_of_rain":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setChanceOfRain(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getChanceOfRain());
                            }
                        }
                        break;
                    case "hourly_will_it_snow":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setWillItSnow(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getWillItSnow());
                            }
                        }
                        break;
                    case "hourly_chance_of_snow":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setChanceOfSnow(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getChanceOfSnow());
                            }
                        }
                        break;
                    case "hourly_vis_km":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setVisKm(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getVisKm());
                            }
                        }
                        break;
                    case "hourly_vis_miles":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setVisMiles(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getVisMiles());
                            }
                        }
                        break;
                    case "hourly_gust_mph":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setGustMph(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getGustMph());
                            }
                        }
                        break;
                    case "hourly_gust_kph":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setGustKph(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getGustKph());
                            }
                        }
                        break;
                    case "hourly_uv":
                        for (int i = 0; i < days; i++) {
                            try {
                                response2.getBody().getForecast().getForecastday().get(i);
                            } catch (Exception e) {
                                response2.getBody().getForecast().addForecastdayItem(new ForecastDay());
                            }
                            for (int j = 0; j < 24; j++) {
                                try {
                                    response2.getBody().getForecast().getForecastday().get(i).getHour().get(j);
                                } catch (Exception e) {
                                    response2.getBody().getForecast().getForecastday().get(i)
                                            .addHourItem(new HourCondition());
                                }
                                response2.getBody().getForecast().getForecastday().get(i)
                                        .getHour().get(j).setUv(
                                                response.getBody().getForecast().getForecastday().get(i).getHour()
                                                        .get(j)
                                                        .getUv());
                            }
                        }
                        break;

                    default:
                        break;
                }
            }

            return response2;
        } catch (IOException e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Modelforecast>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
