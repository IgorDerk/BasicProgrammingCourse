package homework_31.task_01;

/*
Task 1
Реализуйте Enum для определения четырех времен года с методами, возвращающими среднюю температуру для каждого времени года.
 */
public enum Seasons {

    WINTER("Зима", 3),
    SPRING("Весна", 12),
    SUMMER("Лето", 20),
    FALL("Осень", 14);

    private final String russianName;
    private final int averageTempSeasons;

    Seasons(String russian, int temp) {
        this.russianName = russian;
        this.averageTempSeasons = temp;
    }


    public int getAverageTempSeasons() {
        return averageTempSeasons;
    }

    public String getRussianName() {
        return russianName;
    }

    @Override
    public String toString() {
        return "Сезон: " + this.russianName +
                ", средняя температура: " + this.averageTempSeasons + "°C";
    }
}

