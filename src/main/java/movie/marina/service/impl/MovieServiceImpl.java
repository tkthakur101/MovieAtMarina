package movie.marina.service.impl;

import movie.marina.model.Movie;
import movie.marina.service.MovieService;
import movie.marina.utils.MovieUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class MovieServiceImpl implements MovieService {
    @Override
    public Map<String, List<Movie>> findAllMovies() {
        return MovieUtil.getMovieDetails();
    }
}
