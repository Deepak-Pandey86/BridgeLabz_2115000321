import java.util.HashSet;

public class LongestConsecutiveSequence {

    // Method to find the length of the longest consecutive elements sequence
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        // HashSet to store the elements of the array
        HashSet<Integer> numSet = new HashSet<>();
        
        // Add all elements to the hash set
        for (int num : nums) {
            numSet.add(num);
        }

        int longestSequence = 0;

        // Iterate through the array to find the longest consecutive sequence
        for (int num : nums) {
            // If num is the start of a sequence (num - 1 is not in the set)
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentSequenceLength = 1;

                // Expand the sequence by checking consecutive numbers
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentSequenceLength++;
                }

                // Update the longest sequence length
                longestSequence = Math.max(longestSequence, currentSequenceLength);
            }
        }

        return longestSequence;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = longestConsecutive(nums);
        
        System.out.println("Length of the longest consecutive sequence: " + result);
    }
}
