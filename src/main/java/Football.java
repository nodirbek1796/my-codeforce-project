import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.next();

        if (sequence.length() < 7){
            System.out.println("NO");
            return;
        }

        while (sequence.length() >= 7){
            if (sequence.startsWith("0000000") || sequence.startsWith("1111111")){
                System.out.println("YES");
                return;
            }
            sequence = sequence.substring(1);
        }
        System.out.println("NO");
    }
}
