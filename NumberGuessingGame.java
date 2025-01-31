import java.util.Scanner;

public class NumberGuessingGame {

    private static final int MIN = 1;
    private static final int MAX = 100;
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Think of a number between " + MIN + " and " + MAX + " (inclusive).");
        System.out.println("I will try to guess it!");

        int guess;
        boolean isCorrect = false;

        while (!isCorrect) {
            guess = generateGuess();
            System.out.println("Is the number " + guess + "? (Enter 'h' for high, 'l' for low, 'c' for correct): ");
            char feedback = getUser Feedback();

            isCorrect = (feedback == 'c');
            if (!isCorrect) {
                adjustGuessRange(feedback, guess);
            }
        }

        System.out.println("Yay! I guessed your number!");
        scanner.close();
    }

    // Method to generate a random guess
    private static int generateGuess() {
        return random.nextInt(MAX - MIN + 1) + MIN; // Generates a number between MIN and MAX
    }

    // Method to get user feedback
    private static char getUser Feedback() {
        char feedback;
        while (true) {
            feedback = scanner.next().toLowerCase().charAt(0);
            if (feedback == 'h' || feedback == 'l' || feedback == 'c') {
                break;
            } else {
                System.out.print("Invalid input. Please enter 'h', 'l', or 'c': ");
            }
        }
        return feedback;
    }

    // Method to adjust the guessing range based on user feedback
    private static void adjustGuessRange(char feedback, int guess) {
        if (feedback == 'h') {
            System.out.println("Your number is lower than " + guess + ".");
            // Adjust the upper limit for the next guess
            MAX = guess - 1;
        } else if (feedback == 'l') {
            System.out.println("Your number is higher than " + guess + ".");
            // Adjust the lower limit for the next guess
            MIN = guess + 1;
        }
    }
}
