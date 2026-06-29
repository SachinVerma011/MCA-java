import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter19 extends Frame implements ActionListener {

    TextField inputField, outputField;
    Label inputLabel, outputLabel;
    CheckboxGroup group;
    Checkbox cToF, fToC;
    Button convertButton;

    public TemperatureConverter19() {
        setLayout(new FlowLayout());

        inputLabel = new Label("Enter Temperature:");
        inputField = new TextField(10);

        group = new CheckboxGroup();
        cToF = new Checkbox("Celsius to Fahrenheit", group, true);
        fToC = new Checkbox("Fahrenheit to Celsius", group, false);

        convertButton = new Button("Convert");

        outputLabel = new Label("Result:");
        outputField = new TextField(10);
        outputField.setEditable(false);

        add(inputLabel);
        add(inputField);
        add(cToF);
        add(fToC);
        add(convertButton);
        add(outputLabel);
        add(outputField);

        convertButton.addActionListener(this);

        setTitle("Temperature Converter");
        setSize(300, 200);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double temp = Double.parseDouble(inputField.getText());
            double result;

            if (cToF.getState()) {
                result = (temp * 9 / 5) + 32; // C to F
            } else {
                result = (temp - 32) * 5 / 9; // F to C
            }

            outputField.setText(String.format("%.2f", result));
        } catch (NumberFormatException ex) {
            outputField.setText("Invalid Input!");
        }
    }

    public static void main(String[] args) {
        new TemperatureConverter19();
    }
}
