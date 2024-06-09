package io.swagger.api;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.model.InlineResponse200;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-04T09:41:03.559554872Z[GMT]")
@RestController
public class HistoricalweatherApiController implements HistoricalweatherApi {

    private static final Logger log = LoggerFactory.getLogger(HistoricalweatherApiController.class);

    private final ObjectMapper objectMapper;

    @SuppressWarnings("unused")
    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public HistoricalweatherApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse200> historicalWeatherData(

            @NotNull @Parameter(in = ParameterIn.QUERY, description = "Latitude of the location", required = true, schema = @Schema()) @Valid @RequestParam(value = "latitude", required = true) Float latitude,

            @NotNull @Parameter(in = ParameterIn.QUERY, description = "Longitude of the location", required = true, schema = @Schema()) @Valid @RequestParam(value = "longitude", required = true) Float longitude,

            @NotNull @Parameter(in = ParameterIn.QUERY, description = "The time interval to get weather data. A day must be specified as an ISO8601 date (e.g. 2022-12-31).", required = true, schema = @Schema()) @Valid @RequestParam(value = "start_date", required = true) String start_date,

            @NotNull @Parameter(in = ParameterIn.QUERY, description = "The time interval to get weather data. A day must be specified as an ISO8601 date (e.g. 2022-12-31).", required = true, schema = @Schema()) @Valid @RequestParam(value = "end_date", required = true) String end_date,

            @Parameter(in = ParameterIn.QUERY, description = "If fahrenheit is set, all temperature values are converted to Fahrenheit.", required = true, schema = @Schema()) @Valid @RequestParam(value = "temperature_unit", required = true) String temperature_unit,

            @Parameter(in = ParameterIn.QUERY, description = "Other wind speed speed units: ms, mph and kn", required = true, schema = @Schema()) @Valid @RequestParam(value = "wind_speed_unit", required = true) String wind_speed_unit,

            @Parameter(in = ParameterIn.QUERY, description = "Other precipitation amount units: inch", required = true, schema = @Schema()) @Valid @RequestParam(value = "precipitation_unit", required = true) String precipitation_unit,

            @Parameter(in = ParameterIn.QUERY, description = "If timezone is set, all timestamps are returned as local-time and data is returned starting at 00:00 local-time. Any time zone name from the time zone database is supported If auto is set as a time zone, the coordinates will be automatically resolved to the local time zone. For multiple coordinates, a comma separated list of timezones can be specified.", required = false, schema = @Schema()) @Valid @RequestParam(value = "timezone", required = false) String timezone,

            @Parameter(in = ParameterIn.QUERY, description = "filter parameter hourly", required = false, schema = @Schema()) @Valid @RequestParam(value = "filterHourly", required = false) String filterHourly,

            @Parameter(in = ParameterIn.QUERY, description = "filter parameter daily", required = false, schema = @Schema()) @Valid @RequestParam(value = "filterDaily", required = false) String filterDaily

    ) {
        try {

            RestTemplate restTemplate = new RestTemplate();
            ApiService apiService = new ApiService(restTemplate);

            // Test Url:
            // http://localhost:8080/historicalweather?latitude=48.7823&longitude=9.177&start_date=2024-05-24&end_date=2024-06-07&filterHourly=precipitation,temperature_2m&filterDaily=precipitation_sum,temperature_2m_max&temperature_unit=celsius&wind_speed_unit=kmh&precipitation_unit=mm

            String data = apiService.getDataFromFirstApi(
                    "https://archive-api.open-meteo.com/v1/archive?latitude=" + latitude + "&longitude=" + longitude
                            + "&start_date=" + start_date + "&end_date=" + end_date
                            + "&hourly=" + filterHourly + "&daily=" + filterDaily + "&temperature_unit="
                            + temperature_unit + "&wind_speed_unit=" + wind_speed_unit + "&precipitation_unit="
                            + precipitation_unit);

            ResponseEntity<InlineResponse200> response = new ResponseEntity<InlineResponse200>(objectMapper.readValue(
                    data, InlineResponse200.class), HttpStatus.ACCEPTED);

            return response;
        } catch (IOException e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
