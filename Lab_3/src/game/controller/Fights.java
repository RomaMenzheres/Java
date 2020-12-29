package game.controller;

import game.controller.arena.BattleArena;
import game.controller.arena.TeamArena;
import game.controller.factory.TeamFactory;
import game.menu.MenuFunctions;
import game.model.Droid;

import java.util.Scanner;

public class Fights {

    public static void singleFight() {
        if (game.menu.Menu.droids.size() < 2) {
            System.out.println("there are not enough available Droids");
        } else {
            System.out.println("please choose two Droids to fight");
            MenuFunctions.showDroids();
            Scanner in = new Scanner(System.in);
            int first = in.nextInt();
            int second = in.nextInt();
            BattleArena arena = new BattleArena((Droid)game.menu.Menu.droids.get(first), (Droid)game.menu.Menu.droids.get(second));
            Droid winner = arena.startBattle();
            System.out.println("The winner is " + winner.getName());
        }
    }

    public static void teamFight() {
        if (game.menu.Menu.droids.size() < 2) {
            System.out.println("there are not enough available Droids");
        } else {
            TeamFactory droidTeamA = new TeamFactory("team A");
            int firstPart = game.menu.Menu.droids.size() / 2;

            for(int i = 0; i < firstPart; ++i) {
                droidTeamA.addDroid((Droid)game.menu.Menu.droids.get(i));
            }

            TeamFactory droidTeamB = new TeamFactory("team B");

            for(int i = firstPart; i < game.menu.Menu.droids.size(); ++i) {
                droidTeamB.addDroid((Droid)game.menu.Menu.droids.get(i));
            }

            TeamArena teamArena = new TeamArena(droidTeamA, droidTeamB);
            TeamFactory winner = teamArena.StartBattle();
            System.out.println("The winner is " + winner.getName());
        }
    }

}
