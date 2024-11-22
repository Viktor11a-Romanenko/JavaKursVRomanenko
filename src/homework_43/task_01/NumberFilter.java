package homework_43.task_01;

import java.util.List;
import java.util.stream.Collectors;

public class NumberFilter {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 12, 44, 102, 8, 99, 55, 66, 120);
        List<Integer> filteredNumbers = filterNumbers(numbers);
        System.out.println(filteredNumbers);
    }

    public static List<Integer> filterNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num % 2 == 0)
                .filter(num -> num > 10)
                .filter(num -> num < 100)
                .collect(Collectors.toList());
    }
}
