import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        solve(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }

    public static void solve(int n, int m, int a){

        if (a == 1){
            System.out.println((long) n * m);
            return;
        }
        if ((long)n * m <= (long) a * a){
            System.out.println(1);
            return;
        }

        System.out.println((long) (Math.ceil((double) n / a) * Math.ceil((double) m / a)));
    }
}
