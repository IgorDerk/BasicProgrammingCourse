package homework_46;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

/*
Task 2
Написать метод, принимающий список из нескольких дат типа LocalDate и возвращающий количество дней между самой ранней
и поздней датами в этом списке
 */
public class task_02 {
    public static void main(String[] args) {

        List<LocalDate> dates = List.of(
                LocalDate.of(1961, 11, 30),
                LocalDate.of(1985, 4, 12),
                LocalDate.of(2024, 11, 14)
        );
        if (dates == null || dates.isEmpty()) throw new IllegalArgumentException("Список дат не должен быть пустым");

        LocalDate dateAgo = dates.stream().min(LocalDate::compareTo).orElseThrow();
        LocalDate dateLetter = dates.stream().max(LocalDate::compareTo).orElseThrow();

        long daysBetween = ChronoUnit.DAYS.between(dateAgo, dateLetter);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDateAgo = dateAgo.format(formatter);
        String formattedDateLetter = dateLetter.format(formatter);



        System.out.println("Количество дней между самой ранней \"" + formattedDateAgo + "\" и поздней \"" + formattedDateLetter + "\" датами: " + daysBetween + " дня");
    }

//    private static long DaysBetweenAgoAndLatter(List<LocalDate> dates) {
//
//        if (dates == null || dates.isEmpty()) throw new IllegalArgumentException("Список дат не должен быть пустым");
//        LocalDate dateAgo = dates.stream().min(LocalDate::compareTo).orElseThrow();
//        LocalDate dateLetter = dates.stream().max(LocalDate::compareTo).orElseThrow();
//
//
//        return ChronoUnit.DAYS.between(dateAgo, dateLetter);
//    }

}
