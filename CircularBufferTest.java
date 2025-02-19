class CircularBuffer {
    private int[] buffer;
    private int size;
    private int front;
    private int rear;
    private int count;

    // Constructor: Initialize buffer with a fixed size
    public CircularBuffer(int size) {
        this.size = size;
        this.buffer = new int[size];
        this.front = 0;
        this.rear = -1;
        this.count = 0;
    }

    // Insert an element into the buffer (overwrite if full)
    public void enqueue(int value) {
        rear = (rear + 1) % size; // Move rear pointer circularly
        buffer[rear] = value;
        
        if (count < size) {
            count++; // Increase count if buffer is not full
        } else {
            front = (front + 1) % size; // Move front pointer to overwrite oldest element
        }
    }

    // Remove an element from the buffer
    public int dequeue() {
        if (count == 0) {
            throw new RuntimeException("Buffer is empty");
        }
        int value = buffer[front];
        front = (front + 1) % size; // Move front pointer circularly
        count--;
        return value;
    }

    // Display buffer contents
    public void display() {
        if (count == 0) {
            System.out.println("Buffer is empty");
            return;
        }
        System.out.print("Buffer: ");
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(front + i) % size] + " ");
        }
        System.out.println();
    }
}

public class CircularBufferTest {
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);

        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3);
        buffer.display(); // Output: Buffer: 1 2 3

        buffer.enqueue(4); // Overwrites 1
        buffer.display(); // Output: Buffer: 2 3 4

        System.out.println("Dequeued: " + buffer.dequeue()); // Output: Dequeued: 2
        buffer.display(); // Output: Buffer: 3 4

        buffer.enqueue(5);
        buffer.display(); // Output: Buffer: 3 4 5
    }
}
