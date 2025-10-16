public class BankAccount {
    private double balance;   // money in the account
    private String name;      // account owner's name

    // constructor
    public BankAccount(double startingBalance, String ownerName) {
        balance = startingBalance;
        name = ownerName;
    }

    // behaviors
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }

    // accessors
    public double getBalance() { return balance; }
    public String getName() { return name; }
}
