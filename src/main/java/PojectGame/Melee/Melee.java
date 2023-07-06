package PojectGame.Melee;

import PojectGame.MainPackage.Unit;

public abstract class Melee extends Unit {

    protected int damage;
    protected String weapon;

    public Melee(String name, int hp, int armor, int movePoints, int damage, String weapon) {
        super(name, hp, armor, movePoints);
        this.damage = damage;
        this.weapon = weapon;
    }

}
