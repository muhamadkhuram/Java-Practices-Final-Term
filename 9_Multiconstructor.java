// 9. Write a program in which “show” class have multiple constructor.
// 1. 2. 3. 4. First constructor by default constructor just print :”Hello World”
// 2nd Constructor take single value and print table of value.
// 3rd constructor take two values and prints the sum of these values
// 4th constructor take three value and prints the average of these numbers
// Values are entered through keyboard

// IN URDU;
// aik program likho jismein aik class ho jiska naam "show" ho.
// is class mein multiple constructors hon.
// 1. Pehla constructor default constructor ho jo sirf "Hello World" print kare
// 2. Doosra constructor aik value le aur uski table print kare.
// 3. Teesra constructor do values le aur unka sum print kare.
// 4. Choutha constructor teen values le aur unka average print kare.
// Values keyboard se enter ki jayein.

import java.util.Scanner;

class Show {

  // Default constructor Jis ma sirf "Hello World" print karna hae;
  Show() {
    System.out.println("Hello World");
  }

  // Second constructor with one parameter;
  // Jis ma aik value le aur uski table print kare; via for loop
  Show(int value) {
    System.out.println("Table of " + value + ":");
    for (int i = 1; i <= 10; i++) {
      System.out.println(value + " x " + i + " = " + (value * i));
    }
  }

  //  Third constructor with two parameters
  // Jis ma do values le aur unka sum print kare;
  Show(int value1, int value2) {
    int sum = value1 + value2;
    System.out.println(sum);
  }

  //  Fourth constructor with three parameters
  // Jis ma teen values le aur unka average print kare;
  Show(int value1, int value2, int value3) {
    double average = (value1 + value2 + value3) / 3.0;
    System.out.println(average);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Use of default constructo;
    // ye sirf "Hello World" print karega;
    Show show1 = new Show();

    // Using constructor with one parameter
    // Jis ma aik value le aur uski table print kare;
    System.out.print("Enter a number for table: ");

    // so that you know; nextInt() method user sy integer value le ga;
    int num1 = scanner.nextInt();
    Show show2 = new Show(num1);

    // Using constructor with two parameters
    System.out.print("Enter first number for sum: ");
    int num2 = scanner.nextInt();
    System.out.print("Enter second number for sum: ");
    int num3 = scanner.nextInt();
    Show show3 = new Show(num2, num3);

    // Using constructor with three parameters
    System.out.print("Enter first number for average: ");
    int num4 = scanner.nextInt();
    System.out.print("Enter second number for average: ");
    int num5 = scanner.nextInt();
    System.out.print("Enter third number for average: ");
    int num6 = scanner.nextInt();
    Show show4 = new Show(num4, num5, num6);
  }
}
