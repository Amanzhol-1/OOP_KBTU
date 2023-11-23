package Problem2;

public class PlayerCharacter implements Jumpable {
    private Position position;
    private String name;
    private final int jumpHeight = 2;
    private final int walkStep = 1;
    private final int sprintStep = 3;

    public PlayerCharacter(String name) {
        this.name = name;
        this.position = new Position(0, 0);
    } 

    @Override
    public void moveLeft() {
        position.setX(position.getX() - walkStep);
        System.out.println(name + " moved left to position: " + position);
    }

    @Override
    public void moveRight() {
        position.setX(position.getX() + walkStep);
        System.out.println(name + " moved right to position: " + position);
    }

    @Override
    public void sprintLeft() {
        position.setX(position.getX() - sprintStep);
        System.out.println(name + " sprinted left to position: " + position);
    }

    @Override
    public void sprintRight() {
        position.setX(position.getX() + sprintStep);
        System.out.println(name + " sprinted right to position: " + position);
    }

    @Override
    public void jump() {
        for (int i = 0; i < jumpHeight; i++) {
            position.setY(position.getY() + 1);
            System.out.println(name + " is jumping, current position: " + position);
        }
        for (int i = jumpHeight; i > 0; i--) {
            position.setY(position.getY() - 1);
            System.out.println(name + " is falling, current position: " + position);
        }
    }
}
