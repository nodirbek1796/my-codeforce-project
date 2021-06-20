import java.util.Scanner;

public class StrangePartition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, x;
        int[] ints;
        int testCases = scanner.nextInt();
        long[][] result = new long[testCases][2];
        long[] base;
        for (int i = 0; i < testCases; i++) {
            n = scanner.nextInt();
            x = scanner.nextInt();
            ints = new int[n];

            for (int j = 0; j < n; j++) {
                ints[j] = scanner.nextInt();
            }

            base = solve(ints, x);

            for (int k = 0; k < 2; k++) {
                result[i][k] = base[k];
            }

        }

        for (int i = 0; i < testCases; i++) {
            for (int i1 = 0; i1 < 2; i1++) {
                System.out.print(result[i][i1] + " ");
            }
            System.out.println();
        }
    }

    public static long[] solve(int[] ints, int x){
        long min;
        long sum = 0;
        long max = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
            max += (long) Math.ceil((double) ints[i] / x);
        }
        min = (long) Math.ceil((double) sum / x);
        long [] result = {min, max};
        return result;
    }
}
