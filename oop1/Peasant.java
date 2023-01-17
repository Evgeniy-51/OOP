public class Peasant extends Character {

    private int supply;


    public Peasant() {
        super(1, 1, new int[]{1, 1}, 1, 3);
        this.supply = 1;
    }

    public Peasant(int attack, int defense, int[] damage, int health, int speed, int supply) {
        super(attack, defense, damage, health, speed);
        this.supply = supply;
    }

    public int getSupply() {
        return supply;
    }

    @Override
    public String toString() {
        return super.toString() + ", supply=" + supply;
    }
}
