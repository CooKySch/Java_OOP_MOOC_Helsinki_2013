package boxes;

import java.util.*;

public class OneThingBox extends Box {
    private ArrayList<Thing> thing = new ArrayList<Thing>();

    public OneThingBox() {

    }

    public void add(Thing thing) {
        if (this.thing.size() < 1) {
            this.thing.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (this.thing.contains(thing)) {
            return true;
        } else {
            return false;
        }
    }
}
