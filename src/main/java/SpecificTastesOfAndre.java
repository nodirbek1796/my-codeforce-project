import java.util.Scanner;

public class SpecificTastesOfAndre {
    public static void main(String[] args) {

        int[] array = {7, 37, 79, 49};





        int j = 0;
        while (solve(array, j) && j < array.length){
            j++;
        }
        if (j == array.length)
            System.out.println(true);
        else
            System.out.println(false);

    }

    public static boolean solve(int numbers[], int j){
        boolean isPerfect = true;
        int sum = 0;
        int helper = 1;
        for (int i = j; (i < numbers.length && isPerfect); i++) {
            sum += numbers[i];
            if (sum % helper != 0)
                isPerfect = false;
            helper++;
        }
        return isPerfect;
    }
}
