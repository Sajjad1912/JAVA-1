class Student{
    String name;
    int id;
    double cgpa;
    Student(String name, int id , double cgpa ){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
    void isabove(){
        if (cgpa > 3){
            System.out.println(name + " is above 3.0");
        }
        else{
            System.out.println(name + " is below 3.0");
        }
    }
    void updatecgpa(double cgpa){
        this.cgpa = cgpa;
        System.out.println("CGPA updated to " + cgpa);
    }
    void display(){
        System.out.println("Name:" +name);
        System.out.println("ID:" +id);
        System.out.println("CGPA:" +cgpa);
    }
}
public class LAb4 {
    public static void main(String[] args) {
        Student s1 = new Student("Sajjatul Alam", 101, 3.85);
        s1.display();
        s1.isabove();
        s1.updatecgpa(2.5);
        s1.display();
    }
}
