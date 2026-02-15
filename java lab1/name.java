import java.util.Scanner;

public class name {   // ✅ Class name matches file name "Name.java"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String first = sc.nextLine();

        System.out.print("Enter last name: ");
        String last = sc.nextLine();

        System.out.println("Full Name: " + first + " " + last);

        sc.close(); // ✅ Close Scanner to avoid resource leak
    }
}
