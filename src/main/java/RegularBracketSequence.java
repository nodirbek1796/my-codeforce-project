import java.util.Scanner;

public class RegularBracketSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String k = scanner.nextLine();
        int testCases = Integer.parseInt(k);
        String s;
        String[] result = new String[testCases];
        for (int i = 0; i < testCases; i++) {
            s = scanner.nextLine();
            result[i] = solve(s);
        }

        for (int i = 0; i < testCases; i++) {
            System.out.println(result[i]);
        }
    }

    public static String solve(String s){
        if (s.startsWith(")") || s.endsWith("("))
            return "No";
        if (s.length() % 2 == 1)
            return "No";
        return "Yes";
    }
}
