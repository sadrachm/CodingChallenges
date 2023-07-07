package Week4.SumOfDigits;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfDigitsTest {
    @Test
    public void testing() {
        assertEquals(SumOfDigits.testing("ab1231da"), 7);
    }
    @Test
    public void practice() {
        List<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(2);
        x.add(2);
        x.add(2);
        x.add(2);
        x.add(2);
        Iterator e = x.iterator();
        while (e.hasNext()) {
            Integer i = (int) e.next();
            if (i == 1) {
                e.remove();
            }
        }
        for (int i : x) {
            System.out.println(i);
        }
    }
    @Test
    public void compareToPractice() {
        List<Object> el = new ArrayList<>();
        Student a = new Student(1,"Sad");
        Student b = new Student(3,"Sad");
        Student c = new Student(4,"Sad");
        Student d = new Student(5,"Sad");
        Student e = new Student(6,"Sad");
        el.add(a);el.add(b);el.add(c);el.add(d);el.add(e);el.add(a);
//        Collections.sort(el);

    }
}
