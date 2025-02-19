import java.util.Set;
import java.util.HashSet;

public class SymmetricDifference {
    public static <T> Set<T> symmetricDifference(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1); // Copy set1
        Set<T> temp = new HashSet<>(set2);   // Copy set2

        result.removeAll(set2); // Remove common elements from set1
        temp.removeAll(set1);   // Remove common elements from set2

        result.addAll(temp); // Combine both sets
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Symmetric Difference: " + symmetricDifference(set1, set2)); // Output: {1, 2, 4, 5}
    }
}
