class Student {
    String name;
    int id;

    Student() {
        name = "Default";//1912
        id = 0;
    }
}
public class Assignment22 {
    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println("Name of the Student: " + s1.name);
        System.out.println("ID of the Student: " + s1.id);

        s1.name = "Bob";
        s1.id = 123;

        System.out.println("Name of the Student: " + s1.name);
        System.out.println("ID of the Student: " + s1.id);
    }
}