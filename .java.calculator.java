import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Basic Calculator!");

        // Get the first number from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Get the operation from the user
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        // Get the second number from the user
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        // Perform the requested operation
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation entered!");
                return;
        }

        // Display the result
        System.out.println("Result: " + result);

        scanner.close();
    }
}
