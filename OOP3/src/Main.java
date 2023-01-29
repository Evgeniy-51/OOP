// Проделать код ревью своих работ! Оптимизиривать интерфейс так, чтобы в клиент коде было видно только публичные поля.
// Добавить поведение (метод step) для лучников.
//1.Если стрел больше нуля заглушка выстрел и уменьшение количества стрел
//2.Проверить есть ли крестьяне и свободны ли хоть один из них. Если да, то вернуть одну стрелу и сбросить флаг свободен у крестьянина.
//3.Крестьяне должны уметь поднимать свой статус "свободен"
//4.Сделать так, чтобы по нажатию Enter программа повторяла вывод на экран состояние персонажей и вызов метода step.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Character> heroes1 = new ArrayList<>();
        ArrayList<Character> heroes2 = new ArrayList<>();

        createList.create1(heroes1);
        createList.create2(heroes2);

        Scanner console = new Scanner(System.in);
        boolean isRepeat = true;
        int stepCounter = 0;

        while (isRepeat) {
            System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>  STEP " + (++stepCounter) + "  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

            for (Character currHero : heroes1) {
                System.out.println(currHero.getInfo());
                currHero.step(heroes1);
            }
            for (Character currHero : heroes2) {
                System.out.println(currHero.getInfo());
                currHero.step(heroes2);
            }

            System.out.println("\n  Click <ENTER> for next step or any symbol for quit");
            String s = console.nextLine();
            if (!"".equals(s)) isRepeat = false;

        }
    }
}