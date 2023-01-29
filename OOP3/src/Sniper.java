import java.util.ArrayList;

public class Sniper  extends Shooters{

    public Sniper() {
        super(12, 10, new int[]{8, 10}, 15,15, 9,32);
    }
    public Sniper(int attack, int defense, int[] damage, int maxHealth,int health, int speed, int shots) {
        super(attack, defense, damage, maxHealth,health, speed, shots);
    }

}
