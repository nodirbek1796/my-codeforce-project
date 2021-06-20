import java.util.Scanner;

public class VasyaAndSocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(solve(n, m));
    }

    public static int solve(int n, int m){
        int sum;
        sum = n + (n - 1) / (m - 1);
        return sum;
    }
}
