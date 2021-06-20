import java.util.Scanner;

public class FairDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int n,  testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            System.out.print("Number of candies N = ");
            n = scanner.nextInt();
            scanner = new Scanner(System.in);
            String[] candies = scanner.nextLine().split(" ");
            if (fairDivision(n, candies))
                System.out.println("Yes");
            else
                System.out.println("No");

        }
    }

    public static boolean fairDivision(int n, String candies[]){
        boolean answer = false;
        int counter1 = 0, counter2 = 0;
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(candies[i]) == 1)
                counter1 ++;
            else
                counter2 ++;
        }
        if (counter1 % 2 == 0 && counter1 != 0)
            answer = true;
        else if (counter1 == 0 && counter2 % 2 == 0)
            answer = true;

        return answer;
    }
}
