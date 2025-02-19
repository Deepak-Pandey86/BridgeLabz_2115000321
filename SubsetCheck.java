import java.util.*;

public class SubsetCheck {
    public static boolean isSubset(Set<Integer> subset, Set<Integer> mainSet) {
        return mainSet.containsAll(subset); // Check if mainSet contains all elements of subset
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        boolean result = isSubset(set1, set2);
        System.out.println("Is Set1 a subset of Set2? " + result); // Output: true
    }
}
