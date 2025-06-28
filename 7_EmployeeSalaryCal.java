// Employee Salary Calculation
// Create an Employee class with:
// o Attributes: name, id, basicSalary.
// o A constructor to initialize these values.
// o A method calculateSalary() that adds a 10% bonus to basicSalary. Instantiate the
// class and print the total salary.

public class Employee {

  // Attributes
  String name;
  int id;
  double salary;

  // Constructor to initialize attributes
  Employee(String name, int id, double salary) {
    this.name = name;
    this.id = id;
    this.salary = salary;
  }

  // Method to calculate total salary with a 10% bonus
  double addBonusToSalary() {
    // Adding a 10% bonus; Multiply by 0.10 means x 10/100; which is actual formula
    // simple math bhi use kar skty ho; apny hisaab sy;
    return salary + (salary * 0.10);
  }

  public static void main(String[] args) {
    // Create an Employee object
    Employee employee = new Employee("Dilshad Ahmad", 007, 69000); // (:

    // Calculate and display the total salary
    double totalSalary = employee.addBonusToSalary();
    System.out.println(
      "Total Salary of " +
      employee.name +
      " with ID " +
      employee.id +
      " is " +
      totalSalary
    );
  }
}
