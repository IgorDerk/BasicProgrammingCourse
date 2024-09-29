package homework_03;

public class HomeWork03 {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1: \n");
        int age = 36;
        double price = 0.99;
        String name = "Igor";

        System.out.println("My age is  " + age + " years old");
        System.out.println("The price of milk in Germany is " + price);
        System.out.println("My name is " + name);
        System.out.println();

        // Task 2
        System.out.println("Task 2: \n");
        int var1 = 0;
        int var2 = 1;
        int var3 = 2;
        int var4 = 3;
        int sumVar = (var1 + var2 + var3 + var4) / 4;
        int rest = (var1 + var2 + var3 + var4) % 4;
        double sumVarDouble = (var1 + var2 + var3 + var4) / 4.0;
        double difference = sumVarDouble - sumVar;


        System.out.println("The arithmetic mean of the values of the variables in the whole number: " + sumVar);
        System.out.println("Rest: " + rest);
        System.out.println("The arithmetic mean of the values of variables in decimal: " + sumVarDouble);
        System.out.println("The difference between these numbers: " + difference);
        System.out.println();

        // Task 3.0 (optional)
        System.out.println("Task 3.0: \n");
        double productA = 1000;
        double productB = 500;
        int discount = 10;
        double discountedSum = (productA + productB) * discount / 100;
        double priceDiscount1 = (productA + productB) * (100 - discount) / 100;
        double priceDiscount = (productA + productB) - discountedSum;

        System.out.println("The cost of discounted A+B products: " + priceDiscount);
        System.out.println("The cost of discounted A+B products 1: " + priceDiscount1);
        System.out.println("Discount amount : " + discountedSum);
        System.out.println();


        // Task 3.1 (optional)
        System.out.println("Task 3.1: \n");
        int temperature_02_09_24 = 25;
        int temperature_03_09_24 = 30;
        int temperature_04_09_24 = 30;
        int temperature_05_09_24 = 28;
        int temperature_06_09_24 = 27;
        int temperature_07_09_24 = 30;
        int temperature_08_09_24 = 29;

        int sumDaysInt = temperature_02_09_24 + temperature_03_09_24 + temperature_04_09_24 + temperature_05_09_24 + temperature_06_09_24 + temperature_07_09_24 + temperature_08_09_24;
        double sumDaysDouble = sumDaysInt;

        int averageTemperaturePerWeekInt =  sumDaysInt / 7;
        double averageTemperaturePerWeekDouble = (double) sumDaysInt / 7;
        double averageTemperaturePerWeekDouble1 =  sumDaysInt / 7.0;

        double averageSumDays = sumDaysDouble / 7;

        // TODO


        //System.out.println("The average temperature in Rostock over the past week : " + averageTemperaturePerWeek);
        System.out.println("The average temperature in Rostock over the past week : " + averageTemperaturePerWeekInt);
        System.out.println("The average temperature in Rostock over the past week : " + averageTemperaturePerWeekDouble);
        System.out.println("The average temperature in Rostock over the past week : " + averageTemperaturePerWeekDouble1);
        System.out.println("The average temperature in Rostock over the past week : " + averageSumDays);

        // Task 4 (theoretical)

        /*
        - При делении целого числа на 2 возможны остатки 0 (если число четное) и 1 (если число нечетное).
        - При делении целого числа на 3 возможны остатки 0 (если число делится на 3) и 1 (если остаток от отделения на 3 равен 1) и 2 (если остаток от отделения на 3 равен 1).
         */


    }
}


