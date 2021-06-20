import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum, count = 0;
        int testCases = scanner.nextInt();
        scanner = new Scanner(System.in);
        for (int i = 0; i < testCases; i++) {
            String[] str;
            str = scanner.nextLine().split(" ");
            sum = Integer.parseInt(str[0]) + Integer.parseInt(str[1]) + Integer.parseInt(str[2]);
            if (sum >= 2)
                count++;
        }
        System.out.println(count);
    }
}
