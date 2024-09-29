package homework_10;

public class Task_02 {
    public static void main(String[] args) {
        String[] array = new String[]{"one", "java", "twenty"};
        findStr(array);
        String[] array2 = findStr(array);
        System.out.println(array2[0]);
        System.out.println(array2[1]);


    }//main

    public static String[] findStr(String[] array1) {
        int max = array1[0].length();
        int indexMax = 0;
        int min = array1[0].length();
        int indexMin = 0;
        for (int i = 1; i < array1.length; i++) {
            if (array1[i].length() > max) {
                max = array1[i].length();
                indexMax = i;
            }//ifMax
            if (array1[i].length() < min) {
                min = array1[i].length();
                indexMin = i;
            }//ifMin
        }//for
        String[] result = new String[2];
        result[0] = array1[indexMax];
        result[1] = array1[indexMin];
        return result;

    }
}//end
