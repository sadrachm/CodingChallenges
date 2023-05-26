package Week3.IntersectionChallenge;

import lombok.Data;

@Data
public class Node {    
    public Node next = null;
    public int data = 0;
    public Node(int val) {
        this.data = val;
    }
}
