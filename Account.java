import java.util.Scanner;

class Account {
    //fields
    private String accountNo;
    private double balance;

    // Constructor with account number and balance parameters
    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    // Method to print account details
    public void printDetails() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Balance: " + balance);
        System.out.println(); // Just to add a blank line between different account details
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hardcoded account numbers
        String accountNo1 = "2834287";
        String accountNo2 = "29337";

        // Prompt the user to enter the balance for the first account
        System.out.print("Enter balance for Account 1 (Account No: " + accountNo1 + "): ");
        double balance1 = scanner.nextDouble();

        // Prompt the user to enter the balance for the second account
        System.out.print("Enter balance for Account 2 (Account No: " + accountNo2 + "): ");
        double balance2 = scanner.nextDouble();

        // Create two Account objects using the provided account numbers and balances
        Account account1 = new Account(accountNo1, balance1);
        Account account2 = new Account(accountNo2, balance2);

        // Print details of both accounts
        System.out.println("\nDetails of Account 1:");
        account1.printDetails();

        System.out.println("Details of Account 2:");
        account2.printDetails();

        scanner.close();
    }
}
