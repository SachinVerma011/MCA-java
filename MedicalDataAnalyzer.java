import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class MedicalDataAnalyzer extends JFrame {
    private List<Patient> patients = new ArrayList<>();
    private JTable table;
    private DefaultTableModel tableModel;

    private JButton loadButton;
    private JButton analyzeButton;
    private JButton searchButton;
    private JButton deleteButton;
    private JTextField searchField; // for search input

    public MedicalDataAnalyzer() {
        setTitle("Medical Data Analyzer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500); // Increased height a bit for better spacing
        setLocationRelativeTo(null);

        // Main content pane with padding
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Setup UI (top: buttons, center: table)
        JPanel topPanel = new JPanel(new BorderLayout(10, 10)); // Gaps between components

        // Left-aligned action buttons
        JPanel actionsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        loadButton = new JButton("Load Data");
        analyzeButton = new JButton("Analyze Data");
        actionsPanel.add(loadButton);
        actionsPanel.add(analyzeButton);

        // Right-aligned search/delete controls
        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 5, 0));
        searchField = new JTextField(15);
        searchButton = new JButton("Search");
        deleteButton = new JButton("Delete Selected");

        // Style the delete button as a "danger" button
        deleteButton.setBackground(new Color(220, 53, 69)); // A modern "danger" red
        deleteButton.setForeground(Color.WHITE);
        deleteButton.setOpaque(true);
        deleteButton.setBorderPainted(false); // Looks cleaner with a custom background

        searchPanel.add(new JLabel("Search:")); // Add a label for clarity
        searchPanel.add(searchField);
        searchPanel.add(searchButton);
        searchPanel.add(deleteButton);

        topPanel.add(actionsPanel, BorderLayout.WEST);
        topPanel.add(searchPanel, BorderLayout.EAST);

        // Table
        String[] cols = {"ID", "Name", "Age", "Diagnosis"};
        tableModel = new DefaultTableModel(cols, 0) {
            @Override
            public boolean isCellEditable(int row, int column) { return false; }
        };

        // Create a JTable with alternating row colors (zebra-striping)
        table = new JTable(tableModel) {
            private final Color EVEN_ROW_COLOR = new Color(245, 245, 245);
            private final Color ODD_ROW_COLOR = Color.WHITE;

            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
                Component c = super.prepareRenderer(renderer, row, column);
                if (!isRowSelected(row)) {
                    // Set alternating row colors
                    c.setBackground(row % 2 == 0 ? EVEN_ROW_COLOR : ODD_ROW_COLOR);
                }
                return c;
            }
        };

        table.setRowHeight(28); // Give rows more breathing room
        table.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14)); // Style header
        table.setFillsViewportHeight(true); // Ensures table background fills the scroll pane

        JScrollPane scrollPane = new JScrollPane(table);
        
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        
        add(mainPanel); // Add the main panel to the JFrame

        // Button listeners (no changes to logic)
        loadButton.addActionListener(e -> {
            String path = "patients.csv"; // CSV file path
            loadDataFromCSV(path);
            populateTable();
        });

        analyzeButton.addActionListener(e -> {
            String message = analyzeData();
            JOptionPane.showMessageDialog(this, message, "Analysis", JOptionPane.INFORMATION_MESSAGE);
        });

        searchButton.addActionListener(e -> {
            String q = searchField.getText().trim();
            if (q.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter ID or Name to search.");
                return;
            }
            List<Patient> found = searchPatient(q);
            if (found.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No patient found for: " + q);
            } else {
                showSearchResults(found);
            }
        });

        deleteButton.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Select a row in the table to delete.");
                return;
            }
            // Need to convert view row index to model row index if sorting is added
            int modelRow = table.convertRowIndexToModel(selectedRow); 
            int id = Integer.parseInt(tableModel.getValueAt(modelRow, 0).toString());
            
            int confirm = JOptionPane.showConfirmDialog(this, "Delete patient with ID " + id + "?", "Confirm Deletion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (confirm == JOptionPane.YES_OPTION) {
                boolean deleted = deletePatientById(id);
                if (deleted) {
                    populateTable();
                    JOptionPane.showMessageDialog(this, "Patient deleted.");
                } else {
                    JOptionPane.showMessageDialog(this, "Delete failed.");
                }
            }
        });

        setVisible(true);
    }

    // 1) Load CSV into patients list
    private void loadDataFromCSV(String filepath) {
        patients.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;
            boolean first = true;
            while ((line = br.readLine()) != null) {
                if (first) { first = false; continue; } // skip header
                String[] cols = line.split(",", -1);
                if (cols.length >= 4) {
                    try {
                        int id = Integer.parseInt(cols[0].trim());
                        String name = cols[1].trim();
                        int age = Integer.parseInt(cols[2].trim());
                        String diagnosis = cols[3].trim();
                        patients.add(new Patient(id, name, age, diagnosis));
                    } catch (NumberFormatException nfe) {
                        System.err.println("Skipping malformed line: " + line);
                    }
                }
            }
            System.out.println("Loaded " + patients.size() + " patients.");
        } catch (FileNotFoundException fnf) {
             JOptionPane.showMessageDialog(this, "Error: 'patients.csv' not found.\n" + fnf.getMessage(), "File Not Found", JOptionPane.ERROR_MESSAGE);
        } 
        catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error reading CSV: " + e.getMessage(), "Read Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // 2) Populate JTable from patients list
    private void populateTable() {
        tableModel.setRowCount(0);
        for (Patient p : patients) {
            Object[] row = {p.getId(), p.getName(), p.getAge(), p.getDiagnosis()};
            tableModel.addRow(row);
        }
    }

    // 3) Search by id or name (case-insensitive)
    private List<Patient> searchPatient(String q) {
        List<Patient> result = new ArrayList<>();
        try {
            int id = Integer.parseInt(q);
            for (Patient p : patients)
                if (p.getId() == id) result.add(p);
        } catch (NumberFormatException ignored) {
            String qLow = q.toLowerCase();
            for (Patient p : patients)
                if (p.getName().toLowerCase().contains(qLow)) result.add(p);
        }
        return result;
    }

    private void showSearchResults(List<Patient> found) {
        // Use a JTextArea inside a JScrollPane for a scrollable, copy-paste-friendly result
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Found %d patient(s):%n%n", found.size()));
        for (Patient p : found) {
            sb.append(String.format("ID: %d, Name: %s, Age: %d, Dx: %s%n",
                    p.getId(), p.getName(), p.getAge(), p.getDiagnosis()));
        }

        JTextArea textArea = new JTextArea(sb.toString());
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(400, 200)); // Make the dialog box a good size
        
        JOptionPane.showMessageDialog(this, scrollPane, "Search Results", JOptionPane.INFORMATION_MESSAGE);
    }

    // 4) Analyze data
    private String analyzeData() {
        if (patients.isEmpty()) return "No data loaded.";
        double sum = 0;
        Map<String, Integer> diagCount = new HashMap<>();
        for (Patient p : patients) {
            sum += p.getAge();
            diagCount.put(p.getDiagnosis(), diagCount.getOrDefault(p.getDiagnosis(), 0) + 1);
        }
        double avg = sum / patients.size();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Total patients: %d%n", patients.size()));
        sb.append(String.format("Average age: %.2f%n", avg));
        sb.append("--------------------\n");
        sb.append("Diagnosis counts:\n");
        
        // Sort diagnosis by count for better readability
        diagCount.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(e -> sb.append(String.format("  %s: %d%n", e.getKey(), e.getValue())));

        return sb.toString();
    }

    // 5) Delete patient by id
    private boolean deletePatientById(int id) {
        Iterator<Patient> it = patients.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    // main
    public static void main(String[] args) {
        // Set the system look and feel for a modern appearance
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Run the application
        SwingUtilities.invokeLater(MedicalDataAnalyzer::new);
    }
}

// simple data model class
class Patient {
    private int id;
    private String name;
    private int age;
    private String diagnosis;

    public Patient(int id, String name, int age, String diagnosis) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDiagnosis() { return diagnosis; }
}