
package com.example.SpringMovieProject.models;

import java.util.LinkedHashMap;
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
    "Title",
    "Year",
    "imdbID",
    "Type",
    "Poster"
})
@Generated("jsonschema2pojo")
public class Search {

    @JsonProperty("Title")
    private String title;
    @JsonProperty("Year")
    private String year;
    @JsonProperty("imdbID")
    private String imdbID;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("Poster")
    private String poster;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("Title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("Year")
    public String getYear() {
        return year;
    }

    @JsonProperty("Year")
    public void setYear(String year) {
        this.year = year;
    }

    @JsonProperty("imdbID")
    public String getImdbID() {
        return imdbID;
    }

    @JsonProperty("imdbID")
    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("Poster")
    public String getPoster() {
        return poster;
    }

    @JsonProperty("Poster")
    public void setPoster(String poster) {
        this.poster = poster;
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
        return "Search{" + "title=" + title + ", year=" + year + ", imdbID=" + imdbID + ", type=" + type + ", poster=" + poster + ", additionalProperties=" + additionalProperties + '}';
    }

    
}
