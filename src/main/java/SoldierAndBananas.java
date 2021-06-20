import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short k = scanner.nextShort(); int n = scanner.nextInt(); short w = scanner.nextShort();
        int result = k * w * (w + 1) / 2;
        System.out.println(Math.max(result - n, 0));
    }
}
