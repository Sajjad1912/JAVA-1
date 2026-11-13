import java.util.*;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");// Id 1912
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("Invalid array size!");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        double median;
        if(n % 2 == 1) {
            median = arr[n/2];
        } else {
            median = (arr[n/2 - 1] + arr[n/2]) / 2.0;
        }
        System.out.println("The median is: " + median);
    }
}
