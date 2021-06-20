import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] word = scanner.nextLine().split("");
        helper(word);
    }

    public static void helper(String[] word){
        StringBuilder check = new StringBuilder();

        for (int i = 0; i < word.length; i++) {
            if (!check.toString().contains(word[i]))
                check.append(word[i]);
        }

        if (check.length() % 2 == 0)
            System.out.println("CHAT WITH HER!\n");
        else
            System.out.println("IGNORE HIM!\n");
    }
}
