package Week3.LoopDetectionChallenge;
import java.util.HashSet;

import Week3.IntersectionChallenge.Node;

public class LoopDetection {
    public static Node check(Node e) {
        HashSet<Node> dict = new HashSet<>();
        while (e != null) {
            if (dict.contains(e)) return e;
            dict.add(e);
            e = e.next;
        }
        return null;
    }
}
