package movie.marina.service;

import movie.marina.model.Movie;

import java.util.List;
import java.util.Map;

public interface MovieServiceRating {

    Map<String, List<Movie>> updateMoviesRating(String ShowDate, List <Movie> updateMovie);
}
