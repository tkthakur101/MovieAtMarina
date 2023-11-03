package movie.marina.service;

import movie.marina.model.Movie;

import java.util.List;
import java.util.Map;

public interface MovieService
{
    Map<String, List<Movie>> findAllMovies();
}
