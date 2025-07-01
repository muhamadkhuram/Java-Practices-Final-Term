// 1. Question (for Compile-Time Polymorphism):
// Create a Shape class with a method area() that is overloaded with different parameter types or
// counts to calculate the area of different shapes like a circle, square, and rectangle — all within
// the same class.

// IN URDU;
// aik Shape class bnani hae jisme area() method ko alag alag parameter types ya counts ke sath
// overload kiya gya ho taake mukhtalif shapes jaise circle, square, aur rectangle ka area calculate kiya ja sake.

public class Shape {

  // Method to calculate the area of a circle
  public double area(double radius) {
    return Math.PI * radius * radius;
  }

  // Method to calculate the area of a rectangle
  public double area(double length, double width) {
    return length * width;
  }

  public static void main(String[] args) {
    Shape shape = new Shape();

    System.out.println("Area of Circle: " + shape.area(5));
    System.out.println("Area of Rectangle: " + shape.area(4, 6));
  }
}
