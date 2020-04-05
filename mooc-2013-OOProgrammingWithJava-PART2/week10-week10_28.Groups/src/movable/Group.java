package movable;

import java.util.*;

public class Group implements Movable {
    private List<Movable> movables = new ArrayList<Movable>();

    public Group() {

    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : movables) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (Movable movable : movables) {
            output = output + movable.toString() + "\n";
        }
        return output;
    }

    public void addToGroup(Movable movable) {
        movables.add(movable);
    }
}
