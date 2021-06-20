import java.util.*;

public class BrokenKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String testCase = scanner.nextLine();
        int test = Integer.parseInt(testCase);
        for (int i = 0; i < test; i++) {
            solve(scanner.nextLine());
        }

    }

    public static void solve(String word){
        Set<Character> result = new HashSet<>();
        if (word.length() == 1) {
            System.out.println(word);
            return;
        }
        for (int i = 0; i < word.length(); i++) {
            if (i < word.length() - 1 && word.charAt(i) == word.charAt(i + 1)) {
                i++;
            }else
                result.add(word.charAt(i));
        }
        Object[] objects = result.toArray();
        Arrays.sort(objects);
        for (Object object : objects) {
            System.out.print(object);
        }
        System.out.println();
    }
}
