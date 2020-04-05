import java.util.ArrayList;

public class Bird {
    private String name;
    private String latinName;
    private int observationCounter;

    public Bird(String name, String latinName, int observationCounter) {
        this.name = name.trim();
        this.latinName = latinName.trim();
        this.observationCounter = observationCounter;
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public void observed() {
        this.observationCounter++;
    }

    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observationCounter + " observations";
    }

}
