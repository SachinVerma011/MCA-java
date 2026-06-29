import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiniCalculator20 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mini Calculator");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Input fields
        JLabel num1Label = new JLabel("Number 1:");
        JTextField num1Field = new JTextField(10);

        JLabel num2Label = new JLabel("Number 2:");
        JTextField num2Field = new JTextField(10);

        // Buttons
        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton mulButton = new JButton("×");
        JButton divButton = new JButton("÷");

        // Output
        JLabel resultLabel = new JLabel("Result: ");

        // Action Listeners
        addButton.addActionListener(e -> calculate(num1Field, num2Field, resultLabel, '+'));
        subButton.addActionListener(e -> calculate(num1Field, num2Field, resultLabel, '-'));
        mulButton.addActionListener(e -> calculate(num1Field, num2Field, resultLabel, '*'));
        divButton.addActionListener(e -> calculate(num1Field, num2Field, resultLabel, '/'));

        // Add components to frame
        frame.add(num1Label); frame.add(num1Field);
        frame.add(num2Label); frame.add(num2Field);
        frame.add(addButton); frame.add(subButton); frame.add(mulButton); frame.add(divButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }

    private static void calculate(JTextField num1Field, JTextField num2Field, JLabel resultLabel, char op) {
        try {
                double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0;

            switch (op) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': 
                    if (num2 == 0) {
                        resultLabel.setText("Cannot divide by zero!");
                        return;
                    }
                    result = num1 / num2; 
                    break;
            }

            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid Input!");
        }
    }
}
