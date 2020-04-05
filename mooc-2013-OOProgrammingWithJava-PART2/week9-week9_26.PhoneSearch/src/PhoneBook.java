
import java.util.*;

public class PhoneBook {
    private Map<Person, Set<String>> phoneBook = new HashMap<Person, Set<String>>();

    public PhoneBook() {

    }

    public void add(String name, String number) {
        Person person = new Person(name);
        if (isInPhoneBook(person) == null) {
            phoneBook.put(person, new HashSet<String>());
        }
        Person inPhoneBook = isInPhoneBook(person);
        phoneBook.get(inPhoneBook).add(number);
    }

    public void searchByName(String name) {
        Person person = new Person(name);
        if (isInPhoneBook(person) != null) {
            Person inPhoneBook = isInPhoneBook(person);
            for (String number : phoneBook.get(inPhoneBook)) {
                System.out.println("  " + number);
            }
        } else {
            System.out.println("  not found");
        }
    }

    public void searchByNumber(String number) {
        String name = null;
        for (Map.Entry<Person, Set<String>> entry : phoneBook.entrySet()) {
            if (entry.getValue().contains(number)) {
                name = entry.getKey().getName();
            }
        }
        if (name != null) {
            System.out.println("  " + name);
        } else {
            System.out.println("  not found");
        }
    }

    public Person isInPhoneBook(Person person) {
        for (Person inBook : phoneBook.keySet()) {
            if (inBook.equals(person)) {
                return inBook;
            }
        }
        return null;
    }

    public void addAddress(String name, String address, String city) {
        Person person = new Person(name);
        if (isInPhoneBook(person) != null) {
            Person inPhoneBook = isInPhoneBook(person);
            inPhoneBook.setAddress(address, city);
        } else {
            person.setAddress(address, city);
            phoneBook.put(person, new HashSet<String>());
        }
    }

    public void searchPersonalInformation(String name) {
        Person person = new Person(name);
        if (isInPhoneBook(person) != null) {
            Person inPhoneBook = isInPhoneBook(person);
            if (inPhoneBook.getAddress() == null) {
                System.out.println("  address unknown");
            }
            System.out.println("  address: " + inPhoneBook.getAddress());
            System.out.println("  phone numbers:");
            if (phoneBook.get(inPhoneBook).size() == 0) {
                System.out.println("  phone number not found");
            }
            for (String number : phoneBook.get(inPhoneBook)) {
                System.out.println("    " + number);
            }
        } else {
            System.out.println("  not found");
        }
    }

    public void remove(String name) {
        Person person = new Person(name);
        if (isInPhoneBook(person) != null) {
            Person inPhoneBook = isInPhoneBook(person);
            phoneBook.remove(inPhoneBook);
        } else {
            System.out.println("not found");
        }
    }

    public void filteredSearch(String characterSequence) {
        boolean notFound = true;
        Map<Person, Set<String>> sortedmap = new TreeMap<Person, Set<String>>(this.phoneBook);
        for (Map.Entry<Person, Set<String>> entry : sortedmap.entrySet()) {
            if (characterSequence.isEmpty()) {
                printAll(entry);
                notFound = false;
            } else if (entry.getKey().toString().contains(characterSequence)) {
                printAll(entry);
                notFound = false;
            } else if (entry.getKey().getAddress() != null) {
                if (entry.getKey().getAddress().contains(characterSequence)) {
                    printAll(entry);
                    notFound = false;
                }
            }
        }
        if (notFound) {
            System.out.println("  keyword not found");
        }
    }

    public void printAll(Map.Entry<Person, Set<String>> entry) {
        System.out.println(entry.getKey().getName());
        if (entry.getKey().getAddress() == null) {
            System.out.println("  address unknown");
        } else {
            System.out.println("  address: " + entry.getKey().getAddress());
        }
        if (phoneBook.get(entry.getKey()).size() == 0) {
            System.out.println("  phone number not found");
        } else {
            System.out.println("  phone numbers: ");
            searchByName(entry.getKey().getName());
        }
    }
}

