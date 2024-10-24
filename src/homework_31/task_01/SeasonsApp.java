package homework_31.task_01;

public class SeasonsApp {
    public static void main(String[] args) {
        for(Seasons seasons : Seasons.values()){
            System.out.println(seasons);
            System.out.println(seasons.getRussianName());
            System.out.println(seasons.getAverageTempSeasons());
            System.out.println(seasons.printMethod());
            System.out.println("===========\n");

        }

    }

}
