import java.util.Scanner;

public class MinimumProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short testCase = scanner.nextShort();
        for (int i = 0; i < testCase; i++) {
            helper(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        }
    }

    public static void helper(int a, int b, int x, int y, int n){

        if (a < b){
            a += b;
            b = a - b;
            a = a - b;
            x = x + y;
            y = x - y;
            x = x - y;
        }
        System.out.println(Math.min(maxVersion(a, b, x, y, n), minVersion(a, b, x, y, n)));
    }

    public static long minVersion(int a, int b, int x, int y, int n){
        if (b - n > 0){
            if (b - n >= y)
                b -= n;
            else {
                n = n - (b - y);
                b = y;
                if (a - n >= x)
                    a -= n;
                else
                    a = x;
            }
        }else {
            n = n - (b - y);
            b = y;
            if (a - n >= 0){
                if (a - n >= x)
                    a -= n;
                else
                    a = x;
            }else {
                a = x;
            }
        }
        return (long) a * b;
    }

    public static long maxVersion(int a, int b, int x, int y, int n){
        if (a - n > 0){
            if (a - n >= x)
                a -= x;
            else {
                n = n - (a - x);
                a = x;
                if (b - n > 0) {
                    if (b - n >= y)
                        b -= n;
                    else {
                        b = y;
                    }
                }
                else {
                    b = y;
                }
            }
        }else {
            n = n - (a - x);
            a = x;
            if (b - n > 0){
                b = Math.max(b - n, y);
            }else
                b = y;
        }
        return (long) a * b;
    }
}
