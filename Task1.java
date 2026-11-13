import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        int sum  = 0, mx = Integer.MIN_VALUE, mn = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");// Id 1912
        for(int i = 0; i<10 ; i++){
            int num = sc.nextInt();
            sc.nextLine();
            sum += num;
            if (num > mx) mx = num;
            if (num < mn) mn = num;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + mx);//1,4,2,9,2,-4,3,-1,0,1
        System.out.println("Min: " + mn);
        System.err.println("Average: "+ ((double)sum/10));
    }
}