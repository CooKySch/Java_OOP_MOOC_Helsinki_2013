package clicker.ui;

import clicker.applicationlogic.Calculator;

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.BorderUIResource;

public class UserInterface implements Runnable {
    private Calculator calculator;
    private JFrame frame;

    public UserInterface() {

    }

    public UserInterface(Calculator calculator) {
        this.calculator = calculator;
    }


    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BorderLayout layout = new BorderLayout();
        container.setLayout(layout);
        JLabel timesClicked = new JLabel(String.valueOf(this.calculator.giveValue()));
        JButton clicker = new JButton("Click!");

        ClickListener clickListener = new ClickListener(this.calculator, timesClicked);
        clicker.addActionListener(clickListener);

        container.add(timesClicked);
        container.add(clicker, BorderLayout.SOUTH);
    }

    public JFrame getFrame() {
        return frame;
    }

}
