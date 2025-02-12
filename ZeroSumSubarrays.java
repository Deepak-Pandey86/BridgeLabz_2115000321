import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ZeroSumSubarrays {

    public static List<List<Integer>> findSubarraysWithZeroSum(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, List<Integer>> sumMap = new HashMap<>();
        int cumulativeSum = 0;
        
        // Traverse through the array
        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += arr[i];
            
            // Check if the cumulative sum is 0 (subarray from the start to the current index)
            if (cumulativeSum == 0) {
                List<Integer> subarray = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    subarray.add(arr[j]);
                }
                result.add(subarray);
            }
            
            // If cumulative sum has been seen before, subarrays exist between previous indices and current index
            if (sumMap.containsKey(cumulativeSum)) {
                List<Integer> prevIndices = sumMap.get(cumulativeSum);
                for (int start : prevIndices) {
                    List<Integer> subarray = new ArrayList<>();
                    for (int j = start + 1; j <= i; j++) {
                        subarray.add(arr[j]);
                    }
                    result.add(subarray);
                }
            }
            
            // Store the current cumulative sum in the map
            sumMap.putIfAbsent(cumulativeSum, new ArrayList<>());
            sumMap.get(cumulativeSum).add(i);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 2, -2, 3, -3, 0};
        List<List<Integer>> subarrays = findSubarraysWithZeroSum(arr);
        
        System.out.println("Zero sum subarrays:");
        for (List<Integer> subarray : subarrays) {
            System.out.println(subarray);
        }
    }
}
