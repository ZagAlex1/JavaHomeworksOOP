package ProjectGame.Melee;

import ProjectGame.MainPackage.Unit;

public abstract class Melee extends Unit {

    protected int damage;
    protected String weapon;

    public Melee(String name, int hp, int armor, int movePoints, int damage, String weapon, int x, int y) {
        super(name, hp, armor, movePoints, x, y);
        this.damage = damage;
        this.weapon = weapon;
    }

}
