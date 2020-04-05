package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    private  int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>();
        if (things.size() == 0) {
            return boxes;
        } else {
            boxes.add(new Box(boxesVolume));
        }
        int box = 0;
        for (Thing thing : things) {
            if (!boxes.get(box).addThing(thing)) {
                boxes.add(new Box(boxesVolume));
                box++;
                boxes.get(box).addThing(thing);
            }
        }
        return boxes;
    }


}
