package PojectGame.Sorcerer;

import PojectGame.MainPackage.Unit;

public abstract class Sorcerer extends Unit {

    protected int mana;
    protected String artifact;

    public Sorcerer(String name, int hp, int armor, int movePoints, int mana, String artifact) {
        super(name, hp, armor, movePoints);
        if (mana < 0) {
            this.mana = 0;
        } else {
            this.mana = mana;
        }
        this.artifact = artifact;
    }

    public int getMana() {
        return mana;
    }


}
