import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> book = new ArrayList<Person>();


    public Phonebook() {
    }

    public void add(String name, String number){
        Person newPerson = new Person(name, number);
        this.book.add(newPerson);
    }

    public void printAll(){
        for (Person person : book) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        for (Person person : book) {
            if (person.getName().contains(name)) {
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
