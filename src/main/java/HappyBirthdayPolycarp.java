import java.util.Scanner;

public class HappyBirthdayPolycarp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 0; i < testCase; i++) {
            helper(scanner.nextInt());
        }
    }

    public static void helper(int n){
        String number = String.valueOf(n);
        if (number.length() == 1)
            System.out.println(n);
        else {
            int eleven = makeEleven(number.length());
            int result = (n / eleven) + (number.length() - 1) * 9;
            System.out.println(result);
        }
    }

    public static int makeEleven(int n){
        StringBuilder eleven = new StringBuilder();
        for (int i = 0; i < n; i++) {
            eleven.append("1");
        }
        return Integer.parseInt(eleven.toString());
    }
}
