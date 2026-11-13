class Person{
    protected String name;
    protected int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Name: " + name + ", Age: " + age;
    }
}
class Employee extends Person{
    protected double salary;
    protected String department;
    public Employee(String name, int age, double salary, String department){
        super(name, age);
        this.salary = salary;
        this.department = department;
    }
    @Override
    public String toString(){
        return super.toString() + ", Salary: " + salary + ",Department: " + department;
    }
}
class Manager extends Employee{
    protected int  teamSize;
    public Manager(String name, int age, double salary, String department, int teamSize){
        super(name, age, salary, department);
        this.teamSize = teamSize;
    }
    @Override
    public String toString(){
        return super.toString() + ", Team Size: " + teamSize;
    }
}
public class Problem9 {
    public static void main(String[] args){
        Manager m = new Manager("Sajjad", 30, 50000.0, "IT", 10);
        System.out.println(m);
    }
}
