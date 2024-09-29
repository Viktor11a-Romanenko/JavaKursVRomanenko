package homework_09;

public class Task_05 {
    public static void main(String[] args) {
        String[] string = {"One", "Two", "Twenty"};
        print(string);


    }//main

    public static void print(String[] string) {
        String longes = string[0];
        for (int i = 1; i < string.length; i++) {
            if (string[i].length() > longes.length()) {
                longes = string[i];
                System.out.println(longes);
            }

        }
        for (int i = 0; i < longes.length(); i++) {
            System.out.println(longes.charAt(i));
        }

    }


}//end
