package homework_16;

public class MagicArray2 {
    public static void main(String[] args) {
        int[] x = {0, 1, 2, 3, 4, 5, 6, 7};

        MagicArray_hw magicArray_hw = new MagicArray_hw();
        magicArray_hw.add(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(magicArray_hw.toString());

        int index = magicArray_hw.indexOf(100);

        magicArray_hw.remove(3);
        magicArray_hw.add(1555);
        System.out.println(magicArray_hw.toString());


    }


}
