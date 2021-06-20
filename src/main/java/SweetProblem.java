import java.util.Arrays;
import java.util.Scanner;

public class SweetProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 0; i < testCase; i++) {
            int[] numbers = new int[3];
            for (int j = 0; j < numbers.length; j++) {
                numbers[j] = scanner.nextInt();
            }
            solve(numbers);
        }

    }

    public static void solve(int[] numbers){
        Arrays.sort(numbers);
        if (numbers[2] >= numbers[0] + numbers[1])
            System.out.println(numbers[0] + numbers[1]);
        else
            System.out.println((int) Math.floor((double)(numbers[0] + numbers[1] + numbers[2]) / 2));
    }
}
