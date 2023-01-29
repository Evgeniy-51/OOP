import java.util.ArrayList;

public class Shooters extends Character {
    private int shots;

    public Shooters() {
        super(-1, -1, new int[]{-1, -1}, -1, -1, -1);
        this.shots = -1;
    }

    public Shooters(int attack, int defense, int[] damage,  int maxHealth, int health,int speed, int shots) {
        super(attack, defense, damage, maxHealth,health, speed);
        this.shots = shots;
    }

    @Override
    public void step(ArrayList<Character> heroes) {
        if (shots > 0) {
            System.out.println("-- SHOT! --");
            shots--;
            System.out.println("The rest of the arrows: " + shots);
        }
        for (Character currHero : heroes) {
            if (currHero instanceof Peasant && ((Peasant) currHero).getSupply() == 1) {
                shots++;
                ((Peasant) currHero).setSupply(0);
                System.out.println("-- SHOOTER GOT AN ARROW --");
                System.out.println("The rest of the arrows: " + shots + " now...\n");
                break;
            }
        }

    }

    @Override
    public void step() {
    }


    public int getShots() {
        return shots;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", shots=" + shots;
    }
}
