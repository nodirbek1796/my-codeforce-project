import java.util.*;

public class EqualRectangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        while ((cases--) != 0) {
            int n = scanner.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            int temp = n * 4;
            while ((temp--) != 0) {
                list.add(scanner.nextInt());
            }
            list.sort(Comparator.comparingInt(o -> o));
            boolean state=true;
            for (int i = 0; i < list.size()-1; i+=2) {
                if(!list.get(i).equals(list.get(i+1))){
                    state=false;
                    System.out.println("NO");
                    break;
                }
            }
            if(state){
                int lastIndex = list.size() - 1;
                TreeSet<Integer> couple = new TreeSet<>();
                for (int j = 0; j < list.size() / 2; j++) {
                    couple.add(list.get(j) * list.get(lastIndex--));
                }
                if (couple.size() == 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
