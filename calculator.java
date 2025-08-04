import java.util.Scanner;

public class Calculator {

    // Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division with check
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    // Display menu
    private static void printMenu() {
        System.out.println("\n=== Java Console Calculator ===");
        System.out.println("Select operation:");
        System.out.println("1) Addition (+)");
        System.out.println("2) Subtraction (-)");
        System.out.println("3) Multiplication (*)");
        System.out.println("4) Division (/)");
        System.out.println("5) Exit");
        System.out.print("Enter choice (1-5): ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            printMenu();

            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                case "+":
                    System.out.print("Enter first number: ");
                    double a1 = readDouble(scanner);
                    System.out.print("Enter second number: ");
                    double b1 = readDouble(scanner);
                    System.out.println("Result: " + add(a1, b1));
                    break;
                case "2":
                case "-":
                    System.out.print("Enter first number: ");
                    double a2 = readDouble(scanner);
                    System.out.print("Enter second number: ");
                    double b2 = readDouble(scanner);
                    System.out.println("Result: " + subtract(a2, b2));
                    break;
                case "3":
                case "*":
                    System.out.print("Enter first number: ");
                    double a3 = readDouble(scanner);
                    System.out.print("Enter second number: ");
                    double b3 = readDouble(scanner);
                    System.out.println("Result: " + multiply(a3, b3));
                    break;
                case "4":
                case "/":
                    System.out.print("Enter first number: ");
                    double a4 = readDouble(scanner);
                    System.out.print("Enter second number: ");
                    double b4 = readDouble(scanner);
                    try {
                        System.out.println("Result: " + divide(a4, b4));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case "5":
                case "exit":
                case "q":
                    keepRunning = false;
                    System.out.println("Exiting calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1-5.");
            }
        }

        scanner.close();
    }

    // Helper to safely read a double, reprompt on invalid input
    private static double readDouble(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.print("Invalid number. Please enter again: ");
            }
        }
    }
}
