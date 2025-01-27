import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the number
        System.out.print("Enter a number to generate its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();
        
        // Generate and print the multiplication table from 6 to 9
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        
        scanner.close();
    }
}
