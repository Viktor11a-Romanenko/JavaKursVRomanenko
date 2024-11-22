package homework_31;

public class SeasonsApp {
    public static void main(String[] args) {
        for (Seasons seasons : Seasons.values()) {
            System.out.println(seasons);
            System.out.println(seasons.getRussianName());
            System.out.println(seasons.getAvergeTempSeasons());
            System.out.println(seasons.toString());
            System.out.println("===========\n");

        }

    }
}
