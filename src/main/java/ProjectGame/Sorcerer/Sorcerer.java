package ProjectGame.Sorcerer;

import ProjectGame.MainPackage.Unit;

public abstract class Sorcerer extends Unit {

    protected int mana;
    protected String artifact;

    public Sorcerer(String name, int hp, int armor, int movePoints, int mana, String artifact, int x, int y) {
        super(name, hp, armor, movePoints, x, y);
        this.mana = mana;
        this.artifact = artifact;
    }

    public int getMana() {
        return mana;
    }


}
