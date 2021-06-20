import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        solve(scanner.nextLine());
    }

    public static void solve(String word){
        String hello = "hello";
        boolean isSuccess = false;
        for (int i = 0; i < hello.length() && !isSuccess; i++) {
            int index = word.indexOf(String.valueOf(hello.charAt(i)));
            if (index != -1)
                if (index < word.length() - 1)
                    word = word.substring(index + 1);
                else
                    word = word.substring(index);
            else
                isSuccess = true;
        }

        if (!isSuccess)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
