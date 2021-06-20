import java.util.Scanner;

public class AddAndDivide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        int [] arrayRes = new int[testCases];
        scanner = new Scanner(System.in);

        for (int i = 0; i < testCases; i++) {
            String[] str = scanner.nextLine().split(" ");
            arrayRes[i] = solve(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
        }

        for (int i = 0; i < testCases; i++) {
            System.out.println(arrayRes[i]);
        }
    }

    public static int solve(int A, int B){
        int a, b, res, i, answer;
        if (A == 0){
            return 0;
        }
        res = A + 3;
        for (i = (B < 2 ? 2 - B : 0); i < res; ++i){
            b = B + i;
            a = A;
            answer = i;
            while (a != 0){
                a /= b;
                ++answer;
            }
            if (answer < res)
                res = answer;
        }
        return res;
    }
}
