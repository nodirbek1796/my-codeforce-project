import java.util.Scanner;

public class NewYearCandles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        solve(scanner.nextShort(), scanner.nextShort());
    }

    public static void solve(int a, int b){
        int result = 0, remain = 0;
        while (a != 0){
            result += a;
            if (a % b != 0)
                remain += a % b;
            a /= b;
            if (a == 0 && remain >= b){
                a = remain;
                remain = 0;
                if (a % b != 0)
                    remain += a % b;
                a /= b;
            }
        }
        System.out.println(result);
    }
}
