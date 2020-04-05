package dungeon;
import java.util.*;

public class Vampire {
    private int x;
    private int y;
    private boolean moves;

    public Vampire(int x, int y, boolean moves) {
        this.x = x;
        this.y = y;
        this.moves = moves;
    }

    public boolean move(int move) {
        switch (move) {
            case 0: {
                this.y--;
                return true;
            }
            case 1: {
                this.x--;
                return true;
            }
            case 2: {
                this.y++;
                return true;
            }
            case 3: {
                this.x++;
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "v " + this.x + " " + this.y;
    }
}
