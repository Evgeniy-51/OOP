public class Sniper  extends Character{
    private int shots;

    public Sniper() {
        super(12, 10, new int[]{8, 10}, 15, 9);
        this.shots = 32;
    }
    public Sniper(int attack, int defense, int[] damage, int health, int speed, int shots) {
        super(attack, defense, damage, health, speed);
        this.shots = shots;
    }

    public int getShots() {
        return shots;
    }

    @Override
    public String toString() {
        return super.toString() + ", shots=" + shots;
    }
}
