package homework_38.task_01;

import java.util.Comparator;

public class SportsmanScoreComparator implements Comparator<Sportsman> {

    @Override
    public int compare(Sportsman sportsman1, Sportsman sportsman2) {


        return Integer.compare(sportsman1.getScore(), sportsman2.getScore());
    }
}
