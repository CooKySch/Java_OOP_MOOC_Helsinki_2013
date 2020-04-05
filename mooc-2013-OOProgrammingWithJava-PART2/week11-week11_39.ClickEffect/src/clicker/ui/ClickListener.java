package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;

import javax.swing.*;
import java.awt.event.*;

public class ClickListener implements ActionListener {
    private JLabel jLabel;
    private Calculator persCalc;


    public ClickListener(Calculator calculator, JLabel jLabel) {
        this.persCalc = calculator;
        this.jLabel = jLabel;
        }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        persCalc.increase();
        this.jLabel.setText(String.valueOf(persCalc.giveValue()));
    }
}
