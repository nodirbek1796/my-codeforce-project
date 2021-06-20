import java.util.Scanner;

public class TemporarilyUnavailable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 0; i < testCase; i++) {
            System.out.println(solve(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        }
    }

    public static int solve(int a, int b, int c, int r){

        if (a == b)
            return 0;

        int min, max;
        if (a > b) {
            max = a;
            min = b;
        }else {
            max = b;
            min = a;
        }
        int result = Math.abs(a - b);
        int plus = c + r;
        int minus = c - r;

        if (min <= minus && plus <= max)
            return result - 2 * r;
        if (min >= plus || max <= minus)
            return result;
        if (min > minus) {
            if (plus < max)
                return result - (plus - min);
            else
                return 0;
        } else
            return result - (max - minus);
    }
}
