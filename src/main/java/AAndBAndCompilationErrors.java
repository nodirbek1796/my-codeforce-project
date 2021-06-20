import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class AAndBAndCompilationErrors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        for (int i = 0; i < testCase; i++) {
            list.add(scanner.nextInt());
        }
        for (int i = 0; i < testCase - 1; i++) {
            list1.add(scanner.nextInt());
        }
        for (int i = 0; i < testCase - 2; i++) {
            list2.add(scanner.nextInt());
        }
        list.sort(Comparator.comparingInt(o -> o));
        list1.sort(Comparator.comparingInt(o -> o));
        list2.sort(Comparator.comparingInt(o -> o));
        helper(list, list1);
        helper(list1, list2);
    }

    public static void helper(LinkedList<Integer> list, LinkedList<Integer> list1) {
        for (Integer integer : list1) {
            list.remove(integer);
        }
        System.out.println(list.get(0));
    }
}
