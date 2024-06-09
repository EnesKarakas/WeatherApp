
package io.swagger.api;

import io.swagger.model.InlineResponse200;
import io.swagger.model.Model200;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-04T09:41:03.559554872Z[GMT]")
@Validated
public interface HistoricalweatherApi {

        @Operation(summary = "Call Historical weather data for one location", description = "Get the historical weather info", tags = {
                        "Historical Weather Data" })
        @ApiResponses(value = {
                        @ApiResponse(responseCode = "200", description = "Successful response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Model200.class))),

                        @ApiResponse(responseCode = "404", description = "Not found response", content = @Content(mediaType = "text/plain", schema = @Schema(implementation = String.class))) })
        @RequestMapping(value = "/historicalweather", produces = { "application/json",
                        "text/plain" }, method = RequestMethod.GET)
        ResponseEntity<InlineResponse200> historicalWeatherData(
                        @NotNull @Parameter(in = ParameterIn.QUERY, description = "Latitude of the location", required = true, schema = @Schema()) @Valid @RequestParam(value = "latitude", required = true) Float latitude,

                        @NotNull @Parameter(in = ParameterIn.QUERY, description = "Longitude of the location", required = true, schema = @Schema()) @Valid @RequestParam(value = "longitude", required = true) Float longitude,

                        @NotNull @Parameter(in = ParameterIn.QUERY, description = "The time interval to get weather data. A day must be specified as an ISO8601 date (e.g. 2022-12-31).", required = true, schema = @Schema()) @Valid @RequestParam(value = "start_date", required = true) String start_date,

                        @NotNull @Parameter(in = ParameterIn.QUERY, description = "The time interval to get weather data. A day must be specified as an ISO8601 date (e.g. 2022-12-31).", required = true, schema = @Schema()) @Valid @RequestParam(value = "end_date", required = true) String end_date,

                        @Parameter(in = ParameterIn.QUERY, description = "If fahrenheit is set, all temperature values are converted to Fahrenheit.", required = true, schema = @Schema()) @Valid @RequestParam(value = "temperature_unit", required = true) String temperature_unit,

                        @Parameter(in = ParameterIn.QUERY, description = "Other wind speed speed units: ms, mph and kn", required = true, schema = @Schema()) @Valid @RequestParam(value = "wind_speed_unit", required = true) String wind_speed_unit,

                        @Parameter(in = ParameterIn.QUERY, description = "Other precipitation amount units: inch", required = true, schema = @Schema()) @Valid @RequestParam(value = "precipitation_unit", required = true) String precipitation_unit,

                        @Parameter(in = ParameterIn.QUERY, description = "If timezone is set, all timestamps are returned as local-time and data is returned starting at 00:00 local-time. Any time zone name from the time zone database is supported If auto is set as a time zone, the coordinates will be automatically resolved to the local time zone. For multiple coordinates, a comma separated list of timezones can be specified.", required = false, schema = @Schema()) @Valid @RequestParam(value = "timezone", required = false) String timezone,

                        @Parameter(in = ParameterIn.QUERY, description = "filter parameter hourly", required = false, schema = @Schema()) @Valid @RequestParam(value = "filterHourly", required = false) String filterHourly,

                        @Parameter(in = ParameterIn.QUERY, description = "filter parameter daily", required = false, schema = @Schema()) @Valid @RequestParam(value = "filterDaily", required = false) String filterDaily);

}
