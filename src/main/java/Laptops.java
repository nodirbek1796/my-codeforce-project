import java.util.Scanner;

public class Laptops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (scanner.nextInt() != scanner.nextInt()) {
                System.out.println("Happy Alex");
                return;
            }
        }
        System.out.println("Poor Alex");
    }
}
