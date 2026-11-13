class CSECourse {
    String courseName;
    String courseCode;
    int credit;
    CSECourse() {
        courseName = "Programming Language II";//1912
        courseCode = "CSE111";
        credit = 3;
    }
}

public class Assignment23 {
    public static void main(String[] args) {

        CSECourse c1 = new CSECourse();

        System.out.println("Course Name: " + c1.courseName);
        System.out.println("Course Code: " + c1.courseCode);
        System.out.println("Credit: " + c1.credit);
    }
}