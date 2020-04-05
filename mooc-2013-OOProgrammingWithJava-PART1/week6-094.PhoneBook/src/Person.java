public class Person {
    private String name;
    private String phoneNumber;

    public Person(String name, String number) {
        this.name = name;
        this.phoneNumber = number;
    }

    public void changeNumber(String number) {
    this.phoneNumber = number;
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.phoneNumber;
    }

    public String toString() {
        return name + " number: " + phoneNumber;
    }
}
