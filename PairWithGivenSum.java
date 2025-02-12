import java.util.HashSet;

public class PairWithGivenSum {

    // Method to check if there exists a pair with the given sum
    public static boolean hasPairWithSum(int[] arr, int target) {
        // HashSet to store visited numbers
        HashSet<Integer> visitedNumbers = new HashSet<>();
        
        // Traverse the array
        for (int num : arr) {
            int complement = target - num;  // Calculate the complement (target - current number)
            
            // Check if the complement is in the hash set
            if (visitedNumbers.contains(complement)) {
                return true;  // Pair found
            }
            
            // Add the current number to the hash set
            visitedNumbers.add(num);
        }
        
        return false;  // No pair found
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;
        
        boolean result = hasPairWithSum(arr, target);
        
        if (result) {
            System.out.println("There exists a pair with the given sum.");
        } else {
            System.out.println("No pair found with the given sum.");
        }
    }
}
