// Class Animal has a method makeSound() that prints "Animal Sound". Class Dog overrides it
// to print "Dog Barks". Use super.makeSound() inside the child class method to also call the
// parent class version.

class Animal {

  public void makeSound() {
    System.out.println("Animal Sound");
  }
}

class Dog extends Animal {

  @Override
  public void makeSound() {
    // requirement ma hae k - Use super.makeSound() inside the child class method
    super.makeSound();

    System.out.println("Kuta kinda waooo");
  }

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.makeSound();
  }
}
