import java.util.*;

public class ShiftingStacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String testCases = scanner.nextLine();
        int t = Integer.parseInt(testCases);
        String[][] array = new String[t][2];

        for(int i=0 ; i < t ; i++) {
            String columns = scanner.nextLine();
            String bricks = scanner.nextLine();
            array[i][0] = columns;
            array[i][1] = bricks;
        }

        for (int i = 0; i < array.length; i++) {
            solve(array[i][0],array[i][1]);
        }
    }

    public static void solve(String columns, String bricks) {
        int n = Integer.parseInt(columns);
        String[] bricksNumbers = bricks.split(" ");
        long sum = 0;
        int stairSum = 0;
        for (int j = 0; j < n; j++) {
            stairSum +=j;
            sum += Integer.parseInt(bricksNumbers[j]);
            if (sum < stairSum) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }
}