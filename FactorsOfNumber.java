import java.util.Scanner;

public class FactorsOfNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If index is equal to maxFactor, resize the array
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        // Display the factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
    }
}
