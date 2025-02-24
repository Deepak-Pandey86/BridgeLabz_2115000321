class Student {
    private String name;


    public Student() {
        this.name = "Default Student";
    }


    public void display() {
        System.out.println("Student Name: " + name);
    }
}


public class ReflectionObjectCreation {
    public static void main(String[] args) {
        try {
            // Dynamically create an instance of Student using Reflection
            Class<?> studentClass = Class.forName("Student");
            Object studentInstance = studentClass.getDeclaredConstructor().newInstance();


            // Invoke the display method to verify object creation
            studentClass.getMethod("display").invoke(studentInstance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
