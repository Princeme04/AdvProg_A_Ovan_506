package module1.task;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of values: ");
            int n = scanner.nextInt();

            int[] numbers = new int[n];
            System.out.println("Enter the values:");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }

            int total = 0;
            for (int i = 0; i < n; i++) {
                total += numbers[i];
            }

            double average = (double) total / n;
            System.out.println("The average is: " + average);
        }
    }
}
