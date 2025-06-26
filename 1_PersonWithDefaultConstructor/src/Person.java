// Write a Person class with attributes name and age. Use a default constructor to initialize
// name to "Unknown" and age to 0. Print these values.

public class Person {

    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    String name;
    int age;

    public static void main(String[] args) {

        Person person = new Person();

        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
}
