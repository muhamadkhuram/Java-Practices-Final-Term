// Define a Student class with attributes name and grade. Implement:
// o A default constructor that sets name = "Not Assigned" and grade = 0.
// o A parameterized constructor to assign values passed by the user. Create instances
// using both constructors and display the values.

public class Student {

    // Ye default constructor hae;
    public Student() {
        this.name = "Not Assigned";
        this.grade = 0;
    }

    // Ye parameterized constructor hae; yani is ko data pass karna parega
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    String name;
    int grade;

    public static void main(String[] args) {

        // Using default constructor
        Student student1 = new Student();
        System.out.println("Student 1: Name = " + student1.name + ", Grade = " + student1.grade);

        // Using parameterized constructor
        Student student2 = new Student("Alice", 90);
        System.out.println("Student 2: Name = " + student2.name + ", Grade = " + student2.grade);

    }
}
