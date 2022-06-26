package thirdday;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTest1 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5,6));
        System.out.print(set2.remove(5));
        System.out.print(set2.remove(1));
    }
}
