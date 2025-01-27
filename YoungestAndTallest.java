import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input age and height for Amar
        System.out.print("Enter age of Amar: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter height of Amar (in cm): ");
        double heightAmar = scanner.nextDouble();
        
        // Input age and height for Akbar
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter height of Akbar (in cm): ");
        double heightAkbar = scanner.nextDouble();
        
        // Input age and height for Anthony
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = scanner.nextInt();
        System.out.print("Enter height of Anthony (in cm): ");
        double heightAnthony = scanner.nextDouble();
        
        // Find the youngest friend
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = "";
        
        if (youngestAge == ageAmar) {
            youngestFriend = "Amar";
        } else if (youngestAge == ageAkbar) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }
        
        // Find the tallest friend
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = "";
        
        if (tallestHeight == heightAmar) {
            tallestFriend = "Amar";
        } else if (tallestHeight == heightAkbar) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }
        
        // Output the results
        System.out.println("The youngest friend is: " + youngestFriend + " with age " + youngestAge);
        System.out.println("The tallest friend is: " + tallestFriend + " with height " + tallestHeight + " cm");
        
        scanner.close();
    }
}
