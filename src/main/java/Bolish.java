import java.util.Scanner;

public class Bolish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Berilgan sonni kiriting Number = ");
        long num = scanner.nextLong();
        while (!solve(num)){
            num++;
        }
        System.out.println(num);
    }

    public static boolean solve(Long number){
        Long element = number;
        boolean helper = true;
        while (element > 0 && helper){
            long remain = element % 10;
            if (remain != 0 && number % remain != 0L)
                helper = false;

            element /= 10;
        }
        return helper;
    }
}
