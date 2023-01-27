import java.util.ArrayList;

public class Arbalester extends Character {
    private int shots;

    public Arbalester() {
        super(6, 3, new int[]{2, 3}, 10,10, 4);
        this.shots = 16;
    }

    public Arbalester(int attack, int defense, int[] damage, int health, int speed, int shots) {
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
