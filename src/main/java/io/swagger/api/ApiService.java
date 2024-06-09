package io.swagger.api;

import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

public class ApiService {

    private final RestTemplate restTemplate;

    public ApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getDataFromFirstApi(String apiUrl) {
        ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class);
        return response.getBody();
    }
}
