package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double probabilityForEachCell) {
        Random random = new Random();
        boolean[][] initiateBoard = super.getBoard();
        for (int y = 0; y < super.getHeight(); y++) {
            for (int x = 0; x < super.getWidth(); x++) {
                if (random.nextDouble() < probabilityForEachCell) {
                    initiateBoard[x][y] = true;
                } else {
                    initiateBoard[x][y] = false;
                }
            }
        }
    }

    public void turnToLiving(int x, int y) {
        if (x >= 0 && x < super.getWidth() && y >= 0 && y < super.getHeight()) {
            //use cell coordinates to set value to true
            super.getBoard()[x][y] = true;
        }
    }

    public void turnToDead(int x, int y) {
        if (x >= 0 && x < super.getWidth() && y >= 0 && y < super.getHeight()) {
            super.getBoard()[x][y] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int livingcells = 0;
        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                    if (isAlive(x + dx, y + dy)) {
                        if (dx == 0 && dy == 0) {
                            continue;
                        } else {
                            livingcells++;
                        }
                }
            }
        }
        return livingcells;
    }

    public boolean isAlive(int x, int y) {
        if (x >= 0 && x < super.getWidth() && y >= 0 && y < super.getHeight()) {
            return super.getBoard()[x][y];
        } else {
            return false;
        }
    }

    @Override
    public void manageCell(int i, int i1, int i2) {
        if (isAlive(i, i1) && (i2 < 2 || i2 > 3)) {
            turnToDead(i, i1);
        } else if (!isAlive(i, i1) && i2 == 3) {
            turnToLiving(i, i1);
        }
    }
}
