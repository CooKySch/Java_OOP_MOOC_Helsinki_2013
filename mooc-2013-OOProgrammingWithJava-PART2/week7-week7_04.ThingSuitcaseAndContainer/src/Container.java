import java.util.ArrayList;

public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> container = new ArrayList<Suitcase>();

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String toString() {
        return container.size() + " suitcases (" + getWeight() + " kg)";
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.getWeight() + suitcase.totalWeight() <= this.maxWeight) {
            this.container.add(suitcase);
        }
    }

    public int getWeight() {
        int weight = 0;
        for (Suitcase suitcase : container) {
            weight += suitcase.totalWeight();
        }
        return weight;
    }

    public void printThings() {
        for (Suitcase suitcase : container) {
           suitcase.printThings();
       }
    }


}
