import java.util.Scanner;

class AlmostPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int counter = 0;
        for (int k = 1; k <= number; k++)
            if (findCoPrimePair(k))
                counter++;
        System.out.println(counter);
    }

    public static boolean findCoPrimePair(int k) {
        boolean isHasCoPrime = false;
        int n = k;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                if (n > 1) {
                    //System.out.println(k + ": "+ i + " and " + n);
                    isHasCoPrime = true;
                }
            }
        }
        return isHasCoPrime;
    }
}