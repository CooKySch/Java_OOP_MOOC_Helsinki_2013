import java.util.ArrayList;

public class Suitcase {
    private int weightLimit;
    private ArrayList<Thing> things = new ArrayList<Thing>();

    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
    }

    public void addThing(Thing thing) {
        if (thing.getWeight() + this.totalWeight() <= this.weightLimit) {
            this.things.add(thing);
        }
    }

    public String toString() {
        int totalWeight = this.totalWeight();
        if (things.size() == 0) {
            return "empty (" + totalWeight + "kg)";
        }
        if (things.size() ==1) {
            return things.size() + "thing (" + totalWeight + "kg)";
        }
        return things.size() + "things (" + totalWeight + "kg)";
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Thing thing : things) {
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }

    public Thing heaviestThing() {
        Thing answer = null;
        int heaviest = 0;
        for (Thing thing : things) {
            if (thing.getWeight() > heaviest) {
                heaviest = thing.getWeight();
                answer = thing;
            }
        }
        return answer;
    }

}
