package game.menu;

import game.model.Droid;

public class MenuFunctions {

    public static void showDroids() {
        System.out.println("---------created Droids---------");

        for (int i = 0; i < Menu.droids.size(); ++i) {
            System.out.format("%2d) ", i);
            System.out.println(Menu.droids.get(i));
        }

        System.out.println("--------------------------------");
    }

    public static void deteleDeadDroids() {
        for (int i = 0; i < Menu.droids.size(); ++i) {
            if (!((Droid) Menu.droids.get(i)).isAlive()) {
                Menu.droids.remove(i);
            }
        }

    }

}
