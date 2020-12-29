package game.model.type;

import game.model.Droid;
public class DroidTank extends Droid{
    public DroidTank(String name) {
        super(name);
        this.health = 150;
        this.damage = 15;
    }
}
