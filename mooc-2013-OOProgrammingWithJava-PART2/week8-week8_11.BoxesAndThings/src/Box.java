import java.util.ArrayList;

public class Box  implements ToBeStored {
    private double maximumWeight;
    private ArrayList<ToBeStored> items = new ArrayList<ToBeStored>();

    public Box(double maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public double weight() {
        double weight = 0;
        for (ToBeStored item : this.items) {
            weight += item.weight();
        }
        return weight;
    }

    public void add(ToBeStored toBeStored) {
        if (this.weight() + toBeStored.weight() <= this.maximumWeight) {
            items.add(toBeStored);
        }
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " things, total weight " + weight() + " kg";
    }
}
