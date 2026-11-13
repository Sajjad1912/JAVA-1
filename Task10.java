import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");// Id 1912
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0], min = arr[0];
        int maxPos = 0, minPos = 0;
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
                maxPos = i;
            }
            if(arr[i] < min){
                min = arr[i];
                minPos = i;
            }
        }
        System.out.println("The largest number " + max + " was found at position " + (maxPos + 1) + ".");
        System.out.println("The smallest number " + min + " was found at position " + (minPos + 1) + ".");
    }
}
