import java.util.Scanner;

public class ChocolateDistribution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the number of chocolates and the number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();
        
        // Call the method to find the chocolates per child and the remaining chocolates
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        
        // Display the number of chocolates each child gets and the remaining chocolates
        System.out.println("Each child will get: " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);
        
        scanner.close();
    }

    // Method to find the number of chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        // Calculate how many chocolates each child gets (quotient)
        int chocolatesPerChild = number / divisor;
        
        // Calculate the remaining chocolates (remainder)
        int remainingChocolates = number % divisor;
        
        // Return both values in an array
        return new int[]{chocolatesPerChild, remainingChocolates};
    }
}
