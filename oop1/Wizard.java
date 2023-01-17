public class Wizard extends Character {
    private int magic;

    public Wizard() {
        super(17, 12, new int[]{-5, -5}, 30, 9);
        this.magic = 1;
    }

    public Wizard(int attack, int defense, int[] damage, int health, int speed, int magic) {
        super(attack, defense, damage, health, speed);
        this.magic = magic;
    }

    public int getMagic() {
        return magic;
    }

    @Override
    public String toString() {
        return super.toString() + ", magic=" + magic;
    }
}
