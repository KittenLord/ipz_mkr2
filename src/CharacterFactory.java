package mkr2;

public class CharacterFactory {

    private Arena arena;
    private int warriorHealth;
    private int warriorDamage;
    private int mageHealth;
    private int mageDamage;
    private int archerHealth;
    private int archerDamage;

    public CharacterFactory(Arena arena, int warriorHealth, int warriorDamage, int mageHealth, int mageDamage, int archerHealth, int archerDamage) {
        this.arena = arena;
        this.warriorHealth = warriorHealth;
        this.warriorDamage = warriorDamage;
        this.mageHealth = mageHealth;
        this.mageDamage = mageDamage;
        this.archerHealth = archerHealth;
        this.archerDamage = archerDamage;
    }

    public Character createCharacter(String type) {
        if(type == "Warrior") return new Warrior(arena, warriorHealth, warriorDamage);
        else if(type == "Mage") return new Mage(arena, mageHealth, mageDamage);
        else if(type == "Archer") return new Archer(arena, archerHealth, archerDamage);
        else throw new Exception("Invalid character type");
    }

}
