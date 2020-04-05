import com.sun.corba.se.spi.ior.Identifiable;

import java.util.HashMap;

public class Person implements Comparable<Person> {
    private String name;
    private String address;
    private String city;

    public Person(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public Person(String name) {
        this.name = name;
        this.address = null;
        this.city = null;
    }

    public String getAddress() {
        if (this.address == null || this.city == null) {
            return null;
        }
        return this.address + " " + this.city;
    }

    public void setAddress(String address, String city) {
        this.address = address;
        this.city = city;
    }

    public String getName() {
        return this.name;
    }

    public int compareTo(Person person) {
        return this.getName().compareTo(person.getName());
    }

    @Override
    public String toString() {
        return this.name + this.address + this.city;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }

        Person person = (Person) object;

        if (this.getName().equals(person.getName())) {
            return true;
        } else {
            return false;
        }
    }
}

