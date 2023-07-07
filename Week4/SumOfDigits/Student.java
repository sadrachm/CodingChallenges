package Week4.SumOfDigits;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student implements Comparable<Student> {
    private int id;
    private String name;
    @Override
    public int compareTo(Student o) {
        if (o.id > this.id) return -1;
        if (o.id < this.id) return 1;
        return 0;
    }
}
