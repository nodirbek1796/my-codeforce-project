import java.util.Scanner;

public class LifeWithoutZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (removeZeros(a, b, a + b))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean removeZeros(int a, int b, int c){
        a = Integer.parseInt(String.valueOf(a).replaceAll("0", ""));
        b = Integer.parseInt(String.valueOf(b).replaceAll("0", ""));
        c = Integer.parseInt(String.valueOf(c).replaceAll("0", ""));
        return a + b == c;
    }
}
