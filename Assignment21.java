class University {
    public String name;
    public String country;
}

public class Assignment21 {
    public static void main(String[] args) {

        System.out.println("Task 1 - a");//1912

        University u1 = new University();
        University u2 = new University();

        System.out.println("Object location of u1: " + u1);
        System.out.println("Object location of u2: " + u2);

        System.out.println("u1 name: " + u1.name);
        System.out.println("u1 country: " + u1.country);

        System.out.println("u2 name: " + u2.name);
        System.out.println("u2 country: " + u2.country);

        System.out.println();
        System.out.println("Task 1 - b");

        u1.name = "Imperial College London";
        u1.country = "England";

        u2.name = "BRAC University";
        u2.country = "Bangladesh";

        System.out.println("u1 name: " + u1.name);
        System.out.println("u1 country: " + u1.country);

        System.out.println("u2 name: " + u2.name);
        System.out.println("u2 country: " + u2.country);
    }
}

