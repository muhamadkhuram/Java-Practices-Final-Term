// Class Student takes student name and roll number using a constructor. Class Marks
// (child of Student) takes 3 subject marks as input using another constructor. Class
// Result (child of Marks) has a method display() that calculates and prints the percentage
// and student details. Design the program using inheritance and constructors.

// this file isn't tested;

public class Student {

  String name;
  int rollNumber;

  public Student(String name, int rollNumber) {
    this.name = name;
    this.rollNumber = rollNumber;
  }
}

class Marks extends Student {

  int subject1;
  int subject2;
  int subject3;
}

class Result extends Marks {

  public void display() {
    double percentage =
      (super.subject1 + super.subject2 + super.subject3) / 3.0;
    System.out.println("Student Name: " + super.name);
    System.out.println("Roll Number: " + super.rollNumber);
    System.out.println("Percentage: " + super.percentage + "%");
  }
}
