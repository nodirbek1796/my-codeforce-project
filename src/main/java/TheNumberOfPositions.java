import java.util.Scanner;

public class TheNumberOfPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        solve(scanner.nextByte(), scanner.nextByte(), scanner.nextByte());
    }

    public static void solve(byte n, byte a, byte b){
        System.out.println(n - Math.max(a + 1, n - b) + 1);
    }
}
