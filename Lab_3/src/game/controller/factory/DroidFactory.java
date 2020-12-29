package game.controller.factory;

import game.model.Droid;
import game.model.type.DroidWarrior;
import game.model.type.DroidKiller;
import game.model.type.DroidTank;
import java.util.Random;
import java.util.Scanner;

public class DroidFactory {

    public DroidFactory() {
    }

    private String getRandomName() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder name = new StringBuilder();

        for(int i = 0; i < 5; ++i) {
            name.append(characters.charAt((new Random()).nextInt(characters.length())));
        }

        return name.toString();
    }

    public Droid createDroid() {
        Object droid;
        Scanner in = new Scanner(System.in);
        System.out.println("0 - Killer\t1 - Tank\t2 - Warrior");
        int model = in.nextInt();
        droid = switch (model) {
            case 0 -> new DroidKiller(this.getRandomName());
            case 1 -> new DroidTank(this.getRandomName());
            default -> new DroidWarrior(this.getRandomName());
        };

        return (Droid)droid;
    }
}
