package homework_31;

public enum Seasons {
    WINTER("Зима", 3),
    SPRING("Весна", 12),
    SUMMER("Лето", 20),
    FALL("Осень", 14);

    private final String russianName;
    private final int avergeTempSeasons;

    Seasons(String russianName, int avergeTempSeasons) {
        this.russianName = russianName;
        this.avergeTempSeasons = avergeTempSeasons;
    }

    public String getRussianName() {
        return russianName;
    }

    public int getAvergeTempSeasons() {
        return avergeTempSeasons;
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "russianName='" + russianName + '\'' +
                ", avergeTempSeasons=" + avergeTempSeasons +
                '}';
    }
}
