import java.util.Scanner;

public class NumbersOnWhiteboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        int[] array = new int[testCases];

        for (int i = 0; i < testCases; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < testCases; i++) {
            solve(array[i]);
        }
    }

    public static void solve(int n){
        int helper = 0;
        int a = n;
        int b = n - 1;
        System.out.println(2);
        System.out.println(a + " " + b);
        if (n > 2)
            System.out.println(a + " " + (b - 1));
        b = b - 1;
        while (helper < n - 3){
            a -= 1;
            b -= 1;
            System.out.println(a + " " + b);
            helper++;
        }
    }
}
