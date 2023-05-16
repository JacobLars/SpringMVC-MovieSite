
package com.example.SpringMovieProject.controller;

import com.example.SpringMovieProject.models.Movie;
import com.example.SpringMovieProject.models.Search;
import com.example.SpringMovieProject.models.SearchForm;
import com.example.SpringMovieProject.service.MovieService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;


@Controller

public class MovieController {
    
    @Autowired
    MovieService service;
    
    
    @GetMapping("/home")
    public String renderHomePage(Model model, @ModelAttribute("searchForm") SearchForm searchForm){
        String movieName = searchForm.getSearchTerm();
        List<Search> movies = service.getMovieSearch(movieName);

        model.addAttribute("movieList", movies);
        return "index.html";
    }
    
    
    @GetMapping("/movie/{imdbId}")
    public String getMoviePage(@PathVariable("imdbId") String imdbId, Model model){
        Movie movie = service.getMovie(imdbId);
        
   
        String type = movie.getType();
        model.addAttribute("ratings", movie.getRatings());
        model.addAttribute("movie", movie);
        model.addAttribute("movieType", type);
        
       
        
        return "moviePage.html";
    }
    
}
