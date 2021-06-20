import java.util.Scanner;

public class CapsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        solve(scanner.nextLine());
    }

    public static void solve(String word){
        if (word.endsWith(word.substring(1).toUpperCase()))
            if (word.equals(word.toUpperCase()))
                System.out.println(word.toLowerCase());
            else
                System.out.println(String.valueOf(word.charAt(0)).toUpperCase() +
                        word.substring(1).toLowerCase());
        else
            System.out.println(word);
    }
}
