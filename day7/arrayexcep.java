package day7;

import java.util.Scanner;

public class arrayexcep {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[4]; // array size is 4

        try {
            System.out.println("Enter 5 numbers:");
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt(); // index 4 causes exception
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException: 4");
        }
    }
}
