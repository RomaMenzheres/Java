package game.model;

public abstract class Droid {

    protected String name;
    protected int health;
    protected int damage;

    public Droid() {
    }

    public Droid(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isAlive() { return this.health > 0; }

    public int getHit(int damage) {
        this.health -= damage;
        return damage;
    }

    public String toString() {
        return String.format("name =%10s, damage =%5d, health =%5d", this.name, this.damage, this.health);
    }
}
