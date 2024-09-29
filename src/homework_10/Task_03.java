package homework_10;

/*
Task 3
Написать метод, принимающий на вход массив целых чисел.
Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве

вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
 */
public class Task_03 {
    public static void main(String[] args) {
        int[] array = {0, 13, -25, 11, 31, 55, 98, 11, 5};

        int[] result = filterPrimes(array);

        System.out.print("Простые числа: {");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println("}");

    }

    public static int[] filterPrimes(int[] array) {

        int primeCount = 0;
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if (isPrime(number)) {
                primeCount++;
            }
        }
        int[] primes = new int[primeCount];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if (isPrime(number)) {
                primes[index] = number;
                index++;
            }
        }

        return primes;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
