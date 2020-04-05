import java.util.Objects;

public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Bird bird = (Bird) other;
        if (!this.latinName.equals(bird.latinName) || this.ringingYear != bird.ringingYear) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        if (this.name == null) {
            return 0;
        }
        return this.latinName.hashCode() + this.ringingYear;
    }

    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
}


