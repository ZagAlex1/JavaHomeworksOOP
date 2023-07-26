package ProjectGame.Shooter;

import ProjectGame.MainPackage.Countryman;
import ProjectGame.MainPackage.Unit;

import java.util.ArrayList;

public abstract class Shooter extends Unit {

    protected int numberOfArrows;
    protected String weapon;
    protected int damage;

    public Shooter(String name, int hp, int armor, int movePoints, int numberOfArrows, String weapon, int damage, int x, int y) {
        super(name, hp, armor, movePoints, x, y);
        this.numberOfArrows = numberOfArrows;
        this.movePoints = 0;
        this.weapon = weapon;
        this.damage = damage;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }



    public boolean haveArrows() {
        return numberOfArrows > 0;
    }

    @Override
    public void step(ArrayList<Unit> units1, ArrayList<Unit> units2) {
        if (!isAlive()) return;
        if (!haveArrows()) return;
        Unit tmp = nearest(units1);
        attack(tmp);
        if(units2.contains(Countryman.class)) return;
        numberOfArrows--;
    }

}
