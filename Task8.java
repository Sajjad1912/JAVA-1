import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix (n for n x n): ");// Id 1912
        int n = sc.nextInt();
        int[][] A = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        boolean ok = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && A[i][j] != 1)
                    ok = false;
                if (i != j && A[i][j] != 0)
                    ok = false;
            }
        }
        if (ok)
            System.out.println("Identity Matrix");
        else
            System.out.println("Not an Identity Matrix");
    }
}
