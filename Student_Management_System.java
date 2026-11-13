import java.util.*;

// 1. Abstraction (Interface)
interface Reportable {
    void generateReport();
}

// 2. Parent Class
class Person {
    private String name;
    private String id;

    // Constructors
    public Person() {}

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Getters & Setters (Encapsulation)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    // toString (Polymorphism - Override)
    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }
}

// 3. Course Class
class Course {
    private String courseName;
    private int marks;

    public Course(String courseName, int marks) {
        this.courseName = courseName;
        this.marks = marks;
    }

    public String getCourseName() { return courseName; }
    public int getMarks() { return marks; }

    // Grade Calculation
    public String getGrade() {
        if (marks >= 80) return "A+";
        else if (marks >= 75) return "A";
        else if (marks >= 70) return "A-";
        else if (marks >= 65) return "B+";
        else if (marks >= 60) return "B";
        else if (marks >= 55) return "B-";
        else if (marks >= 50) return "C+";
        else if (marks >= 45) return "C";
        else if (marks >= 40) return "D";
        else return "F";
    }

    public double getGradePoint() {
        if (marks >= 90) return 4.0;
        else if (marks >= 80) return 3.7;
        else if (marks >= 75) return 3.5;
        else if (marks >= 70) return 3.0;
        else if (marks >= 60) return 2.5;
        else return 0.0;
    }
}

// 4. Child Class (Inheritance + Abstraction + Polymorphism)
class Student extends Person implements Reportable {
    private String department;
    private ArrayList<Course> courses;

    public static int studentCount = 0; // static

    // Constructors
    public Student() {
        courses = new ArrayList<>();
        studentCount++;
    }

    public Student(String name, String id, String department) {
        super(name, id); // inheritance
        this.department = department;
        courses = new ArrayList<>();
        studentCount++;
    }

    // Getter
    public String getDepartment() { return department; }

    // Method Overloading (Polymorphism)
    public void addGrade(String courseName, int marks) {
        courses.add(new Course(courseName, marks));
    }

    public void addGrade(Course course) {
        courses.add(course);
    }

    // GPA Calculation
    public double calculateGPA() {
        if (courses.size() == 0) return 0.0;

        double total = 0;
        for (Course c : courses) {
            total += c.getGradePoint();
        }
        return total / courses.size();
    }

    // Report
    @Override
    public void generateReport() {
        System.out.println("--------------------------------------------");
        System.out.println("Name       : " + getName());
        System.out.println("ID         : " + getId());
        System.out.println("Department : " + department);

        System.out.println("Courses    : ");
        for (Course c : courses) {
            System.out.println("  " + c.getCourseName() + " -> " + c.getMarks()
                    + " marks (Grade: " + c.getGrade() + ")");
        }

        System.out.printf("GPA        : %.2f\n", calculateGPA());
        System.out.println("--------------------------------------------");
    }

    // Override toString
    @Override
    public String toString() {
        return getName() + " | " + department + " | GPA: " +
                String.format("%.2f", calculateGPA());
    }
}

// 5. Main Class (Menu System)
public class Student_Management_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            System.out.println("\n=== Student Grade Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade");
            System.out.println("3. Display All Students");
            System.out.println("4. Search Student by ID");
            System.out.println("5. Summary Report");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Name   : ");
                    String name = sc.nextLine();

                    System.out.print("Enter ID     : ");
                    String id = sc.nextLine();

                    System.out.print("Enter Dept   : ");
                    String dept = sc.nextLine();

                    students.add(new Student(name, id, dept));
                    break;

                case 2:
                    System.out.print("Enter Student ID : ");
                    String sid = sc.nextLine();

                    Student found = null;
                    for (Student s : students) {
                        if (s.getId().equals(sid)) {
                            found = s;
                            break;
                        }
                    }

                    if (found != null) {
                        System.out.print("Enter Course Name: ");
                        String cname = sc.nextLine();

                        System.out.print("Enter Marks (100): ");
                        int marks = sc.nextInt();
                        sc.nextLine();

                        found.addGrade(cname, marks);
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 3:
                    System.out.println("\nStudent Report");
                    for (Student s : students) {
                        s.generateReport();
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID : ");
                    String searchId = sc.nextLine();

                    for (Student s : students) {
                        if (s.getId().equals(searchId)) {
                            System.out.println("Found: " + s);
                        }
                    }
                    break;

                case 5:
                    if (students.size() == 0) break;

                    Student highest = students.get(0);
                    Student lowest = students.get(0);

                    for (Student s : students) {
                        if (s.calculateGPA() > highest.calculateGPA())
                            highest = s;
                        if (s.calculateGPA() < lowest.calculateGPA())
                            lowest = s;
                    }

                    System.out.println("\n=== Summary Report ===");
                    System.out.println("Total Students  : " + students.size());
                    System.out.println("Total Created   : " + Student.studentCount);
                    System.out.println("Highest GPA     : " + highest.getName()
                            + " -> " + String.format("%.2f", highest.calculateGPA()));
                    System.out.println("Lowest GPA      : " + lowest.getName()
                            + " -> " + String.format("%.2f", lowest.calculateGPA()));
                    break;

                case 6:
                    System.out.println("Exiting... Goodbye!");
                    return;
            }
        }
    }
}