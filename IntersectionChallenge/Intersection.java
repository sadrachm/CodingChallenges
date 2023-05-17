package IntersectionChallenge;
import java.util.*;
public class Intersection {
    Node a = null;
    Node b = null;
    public Intersection(Node a, Node b) {
        this.a = a;
        this.b = b;
    }
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
        System.out.println("Hello World");
    }
}
