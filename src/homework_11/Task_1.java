package homework_11;


public class Task_1 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 10};
        int totalSum = sum(arr);
        System.out.println("Сумма всех элементов массива: " + totalSum);


    } //main

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        return sum;
    }


}//end
