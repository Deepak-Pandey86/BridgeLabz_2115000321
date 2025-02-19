import java.util.LinkedList;
import java.util.Iterator;

public class NthElementFromEnd {
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> first = list.iterator();
        Iterator<T> second = list.iterator();

        // Move 'first' pointer N steps ahead
        for (int i = 0; i < n; i++) {
            if (first.hasNext()) {
                first.next();
            } else {
                return null; // If N is greater than list size, return null
            }
        }

        // Move both pointers until 'first' reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next(); // 'second' now points to the Nth element from the end
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int N = 2;
        String result = findNthFromEnd(list, N);
        System.out.println(result); // Output: D
    }
}
