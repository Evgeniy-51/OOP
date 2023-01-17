public class Monk extends Character {
    private int magic;

    public Monk() {
        super(12, 7, new int[]{-4, -4}, 30, 5);
        this.magic = 1;
    }

    public Monk(int attack, int defense, int[] damage, int health, int speed, int magic) {
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
