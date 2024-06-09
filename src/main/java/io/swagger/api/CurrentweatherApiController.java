package io.swagger.api;

import io.swagger.model.Model200;
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
public class CurrentweatherApiController implements CurrentweatherApi {

    private static final Logger log = LoggerFactory.getLogger(CurrentweatherApiController.class);

    private final ObjectMapper objectMapper;

    @SuppressWarnings("unused")
    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CurrentweatherApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Model200> currentWeatherData(
            @NotNull @Parameter(in = ParameterIn.QUERY, description = "For the query value, type the city name and optionally the country code divided by comma; use ISO 3166 country codes.", required = true, schema = @Schema()) @Valid @RequestParam(value = "q", required = true) String q,
            @Parameter(in = ParameterIn.QUERY, description = "filter parameter", schema = @Schema()) @Valid @RequestParam(value = "filter", required = false) String filter) {
        try {
            String datafree = "{}";
            RestTemplate restTemplate = new RestTemplate();
            ApiService apiService = new ApiService(restTemplate);

            String data = apiService.getDataFromFirstApi(
                    "https://api.weatherapi.com/v1/current.json?key=1244099aeaee4b179e6111803241304&q=" + q
                            + "&aqi=yes");

            ResponseEntity<Model200> response = new ResponseEntity<Model200>(objectMapper.readValue(
                    data, Model200.class), HttpStatus.ACCEPTED);
            ResponseEntity<Model200> response2 = new ResponseEntity<Model200>(objectMapper.readValue(
                    datafree, Model200.class), HttpStatus.ACCEPTED);
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
                    default:
                        break;
                }
            }
            return response2;
        } catch (IOException e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Model200>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
