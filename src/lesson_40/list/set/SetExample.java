package lesson_40.list.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set = new HashSet<>(20);
        set = new HashSet<>(List.of(1, 2, 3, 5, 6, 6, 5, 3));
        System.out.println(set);
    }
}
