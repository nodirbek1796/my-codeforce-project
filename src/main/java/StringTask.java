import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        solve(scanner.nextLine().toLowerCase());
    }

    public static void solve(String word){
        String vowels = "aoyuei";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (!vowels.contains(String.valueOf(word.charAt(i))))
                result.append(".").append(word.charAt(i));
        }
        System.out.println(result);
    }
}
