class payment{
    void pay(double amount){
        System.out.println("Processing the amount " + amount);
    }
    void receipt(){
        System.out.println("Generting receipt");
    }
    void receipt(String email){
        System.out.println("Purchased throught email");
    }
}
class paypal extends payment{
    void pay(double amount){
        System.out.println("Paid " + amount +" using paypal");
    }
    // void validate_pay(){
    //     System.out.println("Validating this key");
    // }
}
class creditcard extends payment{
    void pay(double amount){
        System.out.println("Paid " + amount +" using creditcard");
    }
    void validate_pay(){
        System.out.println("Validating this key");
    }
}

public class LAb5 {
    public static void main(String[] args) {
        // payment p1 = new payment();
        // p1.pay(20000);
        // p1.receipt();
        // p1.receipt("sajjatulsunny@gmail.com");
        // paypal p2 = new paypal();
        // p2.pay(30000);
        // creditcard c1 = new creditcard();
        // c1.pay(40000);
        payment p1 = new paypal();
        p1.pay(2000);
        creditcard c1 = (creditcard)p1;
        c1.validate_pay();
    }
}
