import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scanner.nextInt(); i++) {
            scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            String[] s = line.split(" ");
            boolean answer = solve(Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2]));
            System.out.println(answer);
        }
    }

    public static boolean solve(int width, int height, int n){
        int helper = width * height;
        int maxFriends = 1;
        while (helper % 2 != 1){
            helper /= 2;
        }
        return maxFriends >= n;
    }
}
