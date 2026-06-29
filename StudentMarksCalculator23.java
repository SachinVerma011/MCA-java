import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentMarksCalculator23 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Marks Calculator");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Labels and TextFields for 3 subjects
        JLabel sub1Label = new JLabel("Subject 1:");
        JTextField sub1Field = new JTextField(10);

        JLabel sub2Label = new JLabel("Subject 2:");
        JTextField sub2Field = new JTextField(10);

        JLabel sub3Label = new JLabel("Subject 3:");
        JTextField sub3Field = new JTextField(10);

        JButton calcButton = new JButton("Calculate");

        JLabel resultLabel = new JLabel("Total & Average will appear here");

        // Action Listener
        calcButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int marks1 = Integer.parseInt(sub1Field.getText());
                    int marks2 = Integer.parseInt(sub2Field.getText());
                    int marks3 = Integer.parseInt(sub3Field.getText());

                    int total = marks1 + marks2 + marks3;
                    double average = total / 3.0;

                    resultLabel.setText("Total: " + total + ", Average: " + String.format("%.2f", average));
                    
                    // Optional: Show in JOptionPane
                    // JOptionPane.showMessageDialog(frame, "Total: " + total + "\nAverage: " + average);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers!");
                }
            }
        });

        // Add components to frame
        frame.add(sub1Label); frame.add(sub1Field);
        frame.add(sub2Label); frame.add(sub2Field);
        frame.add(sub3Label); frame.add(sub3Field);
        frame.add(calcButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}
