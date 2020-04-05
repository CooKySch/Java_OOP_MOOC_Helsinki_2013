package wormgame.gui;

import wormgame.Direction;
import wormgame.domain.*;

import java.awt.event.*;

public class KeyboardListener implements KeyListener {
    private Worm worm;

    public KeyboardListener(Worm worm) {
        this.worm = worm;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == KeyEvent.VK_UP) {
            worm.setDirection(Direction.UP);
        } else if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
            worm.setDirection(Direction.RIGHT);
        } else if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN) {
            worm.setDirection(Direction.DOWN);
        } else if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            worm.setDirection(Direction.LEFT);
        } else {

        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
