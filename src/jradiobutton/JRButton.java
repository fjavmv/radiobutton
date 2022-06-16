package jradiobutton;

import javax.swing.*;
import java.awt.*;

public class JRButton extends JFrame {
    JRadioButton op1;
    JRadioButton op2;
    JRadioButton op3;
    public JRButton() {
        super("Swing JRadioButton");

        op1 = new JRadioButton("Linux");
        op2 = new JRadioButton("Windows");
        op3 = new JRadioButton("Mac");

        ButtonGroup group = new ButtonGroup();
        group.add(op1);
        group.add(op2);
        group.add(op3);

        setLayout(new FlowLayout());

        add(op1);
        add(op2);
        add(op3);

         pack();
         //setSize(200,300);
        setVisible(true);

    }


}
