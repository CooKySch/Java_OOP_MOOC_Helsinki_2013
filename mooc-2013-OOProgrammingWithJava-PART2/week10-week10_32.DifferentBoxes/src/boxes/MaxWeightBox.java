package boxes;

import java.util.*;

public class MaxWeightBox extends Box {
    private int maxWeight;
    private List<Thing> contents = new ArrayList<Thing>();

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void add(Thing thing) {
        if (currentWeight() + thing.getWeight() <= this.maxWeight) {
            this.contents.add(thing);
        }
    }

    public int currentWeight() {
        int weight = 0;
        for (Thing thing : contents) {
            weight += thing.getWeight();
        }
        return weight;
    }

    @Override
    public boolean isInTheBox(Thing thing) {
    if (contents.contains(thing)) {
        return true;
    } else {
        return false;
        }
    }
}
