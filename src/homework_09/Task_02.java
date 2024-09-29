package homework_09;
/*
Task 2
Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени этоЧисло

Например: Если в метод пришло число 3 - метод должен вывести число 8 (так как 2 в степени 3 = 8)

класс Math для нахождения степени числа использовать нельзя ;)
 */
public class Task_02 {
    public static void main(String[] args) {
printPower(-2);
    }




    public static void printPower(int pow){

        boolean isPositive = pow >=0;

        pow = (isPositive) ? pow : pow * -1;
      /*  if (isPositive){
            pow = pow * (-1);
        }*/
        int result = 1;
        int i = 0;
        while (i < pow){
            result *= 2;
            i++;
        }
        System.out.println(result);
        if(isPositive){
            System.out.printf("2 ^ %d\n", pow, result);
        }else{
            System.out.printf("2 ^ -%d = %4.f\n", pow, 1/ (double)result);
        }
    }


}
