package mkr2;

public abstract class Character {

    protected Arena arena;
    protected int health;
    protected int damage;

    public void takeDamage(int damage) {
        health -= damage;
    }

    public int getDamage() { return damage; }

    public Coordinates coordinates = new Coordinates(0, 0);

    public abstract void move(int dx, int dy);
    public abstract boolean attack();

}
