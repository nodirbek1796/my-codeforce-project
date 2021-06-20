import java.util.Scanner;

public class FastFoodRestaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short testCases = scanner.nextShort();
        byte[] result = new byte[testCases];
        byte a, b, c;

        for (int i = 0; i < testCases; i++) {
            a = scanner.nextByte();
            b = scanner.nextByte();
            c = scanner.nextByte();
            result[i] = solve(a, b, c);
        }

        for (int i = 0; i < testCases; i++) {
            System.out.println(result[i]);
        }
    }

    public static byte solve(byte a, byte b, byte c){
        if (a == b && b == c && c == 0)
            return 0;

        if (a == b && b == 0 && c >= 1)
            return 1;
        if (a == c && c == 0 && b >= 1)
            return 1;
        if (c == b && b == 0 && a >= 1)
            return 1;

        if (a == 0 && b == 1 && c >= 1)
            return 2;
        if (a == 0 && c == 1 && b >= 1)
            return 2;
        if (b == 0 && a == 1 && c >= 1)
            return 2;
        if (b == 0 && c == 1 && a >= 1)
            return 2;
        if (c == 0 && a == 1 && b >= 1)
            return 2;
        if (c == 0 && b == 1 && a >= 1)
            return 2;

        if (a == 0 && b >= 1 && c >= 1)
            return 3;
        if (b == 0 && a >= 1 && c >= 1)
            return 3;
        if (c == 0 && b >= 1 && a >= 1)
            return 3;

        if (a == b && b == c && c == 1)
            return 3;
        if (a == b && b == 1 && c > 1)
            return 3;
        if (a == c && c == 1 && b > 1)
            return 3;
        if (a > 1 && b == c && c == 1)
            return 3;

        if (a == 1 && b >= 2 && c >= 2)
            return 4;
        if (b == 1 && a >= 2 && c >= 2)
            return 4;
        if (c == 1 && a >= 2 && b >= 2)
            return 4;

        if (a == b && b == c && c == 2)
            return 4;
        if (a == 2 && b >= 2 && c >= 2)
            return 5;
        if (b == 2 && a >= 2 && c >= 2)
            return 5;
        if (c == 2 && b >= 2 && a >= 2)
            return 5;

        if (a == 3 && b >= 3 && c >= 3)
            return 6;
        if (b == 3 && a >= 3 && c >= 3)
            return 6;
        if (c == 3 && a >= 3 && b >= 3)
            return 6;

        if (a >= 4 && b >= 4 && c >= 4)
            return 7;
        return 0;
    }
}
