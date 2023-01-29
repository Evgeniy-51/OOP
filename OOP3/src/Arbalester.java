import java.util.ArrayList;

public class Arbalester extends Shooters {

    public Arbalester() {
        super(6, 3, new int[]{2, 3}, 10, 10, 4,16);
    }

    public Arbalester(int attack, int defense, int[] damage, int maxHealth,int health, int speed, int shots) {
        super(attack, defense, damage, maxHealth,health, speed, shots);
    }
}
