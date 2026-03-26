import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TaskManager {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Personal Productivity App");
        frame.setSize(350,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // -------- TASK MANAGER --------

        JLabel taskLabel = new JLabel("Task Manager");
        frame.add(taskLabel);

        JTextField taskField = new JTextField(15);

        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> taskList = new JList<>(model);

        JButton addBtn = new JButton("Add");
        JButton completeBtn = new JButton("Complete");
        JButton deleteBtn = new JButton("Delete");

        frame.add(taskField);
        frame.add(addBtn);
        frame.add(new JScrollPane(taskList));
        frame.add(completeBtn);
        frame.add(deleteBtn);

        // Add task
        addBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                model.addElement(taskField.getText());
                taskField.setText("");
            }
        });

        // Mark complete
        completeBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int index = taskList.getSelectedIndex();
                if(index != -1){
                    String task = model.get(index) + " (Done)";
                    model.set(index, task);
                }
            }
        });

        // Delete task
        deleteBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int index = taskList.getSelectedIndex();
                if(index != -1){
                    model.remove(index);
                }
            }
        });


        // -------- HABIT TRACKER --------

        JLabel habitLabel = new JLabel("Habit Tracker");
        frame.add(habitLabel);

        JCheckBox exercise = new JCheckBox("Exercise");
        JCheckBox reading = new JCheckBox("Reading");
        JCheckBox meditation = new JCheckBox("Meditation");
        JCheckBox study = new JCheckBox("Study");

        frame.add(exercise);
        frame.add(reading);
        frame.add(meditation);
        frame.add(study);

        frame.setVisible(true);
    }
}