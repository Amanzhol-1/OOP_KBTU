package Problem2;

public class Main {
    public static void main(String[] args) {
    	
        PlayerCharacter character = new PlayerCharacter("Steve");

        System.out.println("Testing character movements:");
        character.moveRight();
        character.jump();
        character.moveLeft();
        character.sprintRight();
        character.sprintLeft();
    }
}