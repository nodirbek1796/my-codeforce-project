import java.util.Scanner;

public class OddDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        long[] numbers = new long[testCases];
        for (int i = 0; i < testCases; i++) {
            numbers[i] = scanner.nextLong();
        }
        for (int i = 0; i < testCases; i++) {
            solve(numbers[i]);
        }
    }

    public static void solve(long number){
        boolean helper = false;
        if (number > 1 && number % 2 == 1){
            helper = true;
        }
        else {
            while (!helper){
                if (number % 2 == 0){
                    number /= 2;
                }else {
                    helper = true;
                }
            }
        }

        if (helper){
            System.out.println("Yes");
        }else
            System.out.println("No");
    }
}
