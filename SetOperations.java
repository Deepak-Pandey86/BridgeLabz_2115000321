import java.util.Set;
import java.util.HashSet;

public class SetOperations {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> unionSet = new HashSet<>(set1); // Copy set1
        unionSet.addAll(set2); // Add all elements from set2
        return unionSet;
    }

    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> intersectionSet = new HashSet<>(set1); // Copy set1
        intersectionSet.retainAll(set2); // Retain only common elements
        return intersectionSet;
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

        System.out.println("Union: " + union(set1, set2)); // Output: {1, 2, 3, 4, 5}
        System.out.println("Intersection: " + intersection(set1, set2)); // Output: {3}
    }
}
