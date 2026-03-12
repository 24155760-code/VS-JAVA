import javax.swing.*;
import java.awt.*;

public class RegistrationForm {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Registration Form");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels and Textboxes
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(15);

        JLabel addressLabel = new JLabel("Address:");
        JTextArea addressArea = new JTextArea(3,15);

        // Radio Buttons
        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        // Checkboxes
        JLabel hobbyLabel = new JLabel("Hobbies:");
        JCheckBox reading = new JCheckBox("Reading");
        JCheckBox music = new JCheckBox("Music");

        // Button
        JButton submit = new JButton("Submit");

        // Image
        ImageIcon icon = new ImageIcon("user.png");
        JLabel imageLabel = new JLabel(icon);

        // Add components
        frame.add(imageLabel);
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(addressLabel);
        frame.add(addressArea);
        frame.add(genderLabel);
        frame.add(male);
        frame.add(female);
        frame.add(hobbyLabel);
        frame.add(reading);
        frame.add(music);
        frame.add(submit);

        frame.setVisible(true);
    }
}