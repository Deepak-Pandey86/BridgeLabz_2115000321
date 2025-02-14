import java.util.Arrays;

public class CountingSort {
    public static int[] countingSort(int[] arr) {
        int[] count = new int[9];
        int[] output = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - 10]++;
        }
        
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - 10] - 1] = arr[i];
            count[arr[i] - 10]--;
        }
        
        return output;
    }

    public static void main(String[] args) {
        int[] ages = {15, 10, 18, 13, 12, 17, 14, 16, 15, 11};
        int[] sortedAges = countingSort(ages);
        System.out.println(Arrays.toString(sortedAges));
    }
}
