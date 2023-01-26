import java.util.ArrayList;

public class Sniper  extends Character{
    private int shots;

    public Sniper() {
        super(12, 10, new int[]{8, 10}, 15,15, 9);
        this.shots = 32;
    }
    public Sniper(int attack, int defense, int[] damage, int health, int speed, int shots) {
        super(attack, defense, damage, health, speed);
        this.shots = shots;
    }

    @Override
    public void step(ArrayList<Character> heroes) {

    }

    public int getShots() {
        return shots;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", shots=" + shots;
    }

    @Override
    public void step() {

    }
}
