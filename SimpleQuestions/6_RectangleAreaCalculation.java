//  Rectangle Area Calculation
// Modify the Rectangle class from the previous example:
// o Add a parameterized constructor that allows the user to specify length and width.
// o Calculate and display the area.

public class Rectangle {

  // Field Names
  double length;
  double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  // Method to calculate area
  public double calculateArea() {
    return length * width;
  }

  public static void main(String[] args) {
    // Create a Rectangle object with specified length and width
    Rectangle rectangle = new Rectangle(5.0, 3.0);

    // Calculate and display the area
    double area = rectangle.calculateArea();
    System.out.println("Area of the rectangle: " + area);
  }
}
