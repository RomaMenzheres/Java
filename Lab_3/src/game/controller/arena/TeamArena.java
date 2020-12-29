package game.controller.arena;

import game.model.Droid;
import game.controller.factory.TeamFactory;
import java.util.Random;

public class TeamArena {
    private final TeamFactory teamA;
    private final TeamFactory teamB;
    private TeamFactory teamAssaulter;
    private TeamFactory teamTarget;

    public TeamArena(TeamFactory teamA, TeamFactory teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public TeamFactory StartBattle() {
        int var1 = 1; /*Round*/

        do {
            this.printRoundInformation(var1++);
            this.setOpponents();
            Droid assaulter = this.teamAssaulter.getRandomDroid();
            Droid target = this.teamTarget.getRandomDroid();
            int damage = target.getHit(assaulter.getDamage());
            System.out.println(this.teamTarget.getName() + " was hit by " + this.teamAssaulter.getName() + " with damage=" + damage);
            ++var1;
            if (!target.isAlive()) {
                this.teamTarget.removeDroid(target);
            }
        } while(this.teamTarget.isAnyoneAlive());

        return this.teamAssaulter;
    }

    private void setOpponents() {
        if ((new Random()).nextBoolean()) {
            this.teamAssaulter = this.teamA;
            this.teamTarget = this.teamB;
        } else {
            this.teamAssaulter = this.teamB;
            this.teamTarget = this.teamA;
        }

    }

    private void printRoundInformation(int round) {
        System.out.println("_____________________");
        System.out.println("Round " + round);
    }
}
