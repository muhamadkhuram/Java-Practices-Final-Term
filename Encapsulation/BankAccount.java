// Create a BankAccount class with deposit and withdraw methods. Don't allow direct access
// to the balance field. Use encapsulation to protect the balance.

class BankAccount {

  private double balance;
  private String accountNumber;
  private String accountHolderName;

  BankAccount(String accountNumber, String accountHolderName) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.balance = 0.0;
  }

  // Getter methods to access private fields
  public double getBalance() {
    return balance;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public String getAccountHolderName() {
    return accountHolderName;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposited: " + amount + ". New balance: " + balance);
    } else {
      System.out.println("Deposit amount must be positive.");
    }
  }

  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrew: " + amount + ". New balance: " + balance);
    } else if (amount > balance) {
      System.out.println("Insufficient funds for withdrawal.");
    } else {
      System.out.println("Withdrawal amount must be positive.");
    }
  }

  public static void main(String[] args) {
    // by default balanace 0 hoga;
    BankAccount account = new BankAccount("123456789", "John Doe");
    account.deposit(1000);
    account.withdraw(500);
    System.out.println("Final balance: " + account.getBalance());
  }
}
