import java.util.ArrayList;

public class Pickeman  extends Character{

    public Pickeman() {
        super(4, 5, new int[]{1, 3}, 10,10, 4);
    }
    public Pickeman(int attack, int defense, int[] damage, int health, int speed) {
        super(attack, defense, damage, health, speed);
    }

    @Override
    public void step(ArrayList<Character> heroes) {

    }

    @Override
    public void step() {

    }
}
