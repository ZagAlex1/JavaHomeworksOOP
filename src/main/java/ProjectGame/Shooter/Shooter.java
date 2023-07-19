package ProjectGame.Shooter;

import ProjectGame.MainPackage.Unit;

public abstract class Shooter extends Unit {

    protected int numberOfArrows;
    protected String weapon;
    protected int damage;

    public Shooter(String name, int hp, int armor, int movePoints, int numberOfArrows, String weapon, int damage, int x, int y) {
        super(name, hp, armor, movePoints, x, y);
        if (setNumberOfArrows(numberOfArrows)) {
            this.numberOfArrows = numberOfArrows;
        } else {
            this.numberOfArrows = 1;
        }
        this.movePoints = 0;
        this.weapon = weapon;
        this.damage = damage;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public boolean setNumberOfArrows(int numberOfArrows) {
        if (numberOfArrows < 0) {
            return false;
        } else {
            this.numberOfArrows += numberOfArrows;
        }
        return true;
    }

}
