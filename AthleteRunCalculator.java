import java.util.Scanner;

public class AthleteRunCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sides of the triangular park
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = calculatePerimeter(side1, side2, side3);

        // Calculate the number of rounds required to complete 5 km
        double rounds = calculateRounds(perimeter, 5000); // 5000 meters = 5 km

        // Output the result
        System.out.printf("The athlete needs to complete %.2f rounds to finish a 5 km run.\n", rounds);
    }

    // Method to calculate the perimeter of the triangle
    private static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate the number of rounds required
    private static double calculateRounds(double perimeter, double distance) {
        return distance / perimeter;
    }
}
