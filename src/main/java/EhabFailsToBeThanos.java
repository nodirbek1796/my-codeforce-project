import java.util.Arrays;
import java.util.Scanner;

public class EhabFailsToBeThanos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort();
        int [] numbers = new int[2 * n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        int sum = 0;
        for (int i = 0, j = numbers.length - 1; i < numbers.length / 2; i++, j--) {
            sum += numbers[i] - numbers[j];
        }
        if (sum != 0)
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        else
            System.out.println(-1);
    }
}