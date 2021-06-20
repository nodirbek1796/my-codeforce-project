import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        helper(word);
    }

    public static void helper(String word){
        byte count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i)))
                count++;
        }
        if (word.length() % 2 == 0)
            if (count >= word.length() / 2)
                System.out.println(word.toLowerCase());
            else
                System.out.println(word.toUpperCase());
        else
            if (count > word.length() / 2)
                System.out.println(word.toLowerCase());
            else
                System.out.println(word.toUpperCase());
    }
}
