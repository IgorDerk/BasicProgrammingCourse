package homework_18;
/*
Task 2 * (Опционально)
Написать класс Собака (Dog).

Каждая Собака обязательно должна иметь имя и высоту прыжка

Должна уметь прыгать и должна уметь тренироваться.

За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров

Максимальная высота прыжка, которую может натренировать собака, не может быть больше, чем двукратная высота первоначального прыжка.

Также должен быть метод взять jumpBarrier. В параметрах метод принимает высоту барьера. Если собака в состоянии преодолеть этот барьер - прыгает. Если не в состоянии, нужно проверить помогут ли тренировки (будет ли данная собака в принципе в состоянии взять барьер). Если да -> идем тренироваться -> берет барьер
 */
public class Dog {
    private String name;
    private int jumpHeight;
    private final int maxJumpHeight;

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * 2;



    }

    public boolean jumpBarrier(int barrier){
        if (jumpHeight >= barrier){
            jump();
            return true;
        }
        if (maxJumpHeight >= barrier){
            while (jumpHeight < barrier){
                train();
            }
            System.out.println("перепрыниваю ьпртер  " + barrier + "" +jumpHeight + name);
            jump();
            return true;

        } else {
            System.out.println("Барьер высотой " + " взять не могу. Ьариер высотой " + jumpHeight);
            return false;
        }
    }


    public void train(){
        jumpHeight +=10;
        if (jumpHeight < maxJumpHeight){
            jumpHeight = maxJumpHeight;
        }
    }

    public void jump(){
        System.out.println(name + "jumping...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


