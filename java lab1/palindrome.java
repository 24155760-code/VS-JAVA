import java.util.Scanner;

class Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int m = sc.nextInt();

        if (m >= 90)
            System.out.println("Grade: O");
        else if (m >= 80)
            System.out.println("Grade: E");
        else if (m >= 70)
            System.out.println("Grade: A");
        else if (m >= 60)
            System.out.println("Grade: B");
        else
            System.out.println("Grade: C");

        sc.close();
    }
}