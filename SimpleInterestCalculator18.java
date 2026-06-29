import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleInterestCalculator18 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Interest Calculator");
        frame.setSize(550, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Labels and TextFields
        JLabel pLabel = new JLabel("Principal:");
        JTextField pField = new JTextField(10);

        JLabel rLabel = new JLabel("Rate (%):");
        JTextField rField = new JTextField(10);

        JLabel tLabel = new JLabel("Time (Years):");
        JTextField tField = new JTextField(10);

        JButton calcButton = new JButton("Calculate");

        JLabel resultLabel = new JLabel("Interest: ");

        // Action Listener for Button
        calcButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double p = Double.parseDouble(pField.getText());
                    double r = Double.parseDouble(rField.getText());
                    double t = Double.parseDouble(tField.getText());

                    double interest = (p * r * t) / 100;
                    resultLabel.setText("Interest: " + interest);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid Input!");
                }
            }
        });

        // Add components to frame
        frame.add(pLabel); frame.add(pField);
        frame.add(rLabel); frame.add(rField);
        frame.add(tLabel); frame.add(tField);
        frame.add(calcButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}
