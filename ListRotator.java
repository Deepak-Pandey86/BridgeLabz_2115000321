import java.util.*;

public class ListRotator {
    public static <T> List<T> rotateList(List<T> list, int positions) {
        int size = list.size();
        positions = positions % size; // Handle cases where positions > size
        List<T> rotatedList = new ArrayList<>();
        rotatedList.addAll(list.subList(positions, size)); // Add elements after rotation point
        rotatedList.addAll(list.subList(0, positions)); // Add the rotated elements at the end
        return rotatedList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int rotateBy = 2;
        List<Integer> rotated = rotateList(numbers, rotateBy);
        System.out.println(rotated);
    }
}
