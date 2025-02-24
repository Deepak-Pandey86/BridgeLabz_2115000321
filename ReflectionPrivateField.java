import java.lang.reflect.Field;


class Person {
    private int age;


    public Person(int age) {
        this.age = age;
    }


    public void displayAge() {
        System.out.println("Age: " + age);
    }
}


public class ReflectionPrivateField {
    public static void main(String[] args) {
        try {
            Person person = new Person(25);
            person.displayAge();


            Field ageField = Person.class.getDeclaredField("age");
            ageField.setAccessible(true); // Allow access to private field
            
            ageField.set(person, 30); // Modify the private field
            
            System.out.println("Modified Age: " + ageField.get(person));
            person.displayAge();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
