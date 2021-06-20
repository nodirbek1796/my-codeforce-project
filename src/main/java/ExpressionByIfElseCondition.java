import java.util.Scanner;

public class ExpressionByIfElseCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        solve(scanner.nextByte(), scanner.nextByte(), scanner.nextByte());
    }

    public static void solve(byte a, byte b, byte c){
        int result;
        if (a == 1){
            if (c == 1){
                result = a + b + c;
            }else
                result = (a + b) * c;
        }else {
            if (b == 1){
                if (c == 1){
                    result = a * (b + c);
                }else{
                    if (a >= c)
                        result = a * (b + c);
                    else
                        result = (a + b) * c;
                }
            }else {
                if (c == 1)
                    result = a * (b + c);
                else
                    result = a * b * c;
            }
        }
        System.out.println(result);
    }
}
