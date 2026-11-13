class Person {
    private String firstName;
    private String lastName;
    private String address;
    protected int id;

    public Person() {}

    public Person(String firstName, String lastName, String address, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Address: " + address);
    }
}

class Student extends Person {
    private double gpa;

    public Student(String firstName, String lastName, String address, int id, double gpa) {
        super(firstName, lastName, address, id);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("GPA: " + gpa);
    }
}

class Employee extends Person {
    private String jobTitle;

    public Employee(String firstName, String lastName, String address, int id, String jobTitle) {
        super(firstName, lastName, address, id);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() { return jobTitle; }
    public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }

    @Override
    public void display() {
        super.display();
        System.out.println("Job Title: " + jobTitle);
    }
}
public class LAb_assigment31 {
    public static void main(String[] args) {
        
        Student studentObj = new Student("John", "Doe", "123 University Ln", 101, 3.85);
        Employee employeeObj = new Employee("Jane", "Smith", "456 Corporate Dr", 202, "Software Engineer");

        System.out.println("--- Student Information ---");
        studentObj.display();

        System.out.println("\n--- Employee Information ---");
        employeeObj.display();
    }
}
