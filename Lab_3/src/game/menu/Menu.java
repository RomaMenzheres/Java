package game.menu;

import game.controller.factory.DroidFactory;
import game.model.Droid;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static final ArrayList<Droid> droids = new ArrayList<>();

    public void start() {
        for (boolean quit = false; !quit; MenuFunctions.deteleDeadDroids()) {
            switch (getMenuItem()) {
                case 1 -> Menu.droids.add((new DroidFactory()).createDroid());
                case 2 -> {
                    MenuFunctions.deteleDeadDroids();
                    MenuFunctions.showDroids();
                }
                case 3 -> game.controller.Fights.singleFight();
                case 4 -> game.controller.Fights.teamFight();
                case 5 -> quit = true;
            }
        }
    }

    private static void text() {
        System.out.println("-----------MENU-----------");
        System.out.println("1 - create Droid");
        System.out.println("2 - show created Droids");
        System.out.println("3 - start Droid fight 1x1");
        System.out.println("4 - start Droid team fight");
        System.out.println("5 - quit");
        System.out.println("--------------------------");
    }

    public static int getMenuItem() {
        Scanner in = new Scanner(System.in);

        int menuItem;
        do {
            do {
                text();
                menuItem = in.nextInt();
            } while (menuItem < 0);
        } while (5 < menuItem);

        return menuItem;
    }
}
