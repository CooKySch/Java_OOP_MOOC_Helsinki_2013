package reference;


import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.domain.*;

import java.lang.reflect.Array;
import java.util.*;

public class Reference {
    private RatingRegister ratingRegister;

    public Reference(RatingRegister ratingRegister) {
        this.ratingRegister = ratingRegister;
    }

    public Film recommendFilm(Person person) {
        Map<Film, Rating> personalRatings = ratingRegister.getPersonalRatings(person);
        List<Person> reviewers = ratingRegister.reviewers();
        if (personalRatings.keySet().size() == 0) {
            Map<Film, List<Rating>> filmRatings = ratingRegister.filmRatings();
            ArrayList<Film> films = new ArrayList<Film>(ratingRegister.filmRatings().keySet());
            Collections.sort(films, new FilmComparator(filmRatings));
            return films.get(0);
        } else {
            Map<Person, Integer> peopleScores = new HashMap<Person, Integer>();
            //for every person, calculate a similarity score and put these in a hashmap.
            for (Person reviewer : reviewers) {
                Map<Film, Rating> reviewerRatings = ratingRegister.getPersonalRatings(reviewer);
                int similarity = 0;
                for (Film key : personalRatings.keySet()) {
                    int ratingOfReviewer;
                    if (!reviewerRatings.containsKey(key)) {
                        ratingOfReviewer = 0;
                    } else {
                        ratingOfReviewer = reviewerRatings.get(key).getValue();
                    }
                    similarity += (personalRatings.get(key).getValue() * ratingOfReviewer);
                }
                peopleScores.put(reviewer, similarity);
            }
            //sort according to similarity.
            Collections.sort(reviewers, new PersonComparator(peopleScores));
            //ratingRegister.reviewers() is now a sorted list. First in index is most similar.
            Person mostSimilar;
            if (reviewers.get(0) == person) {
                mostSimilar = reviewers.get(1);
                System.out.println(mostSimilar);
            } else {
                mostSimilar = reviewers.get(0);
            }
            Map<Film, List<Rating>> filmRatings = new HashMap<Film, List<Rating>>();
            for (Film key : ratingRegister.getPersonalRatings(mostSimilar).keySet()) {
                filmRatings.put(key, new ArrayList<Rating>());
                filmRatings.get(key).add(ratingRegister.getPersonalRatings(mostSimilar).get(key));
            }
            ArrayList<Film> films = new ArrayList<Film>(filmRatings.keySet());
            Collections.sort(films, new FilmComparator(filmRatings));
            int i = 0;
            while (i < films.size()) {
                if (!personalRatings.containsKey(films.get(i)) && filmRatings.get(films.get(i)).get(0).getValue() > 1) {
                    return films.get(i);
                }
                i++;
            }
            return null;
        }
    }
}
