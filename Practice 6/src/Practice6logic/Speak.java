package Practice6logic;

public interface Speak {
    void speak();

    default void isSpeak() {
        System.out.println("I can speak");
    }
}
