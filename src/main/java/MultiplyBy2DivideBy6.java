import java.util.Scanner;

public class MultiplyBy2DivideBy6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 0; i < testCase; i++) {
            solve(scanner.nextInt());
        }
    }

    public static void solve(int number){
        if (number == 1) {
            System.out.println(0);
            return;
        }
        if (number < 6) {
            if (number != 3)
                System.out.println(-1);
            else
                System.out.println(2);
            return;
        }

        int count = 0;
        if (isAvailable(number)){
            while (number != 1){
                if (number % 6 == 0){
                    number /= 6;
                    count++;
                }else {
                    count += (int) (2 * Math.round(Math.log(number) / Math.log(3)));
                    break;
                }
            }
            System.out.println(count);
        }else
            System.out.println(-1);
    }

    public static boolean isAvailable(int number){
        double n;
        while (true){
            if (number % 6 == 0){
                number /= 6;
                if (number == 3)
                    return true;
            }
            else {
                n = Math.log(number) / Math.log(3);
                return number == Math.pow(3, Math.round(n));
            }
        }
    }
}