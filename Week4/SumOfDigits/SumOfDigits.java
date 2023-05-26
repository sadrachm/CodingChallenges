package Week4.SumOfDigits;
import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int val = in.nextInt();
        for (int i = 0; i < val; i++) {
            String inp = in.nextLine();
            System.out.println(SumOfDigits.testing(inp));
        }
    }
    public static int testing(String val) {
        int sum = 0;
        for (int i = 0; i < val.length(); i++) {
            if (val.charAt(i) >47 && val.charAt(i) <57) {
                sum+=val.charAt(i)%48;
            }
        }
        return sum;
    }
}