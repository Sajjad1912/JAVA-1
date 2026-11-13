
import java.util.*;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of the array:");
        int n = sc.nextInt(); // Id 1912
        double arr[] = new double[n];
        System.out.print("Enter the elements of the array:");
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextDouble();
        }
        int remove = 0;
        System.out.print("New arrary:");
        System.out.print(arr[0] + " ");
        for (int i = 1 ; i < n ; i++){
            if (arr[i] != arr[i-1]){
                System.out.print(arr[i] + " ");
            }
            else {
                remove++;
            }
        }
        System.out.println("\nNumber of removed elements: " + remove);
    }
    
}
