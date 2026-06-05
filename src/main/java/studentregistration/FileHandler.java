package studentregistration;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private final String fileLocation;

    public FileHandler(String fileLocation) {
        this.fileLocation = fileLocation;
        createFileIfNeeded();
    }

    private void createFileIfNeeded() {
        try {
            File file = new File(this.fileLocation);

            File parentFolder = file.getParentFile();
            if (parentFolder != null) {
                parentFolder.mkdirs();
            }

            if (!file.exists()) {
                try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
                    writer.println("name,surname,email,personalCode,registrationDateTime");
                }
            }
        } catch (Exception e) {
            System.out.println("Kļūda veidojot CSV failu.");
        }
    }

    public ArrayList<Student> readStudents() {
        ArrayList<Student> studentList = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(this.fileLocation))) {
            if (reader.hasNextLine()) {
                reader.nextLine();
            }

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] fields = line.split(",", -1);

                if (fields.length == 5) {
                    Student student = new Student(fields[0], fields[1], fields[2], fields[3], fields[4]);
                    studentList.add(student);
                }
            }
        } catch (Exception e) {
            System.out.println("Kļūda lasot CSV failu.");
        }

        return studentList;
    }

    public void saveStudents(ArrayList<Student> studentList) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(this.fileLocation))) {
            writer.println("name,surname,email,personalCode,registrationDateTime");

            for (Student entry : studentList) {
                writer.println(entry.toCsvLine());
            }
        } catch (Exception e) {
            System.out.println("Kļūda saglabājot CSV failu.");
        }
    }
}
