import java.util.ArrayList;

public class Healers extends Character {

    private int magic;


    public Healers() {
        super(12, 7, new int[]{-4, -4}, 30, 30, 5);
        this.magic = 1;
    }

    //
    public Healers(int attack, int defense, int[] damage, int maxHealth, int health, int speed, int magic) {
        super(attack, defense, damage, maxHealth, health, speed);
        this.magic = magic;
    }

    @Override
    public void step(ArrayList<Character> heroes) {
        int maxHurt = 0;
        Character stricken = null;
        for (Character currHero : heroes) {
            if (!currHero.getClass().getName().equals("Monk") && !currHero.getClass().getName().equals("Wizard") && currHero.getMaxHealth() - currHero.getHealth() > maxHurt) {
                maxHurt = currHero.getMaxHealth() - currHero.getHealth();
                stricken = currHero;
            }
        }
        System.out.println("==================================");
        System.out.println("Before cure:   " + stricken.getInfo());
        stricken.setHealth(stricken.getMaxHealth());
        System.out.println("After cure:    " + stricken.getInfo());
        System.out.println("==================================");
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", magic=" + magic;
    }
}
