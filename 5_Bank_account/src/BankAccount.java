// Bank Account Class
// Implement a BankAccount class with:
// o Attributes: accountNumber, holderName, and balance.
// o A constructor to initialize all attributes.
// o A method deposit(double amount) to increase balance.
// o A method withdraw(double amount) to decrease balance. Create an account and
// perform deposit/withdraw operations.

public class BankAccount {

    String accountNumber;
    String holderName;
    double balance;

    // Account data set karny k liye method;
    public BankAccount(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }

    // deposit method balance add karny k liye;
    public void deposit(double amount) {
        if (amount > 0) {

            // balance += amount; is ka matlb hae k balance = balance + amount; in
            // programming language;
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }


    // withdraw method balance se amount kam karny k liye;
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {

            // balance -= amount; is ka matlb hae k balance = balance - amount;
            // in programming language;
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }


    // modern optimsed method bnaty waqat km sy km code likhty hain; 
    // is liye aik hi method se deposit aur withdraw dono operations perform karny k liye;
    // ye method requirement ma nae hae; just for demonstration;
    // public void performTransaction(double amount) {
    //     // agar balance positive hae to wo automatically deposit operation perform karega;
    //     balance += amount;
    //     if (amount > 0) {
    //         System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    //     } else if (amount < 0 && Math.abs(amount) <= balance) {
    //         // agar amount negative hae aur wo balance sy zyada nahi hae to wo withdraw operation perform karega;
    //         System.out.println("Withdrawn: " + Math.abs(amount) + ", New Balance: " + balance);
    //     } else {
    //         System.out.println("Insufficient funds for withdrawal or invalid amount.");
    //     }
    // }

    public static void main(String[] args) {
        // BankAccount ka object create karny k liye;
        BankAccount account = new BankAccount("123456789", "Dilshad Ahmed", 1000.0);

        // Deposit operation perform karny k liye;
        account.deposit(500.0); // New balance should be 1500.0

        // Withdraw operation perform karny k liye;
        account.withdraw(200.0); // New balance should be 1300.0
    }
}
