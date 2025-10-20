package module1.task;

import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class Task2 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a positive number: ");
            int number = scanner.nextInt();

            if(number < 0) {
                throw new InvalidNumberException("Error: number must be positive!");
            }
            System.out.println("Valid number: " + number);

        }catch (InvalidNumberException e) {
            System.out.println("Invalid input : " + e.getMessage());
        }
    }
}
