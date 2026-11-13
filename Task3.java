import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();
        String result = s1 + " " + s2;
        int sum = 0;
        for (int i = 0; i < result.length();i++){//1912
           sum = sum + (int)result.charAt(i);
        }
        System.out.println("Sum of ASCII values: " + sum);
        System.out.println("Concatenated String: " + result);
    }
}
