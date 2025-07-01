// Create a Product class with fields: id, name, and price. Provide individual setters and getters
// for each field.

class Product {

  private int id;
  private String name;
  private double price;

  // Constructor
  public Product(int id, String name, double price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  // Getter and Setter for id
  public int getId() {
    return id;
  }

  // Setter for id
  public void setId(int id) {
    this.id = id;
  }

  // Getter and Setter for name
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // Getter and Setter for price
  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
