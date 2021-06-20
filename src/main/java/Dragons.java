import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Dragons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int strengthHero = scanner.nextInt();
        short testCase = scanner.nextShort();

        HashMap<Short, Short> dragonAndBonus = new HashMap<>();

        for (int i = 0; i < testCase; i++) {
            dragonAndBonus.put(scanner.nextShort(), scanner.nextShort());
        }

        Short[] dragons = dragonAndBonus.keySet().toArray(new Short[0]);

        Arrays.sort(dragons);
        boolean isSuccess = false;
        short count = 0;
        while (count != dragons.length && !isSuccess){
            for (Short dragon : dragons) {
                if (strengthHero > dragon) {
                    strengthHero += dragonAndBonus.get(dragon);
                    count++;
                } else {
                    isSuccess = true;
                    break;
                }
            }
        }
        if (isSuccess)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
