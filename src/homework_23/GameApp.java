package homework_23;

public class GameApp {
    public static void main(String[] args) {

        GameCharacter[] gameCharacters = new GameCharacter[3];

        gameCharacters[0] = new Warrior();
        gameCharacters[1] = new Mage();
        gameCharacters[2] = new Archer();

        for (int i = 0; i < gameCharacters.length; i++) {
            GameCharacter gameCharacter = gameCharacters[i];
            gameCharacter.attack();


        }
    }
}
