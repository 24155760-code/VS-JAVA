package day7;

import java.util.Scanner;

public class arrayexcep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5]; // ✅ array size matches number of inputs

        try {
            System.out.println("Enter 5 numbers:");
            for (int i = 0; i < arr.length; i++) { // ✅ use arr.length for safety
                arr[i] = sc.nextInt();
            }

            System.out.println("You entered:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage()); // ✅ print actual exception
        } finally {
            sc.close(); // ✅ close Scanner
        }
    }
}
