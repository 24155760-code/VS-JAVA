import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ArithmeticGUI implements ActionListener {

    JFrame f;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton add,sub,mul,reset;

    ArithmeticGUI() {

        f = new JFrame("Arithmetic Operations");
        f.setSize(300,300);
        f.setLayout(new FlowLayout());

        l1 = new JLabel("Enter First Number");
        l2 = new JLabel("Enter Second Number");
        l3 = new JLabel("Result");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);

        add = new JButton("Add");
        sub = new JButton("Sub");
        mul = new JButton("Multiply");
        reset = new JButton("Reset");

        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);

        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(reset);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        reset.addActionListener(this);

        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==reset){
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
        else{
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double r = 0;

            if(e.getSource()==add) r = a + b;
            if(e.getSource()==sub) r = a - b;
            if(e.getSource()==mul) r = a * b;

            t3.setText(String.valueOf(r));
        }
    }

    public static void main(String[] args) {
        new ArithmeticGUI();
    }
}