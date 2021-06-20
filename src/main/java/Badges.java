import java.util.Scanner;

public class Badges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short b, g, n;
        b = scanner.nextShort();
        g = scanner.nextShort();
        n = scanner.nextShort();
        int result;
        result = Math.min(g, n) - (n - Math.min(b, n)) + 1;
        System.out.println(result);
    }
}
