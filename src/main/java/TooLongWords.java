import java.util.Scanner;

public class TooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter number of test cases: ");
        int testCases = scanner.nextInt();
        String[] words = new String[testCases];
        scanner = new Scanner(System.in);
        for (int i = 0; i < testCases; i++) {
            words[i] = scanner.nextLine();
        }

        for (int i = 0; i < testCases; i++) {
            solve(words[i]);
        }
    }

    public static void solve(String word){
        int len = word.length();
        if (len <= 10){
            System.out.println(word);
        }else
            System.out.println(word.substring(0, 1) + (len - 2) + word.substring(len - 1));
    }
}
