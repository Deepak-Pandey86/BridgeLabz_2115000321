class InventoryItem {
    String itemName;
    int itemID, quantity;
    double price;
    InventoryItem next;

    public InventoryItem(String itemName, int itemID, int quantity, double price) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class InventoryManagement {
    private InventoryItem head;

    public void addItem(String itemName, int itemID, int quantity, double price, int position) {
        InventoryItem newItem = new InventoryItem(itemName, itemID, quantity, price);
        if (position == 0 || head == null) {
            newItem.next = head;
            head = newItem;
            return;
        }
        InventoryItem temp = head;
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;
        newItem.next = (temp != null) ? temp.next : null;
        if (temp != null) temp.next = newItem;
    }

    public void removeItem(int itemID) {
        if (head == null) return;
        if (head.itemID == itemID) {
            head = head.next;
            return;
        }
        InventoryItem temp = head;
        while (temp.next != null && temp.next.itemID != itemID)
            temp = temp.next;
        if (temp.next != null)
            temp.next = temp.next.next;
    }

    public void updateQuantity(int itemID, int newQuantity) {
        InventoryItem temp = head;
        while (temp != null) {
            if (temp.itemID == itemID) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }

    public InventoryItem searchItemByID(int itemID) {
        InventoryItem temp = head;
        while (temp != null) {
            if (temp.itemID == itemID) return temp;
            temp = temp.next;
        }
        return null;
    }

    public InventoryItem searchItemByName(String itemName) {
        InventoryItem temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(itemName)) return temp;
            temp = temp.next;
        }
        return null;
    }

    public double calculateTotalInventoryValue() {
        double totalValue = 0;
        InventoryItem temp = head;
        while (temp != null) {
            totalValue += temp.quantity * temp.price;
            temp = temp.next;
        }
        return totalValue;
    }

    public void sortInventoryByName() {
        if (head == null || head.next == null) return;
        head = mergeSort(head, true);
    }

    public void sortInventoryByPrice() {
        if (head == null || head.next == null) return;
        head = mergeSort(head, false);
    }

    private InventoryItem mergeSort(InventoryItem head, boolean byName) {
        if (head == null || head.next == null) return head;
        InventoryItem middle = getMiddle(head);
        InventoryItem nextOfMiddle = middle.next;
        middle.next = null;
        InventoryItem left = mergeSort(head, byName);
        InventoryItem right = mergeSort(nextOfMiddle, byName);
        return merge(left, right, byName);
    }

    private InventoryItem merge(InventoryItem left, InventoryItem right, boolean byName) {
        if (left == null) return right;
        if (right == null) return left;
        if ((byName && left.itemName.compareToIgnoreCase(right.itemName) < 0) ||
            (!byName && left.price < right.price)) {
            left.next = merge(left.next, right, byName);
            return left;
        } else {
            right.next = merge(left, right.next, byName);
            return right;
        }
    }

    private InventoryItem getMiddle(InventoryItem head) {
        if (head == null) return head;
        InventoryItem slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void displayInventory() {
        InventoryItem temp = head;
        while (temp != null) {
            System.out.println("Item ID: " + temp.itemID + ", Name: " + temp.itemName +
                    ", Quantity: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();
        inventory.addItem("Laptop", 101, 5, 750.0, 0);
        inventory.addItem("Mouse", 102, 15, 25.0, 1);
        inventory.addItem("Keyboard", 103, 10, 45.0, 2);
        inventory.displayInventory();
        inventory.sortInventoryByPrice();
        inventory.displayInventory();
    }
}
