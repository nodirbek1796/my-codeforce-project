import java.util.Arrays;
import java.util.Scanner;

public class DinnerWithEmma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][] numbers = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }

        for (int[] number : numbers) {
            Arrays.parallelSort(number, 0, m);
        }

        int max = numbers[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < numbers[i][0])
                    max = numbers[i][0];
            }
        }
        System.out.println(max);
    }
}
