package Week3.IntersectionChallenge;
public class IntersectionTest {    

    public static void main(String[] args) {        
        Node a = new Node(1); 
        Node b = new Node(2); 
        a.next = b;
        Node c = new Node(3); 
        b.next = c;
        Node d = new Node(4); 
        Node e = new Node(5); 
        d.next = e;
        Node f = new Node(6);
        e.next = f;
        System.out.println(Intersection.check(a, d));
        f.next = c;
        System.out.println(Intersection.check(a,d));
    }
}
