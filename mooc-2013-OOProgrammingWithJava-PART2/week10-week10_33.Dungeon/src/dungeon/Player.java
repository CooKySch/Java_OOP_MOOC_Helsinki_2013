package dungeon;

import java.util.Scanner;

public class Player {
    private int x;
    private int y;

    public Player() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean move(char move, int height, int length) {
        if (move == 'w') {
            if (this.y == 0) {
                return false;
            } else {
                this.y--;
                return true;
            }
        }
        else if (move == 'a') {
            if (this.x == 0) {
                return false;
            } else {
                this.x--;
                return true;
            }
        }
        else if (move == 's') {
            if (this.y == height) {
                return false;
            } else {
                this.y++;
                return true;
            }
        }
        else if (move == 'd') {
            if (this.x == length) {
                return false;
            } else {
                this.x++;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "@ " + this.x + " " + this.y;
    }
}

