package game.model.type;

import game.model.Droid;
public class DroidWarrior extends Droid{
    public DroidWarrior(String name) {
        super(name);
        this.health = 100;
        this.damage = 20;
    }

}
