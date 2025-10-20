package module1.codelab;

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Codelab2 {
    public static void main(String[] args) {
        // try-with-resources automatically closes the Scanner
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            validateAge(age);

            System.out.println("Your age is valid: " + age);

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a number.");
        }
    }

    // Validation method
    public static void validateAge(int age) throws InvalidAgeException {
        if (age <= 0 || age >= 120) {
            throw new InvalidAgeException("Age must be greater than 0 and less than 120.");
        }
    }
}
