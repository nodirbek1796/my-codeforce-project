import java.util.Scanner;

public class UniqueArrayNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massiv uzunligini kiriting = ");

        int lenArray = scanner.nextInt();
        int[] unique = new int[lenArray];
        int[] res = new int[lenArray];

        System.out.println("Massiv elementlarini kiriting: ");
        for (int i = 0; i < lenArray; i++) {
            System.out.print("unique[" + i + "] = ");
            unique[i] = scanner.nextInt();
        }

        int index = 0;
        for (int i = 0; i < lenArray; i++) {
            if (isUniqueItem(res, unique[i])){
                res[index++] = unique[i];
                System.out.print(unique[i] + " ");
            }
        }
    }

    public static boolean isUniqueItem(int [] array, int number){
        int count = 0;
        for (int j : array) {
            if (number == j)
                count++;
        }
        return count == 0;
    }
}
