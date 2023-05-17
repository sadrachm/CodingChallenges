package Week3.IntersectionChallenge;
import java.util.*;
public class Intersection {
    public static boolean check(Node a, Node b) {
        while (a != null) {
            Node temp = b;
            while (temp!=null) {
                if (a==temp) {
                    return true;
                }
                temp = temp.next;
            }
            a = a.next;
        }
        return false;
    }

    public static void main(String args[]) {
    }
}
