import java.util.Scanner;

class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String first = sc.nextLine();

        System.out.print("Enter second name: ");
        String last = sc.nextLine();

        System.out.println(last + " " + first);
    }
}
