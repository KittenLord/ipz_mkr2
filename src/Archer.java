package mkr2;

public class Archer extends Character {

    public void move(int dx, int dy) {
        arena.move(this, dx, dy);
    }

    public boolean attack() {
        arena.attack(this, 2, 60);
    }

    public Archer(Arena arena, int health, int damage) {
        this.arena = arena;
        this.health = health;
        this.damage = damage;
    }

}
