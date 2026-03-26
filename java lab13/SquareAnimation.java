import javax.swing.*;
import java.awt.*;

public class SquareAnimation extends JFrame implements Runnable {

    JLabel imageLabel, messageLabel;
    int x = 50, y = 50;
    int step = 5;
    String[] messages = {"Welcome", "Enjoy", "Thanks", "Visit Again"};
    int msgIndex = 0;

    public SquareAnimation() {
        setTitle("Square Animation");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Image Label (use any image)
        ImageIcon icon = new ImageIcon("image.png"); // put image in same folder
        imageLabel = new JLabel(icon);
        imageLabel.setBounds(x, y, 100, 100);
        add(imageLabel);

        // Message Label
        messageLabel = new JLabel(messages[0]);
        messageLabel.setBounds(130, 300, 200, 30);
        add(messageLabel);

        setVisible(true);

        // Start thread
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            while (true) {

                // Move Right
                for (int i = 0; i < 40; i++) {
                    x += step;
                    updatePosition();
                }

                // Move Down
                for (int i = 0; i < 40; i++) {
                    y += step;
                    updatePosition();
                }

                // Move Left
                for (int i = 0; i < 40; i++) {
                    x -= step;
                    updatePosition();
                }

                // Move Up
                for (int i = 0; i < 40; i++) {
                    y -= step;
                    updatePosition();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void updatePosition() throws InterruptedException {
        imageLabel.setLocation(x, y);

        // Change message
        msgIndex = (msgIndex + 1) % messages.length;
        messageLabel.setText(messages[msgIndex]);

        Thread.sleep(10); // 10 ms gap
    }

    public static void main(String[] args) {
        new SquareAnimation();
    }
}