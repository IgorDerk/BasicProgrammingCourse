package homework_46;
/*
Task 1
Получить и вывести на экран:
текущую дату
текущий год, месяц и день
Создать дату, например Ваш день рождения и вывести на экран
Создать две даты и проверить на равенство
Получить и вывести на экран:
текущее время
текущее время + 3 часа
Создать дату:
которая на неделю позже сегодняшней
которая была на год раньше сегодняшней используя метод minus
которая на год позже сегодняшней
tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
 */

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class task_01 {
    public static void main(String[] args) {


        LocalDate currentDate = LocalDate.now();
        System.out.println("Текущая дата: " + currentDate);

        int currentYer = currentDate.getYear();
        int currentMonth = currentDate.getMonthValue();
        int currentDay = currentDate.getDayOfMonth();
        System.out.printf("Текущий год: %d, месяц: %d, день: %d\n", currentYer, currentMonth, currentDay);

        LocalDate birthday = LocalDate.of(1988, Month.FEBRUARY, 26);
        System.out.println("Мой день рождения: " + birthday);

        LocalDate date1 = LocalDate.of(2024, 11,14);
        LocalDate date2 = LocalDate.of(2024, 11,15);
        System.out.println("Даты равны? " +date1.equals(date2));

        LocalTime currentTime = LocalTime.now();
        System.out.println("Текущее время: " + currentTime);

        LocalTime timePlus3Hours = currentTime.plusHours(3);
        System.out.println("Текущее время + 3 часа: " + timePlus3Hours);

        LocalDate nextWeek = currentDate.plusWeeks(1);
        System.out.println("Дата через неделю: " + nextWeek);

        LocalDate oneYerAgo = currentDate.minusYears(1);
        System.out.println("Дата год назад: " + oneYerAgo);

        LocalDate oneYerLatter = currentDate.plusYears(1);
        System.out.println("Дата через год: " + oneYerLatter);

        LocalDate tomorrow = currentDate.plusDays(1);
        LocalDate yesterday  = currentDate.minusDays(1);
        System.out.println(tomorrow + " после сегодняшней даты: " + tomorrow.isAfter(currentDate));
        System.out.println(yesterday + " перед сегодняшней даты: " + tomorrow.isBefore(currentDate));

    }

}
