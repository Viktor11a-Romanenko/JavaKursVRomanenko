package lesson_08;

import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {

        int[] array;
        String[] string;
        //int array[];

        array = new int[4];
        string = new String[10];

        int[] array2 = new int[8];

        boolean[] booleans = new boolean[3];

        int value = array[0];
        System.out.println("value: " + value);
        System.out.println("array2[3]: " + array2[3]);
        System.out.println("string[9]: " + string[9]);
        System.out.println("booleans [1]: " + booleans[1]);

        System.out.println("array: " + array);

        int[] numbers = new int[]{45, 56, -16, 0, 159};
        int[] ints = {-10, 54, 32333, 444};

        int val = numbers[0];
        System.out.println("val: " + val);
        System.out.println(numbers[4]);

        numbers[2] = 100;

        System.out.println("Вывести все значения масива");
        int j = 0;
        while (j < numbers.length) {
            System.out.print(numbers[j++] + " ; ");

        }
        System.out.println();

        //
        int[] nums = new int[10];
        Random random = new Random();
        int k = 0;
        System.out.print("[");
        while (k < nums.length) {
            nums[k] = random.nextInt(101);
            System.out.print(nums[k] + " , ");
            k++;
        }

        System.out.println("]");

        int min = nums[0];
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < min) {
                min = nums[i];
            }

            i++;
        }

        System.out.println(min);


    }
}
