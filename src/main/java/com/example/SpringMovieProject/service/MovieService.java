
package com.example.SpringMovieProject.service;

import com.example.SpringMovieProject.client.MovieClient;
import com.example.SpringMovieProject.models.Movie;
import com.example.SpringMovieProject.models.Search;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    
    MovieClient client = new MovieClient();
    
    @Value("${api_key}")
    private String key;
    
    public List<Search> getMovieSearch(String movieName){
        
        return client.getSearchResponse(movieName, key).getSearch();
    }
    
    
    public Movie getMovie(String imdbId){
        return client.getMovieInfo(imdbId, key);
    }
}
