// Добавить файл с описанием интерфейса. В котором описать два метода, void step(); и String getInfo();
// Реализовать имнтерфейс в абстрактном классе. Создать два списка в классе main.
// В кждый из списков добавить по десять экземнляров наследников BaseHero.
// Крестьянин, Разбойник, Снайпер и Колдун могут быть в одном и
// Крестьянин Разбойник, копейщик, арбалетчик и монах в другой.
// Реализовать метод step() для магов таким образом, чтобы они могли лечить самого повреждённого из своих однополчан!)
// Удалить ненужные методы из абстрактного класса, если такие есть.переданного в параметре класса и выводящий их описание в консоль!

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Character> heroes1 = new ArrayList<>();
        ArrayList<Character> heroes2 = new ArrayList<>();

        createList1(heroes1);
        createList2(heroes2);

        for (Character currHero:heroes1   ) {
            System.out.println(currHero.getInfo());
            if (currHero.getClass().getName().equals("Wizard")) {
                currHero.step(heroes1);
            }
        }
        for (Character currHero:heroes2   ) {
            System.out.println(currHero.getInfo());
            if (currHero.getClass().getName().equals("Monk")) {
                currHero.step(heroes2);
            }
        }

    }

    private static void createList1(ArrayList<Character> heroes1) {
        Random rnd = new Random();
        int randNum;

        for (int i = 0; i < 10; i++) {
            randNum = rnd.nextInt(4);
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

    private static void createList2(ArrayList<Character> heroes2) {
        Random rnd = new Random();
        int randNum;

        for (int i = 0; i < 10; i++) {
            randNum = rnd.nextInt(5);
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