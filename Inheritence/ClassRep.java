// Three Classes A, B and C. C class is a child of B Class and B Class is a child of A Class.
// C Class "Add" Method takes two values and their sum pass it to its parent class B method
// "square" which pass sqaure number to its parent class A method "factorial" which print out
// the factorial of that number.

class A {

  public void factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact *= i;
    }
    System.out.println("Factorial: " + fact);
  }
}

class B extends A {

  public void square(int n) {
    int squared = n * n;
    System.out.println("Squared: " + squared);
    factorial(squared);
  }
}

class C extends B {

  public void add(int a, int b) {
    int sum = a + b;
    System.out.println("Sum: " + sum);
    square(sum);
  }

  public static void main(String[] args) {
    C obj = new C();
    obj.add(3, 4);
  }
}
