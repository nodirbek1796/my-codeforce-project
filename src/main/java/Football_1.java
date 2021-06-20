import java.util.ArrayList;
import java.util.Scanner;

public class Football_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = Byte.parseByte(scanner.nextLine());
        if (n == 1){
            System.out.println(scanner.nextLine());
        }else{
            ArrayList<String> teams = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                teams.add(scanner.nextLine());
            }
            helper(teams);
        }
    }

    public static void helper(ArrayList<String> teams){
        byte team1= 0, team2 = 0;
        String team = teams.get(0), anotherTeam = "";
        for (String s : teams) {
            if (team.equals(s))
                team1++;
            else {
                anotherTeam = s;
                team2++;
            }
        }
        if (team1 > team2)
            System.out.println(team);
        else
            System.out.println(anotherTeam);
    }
}
