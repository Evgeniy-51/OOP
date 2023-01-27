import java.util.ArrayList;

public class Peasant extends Character {

    private int supply;


    public Peasant() {
        super(1, 1, new int[]{1, 1}, 1,1, 3);
        this.supply = 1;
    }

    public Peasant(int attack, int defense, int[] damage, int health, int speed, int supply) {
        super(attack, defense, damage, health, speed);
        this.supply = supply;
    }

    @Override
    public void step(ArrayList<Character> heroes) {

    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", supply=" + supply;
    }

}
