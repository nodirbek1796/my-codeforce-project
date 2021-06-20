import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte testCase = scanner.nextByte();
        while ((testCase--) != 0){
            byte n = scanner.nextByte();
            solve(n);
        }
    }

    public static void solve(byte n){
        String result = "";
        for (int i = 9; i >= 1; i--) {
            if (n >= i){
                result = i + result;
                n -= i;
            }
        }
        if (n == 0)
            System.out.println(result);
        else
            System.out.println(-1);
    }
}
