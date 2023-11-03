package movie.marina.controller;

import movie.marina.model.Movie;
import movie.marina.service.MovieService;
import movie.marina.service.MovieServiceRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    MovieService service;

    @Autowired
    MovieServiceRating serviceRating;

    @GetMapping
    ResponseEntity<Map<String, List<Movie>>> getMovies() {
        return new ResponseEntity<Map<String, List<Movie>>>(service. findAllMovies(), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<Map<String, List<Movie>>> updateMoviesRating(String ShowDate, List <Movie> updateMovie) {
        return new ResponseEntity<Map<String, List<Movie>>>(serviceRating.updateMoviesRating(ShowDate, updateMovie), HttpStatus.OK);
    }
}
