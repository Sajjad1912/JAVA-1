class Bankaccount{
    String AccountHolder;
    int AcccountN;
    double balance;
    Bankaccount(String AccountHolder, int AcccountN, double balance){
        this.AccountHolder = AccountHolder;
        this.AcccountN = AcccountN;
        this.balance = balance;
    }
    Bankaccount(int AcccountN, double balance){
        this.AcccountN = AcccountN;
        this.balance = balance;
    }
    Bankaccount(Bankaccount b){
        this.AccountHolder = b.AccountHolder;
        this.AcccountN = b.AcccountN;
        this.balance = b.balance;
    }
    void deposite(double amount){
        balance += amount;
    }
    void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    void display(){
        System.out.println("Account Holder: " + AccountHolder);
        System.out.println("Account Number: " + AcccountN);
        System.out.println("Balance: " + balance);
    }
}
public class LAb3 {
    public static void main(String[] args) {
    //Bankaccount a1 = new Bankaccount();
    // a1.AcccountN = 001;
    // a1.AccountHolder = "Sajjad";
    // a1.balance = 1000;
    // a1.display();
    // a1.deposite(500);
    // a1.display();
    // a1.withdraw(200);

    Bankaccount a1 = new Bankaccount("Sajjad", 001, 1000);
    Bankaccount a2 = new Bankaccount(002, 500);
    a1.deposite(100);
    a1.withdraw(10);
    a1.display();
    a2.display();
    Bankaccount a3 = new Bankaccount(a1);
    a3.display();
    }
}
