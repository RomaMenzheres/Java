package game.controller.arena;

import game.model.Droid;
import java.util.Random;

public class BattleArena {
    private final Droid firstDroid;
    private final Droid secondDroid;
    private Droid assaulter;
    private Droid target;

    public BattleArena(Droid firstDroid, Droid secondDroid) {
        this.firstDroid = firstDroid;
        this.secondDroid = secondDroid;
    }

    public Droid startBattle() {
        int round = 1;

        do {
            this.printRoundInformation(round);
            this.setOpponents();
            int damage = this.assaulter.getDamage();
            this.target.getHit(damage);
            System.out.println(this.target.getName() + " was hit by " + this.assaulter.getName() + " with damage=" + damage);
            ++round;
        } while(this.target.isAlive());

        return this.assaulter;
    }

    private void printRoundInformation(int round) {
        System.out.println("_____________________");
        System.out.println("Round " + round);
    }

    private void setOpponents() {
        if ((new Random()).nextBoolean()) {
            this.assaulter = this.firstDroid;
            this.target = this.secondDroid;
        } else {
            this.assaulter = this.secondDroid;
            this.target = this.firstDroid;
        }

    }
}
