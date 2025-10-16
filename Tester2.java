import java.util.Scanner;

public class Tester2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the initial amount (e.g., 1000): ");
        double start = in.nextDouble();
        in.nextLine(); // consume newline

        System.out.print("Enter the account holder's name: ");
        String name = in.nextLine();

        BankAccount myAccount = new BankAccount(start, name);

        myAccount.deposit(505.22);
        System.out.printf("Balance after deposit: $%,.2f%n", myAccount.getBalance());

        myAccount.withdraw(100.00);
        System.out.printf("The %s account balance is, $%,.2f%n",
                myAccount.getName(), myAccount.getBalance());

        in.close();
    }
}
