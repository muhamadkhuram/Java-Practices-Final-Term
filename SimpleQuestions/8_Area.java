// Write a program to print the area of a rectangle by creating a class named 'Area' taking
// the values of its length and breadth as parameters of its constructor and having a
// method named 'returnArea' which returns the area of the rectangle. Length and breadth
// of rectangle are entered through keyboard.

import java.util.Scanner;

class Area {

  private double length;
  private double breadth;

  // Constructor to initialize length and breadth
  public Area(double length, double breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  // Method to return the area of the rectangle
  public double returnArea() {
    return length * breadth;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input length and breadth from user
    System.out.print("Enter the length of the rectangle: ");
    double length = scanner.nextDouble();
    System.out.print("Enter the breadth of the rectangle: ");
    double breadth = scanner.nextDouble();

    // Create an instance of Area
    Area area = new Area(length, breadth);

    // Print the area of the rectangle
    System.out.println("The area of the rectangle is: " + area.returnArea());
  }
}
