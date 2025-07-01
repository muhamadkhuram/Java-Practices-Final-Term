// Create a class Box with length, breadth, and height. Overload constructors to:
// I. initialize all dimensions to 0
// II. initialize all dimensions to the same value
// III. initialize all dimensions individually
// Use this keyword to avoid variable shadowing. Create and print volume from objects.

public class Box {

  double length;
  double breadth;
  double height;

  public Box() {
    this.length = 0;
    this.breadth = 0;
    this.height = 0;
  }

  public Box(double side) {
    this.length = side;
    this.breadth = side;
    this.height = side;
  }

  public Box(double length, double breadth, double height) {
    this.length = length;
    this.breadth = breadth;
    this.height = height;
  }

  public double volume() {
    return length * breadth * height;
  }

  public static void main(String[] args) {
    Box box1 = new Box();
    Box box2 = new Box(5);
    Box box3 = new Box(2, 3, 4);

    System.out.println("Volume of box1: " + box1.volume());
    System.out.println("Volume of box2: " + box2.volume());
    System.out.println("Volume of box3: " + box3.volume());
  }
}
