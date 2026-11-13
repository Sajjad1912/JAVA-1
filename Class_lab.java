class Student{
    private int id;
    public void setId(int id){ // encapsulation
        this.id = id;
    }
    public int getId(){
        return id;
    }
}
public class Class_lab {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(1912);
        System.out.println("Student ID: " + s.getId());
    }
}