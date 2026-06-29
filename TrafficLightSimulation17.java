import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLightSimulation17 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Traffic Light Simulation");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Radio Buttons
        JRadioButton redButton = new JRadioButton("Red");
        JRadioButton yellowButton = new JRadioButton("Yellow");
        JRadioButton greenButton = new JRadioButton("Green");

        // Group buttons so only one can be selected
        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);

        // Output label
        JLabel outputLabel = new JLabel("Select a light");

        // Event Handling
        redButton.addActionListener(e -> outputLabel.setText("STOP"));
        yellowButton.addActionListener(e -> outputLabel.setText("READY"));
        greenButton.addActionListener(e -> outputLabel.setText("GO"));

        // Add components to frame
        frame.add(redButton);
        frame.add(yellowButton);
        frame.add(greenButton);
        frame.add(outputLabel);

        frame.setVisible(true);
    }
}
