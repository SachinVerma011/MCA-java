import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginScreen16 {
    public static void main(String[] args) {
        // Frame setup
        JFrame frame = new JFrame("University Portal Login");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Username
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField(15);
 
        // Password
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField(15);

        // Login button
        JButton loginButton = new JButton("Login");

        // Output label
        JLabel outputLabel = new JLabel("");

        // Button action
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                outputLabel.setText("Logged in as: " + username);
            }
        });

        // Add components to frame
        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(loginButton);
        frame.add(outputLabel);

        // Make it visible
        frame.setVisible(true);
    }
}
