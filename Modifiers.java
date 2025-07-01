// types of Modifiers in java

class Modifiers {

  // private - Sirf is class ke andar access kar sakta hu
  private int privateVariable;

  // default (package-private) - Sirf same package ke classes access kar skty hain
  int defaultVariable;

  // protected- same package ke classes aur child classes access kar skty hain
  protected int protectedVariable;

  // public - koi bhi class access kar sakti hai
  public int publicVariable;

  public Modifiers(
    int privateVariable,
    int defaultVariable,
    int protectedVariable,
    int publicVariable
  ) {
    this.privateVariable = privateVariable;
    this.defaultVariable = defaultVariable;
    this.protectedVariable = protectedVariable;
    this.publicVariable = publicVariable;
  }

  // getter and setter for private variable
  public int getPrivateVariable() {
    return privateVariable;
  }

  public void setPrivateVariable(int privateVariable) {
    this.privateVariable = privateVariable;
  }
}

class ChildClass extends Modifiers {

  public void display() {
    // yaha me protected and public variable access kar sakta hu
    System.out.println("Protected Variable: " + protectedVariable);
    System.out.println("Public Variable: " + publicVariable);
    System.out.println("Default Variable: " + defaultVariable);

    // lkn private variable access nahi kar sakta
    System.out.println("Private Variable: " + privateVariable); // Error
  }
}
