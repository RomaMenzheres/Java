package game.controller.factory;

import game.model.Droid;
import java.util.ArrayList;
import java.util.Random;

public class TeamFactory {
    private ArrayList<Droid> team;
    private String name;

    public TeamFactory(String name) {
        this.name = name;
        this.team = new ArrayList();
    }

    public void addDroid(Droid droid) {
        this.team.add(droid);
    }

    public void removeDroid(Droid droid) {
        this.team.remove(droid);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Droid getRandomDroid() {
        return (Droid)this.team.get((new Random()).nextInt(this.team.size()));
    }

    public boolean isAnyoneAlive() {
        return this.team.size() != 0;
    }

}
