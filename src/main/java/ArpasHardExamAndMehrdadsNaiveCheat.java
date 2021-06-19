import java.util.Scanner;

public class ArpasHardExamAndMehrdadsNaiveCheat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0)
            System.out.println(1);
        else {
            byte remain = (byte) (n % 4);
            switch (remain){
                case 1:
                    System.out.println(8);
                    break;
                case 2:
                    System.out.println(4);
                    break;
                case 3:
                    System.out.println(2);
                    break;
                case 0:
                    System.out.println(6);
            }
        }
    }
}
