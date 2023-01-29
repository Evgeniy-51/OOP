import java.util.ArrayList;
import java.util.Arrays;

public abstract class Character implements MyInterface {
    private int attack;
    private int defense;
    private int[] damage;
    private int maxHealth;
    private int health;
    private int speed;

    public Character(int i, int i1, int[] ints, int i2, int i3) {

    }

    public Character(int attack, int defense, int[] damage, int maxHealth, int health, int speed) {
        this.attack = attack;
        this.defense = defense;
        this.damage = damage;
        this.maxHealth = maxHealth;
        this.health = health;
        this.speed = speed;
    }


    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int[] getDamage() {
        return damage;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void step(ArrayList<Character> heroes);

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return this.getClass().getName() + "  " +
                "attack=" + attack +
                ", defense=" + defense +
                ", damage=" + Arrays.toString(damage) +
                ", maxHealth=" + maxHealth +
                ", health=" + health +
                ", speed=" + speed;
    }
}
