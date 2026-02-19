import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentFileManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("student.txt", true);

            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();  

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            System.out.print("Marks: ");
            int marks = sc.nextInt();

            fw.write(roll + " " + name + " " + subject + " " + marks + "\n");

            fw.close();
            System.out.println("Data saved successfully.");

        } catch (IOException e) {
            System.out.println("Error occurred.");
        }

        sc.close();
    }
}
