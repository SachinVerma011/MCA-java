import java.awt.*;
import java.awt.event.*;

public class LoginFormAWT22 extends Frame implements ActionListener {

    Label userLabel, passLabel, messageLabel;
    TextField userField, passField;
    Button loginButton, resetButton;

    public LoginFormAWT22() {
        setLayout(new FlowLayout());

        // Username and Password
        userLabel = new Label("Username:");
        userField = new TextField(15);

        passLabel = new Label("Password:");
        passField = new TextField(15);
        passField.setEchoChar('*'); // Mask password

        // Buttons
        loginButton = new Button("Login");
        resetButton = new Button("Reset");

        // Message label
        messageLabel = new Label(" ");

        // Add components to frame
        add(userLabel); add(userField);
        add(passLabel); add(passField);
        add(loginButton); add(resetButton);
        add(messageLabel);

        // Event handling
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);

        // Frame properties
        setTitle("Login Form");
        setSize(300, 200);
        setVisible(true);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = userField.getText();
            String password = passField.getText();

            // For demonstration, using hardcoded credentials
            if (username.equals("admin") && password.equals("1234")) {
                messageLabel.setText("Login Successful");
            } else {
                messageLabel.setText("Invalid Credentials");
            }
        } else if (e.getSource() == resetButton) {
            userField.setText("");
            passField.setText("");
            messageLabel.setText(" ");
        }
    }

    public static void main(String[] args) {
        new LoginFormAWT22();
    }
}
