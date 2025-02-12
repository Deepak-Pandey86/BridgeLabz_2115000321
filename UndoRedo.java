class UndoRedo {
    private static class Node {
        String text;
        Node prev, next;
        Node(String text) {
            this.text = text;
        }
    }
    
    private Node head, tail, current;
    private int size = 0, maxSize = 10;
    
    public void addState(String text) {
        Node newNode = new Node(text);
        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        } else {
            head = newNode;
        }
        current = newNode;
        tail = newNode;
        size++;
        if (size > maxSize) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }
    
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }
    
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.text);
        } else {
            System.out.println("No text available.");
        }
    }
    
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.addState("Hello");
        editor.addState("Hello, World");
        editor.addState("Hello, World!");
        editor.displayCurrentState();
        editor.undo();
        editor.displayCurrentState();
        editor.redo();
        editor.displayCurrentState();
    }
}
