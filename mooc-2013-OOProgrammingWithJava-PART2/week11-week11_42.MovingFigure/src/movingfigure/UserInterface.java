package movingfigure;

import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Figure figure;

    public UserInterface(Figure figure) {
        this.figure = figure;
    }
    @Override
    public void run() {
        frame = new JFrame("Figures");
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        DrawingBoard drawingBoard = new DrawingBoard(this.figure);
        container.add(drawingBoard);
    }

    private void addListeners() {
        frame.addKeyListener(new KeyboardListener(frame.getContentPane(), figure));
    }

    public JFrame getFrame() {
        return frame;
    }
}
