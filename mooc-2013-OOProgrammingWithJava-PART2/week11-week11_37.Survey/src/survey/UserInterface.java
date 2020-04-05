package survey;

import java.awt.Container;
import java.awt.Dimension;
import java.io.FileReader;
import javax.script.ScriptEngine;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
        frame = new JFrame("");
        frame.setPreferredSize(new Dimension(500, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("Are you?"));
        container.add(new JCheckBox("Yes!"));
        container.add(new JCheckBox("No!"));
        container.add(new JLabel("Why?"));
        JRadioButton assHole = new JRadioButton("No reason.");
        JRadioButton helpFul = new JRadioButton("Because it is fun!");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(assHole);
        buttonGroup.add(helpFul);
        container.add(assHole);
        container.add(helpFul);
        container.add(new JButton("Done!"));

    }


    public JFrame getFrame() {
        return frame;
    }
}
