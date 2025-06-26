// Create a Car class with attributes brand and year. Use a parameterized constructor to
// initialize these attributes. Create an object of Car and print its details.

public class Car {

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    String brand;
    int year;

    public static void main(String[] args) {
        Car car = new Car("Toyota", 2020);

        System.out.println("Brand: " + car.brand);
        System.out.println("Year: " + car.year);
    }
}
