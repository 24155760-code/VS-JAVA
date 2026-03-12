import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TaskManager {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Task Manager");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

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

        frame.setVisible(true);
    }
}
