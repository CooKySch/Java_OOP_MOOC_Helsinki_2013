package reference;
import reference.domain.*;

import java.util.*;

public class RatingRegister {
    private Map<Film, List<Rating>> filmRatings = new HashMap<Film, List<Rating>>();
    private Map<Person, Map<Film, Rating>> personalFilmRatings = new HashMap<Person, Map<Film, Rating>>();

    public RatingRegister() {

    }

    public void addRating(Film film, Rating rating) {
        if (!filmRatings.containsKey(film)) {
            filmRatings.put(film, new ArrayList<Rating>());
        }
        filmRatings.get(film).add(rating);
    }

    public List<Rating> getRatings(Film film) {
        return filmRatings.get(film);
    }

    public Map<Film, List<Rating>> filmRatings() {
        return filmRatings;
    }

    public void addRating(Person person, Film film, Rating rating) {
        if (!personalFilmRatings.containsKey(person)) {
            personalFilmRatings.put(person, new HashMap<Film, Rating>());
        }
        personalFilmRatings.get(person).put(film, rating);
        addRating(film, rating);
    }

    public Rating getRating(Person person, Film film) {
        if (personalFilmRatings.containsKey(person)) {
            if (personalFilmRatings.get(person).containsKey(film)) {
                return (personalFilmRatings.get(person).get(film));
            }
        }
        return Rating.NOT_WATCHED;
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (personalFilmRatings.containsKey(person)) {
            return personalFilmRatings.get(person);
        } else {
            return new HashMap<Film, Rating>();
        }
    }

    public List<Person> reviewers() {
        List<Person> reviewers = new ArrayList<Person>(personalFilmRatings.keySet());
        return reviewers;
    }
}
