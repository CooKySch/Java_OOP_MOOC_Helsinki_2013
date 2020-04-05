import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZeroEventListener implements ActionListener {
    private JTextField prevAnswer;
    private JTextField variable;
    private JButton zero;

    public ZeroEventListener(JTextField prevAnswer, JTextField variable, JButton zero) {
        this.prevAnswer = prevAnswer;
        this.variable = variable;
        this.zero = zero;

    }

    public void actionPerformed(ActionEvent ae) {
        variable.setText("");
        prevAnswer.setText("0");
        zero.setEnabled(false);
    }
}
