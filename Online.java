class BankAccount {
    private String accountHolderName;
    private double balance;
    public int x;

    BankAccount(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + getBalance());
    }
    
    String getAccountHolderName() {
        return accountHolderName;
    }
    void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }
    double getBalance() {
        return balance;
    }
}

class InterestAccount extends BankAccount {
    private double interestRate;

    InterestAccount(String name, double balance, double interestRate) {
        super(name, balance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }
    double getInterestRate() {
        return interestRate;
    }
    void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            balance -= 10;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

public class Online {
    public static void main(String[] args) {
        BankAccount B = new BankAccount("John Doe", 1000.0);

        B.setAccountHolderName("Jane Doe");
        B.displayBalance();
        System.out.println("Account Holder Name: " + B.getAccountHolderName());

        B.deposit(500.0);
        B.displayBalance();

        B.withdraw(2000.0);
        B.displayBalance();

        InterestAccount IA = new InterestAccount("Alice", 2000.0, 5.0);
        IA.addInterest();
        IA.displayBalance();
        System.out.println("Interest Rate: " + IA.getInterestRate() + "%");
    }
}