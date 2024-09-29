package homework_10;

public class Task_01 {
    public static void main(String[] args) {
        /*
        Написать метод со следующим функционалом:
        На вход метод принимает массив целых чисел и число - длину нового массива.
        Метод должен создать и распечатать массив заданной в параметрах длинны.
        В начало массива должны быть скопированы элементы из входящего массива:
         */
        int[] x = {1, 2, 3, 4, 5, 6};
        int i = 3;
        copy(x, i);
        int[] y = {1, 2, 3};
        int i2 = 5;

    }// main

    public static void copy(int[] x, int newLength) {
        int[] newArray = new int[newLength];
        int i = 3;
        System.out.print("{");
        while (i < newLength && i < x.length) {
            newArray[i] = x[1];
            i++;
        }
        i = 0;
        while (i < newLength) {
            System.out.print(newArray[i]);
            if (i < newLength - 1) {
                System.out.print(", ");
            }
            i++;
        }
        System.out.println("}");

    }

}// end
