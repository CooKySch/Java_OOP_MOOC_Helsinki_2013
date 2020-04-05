package reference.domain;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this.getClass() != o.getClass() || o == null) {
            return false;
        }

        Person other = (Person) o;
        if (this.name == null || !this.name.equals(other.getName())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
