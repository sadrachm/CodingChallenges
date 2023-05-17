package Week3.LoopDetectionChallenge;

import Week3.IntersectionChallenge.Node;

public class LoopDetectionTest {
    public static void main(String[] args) {
        
        Node a = new Node(1); 
        Node b = new Node(2); 
        a.next = b;
        Node c = new Node(3); 
        b.next = c;
        Node d = new Node(4); 
        c.next=d;
        Node e = new Node(5); 
        d.next = e;
        e.next=c;
        System.out.println("Should be 3 : " +  LoopDetection.check(a).data);
         
    }
}
