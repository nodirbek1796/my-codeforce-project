import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        solve(scanner.nextInt());
    }

    public static void solve(int number){
        int[] luckyNumbers = {4, 7, 47, 74, 447, 477, 474, 747, 774, 744};
        boolean isSuccess = false;

        for (int i = 0; i < luckyNumbers.length && !isSuccess; i++) {
            if (number % luckyNumbers[i] == 0)
                isSuccess = true;
        }

        if (isSuccess)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
