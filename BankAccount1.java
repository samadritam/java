import java.util.*;
class BankAccount1 {
    int accountNumber;
    String name, mobile;
    int balance;
    public BankAccount1() {
    balance = 1000;
    }
    public void inputData() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter account number: ");
    accountNumber = scanner.nextInt();
    System.out.println("Enter name: ");
    name = scanner.next();
    System.out.println("Enter mobile: ");
        mobile = scanner.next();
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobile);
        System.out.println("Balance: " + balance);
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }

    public int AccountNumber() {
        return accountNumber;
    }

    public void AccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int Balance() {
        return balance;
    }

    public void Balance(int balance) {
        this.balance = balance;
    }
}

class SavingAccount extends BankAccount1 {
   
}

class BankingSystem {
    public static void main(String[] args) {
        BankAccount1 bank = new BankAccount1();
        SavingAccount sa = new SavingAccount();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Input Data");
            System.out.println("2. Display");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5.Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bank.inputData();
                    break;
                case 2:
                    bank.display();
                    break;
                case 3:
                    System.out.println("Enter deposit amount: ");
                    int depositAmount = scanner.nextInt();
                    bank.Balance(bank.Balance() + depositAmount);
                    break;
                case 4:
                    System.out.println("Enter withdrawal amount: ");
                    int withdrawAmount = scanner.nextInt();
                    bank.withdraw(withdrawAmount);
                    break;
                    case 5: System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}