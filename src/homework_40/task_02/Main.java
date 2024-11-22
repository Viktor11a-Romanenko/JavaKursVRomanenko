package homework_40.task_02;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

        System.out.println("union: " + SetUtils.union(set1, set2));
        System.out.println("intersection: " + SetUtils.intersection(set1, set2));
        System.out.println("difference: " + SetUtils.difference(set1, set2));
    }

}
