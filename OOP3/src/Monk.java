public class Monk extends Healers {

    public Monk() {
        super(12, 7, new int[]{-4, -4}, 30,30, 5,1);
    }

    public Monk(int attack, int defense, int[] damage, int maxHealth, int health, int speed, int magic) {
        super(attack, defense, damage,maxHealth, health, speed,magic);
    }

}
