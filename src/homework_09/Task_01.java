package homework_09;

public class Task_01 {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 6, 7};
        printArrayReverse(array);
        printArrayReverse(array, 2);

    }//main

    public static void printArrayReverse(int[] array) {
        int i = array.length - 1;
        System.out.print("Массив в обратном порядке:" + " { ");

        while (i >= 0) {
            
            System.out.print(array[i] + " ");
            i--;

        }
        System.out.println(" } ");

    }
    // не получаеться todo

    public static void printArrayReverse(int[] array, int index) {
        int i = array.length - 1;
        System.out.print("Массив в обратном порядке + index :" + " { ");
        while (i <= index) {
            System.out.print(array[i] + " ");
            i++;
        }


    }

}//en
