import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n = Short.parseShort(scanner.next());
        short m = Short.parseShort(scanner.next());
        HashMap<String, String> words = new HashMap<>();
        for (int i = 0; i < m; i++) {
            words.put(scanner.next(), scanner.next());
        }
        ArrayList<String> lecture = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lecture.add(scanner.next());
        }
        solve(lecture, words);
    }

    public static void solve(ArrayList<String> lecture, HashMap<String, String> words){
        for (int i = 0; i < lecture.size(); i++) {
            if (words.get(lecture.get(i)).length() < lecture.get(i).length())
                lecture.set(i, words.get(lecture.get(i)));
        }
        for (int i = 0; i < lecture.size() - 1; i++) {
            System.out.print(lecture.get(i) + " ");
        }
        System.out.println(lecture.get(lecture.size() - 1));
    }
}
