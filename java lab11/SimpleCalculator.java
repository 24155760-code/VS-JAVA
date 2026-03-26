import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {

    JTextField display;
    double num1, num2, result;
    char operator;

    SimpleCalculator() {
        setTitle("Calculator");
        setSize(300, 350);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display
        display = new JTextField();
        display.setBounds(20, 20, 240, 30);
        add(display);

        // Buttons
        String buttons[] = {
                "1","2","3","+",
                "4","5","6","-",
                "7","8","9","*",
                "/","0","%","=",
                "OFF"
        };

        int x = 20, y = 70;

        for (int i = 0; i < buttons.length; i++) {
            JButton btn = new JButton(buttons[i]);
            btn.setBounds(x, y, 50, 40);
            btn.addActionListener(this);
            add(btn);

            x += 60;

            if ((i + 1) % 4 == 0) {
                x = 20;
                y += 50;
            }

            // OFF button full width
            if (buttons[i].equals("OFF")) {
                btn.setBounds(20, y, 240, 40);
            }
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();

        // Numbers
        if (input.matches("[0-9]")) {
            display.setText(display.getText() + input);
        }

        // Operators
        else if (input.matches("[+\\-*/%]")) {
            num1 = Double.parseDouble(display.getText());
            operator = input.charAt(0);
            display.setText("");
        }

        // Equals
        else if (input.equals("=")) {
            num2 = Double.parseDouble(display.getText());

            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
                case '%': result = num1 % num2; break;
            }

            display.setText("" + result);
        }

        // OFF button
        else if (input.equals("OFF")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}