import java.util.Scanner;

public class TheGreatHero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int powerHero, healthHero;
        System.out.print("powerHero = "); powerHero = scanner.nextInt();
        System.out.print("healthHero = "); healthHero = scanner.nextInt();
        System.out.print("Number of monsters! \nn = ");
        int n = scanner.nextInt();
        int[] powerM = new int[n];
        int[] healthM = new int[n];
        int[][] monsters = new int[2][n];

        for (int i = 0; i < 2; i++) {
            if (i == 0)
                System.out.println("Power of monsters: ");
            else
                System.out.println("Health of monsters: ");
            for (int j = 0; j < n; j++) {
               monsters[i][j] = scanner.nextInt();
            }
        }

        int j = 0;
        boolean answer = true;
        while (healthHero >= 0 && answer && j < n){
            if (!solve(powerHero, healthHero, monsters[0][j], monsters[1][j]))
                answer = false;
            healthHero = healthHero(powerHero, healthHero, monsters[0][j], monsters[1][j]);
            j++;
        }
        if (answer)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean solve(int powerHero, int healthHero, int powerMonsters, int healthMonsters){
        int helper, helper1;
        if (healthMonsters % powerHero == 0)
            helper = healthMonsters / powerHero;
        else
            helper = healthMonsters % powerHero + 1;
        if (healthHero % powerMonsters == 0)
            helper1 = healthHero / powerMonsters;
        else
            helper1 = healthHero / powerMonsters + 1;
        return helper1 >= helper;
    }

    public static int healthHero(int powerHero, int healthHero, int powerMonsters, int healthMonsters){
        int helper;
        if (healthMonsters % powerHero == 0)
            helper = healthMonsters / powerHero;
        else
            helper = healthMonsters % powerHero + 1;
        healthHero = healthHero - helper * powerMonsters;
        return healthHero;
    }
}
