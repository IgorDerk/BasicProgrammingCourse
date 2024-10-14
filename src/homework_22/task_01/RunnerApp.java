package homework_22.task_01;

public class RunnerApp {
    public static void main(String[] args) {
        Human human = new Human();
        AmateurAthlete amateurAthlete = new AmateurAthlete();
        ProfessionalAthlete professionalAthlete = new ProfessionalAthlete();

        human.run();
        amateurAthlete.run();
        professionalAthlete.run();
    }
}
