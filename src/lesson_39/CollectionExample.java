package lesson_39;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {

        // Интерфейс Collection гарантирует наличие базовых методов для всех расширяющих его интерфейсов
        //Это позволяет единообразно обрабатывать различные типы коллекций.
        //Создаем коллекцию строк
        //Ссылка типа интерфейс -> а справа мы можем подставить объект разных классов (получить разные реализации этого интерфейса)

        //строки
        Collection<String> strings = new ArrayList<>();
        System.out.println("\n======= int size() ========== \n ");
        //int size() - возвращает кол-во элементов в коллекции
        System.out.println("strings.size(): " + strings.size());

        System.out.println("\n======= boolean isEmpty() ========== \n ");

        //  boolean isEmpty() - возвращает true, если коллекция пуста
        System.out.println("strings.isEmpty(): " + strings.isEmpty());

        System.out.println("\n======== add +  toString ========= \n ");

        // boolean add(T t) - добавляет элемент в коллекцию
        strings.add("Java");
        strings.add("Python");

        // Переопределенные метод toString для красивого вывода элементов коллекции
        System.out.println(strings); // автоматически делает toString

        System.out.println("\n========  .of() ========= \n ");

        //.of() - это статический метод в нескольких интерфейсах и классах. Был введен в Java 9
        //Создает неизменяемый экземпляр коллекции из предоставленных элементов
        //Доступен для List, Set, Map
        Collection<Integer> integers = List.of(0, 1, 2, 3, 4, 5);
        System.out.println("integers: " + integers);
        //integers.add(6);// error попытка модифицировать (изменить) неизменяемую коллекцию приведет к ошибки (Исключительной ситуации)
        //System.out.println("integers: " + integers);

        System.out.println("\n======== .addAll(List.of()) ========= \n ");

        //.addAll(List.of()) - addAll(Collection<? extends T> col) - добавляет все элементы из указанной коллекции в текущую (сложения)
        strings.addAll(List.of("JS", "Banana", "Cat"));
        System.out.println(strings);
        System.out.println("\n======== .removeAll(List.of()) ========= \n ");


        // .removeAll(List.of)) -  boolean removeAll(Collection<?> col) - удаляет все элементы из коллекции вызова, содержащиеся в коллекции сol (вычитание)
        Collection<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(0, 1, 2, 3, 4, 5));

        System.out.println("numbers: " + numbers);
        numbers.removeAll(List.of(1, 2, 3));
        System.out.println(numbers);

        // boolean retainAll(Collection<?> col) - Оставляет в коллекции вызова только те элементы, которые содержаться в коллекции col
        //Удаляет из коллекции вызова элементы, которые НЕ содержаться в коллекции col - (пересечение)
        Collection<Integer> colA = new ArrayList<>();
        Collection<Integer> colB = new ArrayList<>();
        colA.addAll(List.of(10, 20, 30, 20, 40, 50));
        colB.addAll(List.of(20, 30, 40));
        System.out.println("colA: " + colA);
        System.out.println("colB: " + colB);
        colA.retainAll(colB);
        System.out.println(colA);


    }
}
