import java.util.*;

public class SearchComparison {

    public static void main(String[] args) {
        int[] datasetSizes = { 1000, 100000, 1000000 };
        for (int size : datasetSizes) {
            System.out.println("Dataset Size: " + size);

            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = i;
            }
            long start = System.nanoTime();
            searchArray(array, size - 1);
            long arraySearchTime = System.nanoTime() - start;
            System.out.println("Array Search Time: " + arraySearchTime / 1e6 + " ms");

            HashSet<Integer> hashSet = new HashSet<>();
            for (int i = 0; i < size; i++) {
                hashSet.add(i);
            }
            start = System.nanoTime();
            searchHashSet(hashSet, size - 1);
            long hashSetSearchTime = System.nanoTime() - start;
            System.out.println("HashSet Search Time: " + hashSetSearchTime / 1e6 + " ms");

            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int i = 0; i < size; i++) {
                treeSet.add(i);
            }
            start = System.nanoTime();
            searchTreeSet(treeSet, size - 1);
            long treeSetSearchTime = System.nanoTime() - start;
            System.out.println("TreeSet Search Time: " + treeSetSearchTime / 1e6 + " ms");
        }
    }

    public static void searchArray(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return;
            }
        }
    }

    public static void searchHashSet(HashSet<Integer> set, int target) {
        set.contains(target);
    }

    public static void searchTreeSet(TreeSet<Integer> set, int target) {
        set.contains(target);
    }
}
