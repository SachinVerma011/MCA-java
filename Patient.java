import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.security.Key;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

                                                         // Patient.java
public class Patient {
    private int id;
    private String name;
    private int age;
    private int bp;          // Blood Pressure
    private int sugarLevel;
    private String disease;

    public Patient(int id, String name, int age, int bp, int sugarLevel, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bp = bp;
        this.sugarLevel = sugarLevel;
        this.disease = disease;
    }

                                                                    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public int getBp() { return bp; }
    public int getSugarLevel() { return sugarLevel; }
    public String getDisease() { return disease; }

    @Override
    public String toString() {
        return id + " - " + name + " - " + age + " - " + bp + " - " + sugarLevel + " - " + disease;
    }

                                                              // Main method
    public static void main(String[] args) {
        // Creating sample patient objects
        Patient p1 = new Patient(1,   "Ramesh",45, 130, 95,    "diabetes");
        Patient p2 = new Patient(2,   "Sita", 52,145, 90,"hHypertension");
        Patient p3 = new Patient (3,   "Amit",  38,   120,85,  "Normal");
        Patient p4 = new Patient (4,   "Paresh",60,155,      110,"Diabetes");
        Patient p5 = new Patient(3,"Harish", 21,     118,88,    "hypertension mild");

        System.out.println(p1);
        System.out.println(p2);                       // patients info
        System.out.println(p3);
    }
}

class MedicalDataAnalyzer extends JFrame {
    private JTextArea outputArea;
    private JButton loadButton, analyzeButton,searchButton,deleteButton;
    private java.util.List<Patient> patients = new ArrayList<>();

    public MedicalDataAnalyzer (){
        setTitle("Medical Data Mining Analyzer");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

                                                                      // Heading
        JLabel title = new JLabel("Medical Data Analyzer", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 22));
        add(title, BorderLayout.NORTH);

                                                                  // Output area
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

                                                                     // Buttons
        JPanel panel = new JPanel();
        loadButton = new JButton("Load Data");
        analyzeButton = new JButton("Analyze Data");
        JButton searchButton = new JButton("Search Patient");
        JButton deleteButton = new JButton ("Delete Patient");

        panel.add(loadButton);
        panel.add(analyzeButton);
        panel.add(searchButton);
        panel.add(deleteButton);
        add(panel, BorderLayout.SOUTH);

                                                                    // Button Actions
        loadButton.addActionListener(e -> loadData());
        analyzeButton.addActionListener(e -> analyzeData());
        searchButton.addActionListener(e ->searchPatient());
        deleteButton.addActionListener(e -> deletePatient());
    }

    private void deletePatient() {
    }

    private void loadData() {
        patients.clear();
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                    String[] parts = line.split(",");
                if (parts.length == 6) {
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    int age = Integer.parseInt(parts[2].trim());
                    int bp = Integer.parseInt(parts[3].trim());
                    int sugar = Integer.parseInt(parts[4].trim());
                    String disease = parts[5].trim();

                    patients.add(new Patient(id, name, age, bp, sugar, disease));
                }
            }
            br.close();

            outputArea.setText("Data Loaded Successfully!\n\nList of Patients:\n");
            for (Patient p : patients) {
                outputArea.append(p + "\n");
            }
        } catch (Exception e) {
            outputArea.setText("Error loading file: " + e.getMessage());
        }
         }


    private void analyzeData() {
        if (patients.isEmpty()) {
            outputArea.setText(" Please load data first!");
            return;
        }


        int totalBP = 0, totalSugar = 0;
        int countDiabetes = 0;
        java.util.List<String> highRisk = new ArrayList<>();

        for (Patient p : patients) {
            totalBP += p.getBp();
            totalSugar += p.getSugarLevel();



            if (p.getDisease().equalsIgnoreCase("Diabetes")) {
                countDiabetes++;
            }
            if (p.getAge() > 50 && p.getBp() > 140) {
                highRisk.add(p.getName());

            }

        }

        double avgBP = (double) totalBP / patients.size();
        double avgSugar = (double) totalSugar / patients.size();

             outputArea.setText(" Data Analysis Report:\n\n");
          outputArea.append("Total Patients: " + patients.size() + "\n");
                outputArea.append(String.format("Average BP: %.2f\n", avgBP));
            outputArea.append(String.format("Average Sugar Level: %.2f\n", avgSugar));
                outputArea.append("Patients with Diabetes: " + countDiabetes + "\n");

        outputArea.append("\nHigh Risk Patients (Age > 50 & BP > 140):\n");
        if (highRisk.isEmpty()) {
            outputArea.append("None\n");
        } else for (String name : highRisk) {
            outputArea.append("- " + name + "\n");
        }
    }

    private void searchPatient() {        //  Search for a patient by ID or Name
        if (patients.isEmpty()) {
            outputArea.setText("Please load data first!");
            return;
        }



        String key = JOptionPane.showInputDialog(this, "Enter Patient ID or Name to search:");

        if (key == null || key.trim().isEmpty()) {
            outputArea.setText("Search cancelled or empty input.");
            return;
        }

        key = key.trim().toLowerCase();
        boolean found = false;

        outputArea.setText(" Search Results:\n\n");

        for (Patient p : patients) {
            if (String.valueOf(p.getId()).equals(key) || p.getName().toLowerCase().contains(key)) {
                outputArea.append("ID: " + p.getId() + "\n");
                outputArea.append("Name: " + p.getName() + "\n");
                outputArea.append("Age: " + p.getAge() + "\n");
                outputArea.append("BP: " + p.getBp() + "\n");
                outputArea.append("Sugar Level: " + p.getSugarLevel() + "\n");
                outputArea.append("Disease: " + p.getDisease() + "\n");
                outputArea.append("-----------------------------------\n");
                found = true;
                break;
            }
        }
        if (!found) {
            outputArea.setText("Patient not found.");
        }

            if (!found) {
                outputArea.setText(" No patient found with that ID or name.");
            }
        }

                                     //  Rewrite updated list to data.txt
    private void saveToFile()  {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"))) {
            for (Patient p : patients) {
                writer.write(p.getId() + ", " + p.getName() + ", " + p.getAge() + ", "
                        + p.getBp() + ", " + p.getSugarLevel() + ", " + p.getDisease());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }






    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MedicalDataAnalyzer().setVisible(true);
        });
    }
}

// khatam ho gaya....