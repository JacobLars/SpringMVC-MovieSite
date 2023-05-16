package com.example.SpringMovieProject.client;

import com.example.SpringMovieProject.models.Movie;
import com.example.SpringMovieProject.models.SearchResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MovieClient {

    String baseUrl = "http://www.omdbapi.com/";
    ObjectMapper objectMapper = new ObjectMapper();

    public String getJsonStringMovieSearchResponse(String searchTerm, String key) {
        String searchUrl = baseUrl + "?s=" + searchTerm + "&apikey=" + key;
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<String> httpEntity = new HttpEntity<>(httpHeaders);
        ResponseEntity<String> response = restTemplate.exchange(searchUrl, HttpMethod.GET, httpEntity, String.class);

        if (response.getStatusCode() != HttpStatus.OK) {
            throw new RuntimeException("getMovieSearch failed");
        }
        return response.getBody();
    }

    public SearchResponse getSearchResponse(String searchTerm, String key) {
        String jsonStringMovies = getJsonStringMovieSearchResponse(searchTerm, key);

        try {
            SearchResponse searchResponse = objectMapper.readValue(jsonStringMovies, SearchResponse.class);
            return searchResponse;
        } catch (JsonProcessingException e) {
            System.out.println("Error!");
        }

        return null;
    }

    public String getMovieByImdbId(String imdbId, String key) {
        String searchUrl = baseUrl + "?i=" + imdbId + "&apikey=" + key;
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<String> httpEntity = new HttpEntity<>(httpHeaders);
        ResponseEntity<String> response = restTemplate.exchange(searchUrl, HttpMethod.GET, httpEntity, String.class);

        if (response.getStatusCode() != HttpStatus.OK) {
            throw new RuntimeException("getMovieSearch failed");
        }
        return response.getBody();
    }

    public Movie getMovieInfo(String imdbId, String key) {

        String movieInfo = getMovieByImdbId(imdbId, key);

        try {

            Movie movie = objectMapper.readValue(movieInfo, Movie.class);
            return movie;
        } catch (JsonProcessingException e) {
            System.out.println("Error!");
        }

        return null;
    }

  

}
