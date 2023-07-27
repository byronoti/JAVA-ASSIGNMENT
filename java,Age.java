import java.util.Scanner;

public class SurnameAndAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their surname
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        // Ask the user to enter their current age
        System.out.print("Enter your current age: ");
        int age = scanner.nextInt();

        // Calculate the number of characters in the surname
        int surnameLength = surname.length();

        // Check if the age is even or odd
        String ageStatus = (age % 2 == 0) ? "even" : "odd";

        // Print the results
        System.out.println("Your surname has " + surnameLength + " characters.");
        System.out.println("Your age is " + ageStatus + ".");
    }
}
