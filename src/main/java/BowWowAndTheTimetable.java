import java.util.Scanner;

public class BowWowAndTheTimetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        solve(scanner.nextLine());
    }

    public static void solve(String numbers){
       if (numbers.lastIndexOf("1") == 0 || numbers.equals("0"))
           System.out.println(numbers.length() / 2);
       else
           System.out.println((numbers.length() + 1) / 2);
    }
}
