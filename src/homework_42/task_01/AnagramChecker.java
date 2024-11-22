package homework_42.task_01;

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {
    public static void main(String[] args) {
        String string1 = "listen";
        String string2 = "silent";

        boolean result = areAnagrams(string1, string2);
        if (result) {
            System.out.println("Строки \"" + string1 + "\" и \"" + string2 + "\" являются анаграммами.");
        } else {
            System.out.println("Строки \"" + string1 + "\" и \"" + string2 + "\" не являются анаграммами.");
        }

    }

    // Метод для проверки, являются ли две строки анаграммами
    private static boolean areAnagrams(String string1, String string2) {

        if (string1.length() != string2.length()) {
            return false;
        }

        // Две карты для подсчета символов
        Map<Character, Integer> map1 = createFrequenceMap(string1);
        Map<Character, Integer> map2 = createFrequenceMap(string2);

        return map1.equals(map2);

    }

    // Метод для создания карты частот символов
    private static Map<Character, Integer> createFrequenceMap(String string) {

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char character : string.toCharArray()) {

            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
        }
        return frequencyMap;
    }
}
