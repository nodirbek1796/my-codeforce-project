import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        if (n > 2 && n % 2 == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
