import java.util.Scanner;

public class Klcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 0; i < testCase; i++) {
            solve(scanner.nextInt(), scanner.nextByte());
        }
    }

    public static void solve(int n, byte k){
        int a, b, c;
        if (n % 2 == 0) {
            float power = (float) (Math.log(n) / Math.log(2));
            if (power == (int) power){
                a = n / 2;
                b = a / 2;
            }else{
                power = helper(n);
                a = (int) Math.pow(2, power);
                b = (n - a) / 2;
            }
        }else{
            a = 1;
            b = (n - 1) / 2;
        }
        c = b;
        System.out.println(a + " " + b + " " + c);
    }

    public static int helper(int number){
        int count = 0;
        boolean isSuccess = true;
        while (isSuccess){
            if (number % 2 == 0){
                number /= 2;
                count++;
            }else
                isSuccess = false;
        }
        return count;
    }
}
