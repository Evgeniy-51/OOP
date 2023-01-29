import java.util.ArrayList;

public class Robber extends Character {

    public Robber() {
        super(8, 3, new int[]{2, 4}, 10,10, 6);
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
