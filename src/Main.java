package mkr2;

public class Main {
    public static void main(String[] args) {
        Arena arena = new Arena();

        CharacterFactory factory = new CharacterFactory(arena, 150, 20, 100, 40, 120, 30);
    }
}
