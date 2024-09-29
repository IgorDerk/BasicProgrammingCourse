package homework_07;

import java.util.Random;

/*
Task 5 * (Опционально)
Используйте оператор switch для решения задачи:

Ваш ребенок принес оценку за контрольную работу по математике. В школе 12-балльная система. Запишите в переменную случайное число от 0 до 12.

Вы разрешаете ребенку смотреть телевизор не более 60 минут в день. На сегодня у него осталось 45 минут.

Если оценка от 10 до 12 баллов: скажите ребенку, как вы рады, и добавьте к оставшемуся времени 1 час.
Оценка от 7 до 9 баллов: похвалите ребенка и добавьте 45 минут.
Оценка от 4 до 6 баллов: нейтрально отнеситесь и добавьте 15 минут.
Оценка 3 балла: огорчитесь и вычтите 30 минут.
Оценка меньше 3 баллов: запретите телевизор на сегодня.
Выведите на экран оставшееся время для просмотра ТВ.

P.S. Проконтролируйте, чтобы ребенок не смотрел ТВ больше 60 минут в день.
 */
public class Task_05 {
    public static void main(String[] args) {
        Random random = new Random();
        int assessment = random.nextInt(13);
        int maxTime = 60;
        int remainingTime = 45;


        System.out.println("Ты получил оценку " + assessment);
        switch (assessment) {
            case 10:
            case 11:
            case 12:
                remainingTime += 60;
                System.out.println("Я очень рад, ты мог бы смотреть телевизор еще " + (remainingTime) + " минут.");


                break;
            case 9:
            case 8:
            case 7:
                remainingTime += 45;
                System.out.println("Молодец, ты мог бы смотреть телевизор еще " + (remainingTime) + " минут.");

                break;
            case 4:
            case 5:
            case 6:
                remainingTime += 15;
                System.out.println("Пойдет, ты можешь смотреть телевизор еще " + (remainingTime) + " минут.");
                break;
            case 3:
                remainingTime -= 30;
                System.out.println("Я огорчен, ты можешь смотреть телевизор еще " + (remainingTime) + " минут.");
                break;
            default:
                System.out.println("Я запрещаю тебе телевизор на сегодня!");
                remainingTime = 0;
        }

        // Проконтролируйте, чтобы ребенок не смотрел ТВ больше 60 минут в день.
        if (maxTime < remainingTime) {
            remainingTime = maxTime;
            System.out.println("Но т.к. ТВ больше 60 минут в день нельзя смотреть, то тебе сегодня можно, только " + remainingTime + " минут смотреть.");
        }
    }
}
