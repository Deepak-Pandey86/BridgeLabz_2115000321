import java.io.*;


public class DataStreamExample {
    public static void main(String[] args) {
        String fileName = "student_data.bin";


               try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(101);         // Roll Number
            dos.writeUTF("Alice");     // Name
            dos.writeDouble(3.8);      // GPA
            
            dos.writeInt(102);
            dos.writeUTF("Bob");
            dos.writeDouble(3.6);
            
            System.out.println("Student details stored successfully.");
        } catch (IOException e) {
            System.out.println("Error writing data: " + e.getMessage());
        }


                try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            while (dis.available() > 0) { 
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
    }
}
