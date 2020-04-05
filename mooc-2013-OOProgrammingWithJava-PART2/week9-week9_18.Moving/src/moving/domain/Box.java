package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {
    private int maximumCapacity;
    private List<Thing> content = new ArrayList<Thing>();

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public boolean addThing(Thing thing) {
        if (this.getVolume() + thing.getVolume() <= this.maximumCapacity) {
            this.content.add(thing);
            return true;
        }
        return false;
    }

    public int getVolume() {
        int volume = 0;
        for (Thing thing : this.content) {
            volume += thing.getVolume();
        }
        return volume;
    }
}
