import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short a = scanner.nextByte(), b = scanner.nextByte();
        byte count = 0;
        while (a <= b){
            count++;
            a *= 3;
            b *= 2;
        }
        System.out.println(count);
    }
}
