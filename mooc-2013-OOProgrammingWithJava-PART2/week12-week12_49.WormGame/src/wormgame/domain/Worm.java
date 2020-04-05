package wormgame.domain;

import wormgame.Direction;
import wormgame.domain.Piece;

import java.util.*;

public class Worm {
    private Direction direction;
    private List<Piece> pieces = new ArrayList<Piece>();
    private boolean grow = true;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.direction = originalDirection;
        pieces.add(new Piece(originalX, originalY));
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getLength() {
        return this.pieces.size();
    }

    public void move() {
        Piece lastPiece = pieces.get(pieces.size() - 1);
        Piece toAdd = null;
        switch (this.direction) {
            case UP:
                toAdd = new Piece(lastPiece.getX(), lastPiece.getY() - 1);
                break;
            case RIGHT:
                toAdd = new Piece(lastPiece.getX() + 1, lastPiece.getY());
                break;
            case DOWN:
                toAdd = new Piece(lastPiece.getX(), lastPiece.getY() + 1);
                break;
            case LEFT:
                toAdd = new Piece(lastPiece.getX() - 1, lastPiece.getY());
                break;
        }
        pieces.add(toAdd);
        if (!this.grow) {
            this.pieces.remove(0);
        }
        if (this.getLength() >= 3) {
            this.grow = false;
        }
    }

    public void grow() {
        this.grow = true;
    }

    public boolean runsInto(Piece piece) {
        for (Piece wormPiece : pieces) {
            if (wormPiece.getX() == piece.getX() && wormPiece.getY() == piece.getY()) {
                return true;
            }
        }
        return false;
    }

    public boolean runsIntoItself() {
        for (Piece wormPiece : pieces) {
            for (Piece wormPiece2 : pieces) {
                if (wormPiece.getX() == wormPiece2.getX() && wormPiece.getY() == wormPiece2.getY()) {
                    if (wormPiece == wormPiece2) {
                        continue;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public List<Piece> getPieces() {
        return this.pieces;
    }

}
