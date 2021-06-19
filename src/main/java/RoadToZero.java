import java.util.Scanner;

public class RoadToZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte testCase = scanner.nextByte();
        for (int i = 0; i < testCase; i++) {
            solve(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        }
    }

    public static void solve(long x, long y, long a, long b){
        long result = 0;
        if (x < y){
            if (2 * a >= b)
                result = x * b + a * (y - x);
            else
                result = a * (x + y);
        }else if (x > y){
            if (2 * a >= b)
                result = y * b + a * (x - y);
            else
                result = a * (x + y);
        }else{
            if (a * 2  >= b)
                result = b * x;
            else
                result = a * (x + y);
        }
        System.out.println(result);
    }
}
