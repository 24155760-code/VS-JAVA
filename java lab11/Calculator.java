import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField num1, num2, result;
    JButton add, sub, mul, div;

    Calculator() {

        frame = new JFrame("Simple Calculator");
        frame.setSize(300,250);
        frame.setLayout(new FlowLayout());

        num1 = new JTextField(10);
        num2 = new JTextField(10);
        result = new JTextField(10);

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");

        frame.add(new JLabel("Number 1"));
        frame.add(num1);

        frame.add(new JLabel("Number 2"));
        frame.add(num2);

        frame.add(add);
        frame.add(sub);
        frame.add(mul);
        frame.add(div);

        frame.add(new JLabel("Result"));
        frame.add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        double a = Double.parseDouble(num1.getText());
        double b = Double.parseDouble(num2.getText());
        double r = 0;

        if(e.getSource()==add)
            r = a + b;

        if(e.getSource()==sub)
            r = a - b;

        if(e.getSource()==mul)
            r = a * b;

        if(e.getSource()==div)
            r = a / b;

        result.setText(String.valueOf(r));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}