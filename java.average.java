import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        int numSubjects = 5;
        int[] marks = new int[numSubjects];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks of " + numSubjects + " units:");

        // Input marks from the user
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Unit " + (i + 1) + " mark: ");
            marks[i] = scanner.nextInt();
        }

        // Calculate the sum of marks
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        // Calculate the average
        double average = (double) sum / numSubjects;

        // Display the average
        System.out.println("Average mark: " + average);

        scanner.close();
    }
}
