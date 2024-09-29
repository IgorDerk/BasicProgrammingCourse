package additionally_03;

/*
Task 3 * (Опционально)
Пусть цена товара A составляет 1000 Euro, а товара B составляет 500 Euro.

Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.

Выведите на экран значение переменной, которая соответствует стоимости товаров A+B со скидкой.
Отдельно выведите на экран сумму скидки для этой покупки (в деньгах).
 */
/*
Task 3 * (Опционально)
Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю (или придумайте :) ).

Вычислите среднюю температуру за неделю и выведете ее на печать.
 */
public class Task_03 {
    public static void main(String[] args) {
        double A = 1000;
        double B = 500;
        int discount = 10;
        double discountMoney = (A + B) * discount / 100;

        //Option 1
        double priceWithDiscount = A+B -discountMoney;

        //Option 2
        double priceWithDiscount2 = (A+B)+(100-discount)/100;

        System.out.println(discountMoney);
        System.out.println(priceWithDiscount);
        System.out.println(priceWithDiscount2);

        System.out.println("==============\n");

        int t1 = 23;
        int t2 = 15;
        int t3 = 27;
        int t4 = 18;
        int t5 = 29;
        int t6 = 20;
        int t7 = 17;

        int days = 7;
        int sumTmp = t1+t2+t3+t4+t5+t6+t7;

        double average = sumTmp/(double) days;
        System.out.println(average);

    }
}
