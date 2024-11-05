package homework_39.task_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListApp {

    public static Collection<Integer> methodRetain( Collection<Integer> list1,  Collection<Integer> list2){
        list2.retainAll(list1);
        return  list2;
    }
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        Collection<Integer> list2 = new ArrayList<>(List.of(3, 4, 5, 6, 7));

        Collection<Integer> result = methodRetain(list1, list2);
        System.out.println(result);

    }
}

