public class MultiplesInRange {
    public static void main(String[] args) {
        int lowerBound = 71;
        int upperBound = 150;

        System.out.println("Multiples of 2, 3, and 7 within the range of " + lowerBound + " to " + upperBound + ":");
        displayMultiples(lowerBound, upperBound);
    }

    private static void displayMultiples(int lowerBound, int upperBound) {
        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
