
package com.example.SpringMovieProject.models;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Search",
    "totalResults",
    "Response"
})
@Generated("jsonschema2pojo")
public class SearchResponse {

    @JsonProperty("Search")
    private List<Search> search;
    @JsonProperty("totalResults")
    private String totalResults;
    @JsonProperty("Response")
    private String response;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("Search")
    public List<Search> getSearch() {
        return search;
    }

    @JsonProperty("Search")
    public void setSearch(List<Search> search) {
        this.search = search;
    }

    @JsonProperty("totalResults")
    public String getTotalResults() {
        return totalResults;
    }

    @JsonProperty("totalResults")
    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    @JsonProperty("Response")
    public String getResponse() {
        return response;
    }

    @JsonProperty("Response")
    public void setResponse(String response) {
        this.response = response;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "SearchResponse{" + "search=" + search + ", totalResults=" + totalResults + ", response=" + response + ", additionalProperties=" + additionalProperties + '}';
    }
    
    
    
}
