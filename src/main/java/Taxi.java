import java.util.ArrayList;
import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < testCase; i++) {
            list.add(scanner.nextInt());
        }
        list.sort((o1, o2) -> o2 - o1);
        list1.add(4);
        int numberOfFour = helper(list, list1, 4);
        int numberOfThree = helper(list, list1, 3);
        int numberOfTwo = helper(list, list1, 2);
        int numberOfOne = list.size();

        if (numberOfThree > numberOfOne) {
            numberOfFour += numberOfOne;
            numberOfFour += (numberOfThree - numberOfOne);
            numberOfOne = 0;
        }else if (numberOfThree == numberOfOne) {
            numberOfFour += numberOfOne;
            numberOfOne = 0;
        }
        else {
            numberOfFour += numberOfThree;
            numberOfOne -= numberOfThree;
            if (numberOfOne % 4 == 0) {
                numberOfFour += numberOfOne / 4;
                numberOfOne = 0;
            }
            else {
                numberOfFour += numberOfOne / 4;
                numberOfOne = numberOfOne % 4;
                if (numberOfOne > 2) {
                    numberOfFour += 1;
                    numberOfOne = 0;
                }
            }
        }

        if (numberOfTwo % 2 == 0) {
            numberOfFour += numberOfTwo / 2;
            if (numberOfOne != 0)
                numberOfFour += 1;
        }
        else {
            numberOfFour += numberOfTwo / 2;
            numberOfFour += 1;
        }
        System.out.println(numberOfFour);
    }

    public static int helper(ArrayList<Integer> list, ArrayList<Integer> list1, int number){
        int count = 0;
        for (Integer integer : list) {
            if (integer != number)
                break;
            count++;
        }
        list1.set(0, number);
        list.removeAll(list1);
        return count;
    }
}
