import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        if (n == 1) {
            System.out.println("I hate it");
            return;
        }
        String[] feelings = { "I hate that ", "I love that "};
        String hateLast = "I hate it ";
        String loveLast = "I love it ";
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1){
                result.append(feelings[0]);
            }else
                result.append(feelings[1]);
            if (i == n - 1) {
                if (n % 2 == 1){
                    {
                        result.append(hateLast);
                        break;
                    }
                }else {
                    result.append(loveLast);
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
