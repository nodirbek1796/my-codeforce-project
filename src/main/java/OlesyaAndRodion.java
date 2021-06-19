import java.util.Scanner;

public class OlesyaAndRodion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        helper(scanner.nextInt(), scanner.nextInt());
    }

    public static void helper(int len, int t){
        if (len == 1 && t == 10)
            System.out.println(-1);
        else {
            if (t == 10)
                len -= 2;
            else
                len -= 1;
            String nulls = "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"; // 100 ta null
            StringBuilder result = new StringBuilder(String.valueOf(t));
            System.out.println(result.append(nulls, 0, len));
        }
    }
}
