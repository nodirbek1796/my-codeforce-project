import java.util.Scanner;

public class StringLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < testCase; i++) {
            solve(scanner.nextLine(), scanner.nextLine());
        }
    }

    public static void solve(String word1, String word2){
       int len1 = word1.length();
       int len2 = word2.length();

       int gcd = gcd(len1, len2);

       if (mul(word1, len2 / gcd).equals(mul(word2, len1 / gcd)))
           System.out.println(mul(word1, len2 / gcd));
       else
           System.out.println(-1);

    }

    public static int gcd(int number1, int number2){
        while (number1 != number2){
            if (number1 > number2)
                number1 -= number2;
            else
                number2 -= number1;
        }
        return number1;
    }

    public static String mul(String word, int k){
        StringBuilder result = new StringBuilder();
        while (k != 0){
            result.append(word);
            k--;
        }
        return result.toString();
    }
}
