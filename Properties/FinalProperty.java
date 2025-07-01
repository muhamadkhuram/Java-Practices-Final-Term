// AGar aik class A bnain us ko final rakh dain
final class A {}

// to us ko hum kisi class main extend nahi kar sakty

class B extends A { // Error: Cannot inherit from final 'A'
  // yaha error aayega kyunki A class ko final declare kiya gaya hai
}

/////////////////////////
// final variable ko value reassign nahi kar sakty

class Main {

  public static void main(String[] args) {
    final int x = 10; // meny is variable ko final declare kiya hai

    x = 20; // Error: Cannot assign a value to final variable x
  }
}

// final method ko override nahi kar sakty
class Parent {

  public final void display() {
    System.out.println("Parent class ka display method");
  }
}

class Child extends Parent {

  // yaha par me display method ko override karne ki koshish kar raha hu
  public void display() { // Error: Cannot override the final method from Parent
    System.out.println("Child class ka display method");
  }

  public static void main(String[] args) {
    Child child = new Child();
    child.display();
  }
}
