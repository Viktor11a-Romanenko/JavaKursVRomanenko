package lesson_19;

import java.util.Arrays;
import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {

        int[] array = {3, 2, 1, 0};

        String arrayToString = Arrays.toString(array);
        System.out.println(arrayToString);

        System.out.println("\n ======= Сортировка массива ========== \n ");
        Arrays.sort(array);//полная сортировка
        // Arrays.sort(array, 1, 3); //сортировка части массива -> от начального включительно до конечного не включительно индекса
        System.out.println(Arrays.toString(array));

        System.out.println("\n ======= Бинарный поиск ========== \n ");
        //binarySearch -> массивл должен быть отсортирован
        //
        int index = Arrays.binarySearch(array, 3);
        System.out.println("index: " + index);

        System.out.println("\n ======= Сравнение массивов на равенство ========== \n ");
        int[] test = {0, 2, 1, 3};
        //  System.out.println("array.equals(test): " + array.equals(test)); // мы не можем корректно сравнить массивы "по значению" методом equels

        boolean isArraysEquals = Arrays.equals(array, test);
        System.out.println("Arrays.equals(array,test): " + isArraysEquals);

        //difference
        int mismatchIndex = Arrays.mismatch(array, test);
        System.out.println("Arrays.mismatch(array, test): " + mismatchIndex);

        System.out.println("\n ======= Многмерный массив ========== \n ");
        int[][] arrayD = new int[3][4];
        System.out.println(Arrays.deepToString(arrayD));//

        int[][] arrayC = new int[3][4];
        boolean isEquals = Arrays.deepEquals(arrayD, arrayC);
        System.out.println("Arrays.deepEquals(arrayD,arrayC): " + isEquals);
        arrayC[0][3] = 1;
        arrayC[2][2] = 5;
        System.out.println(Arrays.deepToString(arrayC));
        isEquals = Arrays.deepEquals(arrayD, arrayC);
        System.out.println("Arrays.deepEquals(arrayD,arrayC): " + isEquals);

        System.out.println("\n ======= copyOf ========== \n ");

        int[] copoOfTest = Arrays.copyOf(test, 10);
        System.out.println(Arrays.toString(copoOfTest));
        copoOfTest = Arrays.copyOf(test, 2);
        System.out.println(Arrays.toString(copoOfTest));

        System.out.println("\n ======= copyOfRange ========== \n ");
        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] rangeFromInts = Arrays.copyOfRange(ints, 3, 10);
        System.out.println("Arrays.copyOfRange(ints, 3, 10): " + Arrays.toString(rangeFromInts));

        int[] copyOfInts = Arrays.copyOf(ints, ints.length);
        System.out.println("Arrays.copyOf(ints,ints.length): " + Arrays.toString(copyOfInts));
        copoOfTest = Arrays.copyOfRange(ints, 0, ints.length);
        System.out.println("Arrays.copyOfRange(ints, 0, ints.length): " + Arrays.toString(copoOfTest));

        System.out.println("\n ======= System.arraycopy ========== \n ");
        /*

         */

        int[] target = new int[10];
        System.arraycopy(ints, 9, target, 3, 5);
        System.out.println(Arrays.toString(target));

        System.out.println("\n ======= fill ========== \n ");
        int[] arr = new int[5];
        Arrays.fill(arr, 10);
        Arrays.fill(arr, 2, 4, 1000);
        Random random = new Random();
        Arrays.fill(arr, random.nextInt(101));
        System.out.println(Arrays.toString(arr));

    }
}
