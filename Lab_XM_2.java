abstract class Employee{
    private String empId;
    private String name;
    private double baseSalary;
    private int performanceScore;
    public void setPerformanceScore(int score){
        if(score >= 80){
            this.performanceScore = score;
            return 0.1 * computeSalary();
        } 
        else {
            this.performanceScore = score;
        }
    }
    public Employee(String empId, String name, double baseSalary) {
        this.empId = empId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public String getEmpId(){
        return empId;
    }
    public String getName(){
        return name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public abstract double computeSalary();
    public void printPayslip(){
        System.out.println("Employee ID: " + empId + ", Name: " + name + ", Salary: " + computeSalary());
        
    }
    public void setSalary(double amount){
        if(amount <= 0){
            System.out.println("Invalid salary.");
        }
    }
    
}
class FullTimeEmployee extends Employee{
    private double taxRate;
    public FullTimeEmployee(String empId, String name, double baseSalary, double taxRate) {
        super(empId, name, baseSalary);
        this.taxRate = taxRate;
    }
    @override
    public double computeSalary(){
        return getBaseSalary() * (1 - taxRate);
    }
}
class Contractor extends Employee{
    private int hoursWorked;
    private double hourlyRate;
    public Contractor(String empId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(empId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @override
    public double computeSalary(){
        return hoursWorked * hourlyRate;
    }
}

public class Lab_XM_2 {
    public static void main(String[] args) {
        Employee e = new FullTimeEmployee("E001", "Sara", 5000, 0.2);
        e.printPayslip();
        Employee ft = new FullTimeEmployee("E002", "Sara", 6000, 0.25);
        Employee co = new Contractor("C001", "John", 0, 160, 30);
        ft.printPayslip();
        co.printPayslip();
        FullTimeEmployee e = new FullTimeEmployee("E003", "Amy", 7000, 0.3);
        e.setPerformanceScore(90);
        e.printPayslip();
        e.setSalary(-1000);+
    }
}
