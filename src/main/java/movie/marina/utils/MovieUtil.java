package movie.marina.utils;

import movie.marina.model.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieUtil {
    static Map<String, List<Movie>> movie = new HashMap<>();
    public static Map<String, List<Movie>> getMovieDetails() {
        //Map<String, List<Movie>> movie = new HashMap<>();
        List <Movie> m1 = new ArrayList<>();
        m1.add(new Movie( "Shole" , "10-10-1985", "09-Nov-2023",
                "NA", "Action", 3));
        m1.add(new Movie( "Drishyam" , "10-10-2005", "09-Nov-2023",
                "NA", "Thriller", 2));
        m1.add(new Movie( "harry potter" , "10-10-2010", "09-Nov-2023",
                "NA", "Thriller", 1));

        movie.put("09-Nov-2023", m1);
        movie.put("10-Dec-2023", m1);
        return movie;
    }

    public static Map<String, List<Movie>> updateMovieRatings(String ShowDate, List <Movie> updateMovie) {
       movie.put("ShowDate", updateMovie);
       return movie;
    }
}
