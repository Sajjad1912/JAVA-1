import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");// Id 1912
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to remove: ");
        int remove = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < n; i++){
            if(arr[i] == remove){
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Array after removing element:");
            for(int i = 0; i < n; i++){
                if(arr[i] != remove){
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
