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
//        int maxHurt = 0;
//        int stricken = 0;
//
//        for (int i = 0; i < heroes.size(); i++) {
//            if (!(heroes.get(i) instanceof Healers) && heroes.get(i).getMaxHealth() -  heroes.get(i).getHealth() > maxHurt) {
//              maxHurt =  heroes.get(i).getMaxHealth() -  heroes.get(i).getHealth();
//                stricken = i;
//            }
//        }
//        System.out.println("==================================");
//        System.out.println("-- CURE! --");
//        System.out.println("Before cure:   " + heroes.get(stricken).getInfo());
//        heroes.get(stricken).setHealth(heroes.get(stricken).getHealth() + 1);
//        System.out.println("After cure:    " + heroes.get(stricken).getInfo());
//        System.out.println("==================================");

    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", magic=" + magic;
    }
}
