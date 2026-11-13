class animal{
    void sound(){
        System.out.println("Animal Sound");
    }
    
}           // polymorphism
class cat extends animal{
    void sound(){
        System.out.println("Cat Sound");
    }
}
public class Class_lab1 {
    public static void main(String[] args) {
        animal a = new animal();
        cat c = new cat();
        a.sound();
        c.sound();
    }
}
