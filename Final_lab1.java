class person{
    String name;
    int age;
    // person() {
    //     name = "Unknown";
    //     age = 0;
    //     System.out.println("Person constructor called");
    // }
    person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor called");
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class student extends person{
    int id;

    // void studentInfo(){
    //     display();
    //     System.out.println("ID: "+id);
    // }
    // student() {
    //     id = 0;
    //     System.out.println("Student constructor called");
    // }
    student() {
        id = 0;
        System.out.println("Student constructor called");
    }
    void display(){
        super.display();
        System.out.println("ID:"+id);
    }
}
public class Final_lab1 {
    public static void main(String[] args){
        student s1 = new student();
        // s1.name = "Sajjad";
        // s1.age = 23;
        // s1.id = 1912;
        s1.display();
    }
}
