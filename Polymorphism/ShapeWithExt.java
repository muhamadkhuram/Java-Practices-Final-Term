// 2. Question (for Run-Time Polymorphism):
// Create a Shape class with a method area(). Extend it in Circle, Square, and Rectangle. Override
// the area() method in all subclasses and demonstrate polymorphism using a Shape reference.

// IN URDU;
// aik Shape class bnani hae jisme area() method ho. Isay Circle, Square, aur Rectangle mein extend karein.
// Har subclass mein area() method ko override karein aur Shape reference ka istemal karke polymorphism ko demonstrate karein.

class Shape {

  public double area() {
    return 0.0;
  }
}

class Circle extends Shape {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double area() {
    // Using a constant value for Pi and pi r^2
    return 3.14 * radius * radius;
  }
}

class Square extends Shape {

  private int side;

  public Square(int side) {
    this.side = side;
  }

  public double area() {
    return side * side;
  }
}

class Rectangle extends Shape {

  private int length, width;

  public Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  public double area() {
    return length * width;
  }
}

public class Main {

  public static void main(String[] args) {
    Circle circle = new Circle(5.0);
    System.out.println("Area of Circle: " + circle.area());

    Squire square = new Square(4);
    System.out.println("Area of Square: " + square.area());

    Rectangle rectangle = new Rectangle(5, 3);
    System.out.println("Area of Rectangle: " + rectangle.area());
  }
}
