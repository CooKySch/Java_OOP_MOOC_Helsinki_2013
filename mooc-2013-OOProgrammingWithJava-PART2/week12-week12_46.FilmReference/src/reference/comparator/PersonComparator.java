package reference.comparator;
import reference.domain.*;
import java.util.*;

public class PersonComparator implements Comparator<Person> {
    private Map<Person, Integer> peopleIdentities;

    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        this.peopleIdentities = peopleIdentities;
    }


    @Override
    public int compare(Person person, Person other) {
        return peopleIdentities.get(other) - peopleIdentities.get(person);

    }
}
