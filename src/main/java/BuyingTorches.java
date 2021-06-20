import java.util.Scanner;

public class BuyingTorches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 0; i < testCase; i++) {
            solve(scanner.nextLong(), scanner.nextLong(), scanner.nextLong());
        }
    }

    private static void solve(long d, long y, long k){
        long n = (long) Math.ceil((double) ((y + 1) * k - 1) / (d - 1));
        System.out.println(n + k);
    }
}
