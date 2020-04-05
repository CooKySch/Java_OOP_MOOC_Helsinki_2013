package movingfigure;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener implements KeyListener {
    private Component component;
    private Figure figure;

    public KeyboardListener(Component component, Figure figure) {
        this.component = component;
        this.figure = figure;

    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            this.figure.move(-1, 0);
        } else if (keyEvent.getKeyCode() == KeyEvent.VK_UP) {
            this.figure.move(0, -1);
        } else if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.figure.move(1, 0);
        } else if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN) {
            this.figure.move(0, 1);
        }
        component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
