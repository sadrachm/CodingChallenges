package Week4.SecondMax;
import java.util.*;
public class SecondMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int first = in.nextInt();
            int second = in.nextInt();
            int third = in.nextInt();
            int[] lst = new int[]{first, second, third};
            Arrays.sort(lst);
            System.out.println(lst[1]);
        }
    }
}