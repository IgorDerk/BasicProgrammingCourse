package homework_27.task_01and02;
/*
Task 1 and Task 2
 */

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }



    /*

    Task 1
    Закончить реализацию метода проверки email на валидность в классе Person
    Требования к email:
    test@email.com.net
    1. Должна присутствовать @ и только одна - done
    2. Точка после собаки - done
    3. После последней точки есть 2 или более символов
    4. Алфавит, цифры, '-', '_', '.', '@'
    5. До собаки должен быть хотя бы 1 символ
    6. Первый символ - должна быть буква
     */

    private boolean isEmailValid(String email) {

        // 1. Должна присутствовать @
        int indexAt = email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

        // 2. Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;

        //  3. После последней точки есть 2 или более символов
        if (email.length() - dotIndexAfterAt < 3) return false;

        // 4. Алфавит, цифры, '-', '_', '.', '@'
        if (!email.matches("[a-zA-Z0-9._@-]+")) return false;

        // 5. До собаки должен быть хотя бы 1 символ
        if (indexAt < 1) return false;

        // 6. Первый символ - должна быть буква
        if (!Character.isLetter(email.charAt(0))) return false;

        return true;
    }

    /*
     Task 2
    Написать в классе Person метод для проверки валидности Password
    Требования к паролю:
    1. длина >= 8
    2. Должна быть мин 1 цифра
    3. Должна быть мин 1 маленькая буква
    4. Должна быть мин 1 большая буква
    5. Должна быть мин 1 спец. символ (!%$@&*()[].,-)

    5 boolean переменных. Каждая "отвечает за свой пункт".
Пароль будет подходить только если все пять - true
return b1 && b2 && b3 && b4 && b5;
      */
    private boolean isPasswordValid(String password) {

        // 1. длина >= 8
        boolean isLengthValid = password.length() >= 8;

        // 2. Должна быть мин 1 цифра
        boolean hasDigit = password.matches(".*[0-9].*");

        //3. Должна быть мин 1 маленькая буква
        boolean hasLowerCase = password.matches(".*[A-Z].*");

        //  4. Должна быть мин 1 большая буква
        boolean hasUpperCase = password.matches(".*[A-Z].*");

        //  5. Должна быть мин 1 спец. символ (!%$@&*()[].,-)
        boolean hasSpecialChar = password.matches(".*[!%$@&*()\\[\\].,-]");

        return  isLengthValid && hasDigit && hasLowerCase && hasUpperCase && hasSpecialChar;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        if (isEmailValid(email)) {
            this.email = email;
        } else {
            System.out.println("E-mail не соответствует требованиям.");
        }
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;

        } else {
            System.out.println("Пароль не соответствует требованиям.");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

/*
Требование к паролю:
длина >= 8
Должна быть мин 1 цифра
Должна быть мин 1 маленькая буква
Должна быть мин 1 большая буква
Должна быть мин 1 спец. символ (!%$@&*()[].,-)

5 boolean переменных. Каждая "отвечает за свой пункт".
Пароль будет подходить только если все пять - true
return b1 && b2 && b3 && b4 && b5;
 */