import java.util.Scanner;

abstract class Student {
    int rollNo;
    long regNo;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rollno - ");
        rollNo = sc.nextInt();
        System.out.print("Registration no - ");
        regNo = sc.nextLong();
    }

    abstract void course();
}

class Kiitian extends Student {
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
}

public class Main {
    public static void main(String[] args) {
        Kiitian k = new Kiitian();
        k.getInput();

        System.out.println("Rollno - " + k.rollNo);
        System.out.println("Registration no - " + k.regNo);
        k.course();
    }
}
