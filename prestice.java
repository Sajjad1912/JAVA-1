class Person{
    private String firstName;
    private String lastName;
    private String address;
    protected int id;
    public Person(){
        
    }
    public Person(String firstName, String lastName, String address, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.id = id;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public void display(){
        System.out.println("First Name:"+firstName+" Last Name:"+lastName+" Address:"+address+" ID:"+id);
    }
}
class Student extends Person{
    private double gpa;
    public Student(String firstName, String lastName, String address, int id, double gpa){
        super(firstName, lastName, address, id);
        this.gpa = gpa;
    }
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public void display(){
        super.display();
        System.out.println("GPA:" +gpa);
    }
}
class Employee extends Person{
    private String jobTitle;
    public Employee(String firstName, String lastName, String address, int id, String jobTitle){
        super(firstName, lastName, address, id);
        this.jobTitle = jobTitle;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public void display(){
        super.display();
        System.out.println("Job Title:" +jobTitle);
    }
}
public class prestice {
    public static void main (String args[]){
        Student s = new Student("Sajjatul", "Alam", "Dhaka", 1912, 3.793);
        Employee e = new Employee("Sajjatul", "Alam", "Dhaka", 1912, "Software Engineer");
        System.out.println("Student Information:");
        s.display();
        System.out.println("\nEmployee Information:");
        e.display();

    }
}
