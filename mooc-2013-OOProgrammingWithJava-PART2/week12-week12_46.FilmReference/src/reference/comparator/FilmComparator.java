package reference.comparator;
import reference.domain.*;

import java.lang.reflect.Array;
import java.util.*;

public class FilmComparator implements Comparator<Film> {
    private Map<Film, List<Rating>> ratings = new HashMap<Film, List<Rating>>();

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings =ratings;
    }

    @Override
    public int compare(Film film, Film other) {
        return averageRatings(other) - averageRatings(film);
    }

    public int averageRatings(Film film) {
        ArrayList<Rating> toSum = new ArrayList<Rating>();
        for (Rating rating : this.ratings.get(film)) {
            toSum.add(rating);
        }
        int sum = 0;
        for (Rating rating : toSum) {
            sum += rating.getValue();
        }
        return sum/toSum.size();
    }
}
