import java.util.Arrays;

public class RandomNumberStatistics {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate a random 4-digit number (1000 to 9999)
            randomNumbers[i] = 1000 + (int) (Math.random() * 9000);
        }
        return randomNumbers;
    }

    // Method to find average, min, and max value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int size = 5; // Number of random values to generate
        int[] randomNumbers = generate4DigitRandomArray(size);

        // Display the generated random numbers
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));

        // Find average, min, and max values
        double[] results = findAverageMinMax(randomNumbers);
        double average = results[0];
        double min = results[1];
        double max = results[2];

        // Display the results
        System.out.printf("Average: %.2f%n", average);
        System.out.printf("Minimum: %.0f%n", min);
        System.out.printf("Maximum: %.0f%n", max);
    }
}
