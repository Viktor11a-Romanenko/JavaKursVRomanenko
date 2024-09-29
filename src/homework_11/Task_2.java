package homework_11;

import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        double mean = mean(arr);
        System.out.println(mean);

    }// main

    public static double mean(int[] arr) {

        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.println("Элемент массива [" + i + "] = " + arr[i]);
            sum += arr[i];

        }

        return (double) sum / arr.length;
    }
}// end
