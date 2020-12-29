package game.model.type;

import game.model.Droid;

public class DroidKiller extends Droid{
    public DroidKiller(String name) {
        super(name);
        this.health = 70;
        this.damage = 25;
    }
}
