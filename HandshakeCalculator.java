import java.util.Scanner;

public class HandshakeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate the maximum number of handshakes
        int maxHandshakes = calculateHandshakes(numberOfStudents);

        // Output the result
        System.out.printf("The maximum number of handshakes among %d students is %d.\n", numberOfStudents, maxHandshakes);
    }

    // Method to calculate the maximum number of handshakes
    private static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}