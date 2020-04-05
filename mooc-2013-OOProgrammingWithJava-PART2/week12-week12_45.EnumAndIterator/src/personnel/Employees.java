package personnel;

import java.util.*;

public class Employees {
    private List<Person> personnel = new ArrayList<Person>();

    public Employees(){

    }
    public void add(Person person) {
        this.personnel.add(person);
    }

    public void add(List<Person> persons) {
        Iterator<Person> personIterator = persons.iterator();
        while (personIterator.hasNext()) {
            this.personnel.add(personIterator.next());
        }
    }

    public void print() {
        Iterator<Person> personIterator = this.personnel.iterator();
        while (personIterator.hasNext()) {
            System.out.println(personIterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> personIterator = this.personnel.iterator();
        while (personIterator.hasNext()) {
            Person toPrint = personIterator.next();
            if (toPrint.getEducation() == education) {
                System.out.println(toPrint);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> personIterator = this.personnel.iterator();
        while (personIterator.hasNext()) {
            if (personIterator.next().getEducation() == education) {
                personIterator.remove();
            }
        }
    }


}
