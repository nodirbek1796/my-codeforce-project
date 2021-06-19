import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MakeProductEqualOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        ArrayList<Integer> integers = new ArrayList<>();
        long result = 0;
        for (int i = 0; i < number; i++) {
            integers.add(scanner.nextInt());
        }
        Collections.sort(integers);
        if (isHasZero(integers)) {
            for (Integer integer : integers) {
                if (integer < 0)
                    result += Math.abs(integer + 1);
                else if (integer == 0)
                    result++;
                else if (integer > 1)
                    result += integer - 1;
            }
        } else if (integers.stream().findFirst().get() > 0) {
            for (Integer integer : integers) {
                result += integer - 1;
            }
        } else if (isEvenNegativeNumbers(integers)){
            for (Integer integer : integers) {
                if (integer < 0)
                    result += Math.abs(integer + 1);
                else if (integer > 1)
                    result += integer - 1;
            }
        }else {
            for (Integer integer : integers) {
                if (integer < 0)
                    result += Math.abs(integer + 1);
                else if (integer > 1)
                    result += integer - 1;
            }
            result += 2;
        }
        System.out.println(result);
    }

    public static boolean isHasZero(ArrayList<Integer> integers) {
        return integers.toString().contains(", 0");
    }

    public static boolean isEvenNegativeNumbers(ArrayList<Integer> integers){
        int countNegativeNumbers = 0;
        for (Integer integer : integers) {
            if (integer < 0)
                countNegativeNumbers++;
            else
                break;
        }
        return countNegativeNumbers % 2 == 0;
    }
}
