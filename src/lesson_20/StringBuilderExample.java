package lesson_20;

public class StringBuilderExample {
    public static void main(String[] args) {

        String str = "Java " + "is"+ " " + "the" + " " + "best";

        StringBuilder sb1 = new StringBuilder(str);
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" ").append("Java");

        String string = sb.toString();
        System.out.println(string);

        StringBuilder sb2 = new StringBuilder("Hello World");
        sb2.insert(6, "beautiful ");
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("Hello World!");
        sb3.replace(6,11, "Java");
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("Hello World!");
        sb4.delete(5, 11);
        System.out.println(sb4);

        StringBuilder sb5 = new StringBuilder("Hello World!");
        sb5.reverse();
        System.out.println(sb5);





    }
}
