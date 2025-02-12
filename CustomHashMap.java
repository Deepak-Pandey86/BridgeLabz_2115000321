import java.util.LinkedList;

class CustomHashMap {

    private static class Node {
        int key;
        int value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Node>[] table;
    private static final int SIZE = 10;

    public CustomHashMap() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        LinkedList<Node> bucket = table[index];

        for (Node node : bucket) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }

        bucket.add(new Node(key, value));
    }

    public Integer get(int key) {
        int index = hash(key);
        LinkedList<Node> bucket = table[index];

        for (Node node : bucket) {
            if (node.key == key) {
                return node.value;
            }
        }

        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        LinkedList<Node> bucket = table[index];

        for (Node node : bucket) {
            if (node.key == key) {
                bucket.remove(node);
                return;
            }
        }
    }

    public void display() {
        for (int i = 0; i < SIZE; i++) {
            LinkedList<Node> bucket = table[i];
            if (!bucket.isEmpty()) {
                System.out.print("Bucket " + i + ": ");
                for (Node node : bucket) {
                    System.out.print("[" + node.key + "=" + node.value + "] ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();

        map.put(1, 10);
        map.put(2, 20);
        map.put(12, 30);

        System.out.println("Value for key 1: " + map.get(1));
        System.out.println("Value for key 2: " + map.get(2));
        System.out.println("Value for key 12: " + map.get(12));

        map.remove(2);
        System.out.println("Value for key 2 after removal: " + map.get(2));

        map.display();
    }
}
