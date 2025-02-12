class Task {
    int taskId, priority;
    String taskName, dueDate;
    Task next;

    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {
    private Task head = null, tail = null, current = null;

    public void addTask(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            tail.next = head;
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head;
        }
    }

    public void removeTask(int taskId) {
        if (head == null) return;
        Task temp = head, prev = null;
        do {
            if (temp.taskId == taskId) {
                if (temp == head) head = head.next;
                if (temp == tail) tail = prev;
                if (prev != null) prev.next = temp.next;
                if (tail != null) tail.next = head;
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    public void viewCurrentTask() {
        if (current == null) current = head;
        if (current != null) {
            System.out.println("Current Task: " + current.taskName);
            current = current.next;
        }
    }

    public void displayTasks() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println(temp.taskId + " - " + temp.taskName + " (Priority: " + temp.priority + ") Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchTaskByPriority(int priority) {
        if (head == null) return;
        Task temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println("Task Found: " + temp.taskName);
            }
            temp = temp.next;
        } while (temp != head);
    }
}

public class TaskSchedular {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask(1, "Task A", 2, "2025-02-15");
        scheduler.addTask(2, "Task B", 1, "2025-02-16");
        scheduler.addTask(3, "Task C", 3, "2025-02-17");
        
        scheduler.displayTasks();
        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask();
        scheduler.searchTaskByPriority(1);
        scheduler.removeTask(2);
        scheduler.displayTasks();
    }
}
