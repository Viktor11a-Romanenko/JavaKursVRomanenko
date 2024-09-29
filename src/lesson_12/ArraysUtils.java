package lesson_12;

public class ArraysUtils {
    // Метод линейного поиска элемента в массиве
    // Осуществляется перебором всех элементов и сравниванием с искомым значением
    // Если значений найдено - возвращается индекс элемента массива
    // Если не найдено - возвращается -1

    // Однозначно сказать, что число отсутствует в массиве?
    // Потребуется перебрать абсолютно все элементы массива -> O(n)

    public static int linearSearch(int[] array, int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }

        return -1;
    }

    public static int minIndex(int[] array) {// поиск минимального занчения
        int min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) ;
            min = array[i];
            minIndex = 1;


        }
        return minIndex;

    }

    public static int minIndex(int[] array, int startIndex) {// ищем дальше без учета 1 масива меньшего
        int min = array[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }


        }

        return minIndex;
    }

    public static void sortSelection(int[] array) {//сортировка

        for (int i = 0; i < array.length; i++) {
            int localMin = minIndex(array, i);

            int temp = array[i];// нужен новый тип, чтобы сохранить данный при замене
            array[i] = array[localMin];
            array[localMin] = temp;
        }

    }

    public static int[] copyOfArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    //
    public static int binarySearch(int[] array, int searchValue) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;
        int counter = 0;
        while (startIndex <= endIndex) {
            counter++;
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (array[middleIndex] == searchValue) {
                System.out.println("Найдено за " + counter + " шагов");
                return middleIndex;
            }
            //
            if (array[middleIndex] > searchValue) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex;
            }
        }
        //
        System.out.println("Значение не найдено! Шагов сделано: " + counter);
        return -1;

    }

}// end
