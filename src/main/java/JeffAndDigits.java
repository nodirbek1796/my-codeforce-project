import java.util.Scanner;

public class JeffAndDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String numbers = scanner.nextLine();
        solve(numbers);
    }

    public static void solve(String numbers){
        if (!numbers.contains("0")) {
            System.out.println(-1);
            return;
        }else if (!numbers.contains("5")){
            System.out.println(0);
            return;
        }

        StringBuilder nulls = new StringBuilder();
        int count5 = 0;
        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) == '0')
                nulls.append("0");
            else if (numbers.charAt(i) == '5')
                count5++;
        }

        if (count5 < 9){
            System.out.println(0);
            return;
        }

        int div = count5 / 9;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < div * 9; i++) {
            result.append("5");
        }

        System.out.println(result.append(nulls));
    }
}
