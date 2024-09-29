package lesson_04;

public class IncrementExample {
    public static void main(String[] args) {
        int var = 5;
        var = var + 5;
        System.out.println("var = var +5: " + var);

        var = 5;
        var += 5;
        System.out.println("var +=5: " + var);

        var -= 2;
        System.out.println("var: " + var);

        var *= 2;
        System.out.println("var: " + var);

        var /= 2;
        System.out.println("var: " + var);

        //инкремент
        var++; // var +=1; var = var +1;
        System.out.println("var++: " + var);

        //декримент
        var--; // var -=1; var = var - 1;
        System.out.println(var);

        System.out.println("=============");

        // постинкремент
        int x = 100;
        System.out.println("x1: " + x++);
        System.out.println("x2: " + x); // постинкремент

        // прединкремент
        int y = 100;
        System.out.println("x1: " + ++y);
        System.out.println("x2: " + y); // прединкремент




    }
}
