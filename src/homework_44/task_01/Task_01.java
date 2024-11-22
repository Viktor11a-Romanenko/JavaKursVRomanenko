package homework_44.task_01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task_01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(5, 23, 15, 42, 8, 67, 89, 11, 34, 78, 101));

        List<Integer> result = numbers.stream()
                .filter(i -> i > 10)
                .sorted((i1, i2) -> Integer.compare(i1 % 10, i2 % 10))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
