public class Wizard extends Healers {

    public Wizard() {


        super(17, 12, new int[]{-5, -5}, 30,30,9,1);
    }

    public Wizard(int attack, int defense, int[] damage, int maxHealth,int health, int speed, int magic) {
        super(attack, defense, damage,maxHealth, health, speed, magic);
    }
}
