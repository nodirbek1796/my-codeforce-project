import java.util.Scanner;

public class HQ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();

        if (p.contains("H")){
            System.out.println("YES");
            return;
        }
        if (p.contains("Q")){
            System.out.println("YES");
            return;
        }
        if (p.contains("9")){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
