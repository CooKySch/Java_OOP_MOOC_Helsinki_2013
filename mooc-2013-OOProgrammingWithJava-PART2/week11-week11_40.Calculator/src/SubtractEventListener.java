import javax.swing.*;
import java.awt.event.*;

public class SubtractEventListener implements ActionListener {
    private JTextField prevAnswer;
    private JTextField variable;
    private JButton zero;

    public SubtractEventListener(JTextField prevAnswer, JTextField variable, JButton zero) {
        this.prevAnswer = prevAnswer;
        this.variable = variable;
        this.zero = zero;
    }

    public void actionPerformed(ActionEvent ae) {
        if (variable.getText().matches("[0-9]+")) {
            int answer = Integer.parseInt(prevAnswer.getText()) - Integer.parseInt(variable.getText());
            variable.setText("");
            prevAnswer.setText(String.valueOf(answer));
            if (answer != 0) {
                zero.setEnabled(true);
            }
        }
        else {
            variable.setText("");
        }
    }
}
