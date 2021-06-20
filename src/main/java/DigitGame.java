import java.util.Scanner;

public class DigitGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < testCase; i++) {
            solve(Integer.parseInt(scanner.nextLine()), scanner.nextLine());
        }
    }

    public static void solve(int length, String numbers){

        if (length % 2 == 1){
            if (hasOdd(numbers))
                System.out.println(1);
            else
                System.out.println(2);
        }else {
            if (hasEven(numbers))
                System.out.println(2);
            else
                System.out.println(1);
        }

    }

    public static boolean hasOdd(String numbers){
        boolean isSuccess = false;
        for (int i = 0; i < numbers.length() && !isSuccess; i += 2) {
            if (Integer.parseInt(String.valueOf(numbers.charAt(i))) % 2 == 1)
                isSuccess = true;
        }
        return isSuccess;
    }

    public static boolean hasEven(String numbers){
        boolean isSuccess = false;
        for (int i = 1; i < numbers.length(); i += 2) {
            if (Integer.parseInt(String.valueOf(numbers.charAt(i))) % 2 == 0)
                isSuccess = true;
        }
        return isSuccess;
    }
}
