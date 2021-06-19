import java.util.Scanner;

public class MagicStick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 0; i < testCase; i++) {
            solve(scanner.nextInt(), scanner.nextInt());
        }
    }

    public static void solve(int x, int y){
        if (x == y)
            System.out.println("Yes");
        else {
            if (x == 1 && x < y)
                System.out.println("No");
            else if (x <= 3 && y == 3)
                System.out.println("Yes");
            else if (x <= 3 && y > x)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}
