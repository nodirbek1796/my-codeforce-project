import java.util.LinkedList;
import java.util.Scanner;

public class StrangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte testCase = scanner.nextByte();
        int n, x;
        for (int i = 0; i < testCase; i++) {
            n = scanner.nextInt();
            x = scanner.nextInt();
            LinkedList<Integer> list = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                list.add(scanner.nextInt());
            }
            solve(list, x);
        }
    }

    public static void solve(LinkedList<Integer> list, int x){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % x == 0)
                helper(list, x, list.get(i) / x);
            else {
                result(list);
                return;
            }
        }
    }

    public static void helper(LinkedList<Integer> list, int x, int number){
        for (int i = 0; i < x; i++) {
            list.add(number);
        }
    }

    public static void result(LinkedList<Integer> list){
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println(sum);
    }
}
