import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// Main class to handle user input and LinkedList operations
public class StudentList {

    public static void main(String[] args) { //main method
        
        //Student list constructor
        LinkedList<Student> studentList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        // Loop gets student name, address, and GPA
        // nested are conditionals and try catch 
        do {
            // user inputs student name
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            // user inputs student address
            System.out.print("Enter student address: ");
            String address = scanner.nextLine();

            // user inputs student GPA and validate numeric input
            double gpa = 0.0;

            // Validate GPA input between 0.0 and 4.0
            // try/catch block
            while (true) {
                System.out.print("Enter GPA (numeric value): ");
                try {
                    gpa = Double.parseDouble(scanner.nextLine());
                    if (gpa < 0.0 || gpa > 4.0) {
                        System.out.println("GPA must be between 0.0 and 4.0.");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a numeric value for GPA.");
                }
            }

            // stundent dat object is created and added to the list
            studentList.add(new Student(name, address, gpa));

            // parameter needed to break or remain in the loop
            System.out.print("Do you want to enter another student? (y/n): ");
            input = scanner.nextLine().trim().toLowerCase();

        } while (input.equals("y")); //break case 

        // Sorts in ascending order by student name
        Collections.sort(studentList, Comparator.comparing(Student::getName));

        // Output the sorted student list to a text file
        // try/catch block for error handling text file writing
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("student_list.txt"))) {
            for (Student student : studentList) {
                writer.write(student.toString());
                writer.newLine(); // Write each student's data on a new line
            }
            System.out.println("Student Info in 'student_list.txt' successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Close the scanner
        scanner.close();
    }
}