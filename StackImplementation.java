import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {
    private Queue<Integer> queue1 = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();

    // Push operation
    public void push(int x) {
        queue1.add(x);
    }

    // Pop operation
    public int pop() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        // Move elements except the last one to queue2
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        int topElement = queue1.poll(); // Last added element (top of stack)

        // Swap the queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // Top operation
    public int top() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        // Move elements except the last one to queue2
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        int topElement = queue1.peek(); // Last element in queue1 (top of stack)
        queue2.add(queue1.poll()); // Move it to queue2

        // Swap the queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        // Push elements into stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop and print
        System.out.println(stack.pop()); // Output: 3

        // Get the top element
        System.out.println(stack.top()); // Output: 2
    }
}
