import java.util.Scanner;

public class KDivisibleSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++){
            scanner = new Scanner(System.in);
            String[] str = scanner.nextLine().split(" ");
            int result = solve(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
            System.out.println(result);
        }
    }

    public static int solve(int n, int k){
        if (k % n == 0)
            return k / n;
        else if (n % k == 0)
            return 1;
        if (k > n)
            return (k / n) + 1;
        else
            return 2;
    }
}
