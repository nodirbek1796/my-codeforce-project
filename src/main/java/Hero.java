import java.util.Scanner;

public class Hero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int testCases = scanner.nextInt();
        scanner = new Scanner(System.in);
        for (int j = 0; j < testCases; j++) {
            //System.out.println("Enter power and health of hero and number of monsters ->");

            int powerHero, healthHero, n;
            String[] str0 = scanner.nextLine().split(" ");
            powerHero = Integer.parseInt(str0[0]);
            healthHero = Integer.parseInt(str0[1]);
            n = Integer.parseInt(str0[2]);
            int[] powerM = new int[n];
            int[] healthM = new int[n];

           // System.out.println("Power of monsters: ");
            String[] str = scanner.nextLine().split(" ");

           // System.out.println("Health of monsters: ");
            String[] str1 = scanner.nextLine().split(" ");

            for (int i = 0; i < n; i++) {
                powerM[i] = Integer.parseInt(str[i]);
                healthM[i] = Integer.parseInt(str1[i]);
            }

            int i = 0;
            boolean answer = true;
            while (healthHero >= 0 && answer && i < n){
                if (!solve(powerHero, healthHero, powerM[i], healthM[i]))
                    answer = false;
                healthHero = healthHero(powerHero, healthHero, powerM[i], healthM[i]);
                i++;
            }
            if (answer)
                System.out.println("Yes\n");
            else
                System.out.println("No\n");

        }
    }

    public static boolean solve(int powerHero, int healthHero, int powerMonsters, int healthMonsters){
        int helper, helper1;
        if (healthMonsters % powerHero == 0)
            helper = healthMonsters / powerHero;
        else
            helper = (healthMonsters % powerHero) + 1;
        if (healthHero % powerMonsters == 0)
            helper1 = healthHero / powerMonsters;
        else
            helper1 = (healthHero / powerMonsters) + 1;
        return helper1 >= helper;
    }

    public static int healthHero(int powerHero, int healthHero, int powerMonsters, int healthMonsters){
        int helper;
        if (healthMonsters % powerHero == 0)
            helper = healthMonsters / powerHero;
        else
            helper = (healthMonsters % powerHero) + 1;
        healthHero = healthHero - helper * powerMonsters;
        return healthHero;
    }
}
