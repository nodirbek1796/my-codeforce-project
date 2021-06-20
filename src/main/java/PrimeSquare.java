import java.util.Scanner;

public class PrimeSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Test cases = ");
        int testCases = scanner.nextInt();
        int[] test = new int[testCases];

        for (int i = 0; i < testCases; i++) {
            test[i] = scanner.nextInt();
        }

        for (int i = 0; i < testCases; i++) {
            solve(test[i]);
        }
    }

    public static void solve(int n){
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            a[i][i] = 1;
            a[i][n - i - 1] = 1;
        }

        if (n % 2 == 1){
            a[n / 2 - 1][n / 2] = 1;
            a[n / 2][n / 2 + 1] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
