package rvt;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CsvManager {
    private static final String FILENAME = "students.csv";
    private static final Logger logger = Logger.getLogger(CsvManager.class.getName());

    public static void writeToFile(Student student) {
        try (FileWriter fileWriter = new FileWriter(FILENAME, true);
            BufferedWriter writer = new BufferedWriter(fileWriter)) {
            writer.write(student.toCsvString());
            writer.newLine();
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error writing to CSV file", e);
        }
    }

    public static List<Student> readFromFile() {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 12) {
                    Student student = new Student();
                    students.add(student);
                }
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error reading from CSV file", e);
        }
        return students;
    }
}
