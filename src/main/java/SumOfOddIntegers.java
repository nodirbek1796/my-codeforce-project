import java.util.Scanner;

public class SumOfOddIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 0; i < testCase; i++) {
            solve(scanner.nextInt(), scanner.nextInt());
        }
    }

    public static void solve(int n, int k){
        if (k * k <= n && n % 2 == k % 2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
