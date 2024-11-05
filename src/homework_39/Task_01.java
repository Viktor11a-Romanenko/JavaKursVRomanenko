package homework_39;
/*
Task 1
Напишите метод, который принимает на вход две реализации интерфейса List.
Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Task_01 {
    public static void main(String[] args) {

        Collection<Integer> numbers = new ArrayList<>();
        Collection<Integer> numbers1 = new ArrayList<>();
        numbers.addAll(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        numbers1.addAll(List.of(2, 4, 6, 8));
        System.out.println("numbers: " + numbers);
        System.out.println("numbers1: " + numbers1);
        numbers.retainAll(numbers1);
        System.out.println(numbers);


    }
}
