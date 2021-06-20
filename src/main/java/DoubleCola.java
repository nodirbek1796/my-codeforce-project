import java.util.Scanner;

public class DoubleCola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        int n = scanner.nextInt();
        whoIsNext(names, n);
    }

    public static void whoIsNext(String[] names, int n) {
        n = n - 1;
        int len = 5;

        while(n >= len) {
            int div = n-len;
            n = (int)Math.floor((double) div/2);
        }
        System.out.println(names[n]);
    }
}
