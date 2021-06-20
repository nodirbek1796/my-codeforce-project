import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 5)
            System.out.println(1);
        else
            if (n % 5 == 0)
                System.out.println(n / 5);
            else
                System.out.println((n / 5) + 1);
    }
}
