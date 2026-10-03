package core_java_project_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class studentfilesservice {

	private static final String FILE_NAME = "students.dat";

    // Save students to file
    public void saveStudents(HashMap<Integer, student> students) {

        try (ObjectOutputStream output =
                     new ObjectOutputStream(
                             new FileOutputStream(FILE_NAME))) {

            output.writeObject(students);

            System.out.println("Student details saved successfully.");

        } catch (IOException e) {

            System.out.println("Error while saving data: "
                    + e.getMessage());
        }
    }

    // Load students from file
    @SuppressWarnings("unchecked")
    public HashMap<Integer, student> loadStudents() {

        try (ObjectInputStream input =
                     new ObjectInputStream(
                             new FileInputStream(FILE_NAME))) {

            HashMap<Integer, student> students =
                    (HashMap<Integer, student>) input.readObject();

            System.out.println("Student details loaded successfully.");

            return students;

        } catch (IOException | ClassNotFoundException e) {

            System.out.println("No previous student data found.");

            return new HashMap<>();
        }
    }
}