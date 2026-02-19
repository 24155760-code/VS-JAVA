import java.io.*;
import java.util.Scanner;

public class StudentFileManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Student Details 
        System.out.println("--- Enter Student Details ---");
        System.out.print("Enter the name of the file to write to (e.g., student_details.txt): ");
        String fileName = scanner.nextLine();

        try (FileWriter writer = new FileWriter(fileName, true)) 
        {
            System.out.print("Enter Student RollNo: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Subject: ");
            String subject = scanner.nextLine();

            System.out.print("Enter Marks: ");
            double marks = scanner.nextDouble();

            scanner.nextLine(); 

            String studentDetails = rollNo + "," + name + "," + subject + "," + marks + "\n";
            writer.write(studentDetails);
            System.out.println("Student details written to file successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        //Read and Display 
        System.out.println("\n--- Reading Content from File ---");
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            System.out.println("RollNo | Name | Subject | Marks");
            System.out.println("--------------------------------");

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                // Optional: You can parse the line here (using split(",")) to display in a tabular format
                System.out.println(line);
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (Exception e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            scanner.close(); // Close the main scanner object
        }
    }
}
