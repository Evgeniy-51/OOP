// Разработать иерархию классов персонажей, описанных в таблице.
// Провести анализ(абстракция) полей необходимых данных и перенести общие в базовый класс.
// Также в базовом классе переопределить метод toString для вывода подробной информации о персонаже.
// Описать удобный конструктор базового класса и классов наследников так, чтобы необходимые параметры передавались
// вызовом пустого конструктора класса наследника.
// В основном классе создать список и заполнить его экземплярами каждого нового класса.
// Вывести в консоль содержание списка переопределённым методом toString().
// *Создать список из 50 персонажей выбранных случайным числом и статический метод, выбирающий из списка
// только элементы конкретного, переданного в параметре класса и выводящий их описание в консоль!

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> heroes = new ArrayList<>();

        createList(heroes);

        selectValues("Sniper", heroes);
    }

    private static void selectValues(String choice, ArrayList<Object> heroes) {
        for (Object item : heroes) {
            if (item.getClass().getName().equals(choice)) {
                System.out.println(item.getClass().getName() + " // " + item);
            }
        }
    }

    private static void createList(ArrayList<Object> heroes) {
        Random rnd = new Random();
        int randNum;

        for (int i = 0; i < 50; i++) {
            randNum = rnd.nextInt(7);
            if (randNum == 0) {
                Peasant hero = new Peasant();
                System.out.println(i + 1 + " " + hero.getClass().getName() + " // " + hero);
                heroes.add(hero);
            } else if (randNum == 1) {
                Robber hero = new Robber();
                System.out.println(i + 1 + " " + hero.getClass().getName() + " // " + hero);
                heroes.add(hero);
            } else if (randNum == 2) {
                Sniper hero = new Sniper();
                System.out.println(i + 1 + " " + hero.getClass().getName() + " // " + hero);
                heroes.add(hero);
            } else if (randNum == 3) {
                Wizard hero = new Wizard();
                System.out.println(i + 1 + " " + hero.getClass().getName() + " // " + hero);
                heroes.add(hero);
            } else if (randNum == 4) {
                Pickeman hero = new Pickeman();
                System.out.println(i + 1 + " " + hero.getClass().getName() + " // " + hero);
                heroes.add(hero);
            } else if (randNum == 5) {
                Arbalester hero = new Arbalester();
                System.out.println(i + 1 + " " + hero.getClass().getName() + " // " + hero);
                heroes.add(hero);
            } else {
                Monk hero = new Monk();
                System.out.println(i + 1 + " " + hero.getClass().getName() + " // " + hero);
                heroes.add(hero);
            }
        }
        System.out.println("=============================================================================");
    }
}