import java.util.Scanner;

public class NewYearNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        int testCases[] = new int[test];
        for (int i = 0; i < test; i++) {
            testCases[i] = scanner.nextInt();
        }

        for (int i = 0; i < test; i++) {
            int sub = testCases[i] / 2020;
            int rem = testCases[i] % 2020;
            if (rem <= sub)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
