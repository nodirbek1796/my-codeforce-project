import java.util.Scanner;

public class PetrAndBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pagesNumber = scanner.nextInt();
        int[] days = new int[7];
        for (int i = 0; i < 7; i++) {
            days[i] = scanner.nextInt();
        }

        int answer = 0;
        int result = 0;
        boolean isSuccess = false;
        while (!isSuccess){
            for (int i1 = 0; i1 < 7 && !isSuccess; i1++) {
                result += days[i1];
                if (result >= pagesNumber) {
                    isSuccess = true;
                    answer = (byte) (i1 + 1);
                }
            }
        }
        System.out.println(answer);
    }
}
