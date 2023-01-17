public class Arbalester extends Character {
    private int shots;

    public Arbalester() {
        super(6, 3, new int[]{2, 3}, 10, 4);
        this.shots = 16;
    }

    public Arbalester(int attack, int defense, int[] damage, int health, int speed, int shots) {
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
