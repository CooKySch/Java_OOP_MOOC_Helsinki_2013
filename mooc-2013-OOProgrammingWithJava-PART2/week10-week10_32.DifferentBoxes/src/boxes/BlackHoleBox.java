package boxes;

import java.util.*;

public class BlackHoleBox extends Box {
    private List<Thing> things = new ArrayList<Thing>();

    public BlackHoleBox() {

    }

    @Override
    public void add(Thing thing) {
        things.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
