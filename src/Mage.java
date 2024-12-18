package mkr2;

public class Mage extends Character {

    public void move(int dx, int dy) {
        arena.move(this, dx, dy);
    }

    public boolean attack() {
        return arena.attack(this, 2, 20);
    }

    public Mage(Arena arena, int health, int damage) {
        this.arena = arena;
        this.health = health;
        this.damage = damage;
    }

}
