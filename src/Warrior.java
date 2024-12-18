package mkr2;

public class Warrior extends Character {

    public void move(int dx, int dy) {
        arena.move(this, dx * 2, dy * 2);
    }

    public boolean attack() {
        return arena.attack(this, 1, 10);
    }

    public Warrior(Arena arena, int health, int damage) {
        this.arena = arena;
        this.health = health;
        this.damage = damage;
    }

}
