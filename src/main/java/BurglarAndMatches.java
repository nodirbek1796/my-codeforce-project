import java.util.Scanner;

public class BurglarAndMatches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        int container = scanner.nextInt();
        int[] boxes = new int[container];
        int[] matches = new int[container];
        for (int i = 0; i < container; i++) {
            boxes[i] = scanner.nextInt();
            matches[i] = scanner.nextInt();
        }
        System.out.println(solve(capacity, boxes, matches));
    }

    public static int solve(
        int capacity,
        int[] boxes,
        int[] matches
    ){
        int sum = 0;
        int index = getMax(matches);
        while (capacity > 0){
            if (capacity >= boxes[index]){
                sum += boxes[index] * matches[index];
                matches[index] = 0;
                capacity -= boxes[index];
                index = getMax(matches);
            }else {
                sum += capacity * matches[index];
                capacity = 0;
            }
        }
        return sum;
    }

    public static int getMax(int [] ints){
        int maxNumber = ints[0];
        int index = 0;
        for (int i = 1; i < ints.length; i++) {
            if (maxNumber < ints[i]){
                maxNumber = ints[i];
                index = i;
            }
        }
        return index;
    }
}
