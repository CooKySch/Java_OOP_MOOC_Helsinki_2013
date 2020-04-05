package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(1024, 768));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField input = new JTextField();
        JLabel output = new JLabel();
        JButton copyButton = new JButton("Copy!");

        ActionEventListener listener = new ActionEventListener(input, output);
        copyButton.addActionListener(listener);

        container.add(input);
        container.add(copyButton);
        container.add(output);
    }
}
