import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import javax.swing.*;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        JFrame frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(540, 360));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField prevAnswer = new JTextField("0");
        prevAnswer.setEnabled(false);
        JTextField variable = new JTextField();
        JPanel menu = MenuPanel(prevAnswer, variable);
        container.add(prevAnswer);
        container.add(variable);
        container.add(menu);
    }

    public JFrame getFrame() {
        return frame;
    }

    private JPanel MenuPanel(JTextField prevAnswer, JTextField variable) {
        JPanel jPanel = new JPanel(new GridLayout(1, 3));
        JButton add = new JButton("+");
        JButton subtract = new JButton("-");
        JButton zero = new JButton("Z");

        ActionListener addFunc = new AddEventListener(prevAnswer, variable, zero);
        ActionListener subtractFunc = new SubtractEventListener(prevAnswer, variable, zero);
        ActionListener zeroFunc = new ZeroEventListener(prevAnswer, variable, zero);

        add.addActionListener(addFunc);
        subtract.addActionListener(subtractFunc);
        zero.addActionListener(zeroFunc);
        zero.setEnabled(false);


        jPanel.add(add);
        jPanel.add(subtract);
        jPanel.add(zero);
        return jPanel;
    }
}
