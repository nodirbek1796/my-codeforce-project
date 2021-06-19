import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ThreeProblems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        short n = scanner.nextShort();
        for (int i = 0; i < n; i++) {
            hashMap.put(i + 1, scanner.nextInt());
        }

        Integer[] values = hashMap.values().toArray(new Integer[0]);
        int[] helper = helper(values);
        if (helper[0] == -1) {
            System.out.println(-1 + " " + -1 + " " + -1);
        }else {
            for (int j : helper) {
                System.out.print(getKey(hashMap, j) + " ");
            }
        }
    }

    public static <K, V> K getKey(Map<K, V> map, V value){
        for (K key: map.keySet()) {
            if (value.equals(map.get(key)))
                return key;
        }
        return null;
    }

    public static int[] helper(Integer[] values){
        int[] result = new int[3];
        Arrays.sort(values);
        result[0] = values[0];
        int index = 1;
        for (int i = 0; i < values.length - 1 && index != 3; i++) {
            if (!values[i].equals(values[i + 1]))
                result[index++] = values[i + 1];
        }
        if (result[1] == 0 || result[2] == 0){
            result[0] = -1;
            result[1] = -1;
            result[2] = -1;
        }
        return result;
    }
}
