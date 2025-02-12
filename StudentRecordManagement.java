class Student {
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;

    public Student(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentList {
    private Student head;

    public void addStudent(int rollNumber, String name, int age, char grade, int position) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (position == 0 || head == null) {
            newStudent.next = head;
            head = newStudent;
            return;
        }
        Student current = head;
        for (int i = 0; current.next != null && i < position - 1; i++) {
            current = current.next;
        }
        newStudent.next = current.next;
        current.next = newStudent;
    }

    public void deleteStudent(int rollNumber) {
        if (head == null) return;
        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
        Student current = head;
        while (current.next != null && current.next.rollNumber != rollNumber) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public Student searchStudent(int rollNumber) {
        Student current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void updateGrade(int rollNumber, char newGrade) {
        Student student = searchStudent(rollNumber);
        if (student != null) {
            student.grade = newGrade;
        }
    }

    public void displayStudents() {
        Student current = head;
        while (current != null) {
            System.out.println("Roll No: " + current.rollNumber + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
            current = current.next;
        }
    }
}

public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentList list = new StudentList();
        list.addStudent(101, "Alice", 20, 'A', 0);
        list.addStudent(102, "Bob", 22, 'B', 1);
        list.addStudent(103, "Charlie", 21, 'C', 2);
        list.displayStudents();
        System.out.println("After updating grade:");
        list.updateGrade(102, 'A');
        list.displayStudents();
        System.out.println("After deleting a record:");
        list.deleteStudent(101);
        list.displayStudents();
    }
}
