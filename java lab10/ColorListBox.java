import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorListBox implements ActionListener {

    JFrame f;
    JList<String> list;
    JButton btn;
    JPanel panel;

    ColorListBox() {

        f = new JFrame("Color Change");
        f.setSize(300,300);
        f.setLayout(new FlowLayout());

        // List box with colors
        String colors[] = {"Red","Green","Blue","Yellow"};
        list = new JList<>(colors);

        btn = new JButton("Change Color");

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200,100));

        f.add(list);
        f.add(btn);
        f.add(panel);

        btn.addActionListener(this);

        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String color = list.getSelectedValue();

        if(color.equals("Red"))
            panel.setBackground(Color.RED);

        if(color.equals("Green"))
            panel.setBackground(Color.GREEN);

        if(color.equals("Blue"))
            panel.setBackground(Color.BLUE);

        if(color.equals("Yellow"))
            panel.setBackground(Color.YELLOW);
    }

    public static void main(String[] args) {
        new ColorListBox();
    }
}