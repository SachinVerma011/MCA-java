import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm21 extends Frame implements ActionListener {

    Label nameLabel, rollLabel, genderLabel, courseLabel, outputLabel;
    TextField nameField, rollField;
    CheckboxGroup genderGroup;
    Checkbox male, female;
    Choice courseChoice;
    Button submitButton, resetButton;

    public StudentRegistrationForm21() {
        setLayout(new FlowLayout());

        // Labels and TextFields
        nameLabel = new Label("Name:");
        nameField = new TextField(15);

        rollLabel = new Label("Roll No:");
        rollField = new TextField(10);

        // Gender
        genderLabel = new Label("Gender:");
        genderGroup = new CheckboxGroup();
        male = new Checkbox("Male", genderGroup, false);
        female = new Checkbox("Female", genderGroup, false);

        // Course
        courseLabel = new Label("Course:");
        courseChoice = new Choice();
        courseChoice.add("Select Course");
        courseChoice.add("Computer Science");
        courseChoice.add("Mathematics");
        courseChoice.add("Physics");
        courseChoice.add("Chemistry");

        // Buttons
        submitButton = new Button("Submit");
        resetButton = new Button("Reset");

        // Output label
        outputLabel = new Label(" ");

        // Add components to frame
        add(nameLabel); add(nameField);
        add(rollLabel); add(rollField);
        add(genderLabel); add(male); add(female);
        add(courseLabel); add(courseChoice);
        add(submitButton); add(resetButton);
        add(outputLabel);

        // Event handling
        submitButton.addActionListener(this);
        resetButton.addActionListener(this);

        // Frame properties
        setTitle("Student Registration Form");
        setSize(400, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String roll = rollField.getText();
            String gender = genderGroup.getSelectedCheckbox().getLabel();
            String course = courseChoice.getSelectedItem();

            outputLabel.setText("Name: " + name + ", Roll No: " + roll + ", Gender: " + gender + ", Course: " + course);
        } else if (e.getSource() == resetButton) {
            nameField.setText("");
            rollField.setText("");
            male.setState(true);
            courseChoice.select(0);
            outputLabel.setText(" ");
        }
    }

    public static void main(String[] args) {
        new StudentRegistrationForm21();
    }
}
