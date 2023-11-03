package movie.marina.service.impl;

import movie.marina.model.Movie;
import movie.marina.service.MovieServiceRating;
import movie.marina.utils.MovieUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class MovieServiceRatingImpl implements MovieServiceRating {
    @Override
    public Map<String, List<Movie>> updateMoviesRating(String ShowDate, List<Movie> updateMovie) {
        return MovieUtil.updateMovieRatings(ShowDate, updateMovie);
    }
}
