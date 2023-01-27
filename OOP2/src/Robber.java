import java.util.ArrayList;

public class Robber extends Character {

    public Robber() {
        super(1, 1, new int[]{1, 1}, 1,1, 3);
    }

    public Robber(int attack, int defense, int[] damage, int health, int speed) {
        super(attack, defense, damage, health, speed);
    }

    @Override
    public void step(ArrayList<Character> heroes) {

    }

    @Override
    public void step() {

    }

}
