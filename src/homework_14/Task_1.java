package homework_14;

public class Task_1 {
    public static void main(String[] args) {
        int[] ints = {1, 4, 9, 2, 8, 3};
        int sum = sum(ints);
        System.out.println("Сумма четных чисел: " + sum);

    }//main

    public static int sum(int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                sum += ints[i];
            }//if

        }//for
        return sum;

    }

}//end
