import test.Test;

import java.util.Scanner;

public class Chocolates implements Test {
    @Override
    public String test1() {
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        int[] chocolates = new int[testCase];
        for (int i = 0; i < testCase; i++) {
            chocolates[i] = scanner.nextInt();
        }
        helper(chocolates);

    }

    public static void helper(int[] candies){
        long result = candies[candies.length - 1];
        int min = candies[candies.length - 1];
        for (int i = candies.length - 1; i > 0; i--) {
            min = Math.min(min - 1, candies[i - 1]);
            if (min == 0)
                break;
            result += min;
        }
        System.out.println(result);
    }
}
