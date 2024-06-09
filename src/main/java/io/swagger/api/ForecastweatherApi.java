
package io.swagger.api;

import io.swagger.model.Model200;
import io.swagger.model.Modelforecast;
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
public interface ForecastweatherApi {

        @Operation(summary = "Call forecast weather data for one location", description = "Get the forecast weather info", tags = {
                        "Forecast Weather Data" })
        @ApiResponses(value = {
                        @ApiResponse(responseCode = "200", description = "Successful response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Model200.class))),

                        @ApiResponse(responseCode = "404", description = "Not found response", content = @Content(mediaType = "text/plain", schema = @Schema(implementation = String.class))) })
        @RequestMapping(value = "/forecastweather", produces = { "application/json",
                        "text/plain" }, method = RequestMethod.GET)
        ResponseEntity<Modelforecast> forecastWeatherData(
                        @NotNull @Parameter(in = ParameterIn.QUERY, description = "For the query value, type the city name and optionally the country code divided by comma; use ISO 3166 country codes.", required = true, schema = @Schema()) @Valid @RequestParam(value = "q", required = true) String q,

                        @Parameter(in = ParameterIn.QUERY, description = "forcast days", required = true, schema = @Schema()) @Valid @RequestParam(value = "days", required = true) int days,

                        @Parameter(in = ParameterIn.QUERY, description = "show alerts", required = true, schema = @Schema()) @Valid @RequestParam(value = "alerts", required = true) String alerts,

                        @Parameter(in = ParameterIn.QUERY, description = "filter parameter", required = false, schema = @Schema()) @Valid @RequestParam(value = "filter", required = false) String filter);

}
