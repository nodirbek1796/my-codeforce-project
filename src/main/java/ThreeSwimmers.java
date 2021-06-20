import java.util.Arrays;
import java.util.Scanner;

public class ThreeSwimmers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long testCases = scanner.nextLong();
        long[] numbers = new long[4];
        for (int j = 0; j < testCases; j++) {

            for (int i = 0; i < 4; i++) {
                numbers[i] = scanner.nextLong();
            }

            number(numbers);
        }

    }

    public static void number(long[] numbers){
        long[] nums = new long[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = number(numbers[0], numbers[i + 1]);
        }
        Arrays.sort(nums);
        System.out.println(nums[0]);
    }

    public static long number(long p, long number){
        if (p <= number)
            return number - p;
        number = number * (Math.round((double) p / number) + 1);
        return number - p;
    }
}
