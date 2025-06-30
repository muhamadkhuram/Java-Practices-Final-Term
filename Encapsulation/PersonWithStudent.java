// Create a program that demonstrates encapsulation by:
// Defining a class Person with private fields: name and age, along with public getters and
// setters.
// Defining a subclass Student that extends Person and adds a private field studentId with its
// own getter and setter.
// In the Student class, create a method displayDetails() that uses the super keyword to
// access the Person class methods.
// In the Main class, create an object of Student, set values using setters, and display all details
// using the displayDetails() method.

// IN URDU
// 1. aik class Person define kani hae jis main private fields hon: name aur age
// 2. is class mein public getters aur setters hon.
// 3. aik subclass Student define kare jo Person ko extend kare aur aik private field studentId
//    add kare jiska apna getter aur setter ho.
// 4. Student class mein aik method displayDetails() create kare jo super keyword ka istemal
//    kare Person class methods ko access karne ke liye.

class Person {

  // Private fields for encapsulation
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

class Student extends Person {

  // Private field for student ID
  private String studentId;

  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  // Method to display details using super keyword
  public void displayDetails() {
    System.out.println("Name: " + getName());
    System.out.println("Age: " + getAge());
    System.out.println("Student ID: " + getStudentId());
  }
}

public class Main {

  public static void main(String[] args) {
    // Create an object of Student
    Student student = new Student();

    // Set values using setters
    student.setName("Dilshad Ahmad");
    student.setAge(23);
    student.setStudentId("ADPCS023A24-23");

    // Display all details using displayDetails() method
    student.displayDetails();
  }
}
