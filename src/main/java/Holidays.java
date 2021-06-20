import java.util.Scanner;

public class Holidays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] ints;
        ints = solve(number);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }

    public static int[] solve(int number){
        int[] minMax = new int[2];
        int divNumber = number / 7;
        int remainNumber = number % 7;
        if (remainNumber == 0){
            minMax[0] = divNumber * 2;
            minMax[1] = divNumber * 2;
        }else {
            if (remainNumber == 1) {
                minMax[0] = divNumber * 2;
                minMax[1] = divNumber * 2 + 1;
            }else if (remainNumber >= 2 && remainNumber <= 5){
                minMax[0] = divNumber * 2;
                minMax[1] = divNumber * 2 + 2;
            }else{
                minMax[0] = divNumber * 2 + 1;
                minMax[1] = divNumber * 2 + 2;
            }
        }
        return minMax;
    }
}
