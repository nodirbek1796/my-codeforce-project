import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte numberOfForces = scanner.nextByte();

        int sumX = 0;
        int sumY = 0;
        int sumZ = 0;

        for (int i = 0; i < numberOfForces; i++) {
            sumX += scanner.nextByte();
            sumY += scanner.nextByte();
            sumZ += scanner.nextByte();
        }

        if (sumX == 0 && sumY == 0 && sumZ == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
