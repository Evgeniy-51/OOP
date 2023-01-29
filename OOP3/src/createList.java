import java.util.ArrayList;
import java.util.Random;

public class createList {
    static void create1(ArrayList<Character> heroes1) {
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            int randNum = rnd.nextInt(4);
            if (randNum == 0) {
                Peasant hero = new Peasant();
                heroes1.add(hero);
            } else if (randNum == 1) {
                Robber hero = new Robber();
                hero.setHealth(rnd.nextInt(hero.getMaxHealth()) + 1);
                heroes1.add(hero);
            } else if (randNum == 2) {
                Sniper hero = new Sniper();
                hero.setHealth(rnd.nextInt(hero.getMaxHealth()) + 1);
                heroes1.add(hero);
            } else {
                Wizard hero = new Wizard();
                hero.setHealth(rnd.nextInt(hero.getMaxHealth()) + 1);
                heroes1.add(hero);
            }
        }
    }

    static void create2(ArrayList<Character> heroes2) {
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            int randNum = rnd.nextInt(5);
            if (randNum == 0) {
                Peasant hero = new Peasant();
                heroes2.add(hero);
            } else if (randNum == 1) {
                Robber hero = new Robber();
                hero.setHealth(rnd.nextInt(hero.getMaxHealth()) + 1);
                heroes2.add(hero);
            } else if (randNum == 2) {
                Pickeman hero = new Pickeman();
                hero.setHealth(rnd.nextInt(hero.getMaxHealth()) + 1);
                heroes2.add(hero);
            } else if (randNum == 3) {
                Arbalester hero = new Arbalester();
                hero.setHealth(rnd.nextInt(hero.getMaxHealth()) + 1);
                heroes2.add(hero);
            } else {
                Monk hero = new Monk();
                hero.setHealth(rnd.nextInt(hero.getMaxHealth()) + 1);
                heroes2.add(hero);
            }
        }
    }
}
